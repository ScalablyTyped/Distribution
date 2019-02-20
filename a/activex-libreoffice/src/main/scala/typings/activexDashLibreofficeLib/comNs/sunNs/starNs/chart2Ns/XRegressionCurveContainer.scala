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

