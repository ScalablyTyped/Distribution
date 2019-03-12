package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRegressionCurveContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all regression curves */
  var RegressionCurves: stdLib.SafeArray[XRegressionCurve]
  /**
    * add an regression curve to the container
    * @throws IllegalArgumentException If the given regression curve is already contained in the container.
    */
  def addRegressionCurve(aRegressionCurve: XRegressionCurve): scala.Unit
  /** retrieve all regression curves */
  def getRegressionCurves(): stdLib.SafeArray[XRegressionCurve]
  /** removes one regression curve from the container. */
  def removeRegressionCurve(aRegressionCurve: XRegressionCurve): scala.Unit
  /** set all regression curves */
  def setRegressionCurves(aRegressionCurves: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XRegressionCurve]): scala.Unit
}

object XRegressionCurveContainer {
  @scala.inline
  def apply(
    RegressionCurves: stdLib.SafeArray[XRegressionCurve],
    acquire: () => scala.Unit,
    addRegressionCurve: XRegressionCurve => scala.Unit,
    getRegressionCurves: () => stdLib.SafeArray[XRegressionCurve],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeRegressionCurve: XRegressionCurve => scala.Unit,
    setRegressionCurves: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XRegressionCurve] => scala.Unit
  ): XRegressionCurveContainer = {
    val __obj = js.Dynamic.literal(RegressionCurves = RegressionCurves, acquire = js.Any.fromFunction0(acquire), addRegressionCurve = js.Any.fromFunction1(addRegressionCurve), getRegressionCurves = js.Any.fromFunction0(getRegressionCurves), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRegressionCurve = js.Any.fromFunction1(removeRegressionCurve), setRegressionCurves = js.Any.fromFunction1(setRegressionCurves))
  
    __obj.asInstanceOf[XRegressionCurveContainer]
  }
}

