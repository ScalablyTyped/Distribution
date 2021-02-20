package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.CONFIRMED
import typings.awsLambda.awsLambdaStrings.EMAIL
import typings.awsLambda.awsLambdaStrings.RESET_REQUIRED
import typings.awsLambda.awsLambdaStrings.SMS
import typings.awsLambda.awsLambdaStrings.SUPPRESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerCorrect extends StObject {
  
  var answerCorrect: js.UndefOr[Boolean] = js.native
  
  var autoConfirmUser: js.UndefOr[Boolean] = js.native
  
  var autoVerifyEmail: js.UndefOr[Boolean] = js.native
  
  var autoVerifyPhone: js.UndefOr[Boolean] = js.native
  
  var challengeMetadata: js.UndefOr[String] = js.native
  
  var challengeName: js.UndefOr[String] = js.native
  
  var claimsOverrideDetails: js.UndefOr[ClaimsToAddOrOverride] = js.native
  
  var desiredDeliveryMediums: js.UndefOr[js.Array[EMAIL | SMS]] = js.native
  
  var emailMessage: js.UndefOr[String] = js.native
  
  var emailSubject: js.UndefOr[String] = js.native
  
  var failAuthentication: js.UndefOr[Boolean] = js.native
  
  var finalUserStatus: js.UndefOr[CONFIRMED | RESET_REQUIRED] = js.native
  
  var forceAliasCreation: js.UndefOr[Boolean] = js.native
  
  var issueTokens: js.UndefOr[Boolean] = js.native
  
  var messageAction: js.UndefOr[SUPPRESS] = js.native
  
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.native
  
  var publicChallengeParameters: js.UndefOr[StringDictionary[String]] = js.native
  
  var smsMessage: js.UndefOr[String] = js.native
  
  var userAttributes: js.UndefOr[StringDictionary[String]] = js.native
}
object AnswerCorrect {
  
  @scala.inline
  def apply(): AnswerCorrect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerCorrect]
  }
  
  @scala.inline
  implicit class AnswerCorrectMutableBuilder[Self <: AnswerCorrect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswerCorrect(value: Boolean): Self = StObject.set(x, "answerCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerCorrectUndefined: Self = StObject.set(x, "answerCorrect", js.undefined)
    
    @scala.inline
    def setAutoConfirmUser(value: Boolean): Self = StObject.set(x, "autoConfirmUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConfirmUserUndefined: Self = StObject.set(x, "autoConfirmUser", js.undefined)
    
    @scala.inline
    def setAutoVerifyEmail(value: Boolean): Self = StObject.set(x, "autoVerifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoVerifyEmailUndefined: Self = StObject.set(x, "autoVerifyEmail", js.undefined)
    
    @scala.inline
    def setAutoVerifyPhone(value: Boolean): Self = StObject.set(x, "autoVerifyPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoVerifyPhoneUndefined: Self = StObject.set(x, "autoVerifyPhone", js.undefined)
    
    @scala.inline
    def setChallengeMetadata(value: String): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeMetadataUndefined: Self = StObject.set(x, "challengeMetadata", js.undefined)
    
    @scala.inline
    def setChallengeName(value: String): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeNameUndefined: Self = StObject.set(x, "challengeName", js.undefined)
    
    @scala.inline
    def setClaimsOverrideDetails(value: ClaimsToAddOrOverride): Self = StObject.set(x, "claimsOverrideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsOverrideDetailsUndefined: Self = StObject.set(x, "claimsOverrideDetails", js.undefined)
    
    @scala.inline
    def setDesiredDeliveryMediums(value: js.Array[EMAIL | SMS]): Self = StObject.set(x, "desiredDeliveryMediums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredDeliveryMediumsUndefined: Self = StObject.set(x, "desiredDeliveryMediums", js.undefined)
    
    @scala.inline
    def setDesiredDeliveryMediumsVarargs(value: (EMAIL | SMS)*): Self = StObject.set(x, "desiredDeliveryMediums", js.Array(value :_*))
    
    @scala.inline
    def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setFailAuthentication(value: Boolean): Self = StObject.set(x, "failAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailAuthenticationUndefined: Self = StObject.set(x, "failAuthentication", js.undefined)
    
    @scala.inline
    def setFinalUserStatus(value: CONFIRMED | RESET_REQUIRED): Self = StObject.set(x, "finalUserStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUserStatusUndefined: Self = StObject.set(x, "finalUserStatus", js.undefined)
    
    @scala.inline
    def setForceAliasCreation(value: Boolean): Self = StObject.set(x, "forceAliasCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceAliasCreationUndefined: Self = StObject.set(x, "forceAliasCreation", js.undefined)
    
    @scala.inline
    def setIssueTokens(value: Boolean): Self = StObject.set(x, "issueTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueTokensUndefined: Self = StObject.set(x, "issueTokens", js.undefined)
    
    @scala.inline
    def setMessageAction(value: SUPPRESS): Self = StObject.set(x, "messageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageActionUndefined: Self = StObject.set(x, "messageAction", js.undefined)
    
    @scala.inline
    def setPrivateChallengeParameters(value: StringDictionary[String]): Self = StObject.set(x, "privateChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateChallengeParametersUndefined: Self = StObject.set(x, "privateChallengeParameters", js.undefined)
    
    @scala.inline
    def setPublicChallengeParameters(value: StringDictionary[String]): Self = StObject.set(x, "publicChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicChallengeParametersUndefined: Self = StObject.set(x, "publicChallengeParameters", js.undefined)
    
    @scala.inline
    def setSmsMessage(value: String): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMessageUndefined: Self = StObject.set(x, "smsMessage", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: StringDictionary[String]): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributesUndefined: Self = StObject.set(x, "userAttributes", js.undefined)
  }
}
