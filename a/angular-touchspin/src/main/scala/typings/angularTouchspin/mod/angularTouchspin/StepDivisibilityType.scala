package typings.angularTouchspin.mod.angularTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepDivisibilityType extends js.Object
@JSImport("angular-touchspin", "angularTouchspin.StepDivisibilityType")
@js.native
object StepDivisibilityType extends js.Object {
  
  @js.native
  sealed trait ceil extends StepDivisibilityType
  
  @js.native
  sealed trait floor extends StepDivisibilityType
  
  @js.native
  sealed trait none extends StepDivisibilityType
  
  @js.native
  sealed trait round extends StepDivisibilityType
}
