package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XPrimitive2D} interface
  *
  * This is the basic interface for 2D graphic primitives. They need to be able to provide a decomposition consisting of simpler graphic primitivesto
  * provide a 2D bound rectangle as a 2D range
  */
trait XPrimitive2D extends XInterface {
  /**
    * Retrieve decomposed list of simpler primitives
    * @param aViewParameters 2D View-specific parameter set. The defined but not mandatory parameters include:{@link com.sun.star.geometry.AffineMatrix2D} Tra
    */
  def getDecomposition(aViewParameters: SeqEquiv[PropertyValue]): SafeArray[XPrimitive2D]
  /**
    * Retrieve bound rect of primitive
    *
    * This method calculates the actual bound rect of the area in **world coordinates** . Note that for view-dependent primitives, the necessary pixel
    * adjustments are taken into account. For that reason the ViewParameters need to be given.
    * @param aViewParameters 2D View-specific parameter set, same as in getDecomposition.
    */
  def getRange(aViewParameters: SeqEquiv[PropertyValue]): RealRectangle2D
}

object XPrimitive2D {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDecomposition: SeqEquiv[PropertyValue] => SafeArray[XPrimitive2D],
    getRange: SeqEquiv[PropertyValue] => RealRectangle2D,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrimitive2D = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDecomposition = js.Any.fromFunction1(getDecomposition), getRange = js.Any.fromFunction1(getRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrimitive2D]
  }
}

