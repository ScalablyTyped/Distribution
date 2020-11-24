package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object preSignupMod {
  
  type PreSignUpAdminCreateUserTriggerEvent = typings.awsLambda.preSignupMod.BasePreSignUpTriggerEvent[typings.awsLambda.awsLambdaStrings.PreSignUp_AdminCreateUser]
  
  type PreSignUpEmailTriggerEvent = typings.awsLambda.preSignupMod.BasePreSignUpTriggerEvent[typings.awsLambda.awsLambdaStrings.PreSignUp_SignUp]
  
  type PreSignUpExternalProviderTriggerEvent = typings.awsLambda.preSignupMod.BasePreSignUpTriggerEvent[typings.awsLambda.awsLambdaStrings.PreSignUp_ExternalProvider]
  
  type PreSignUpTriggerEvent = typings.awsLambda.preSignupMod.PreSignUpEmailTriggerEvent | typings.awsLambda.preSignupMod.PreSignUpExternalProviderTriggerEvent | typings.awsLambda.preSignupMod.PreSignUpAdminCreateUserTriggerEvent
  
  type PreSignUpTriggerHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.preSignupMod.PreSignUpTriggerEvent, js.Any]
}
