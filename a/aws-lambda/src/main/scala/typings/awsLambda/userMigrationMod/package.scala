package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object userMigrationMod {
  
  type UserMigrationAuthenticationTriggerEvent = typings.awsLambda.userMigrationMod.BaseUserMigrationTriggerEvent[typings.awsLambda.awsLambdaStrings.UserMigration_Authentication]
  
  type UserMigrationForgotPasswordTriggerEvent = typings.awsLambda.userMigrationMod.BaseUserMigrationTriggerEvent[typings.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword]
  
  type UserMigrationTriggerEvent = typings.awsLambda.userMigrationMod.UserMigrationAuthenticationTriggerEvent | typings.awsLambda.userMigrationMod.UserMigrationForgotPasswordTriggerEvent
  
  type UserMigrationTriggerHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.userMigrationMod.UserMigrationTriggerEvent, js.Any]
}
