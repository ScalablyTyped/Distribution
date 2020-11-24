package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object preTokenGenerationMod {
  
  type PreTokenGenerationAuthenticateDeviceTriggerEvent = typings.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typings.awsLambda.awsLambdaStrings.TokenGeneration_AuthenticateDevice]
  
  type PreTokenGenerationAuthenticationTriggerEvent = typings.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typings.awsLambda.awsLambdaStrings.TokenGeneration_Authentication]
  
  type PreTokenGenerationHostedAuthTriggerEvent = typings.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typings.awsLambda.awsLambdaStrings.TokenGeneration_HostedAuth]
  
  type PreTokenGenerationNewPasswordChallengeTriggerEvent = typings.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typings.awsLambda.awsLambdaStrings.TokenGeneration_NewPasswordChallenge]
  
  type PreTokenGenerationRefreshTokensTriggerEvent = typings.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typings.awsLambda.awsLambdaStrings.TokenGeneration_RefreshTokens]
  
  type PreTokenGenerationTriggerEvent = typings.awsLambda.preTokenGenerationMod.PreTokenGenerationHostedAuthTriggerEvent | typings.awsLambda.preTokenGenerationMod.PreTokenGenerationAuthenticationTriggerEvent | typings.awsLambda.preTokenGenerationMod.PreTokenGenerationNewPasswordChallengeTriggerEvent | typings.awsLambda.preTokenGenerationMod.PreTokenGenerationAuthenticateDeviceTriggerEvent | typings.awsLambda.preTokenGenerationMod.PreTokenGenerationRefreshTokensTriggerEvent
  
  type PreTokenGenerationTriggerHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.preTokenGenerationMod.PreTokenGenerationTriggerEvent, js.Any]
}
