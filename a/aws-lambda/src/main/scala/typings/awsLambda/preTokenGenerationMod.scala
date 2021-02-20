package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ClaimsOverrideDetails
import typings.awsLambda.anon.GroupConfiguration
import typings.awsLambda.awsLambdaStrings.TokenGeneration_AuthenticateDevice
import typings.awsLambda.awsLambdaStrings.TokenGeneration_Authentication
import typings.awsLambda.awsLambdaStrings.TokenGeneration_HostedAuth
import typings.awsLambda.awsLambdaStrings.TokenGeneration_NewPasswordChallenge
import typings.awsLambda.awsLambdaStrings.TokenGeneration_RefreshTokens
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preTokenGenerationMod {
  
  @js.native
  trait BasePreTokenGenerationTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
    
    var request: GroupConfiguration = js.native
    
    var response: ClaimsOverrideDetails = js.native
  }
  object BasePreTokenGenerationTriggerEvent {
    
    @scala.inline
    def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: GroupConfiguration,
      response: ClaimsOverrideDetails,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BasePreTokenGenerationTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePreTokenGenerationTriggerEvent[T]]
    }
    
    @scala.inline
    implicit class BasePreTokenGenerationTriggerEventMutableBuilder[Self <: BasePreTokenGenerationTriggerEvent[_], T /* <: String */] (val x: Self with BasePreTokenGenerationTriggerEvent[T]) extends AnyVal {
      
      @scala.inline
      def setRequest(value: GroupConfiguration): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: ClaimsOverrideDetails): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GroupOverrideDetails extends StObject {
    
    var groupsToOverride: js.UndefOr[js.Array[String]] = js.native
    
    var iamRolesToOverride: js.UndefOr[js.Array[String]] = js.native
    
    var preferredRole: js.UndefOr[String] = js.native
  }
  object GroupOverrideDetails {
    
    @scala.inline
    def apply(): GroupOverrideDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupOverrideDetails]
    }
    
    @scala.inline
    implicit class GroupOverrideDetailsMutableBuilder[Self <: GroupOverrideDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupsToOverride(value: js.Array[String]): Self = StObject.set(x, "groupsToOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsToOverrideUndefined: Self = StObject.set(x, "groupsToOverride", js.undefined)
      
      @scala.inline
      def setGroupsToOverrideVarargs(value: String*): Self = StObject.set(x, "groupsToOverride", js.Array(value :_*))
      
      @scala.inline
      def setIamRolesToOverride(value: js.Array[String]): Self = StObject.set(x, "iamRolesToOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesToOverrideUndefined: Self = StObject.set(x, "iamRolesToOverride", js.undefined)
      
      @scala.inline
      def setIamRolesToOverrideVarargs(value: String*): Self = StObject.set(x, "iamRolesToOverride", js.Array(value :_*))
      
      @scala.inline
      def setPreferredRole(value: String): Self = StObject.set(x, "preferredRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredRoleUndefined: Self = StObject.set(x, "preferredRole", js.undefined)
    }
  }
  
  type PreTokenGenerationAuthenticateDeviceTriggerEvent = BasePreTokenGenerationTriggerEvent[TokenGeneration_AuthenticateDevice]
  
  type PreTokenGenerationAuthenticationTriggerEvent = BasePreTokenGenerationTriggerEvent[TokenGeneration_Authentication]
  
  type PreTokenGenerationHostedAuthTriggerEvent = BasePreTokenGenerationTriggerEvent[TokenGeneration_HostedAuth]
  
  type PreTokenGenerationNewPasswordChallengeTriggerEvent = BasePreTokenGenerationTriggerEvent[TokenGeneration_NewPasswordChallenge]
  
  type PreTokenGenerationRefreshTokensTriggerEvent = BasePreTokenGenerationTriggerEvent[TokenGeneration_RefreshTokens]
  
  type PreTokenGenerationTriggerEvent = PreTokenGenerationHostedAuthTriggerEvent | PreTokenGenerationAuthenticationTriggerEvent | PreTokenGenerationNewPasswordChallengeTriggerEvent | PreTokenGenerationAuthenticateDeviceTriggerEvent | PreTokenGenerationRefreshTokensTriggerEvent
  
  type PreTokenGenerationTriggerHandler = Handler[PreTokenGenerationTriggerEvent, js.Any]
}
