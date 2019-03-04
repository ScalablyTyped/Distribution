package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRegressionCurveContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all regression curves */
  var RegressionCurves: activexDashInteropLib.SafeArray[XRegressionCurve]
  /**
    * add an regression curve to the container
    * @throws IllegalArgumentException If the given regression curve is already contained in the container.
    */
  def addRegressionCurve(aRegressionCurve: XRegressionCurve): scala.Unit
  /** retrieve all regression curves */
  def getRegressionCurves(): activexDashInteropLib.SafeArray[XRegressionCurve]
  /** removes one regression curve from the container. */
  def removeRegressionCurve(aRegressionCurve: XRegressionCurve): scala.Unit
  /** set all regression curves */
  def setRegressionCurves(aRegressionCurves: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XRegressionCurve]): scala.Unit
}

object XRegressionCurveContainer {
  @scala.inline
  def apply(
    RegressionCurves: activexDashInteropLib.SafeArray[XRegressionCurve],
    acquire: js.Function0[scala.Unit],
    addRegressionCurve: js.Function1[XRegressionCurve, scala.Unit],
    getRegressionCurves: js.Function0[activexDashInteropLib.SafeArray[XRegressionCurve]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeRegressionCurve: js.Function1[XRegressionCurve, scala.Unit],
    setRegressionCurves: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XRegressionCurve], scala.Unit]
  ): XRegressionCurveContainer = {
    val __obj = js.Dynamic.literal(RegressionCurves = RegressionCurves, acquire = acquire, addRegressionCurve = addRegressionCurve, getRegressionCurves = getRegressionCurves, queryInterface = queryInterface, release = release, removeRegressionCurve = removeRegressionCurve, setRegressionCurves = setRegressionCurves)
  
    __obj.asInstanceOf[XRegressionCurveContainer]
  }
}

