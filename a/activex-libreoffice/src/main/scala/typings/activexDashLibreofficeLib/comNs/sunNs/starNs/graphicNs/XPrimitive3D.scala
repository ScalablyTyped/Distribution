package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XPrimitive3D} interface
  *
  * This is the basic interface for graphic 3D primitives. They need to be able to provide a decomposition consisting of simpler graphic primitivesto
  * provide a 3D bound rectangle as a 3D range
  */
trait XPrimitive3D
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Retrieve decomposed list of simpler primitives
    * @param aViewParameters 3D View-specific parameter set. The defined but not mandatory parameters include: double Time  Defines the point in time for whic
    */
  def getDecomposition(
    aViewParameters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashInteropLib.SafeArray[XPrimitive3D]
  /**
    * Retrieve bound rect of primitive
    *
    * This method calculates the actual bound rect of the area in **world coordinates** . Note that for view-dependent primitives, the necessary pixel
    * adjustments are taken into account. For that reason the ViewParameters need to be given.
    * @param aViewParameters 3D View-specific parameter set, same as in getDecomposition.
    */
  def getRange(
    aViewParameters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle3D
}

object XPrimitive3D {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDecomposition: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashInteropLib.SafeArray[XPrimitive3D]
    ],
    getRange: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle3D
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPrimitive3D = {
    val __obj = js.Dynamic.literal(acquire = acquire, getDecomposition = getDecomposition, getRange = getRange, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPrimitive3D]
  }
}

