package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  trait BaseTriggerEvent[T /* <: String */] extends StObject {
    
    var callerContext: AwsSdkVersion
    
    var region: String
    
    var triggerSource: T
    
    var userName: String
    
    var userPoolId: String
    
    var version: String
  }
  object BaseTriggerEvent {
    
    @scala.inline
    def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BaseTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTriggerEvent[T]]
    }
    
    @scala.inline
    implicit class BaseTriggerEventMutableBuilder[Self <: BaseTriggerEvent[?], T /* <: String */] (val x: Self & BaseTriggerEvent[T]) extends AnyVal {
      
      @scala.inline
      def setCallerContext(value: AwsSdkVersion): Self = StObject.set(x, "callerContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerSource(value: T): Self = StObject.set(x, "triggerSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER
    - typings.awsLambda.awsLambdaStrings.SMS_MFA
    - typings.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH
    - typings.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER
    - typings.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH
    - typings.awsLambda.awsLambdaStrings.SRP_A
  */
  trait ChallengeName extends StObject
  object ChallengeName {
    
    @scala.inline
    def ADMIN_NO_SRP_AUTH: typings.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[typings.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH]
    
    @scala.inline
    def DEVICE_PASSWORD_VERIFIER: typings.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[typings.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER]
    
    @scala.inline
    def DEVICE_SRP_AUTH: typings.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH".asInstanceOf[typings.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH]
    
    @scala.inline
    def PASSWORD_VERIFIER: typings.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER = "PASSWORD_VERIFIER".asInstanceOf[typings.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER]
    
    @scala.inline
    def SMS_MFA: typings.awsLambda.awsLambdaStrings.SMS_MFA = "SMS_MFA".asInstanceOf[typings.awsLambda.awsLambdaStrings.SMS_MFA]
    
    @scala.inline
    def SRP_A: typings.awsLambda.awsLambdaStrings.SRP_A = "SRP_A".asInstanceOf[typings.awsLambda.awsLambdaStrings.SRP_A]
  }
  
  trait ChallengeResult extends StObject {
    
    var challengeMetadata: Unit
    
    var challengeName: ChallengeName
    
    var challengeResult: Boolean
  }
  object ChallengeResult {
    
    @scala.inline
    def apply(challengeMetadata: Unit, challengeName: ChallengeName, challengeResult: Boolean): ChallengeResult = {
      val __obj = js.Dynamic.literal(challengeMetadata = challengeMetadata.asInstanceOf[js.Any], challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengeResult]
    }
    
    @scala.inline
    implicit class ChallengeResultMutableBuilder[Self <: ChallengeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallengeMetadata(value: Unit): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeName(value: ChallengeName): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeResult(value: Boolean): Self = StObject.set(x, "challengeResult", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomChallengeResult extends StObject {
    
    var challengeMetadata: js.UndefOr[String] = js.undefined
    
    var challengeName: CUSTOM_CHALLENGE
    
    var challengeResult: Boolean
  }
  object CustomChallengeResult {
    
    @scala.inline
    def apply(challengeResult: Boolean): CustomChallengeResult = {
      val __obj = js.Dynamic.literal(challengeName = "CUSTOM_CHALLENGE", challengeResult = challengeResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomChallengeResult]
    }
    
    @scala.inline
    implicit class CustomChallengeResultMutableBuilder[Self <: CustomChallengeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallengeMetadata(value: String): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeMetadataUndefined: Self = StObject.set(x, "challengeMetadata", js.undefined)
      
      @scala.inline
      def setChallengeName(value: CUSTOM_CHALLENGE): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeResult(value: Boolean): Self = StObject.set(x, "challengeResult", value.asInstanceOf[js.Any])
    }
  }
  
  type StringMap = StringDictionary[String]
}
