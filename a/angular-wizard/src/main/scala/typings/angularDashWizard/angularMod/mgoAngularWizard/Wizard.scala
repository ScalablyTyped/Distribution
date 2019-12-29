package typings.angularDashWizard.angularMod.mgoAngularWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wizard extends js.Object {
  def addStep(step: WzStep): Unit = js.native
  def cancel(): Unit = js.native
  def currentStep(): WzStep = js.native
  def currentStepDescription(): String = js.native
  def currentStepNumber(): Double = js.native
  def currentStepTitle(): String = js.native
  def finish(): Unit = js.native
  def getEnabledSteps(): js.Array[WzStep] = js.native
  def goTo(step: String): Unit = js.native
  def goTo(step: Double): Unit = js.native
  def next(): Unit = js.native
  def next(nextHandler: js.Function0[Boolean]): Unit = js.native
  def previous(): Unit = js.native
  def reset(): Unit = js.native
  def totalStepCount(): Double = js.native
}

