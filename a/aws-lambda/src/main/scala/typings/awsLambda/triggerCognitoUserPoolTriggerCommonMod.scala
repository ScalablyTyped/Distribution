package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerCommonMod {
  
  trait BaseTriggerEvent[T /* <: String */] extends StObject {
    
    var callerContext: AwsSdkVersion
    
    var region: String
    
    var triggerSource: T
    
    var userName: String
    
    var userPoolId: String
    
    var version: String
  }
  object BaseTriggerEvent {
    
    inline def apply[T /* <: String */](
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
    implicit open class MutableBuilder[Self <: BaseTriggerEvent[?], T /* <: String */] (val x: Self & BaseTriggerEvent[T]) extends AnyVal {
      
      inline def setCallerContext(value: AwsSdkVersion): Self = StObject.set(x, "callerContext", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setTriggerSource(value: T): Self = StObject.set(x, "triggerSource", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
    
    inline def ADMIN_NO_SRP_AUTH: typings.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[typings.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH]
    
    inline def DEVICE_PASSWORD_VERIFIER: typings.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[typings.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER]
    
    inline def DEVICE_SRP_AUTH: typings.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH".asInstanceOf[typings.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH]
    
    inline def PASSWORD_VERIFIER: typings.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER = "PASSWORD_VERIFIER".asInstanceOf[typings.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER]
    
    inline def SMS_MFA: typings.awsLambda.awsLambdaStrings.SMS_MFA = "SMS_MFA".asInstanceOf[typings.awsLambda.awsLambdaStrings.SMS_MFA]
    
    inline def SRP_A: typings.awsLambda.awsLambdaStrings.SRP_A = "SRP_A".asInstanceOf[typings.awsLambda.awsLambdaStrings.SRP_A]
  }
  
  trait ChallengeResult extends StObject {
    
    var challengeMetadata: Unit
    
    var challengeName: ChallengeName
    
    var challengeResult: Boolean
  }
  object ChallengeResult {
    
    inline def apply(challengeMetadata: Unit, challengeName: ChallengeName, challengeResult: Boolean): ChallengeResult = {
      val __obj = js.Dynamic.literal(challengeMetadata = challengeMetadata.asInstanceOf[js.Any], challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChallengeResult] (val x: Self) extends AnyVal {
      
      inline def setChallengeMetadata(value: Unit): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
      
      inline def setChallengeName(value: ChallengeName): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
      
      inline def setChallengeResult(value: Boolean): Self = StObject.set(x, "challengeResult", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomChallengeResult extends StObject {
    
    var challengeMetadata: js.UndefOr[String] = js.undefined
    
    var challengeName: CUSTOM_CHALLENGE
    
    var challengeResult: Boolean
  }
  object CustomChallengeResult {
    
    inline def apply(challengeResult: Boolean): CustomChallengeResult = {
      val __obj = js.Dynamic.literal(challengeName = "CUSTOM_CHALLENGE", challengeResult = challengeResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomChallengeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomChallengeResult] (val x: Self) extends AnyVal {
      
      inline def setChallengeMetadata(value: String): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
      
      inline def setChallengeMetadataUndefined: Self = StObject.set(x, "challengeMetadata", js.undefined)
      
      inline def setChallengeName(value: CUSTOM_CHALLENGE): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
      
      inline def setChallengeResult(value: Boolean): Self = StObject.set(x, "challengeResult", value.asInstanceOf[js.Any])
    }
  }
  
  type StringMap = StringDictionary[String]
}
