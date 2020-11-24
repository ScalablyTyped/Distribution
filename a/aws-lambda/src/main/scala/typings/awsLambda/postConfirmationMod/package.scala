package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object postConfirmationMod {
  
  type PostConfirmationConfirmForgotPassword = typings.awsLambda.postConfirmationMod.BasePostConfirmationTriggerEvent[typings.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmForgotPassword]
  
  type PostConfirmationConfirmSignUpTriggerEvent = typings.awsLambda.postConfirmationMod.BasePostConfirmationTriggerEvent[typings.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmSignUp]
  
  type PostConfirmationTriggerEvent = typings.awsLambda.postConfirmationMod.PostConfirmationConfirmSignUpTriggerEvent | typings.awsLambda.postConfirmationMod.PostConfirmationConfirmForgotPassword
  
  type PostConfirmationTriggerHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.postConfirmationMod.PostConfirmationTriggerEvent, js.Any]
}
