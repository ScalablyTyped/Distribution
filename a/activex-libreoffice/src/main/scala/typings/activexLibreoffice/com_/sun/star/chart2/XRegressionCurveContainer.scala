package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRegressionCurveContainer extends XInterface {
  /** retrieve all regression curves */
  var RegressionCurves: SafeArray[XRegressionCurve]
  /**
    * add an regression curve to the container
    * @throws IllegalArgumentException If the given regression curve is already contained in the container.
    */
  def addRegressionCurve(aRegressionCurve: XRegressionCurve): Unit
  /** retrieve all regression curves */
  def getRegressionCurves(): SafeArray[XRegressionCurve]
  /** removes one regression curve from the container. */
  def removeRegressionCurve(aRegressionCurve: XRegressionCurve): Unit
  /** set all regression curves */
  def setRegressionCurves(aRegressionCurves: SeqEquiv[XRegressionCurve]): Unit
}

object XRegressionCurveContainer {
  @scala.inline
  def apply(
    RegressionCurves: SafeArray[XRegressionCurve],
    acquire: () => Unit,
    addRegressionCurve: XRegressionCurve => Unit,
    getRegressionCurves: () => SafeArray[XRegressionCurve],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRegressionCurve: XRegressionCurve => Unit,
    setRegressionCurves: SeqEquiv[XRegressionCurve] => Unit
  ): XRegressionCurveContainer = {
    val __obj = js.Dynamic.literal(RegressionCurves = RegressionCurves.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRegressionCurve = js.Any.fromFunction1(addRegressionCurve), getRegressionCurves = js.Any.fromFunction0(getRegressionCurves), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRegressionCurve = js.Any.fromFunction1(removeRegressionCurve), setRegressionCurves = js.Any.fromFunction1(setRegressionCurves))
    __obj.asInstanceOf[XRegressionCurveContainer]
  }
}

