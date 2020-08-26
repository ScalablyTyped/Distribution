package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRegressionCurveContainer extends XInterface {
  /** retrieve all regression curves */
  var RegressionCurves: SafeArray[XRegressionCurve] = js.native
  /**
    * add an regression curve to the container
    * @throws IllegalArgumentException If the given regression curve is already contained in the container.
    */
  def addRegressionCurve(aRegressionCurve: XRegressionCurve): Unit = js.native
  /** retrieve all regression curves */
  def getRegressionCurves(): SafeArray[XRegressionCurve] = js.native
  /** removes one regression curve from the container. */
  def removeRegressionCurve(aRegressionCurve: XRegressionCurve): Unit = js.native
  /** set all regression curves */
  def setRegressionCurves(aRegressionCurves: SeqEquiv[XRegressionCurve]): Unit = js.native
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
  @scala.inline
  implicit class XRegressionCurveContainerOps[Self <: XRegressionCurveContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegressionCurves(value: SafeArray[XRegressionCurve]): Self = this.set("RegressionCurves", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddRegressionCurve(value: XRegressionCurve => Unit): Self = this.set("addRegressionCurve", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRegressionCurves(value: () => SafeArray[XRegressionCurve]): Self = this.set("getRegressionCurves", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveRegressionCurve(value: XRegressionCurve => Unit): Self = this.set("removeRegressionCurve", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRegressionCurves(value: SeqEquiv[XRegressionCurve] => Unit): Self = this.set("setRegressionCurves", js.Any.fromFunction1(value))
  }
  
}

