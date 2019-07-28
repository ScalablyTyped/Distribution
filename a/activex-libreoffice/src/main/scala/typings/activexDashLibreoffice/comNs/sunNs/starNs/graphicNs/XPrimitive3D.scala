package typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealRectangle3D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XPrimitive3D} interface
  *
  * This is the basic interface for graphic 3D primitives. They need to be able to provide a decomposition consisting of simpler graphic primitivesto
  * provide a 3D bound rectangle as a 3D range
  */
trait XPrimitive3D extends XInterface {
  /**
    * Retrieve decomposed list of simpler primitives
    * @param aViewParameters 3D View-specific parameter set. The defined but not mandatory parameters include: double Time  Defines the point in time for whic
    */
  def getDecomposition(aViewParameters: SeqEquiv[PropertyValue]): SafeArray[XPrimitive3D]
  /**
    * Retrieve bound rect of primitive
    *
    * This method calculates the actual bound rect of the area in **world coordinates** . Note that for view-dependent primitives, the necessary pixel
    * adjustments are taken into account. For that reason the ViewParameters need to be given.
    * @param aViewParameters 3D View-specific parameter set, same as in getDecomposition.
    */
  def getRange(aViewParameters: SeqEquiv[PropertyValue]): RealRectangle3D
}

object XPrimitive3D {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDecomposition: SeqEquiv[PropertyValue] => SafeArray[XPrimitive3D],
    getRange: SeqEquiv[PropertyValue] => RealRectangle3D,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrimitive3D = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDecomposition = js.Any.fromFunction1(getDecomposition), getRange = js.Any.fromFunction1(getRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPrimitive3D]
  }
}

