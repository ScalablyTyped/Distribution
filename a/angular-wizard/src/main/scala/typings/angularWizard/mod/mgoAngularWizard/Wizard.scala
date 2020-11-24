package typings.angularWizard.mod.mgoAngularWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /** Set the edit mode of the wizard.
    * Setting editMode to `true` will make ALL steps accessible,
    * setting edit mode to `false` will make all steps with an index lower than
    * the latest "completed" step accessible.
    */
  def setEditMode(editMode: Boolean): Unit = js.native
  
  def totalStepCount(): Double = js.native
}
