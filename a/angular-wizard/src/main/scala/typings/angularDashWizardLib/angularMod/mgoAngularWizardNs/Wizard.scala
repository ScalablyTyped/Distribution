package typings
package angularDashWizardLib.angularMod.mgoAngularWizardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wizard extends js.Object {
  def addStep(step: WzStep): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def currentStep(): WzStep = js.native
  def currentStepDescription(): java.lang.String = js.native
  def currentStepNumber(): scala.Double = js.native
  def currentStepTitle(): java.lang.String = js.native
  def finish(): scala.Unit = js.native
  def getEnabledSteps(): js.Array[WzStep] = js.native
  def goTo(step: java.lang.String): scala.Unit = js.native
  def goTo(step: scala.Double): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def next(nextHandler: js.Function0[scala.Boolean]): scala.Unit = js.native
  def previous(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

