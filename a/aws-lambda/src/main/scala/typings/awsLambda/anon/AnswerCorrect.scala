package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.CONFIRMED
import typings.awsLambda.awsLambdaStrings.EMAIL
import typings.awsLambda.awsLambdaStrings.RESET_REQUIRED
import typings.awsLambda.awsLambdaStrings.SMS
import typings.awsLambda.awsLambdaStrings.SUPPRESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerCorrect extends StObject {
  
  var answerCorrect: js.UndefOr[Boolean] = js.undefined
  
  var autoConfirmUser: js.UndefOr[Boolean] = js.undefined
  
  var autoVerifyEmail: js.UndefOr[Boolean] = js.undefined
  
  var autoVerifyPhone: js.UndefOr[Boolean] = js.undefined
  
  var challengeMetadata: js.UndefOr[String] = js.undefined
  
  var challengeName: js.UndefOr[String] = js.undefined
  
  var claimsOverrideDetails: js.UndefOr[ClaimsToAddOrOverride] = js.undefined
  
  var desiredDeliveryMediums: js.UndefOr[js.Array[EMAIL | SMS]] = js.undefined
  
  var emailMessage: js.UndefOr[String] = js.undefined
  
  var emailSubject: js.UndefOr[String] = js.undefined
  
  var failAuthentication: js.UndefOr[Boolean] = js.undefined
  
  var finalUserStatus: js.UndefOr[CONFIRMED | RESET_REQUIRED] = js.undefined
  
  var forceAliasCreation: js.UndefOr[Boolean] = js.undefined
  
  var issueTokens: js.UndefOr[Boolean] = js.undefined
  
  var messageAction: js.UndefOr[SUPPRESS] = js.undefined
  
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var publicChallengeParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var smsMessage: js.UndefOr[String] = js.undefined
  
  var userAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
}
object AnswerCorrect {
  
  inline def apply(): AnswerCorrect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerCorrect]
  }
  
  extension [Self <: AnswerCorrect](x: Self) {
    
    inline def setAnswerCorrect(value: Boolean): Self = StObject.set(x, "answerCorrect", value.asInstanceOf[js.Any])
    
    inline def setAnswerCorrectUndefined: Self = StObject.set(x, "answerCorrect", js.undefined)
    
    inline def setAutoConfirmUser(value: Boolean): Self = StObject.set(x, "autoConfirmUser", value.asInstanceOf[js.Any])
    
    inline def setAutoConfirmUserUndefined: Self = StObject.set(x, "autoConfirmUser", js.undefined)
    
    inline def setAutoVerifyEmail(value: Boolean): Self = StObject.set(x, "autoVerifyEmail", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifyEmailUndefined: Self = StObject.set(x, "autoVerifyEmail", js.undefined)
    
    inline def setAutoVerifyPhone(value: Boolean): Self = StObject.set(x, "autoVerifyPhone", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifyPhoneUndefined: Self = StObject.set(x, "autoVerifyPhone", js.undefined)
    
    inline def setChallengeMetadata(value: String): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
    
    inline def setChallengeMetadataUndefined: Self = StObject.set(x, "challengeMetadata", js.undefined)
    
    inline def setChallengeName(value: String): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeNameUndefined: Self = StObject.set(x, "challengeName", js.undefined)
    
    inline def setClaimsOverrideDetails(value: ClaimsToAddOrOverride): Self = StObject.set(x, "claimsOverrideDetails", value.asInstanceOf[js.Any])
    
    inline def setClaimsOverrideDetailsUndefined: Self = StObject.set(x, "claimsOverrideDetails", js.undefined)
    
    inline def setDesiredDeliveryMediums(value: js.Array[EMAIL | SMS]): Self = StObject.set(x, "desiredDeliveryMediums", value.asInstanceOf[js.Any])
    
    inline def setDesiredDeliveryMediumsUndefined: Self = StObject.set(x, "desiredDeliveryMediums", js.undefined)
    
    inline def setDesiredDeliveryMediumsVarargs(value: (EMAIL | SMS)*): Self = StObject.set(x, "desiredDeliveryMediums", js.Array(value :_*))
    
    inline def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    inline def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    inline def setFailAuthentication(value: Boolean): Self = StObject.set(x, "failAuthentication", value.asInstanceOf[js.Any])
    
    inline def setFailAuthenticationUndefined: Self = StObject.set(x, "failAuthentication", js.undefined)
    
    inline def setFinalUserStatus(value: CONFIRMED | RESET_REQUIRED): Self = StObject.set(x, "finalUserStatus", value.asInstanceOf[js.Any])
    
    inline def setFinalUserStatusUndefined: Self = StObject.set(x, "finalUserStatus", js.undefined)
    
    inline def setForceAliasCreation(value: Boolean): Self = StObject.set(x, "forceAliasCreation", value.asInstanceOf[js.Any])
    
    inline def setForceAliasCreationUndefined: Self = StObject.set(x, "forceAliasCreation", js.undefined)
    
    inline def setIssueTokens(value: Boolean): Self = StObject.set(x, "issueTokens", value.asInstanceOf[js.Any])
    
    inline def setIssueTokensUndefined: Self = StObject.set(x, "issueTokens", js.undefined)
    
    inline def setMessageAction(value: SUPPRESS): Self = StObject.set(x, "messageAction", value.asInstanceOf[js.Any])
    
    inline def setMessageActionUndefined: Self = StObject.set(x, "messageAction", js.undefined)
    
    inline def setPrivateChallengeParameters(value: StringDictionary[String]): Self = StObject.set(x, "privateChallengeParameters", value.asInstanceOf[js.Any])
    
    inline def setPrivateChallengeParametersUndefined: Self = StObject.set(x, "privateChallengeParameters", js.undefined)
    
    inline def setPublicChallengeParameters(value: StringDictionary[String]): Self = StObject.set(x, "publicChallengeParameters", value.asInstanceOf[js.Any])
    
    inline def setPublicChallengeParametersUndefined: Self = StObject.set(x, "publicChallengeParameters", js.undefined)
    
    inline def setSmsMessage(value: String): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsMessageUndefined: Self = StObject.set(x, "smsMessage", js.undefined)
    
    inline def setUserAttributes(value: StringDictionary[String]): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesUndefined: Self = StObject.set(x, "userAttributes", js.undefined)
  }
}
