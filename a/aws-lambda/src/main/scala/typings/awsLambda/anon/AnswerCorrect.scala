package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.CONFIRMED
import typings.awsLambda.awsLambdaStrings.EMAIL
import typings.awsLambda.awsLambdaStrings.RESET_REQUIRED
import typings.awsLambda.awsLambdaStrings.SMS
import typings.awsLambda.awsLambdaStrings.SUPPRESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerCorrect extends js.Object {
  
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
  implicit class AnswerCorrectOps[Self <: AnswerCorrect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnswerCorrect(value: Boolean): Self = this.set("answerCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswerCorrect: Self = this.set("answerCorrect", js.undefined)
    
    @scala.inline
    def setAutoConfirmUser(value: Boolean): Self = this.set("autoConfirmUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConfirmUser: Self = this.set("autoConfirmUser", js.undefined)
    
    @scala.inline
    def setAutoVerifyEmail(value: Boolean): Self = this.set("autoVerifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoVerifyEmail: Self = this.set("autoVerifyEmail", js.undefined)
    
    @scala.inline
    def setAutoVerifyPhone(value: Boolean): Self = this.set("autoVerifyPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoVerifyPhone: Self = this.set("autoVerifyPhone", js.undefined)
    
    @scala.inline
    def setChallengeMetadata(value: String): Self = this.set("challengeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeMetadata: Self = this.set("challengeMetadata", js.undefined)
    
    @scala.inline
    def setChallengeName(value: String): Self = this.set("challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeName: Self = this.set("challengeName", js.undefined)
    
    @scala.inline
    def setClaimsOverrideDetails(value: ClaimsToAddOrOverride): Self = this.set("claimsOverrideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimsOverrideDetails: Self = this.set("claimsOverrideDetails", js.undefined)
    
    @scala.inline
    def setDesiredDeliveryMediumsVarargs(value: (EMAIL | SMS)*): Self = this.set("desiredDeliveryMediums", js.Array(value :_*))
    
    @scala.inline
    def setDesiredDeliveryMediums(value: js.Array[EMAIL | SMS]): Self = this.set("desiredDeliveryMediums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredDeliveryMediums: Self = this.set("desiredDeliveryMediums", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: String): Self = this.set("emailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailMessage: Self = this.set("emailMessage", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    
    @scala.inline
    def setFailAuthentication(value: Boolean): Self = this.set("failAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailAuthentication: Self = this.set("failAuthentication", js.undefined)
    
    @scala.inline
    def setFinalUserStatus(value: CONFIRMED | RESET_REQUIRED): Self = this.set("finalUserStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalUserStatus: Self = this.set("finalUserStatus", js.undefined)
    
    @scala.inline
    def setForceAliasCreation(value: Boolean): Self = this.set("forceAliasCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAliasCreation: Self = this.set("forceAliasCreation", js.undefined)
    
    @scala.inline
    def setIssueTokens(value: Boolean): Self = this.set("issueTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueTokens: Self = this.set("issueTokens", js.undefined)
    
    @scala.inline
    def setMessageAction(value: SUPPRESS): Self = this.set("messageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAction: Self = this.set("messageAction", js.undefined)
    
    @scala.inline
    def setPrivateChallengeParameters(value: StringDictionary[String]): Self = this.set("privateChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateChallengeParameters: Self = this.set("privateChallengeParameters", js.undefined)
    
    @scala.inline
    def setPublicChallengeParameters(value: StringDictionary[String]): Self = this.set("publicChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicChallengeParameters: Self = this.set("publicChallengeParameters", js.undefined)
    
    @scala.inline
    def setSmsMessage(value: String): Self = this.set("smsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsMessage: Self = this.set("smsMessage", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: StringDictionary[String]): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAttributes: Self = this.set("userAttributes", js.undefined)
  }
}
