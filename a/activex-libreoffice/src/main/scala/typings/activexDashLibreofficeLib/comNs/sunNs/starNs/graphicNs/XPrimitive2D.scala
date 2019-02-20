package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XPrimitive2D} interface
  *
  * This is the basic interface for 2D graphic primitives. They need to be able to provide a decomposition consisting of simpler graphic primitivesto
  * provide a 2D bound rectangle as a 2D range
  */
trait XPrimitive2D
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Retrieve decomposed list of simpler primitives
    * @param aViewParameters 2D View-specific parameter set. The defined but not mandatory parameters include:{@link com.sun.star.geometry.AffineMatrix2D} Tra
    */
  def getDecomposition(
    aViewParameters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashInteropLib.SafeArray[XPrimitive2D]
  /**
    * Retrieve bound rect of primitive
    *
    * This method calculates the actual bound rect of the area in **world coordinates** . Note that for view-dependent primitives, the necessary pixel
    * adjustments are taken into account. For that reason the ViewParameters need to be given.
    * @param aViewParameters 2D View-specific parameter set, same as in getDecomposition.
    */
  def getRange(
    aViewParameters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D
}

