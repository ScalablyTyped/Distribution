package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object customMessageMod {
  
  type CustomMessageAdminCreateUserTriggerEvent = typings.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typings.awsLambda.awsLambdaStrings.CustomMessage_AdminCreateUser]
  
  type CustomMessageAuthenticationTriggerEvent = typings.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typings.awsLambda.awsLambdaStrings.CustomMessage_Authentication]
  
  type CustomMessageForgotPasswordTriggerEvent = typings.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typings.awsLambda.awsLambdaStrings.CustomMessage_ForgotPassword]
  
  type CustomMessageResendCodeTriggerEvent = typings.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typings.awsLambda.awsLambdaStrings.CustomMessage_ResendCode]
  
  type CustomMessageSignUpTriggerEvent = typings.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typings.awsLambda.awsLambdaStrings.CustomMessage_SignUp]
  
  type CustomMessageTriggerEvent = typings.awsLambda.customMessageMod.CustomMessageSignUpTriggerEvent | typings.awsLambda.customMessageMod.CustomMessageAdminCreateUserTriggerEvent | typings.awsLambda.customMessageMod.CustomMessageResendCodeTriggerEvent | typings.awsLambda.customMessageMod.CustomMessageForgotPasswordTriggerEvent | typings.awsLambda.customMessageMod.CustomMessageUpdateUserAttributeTriggerEvent | typings.awsLambda.customMessageMod.CustomMessageVerifyUserAttributeTriggerEvent | typings.awsLambda.customMessageMod.CustomMessageAuthenticationTriggerEvent
  
  type CustomMessageTriggerHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.customMessageMod.CustomMessageTriggerEvent, js.Any]
  
  type CustomMessageUpdateUserAttributeTriggerEvent = typings.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typings.awsLambda.awsLambdaStrings.CustomMessage_UpdateUserAttribute]
  
  type CustomMessageVerifyUserAttributeTriggerEvent = typings.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typings.awsLambda.awsLambdaStrings.CustomMessage_VerifyUserAttribute]
}
