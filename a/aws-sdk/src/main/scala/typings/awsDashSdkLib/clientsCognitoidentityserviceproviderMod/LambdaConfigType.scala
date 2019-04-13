package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaConfigType extends js.Object {
  /**
    * Creates an authentication challenge.
    */
  var CreateAuthChallenge: js.UndefOr[ArnType] = js.undefined
  /**
    * A custom Message AWS Lambda trigger.
    */
  var CustomMessage: js.UndefOr[ArnType] = js.undefined
  /**
    * Defines the authentication challenge.
    */
  var DefineAuthChallenge: js.UndefOr[ArnType] = js.undefined
  /**
    * A post-authentication AWS Lambda trigger.
    */
  var PostAuthentication: js.UndefOr[ArnType] = js.undefined
  /**
    * A post-confirmation AWS Lambda trigger.
    */
  var PostConfirmation: js.UndefOr[ArnType] = js.undefined
  /**
    * A pre-authentication AWS Lambda trigger.
    */
  var PreAuthentication: js.UndefOr[ArnType] = js.undefined
  /**
    * A pre-registration AWS Lambda trigger.
    */
  var PreSignUp: js.UndefOr[ArnType] = js.undefined
  /**
    * A Lambda trigger that is invoked before token generation.
    */
  var PreTokenGeneration: js.UndefOr[ArnType] = js.undefined
  /**
    * The user migration Lambda config type.
    */
  var UserMigration: js.UndefOr[ArnType] = js.undefined
  /**
    * Verifies the authentication challenge response.
    */
  var VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.undefined
}

object LambdaConfigType {
  @scala.inline
  def apply(
    CreateAuthChallenge: ArnType = null,
    CustomMessage: ArnType = null,
    DefineAuthChallenge: ArnType = null,
    PostAuthentication: ArnType = null,
    PostConfirmation: ArnType = null,
    PreAuthentication: ArnType = null,
    PreSignUp: ArnType = null,
    PreTokenGeneration: ArnType = null,
    UserMigration: ArnType = null,
    VerifyAuthChallengeResponse: ArnType = null
  ): LambdaConfigType = {
    val __obj = js.Dynamic.literal()
    if (CreateAuthChallenge != null) __obj.updateDynamic("CreateAuthChallenge")(CreateAuthChallenge)
    if (CustomMessage != null) __obj.updateDynamic("CustomMessage")(CustomMessage)
    if (DefineAuthChallenge != null) __obj.updateDynamic("DefineAuthChallenge")(DefineAuthChallenge)
    if (PostAuthentication != null) __obj.updateDynamic("PostAuthentication")(PostAuthentication)
    if (PostConfirmation != null) __obj.updateDynamic("PostConfirmation")(PostConfirmation)
    if (PreAuthentication != null) __obj.updateDynamic("PreAuthentication")(PreAuthentication)
    if (PreSignUp != null) __obj.updateDynamic("PreSignUp")(PreSignUp)
    if (PreTokenGeneration != null) __obj.updateDynamic("PreTokenGeneration")(PreTokenGeneration)
    if (UserMigration != null) __obj.updateDynamic("UserMigration")(UserMigration)
    if (VerifyAuthChallengeResponse != null) __obj.updateDynamic("VerifyAuthChallengeResponse")(VerifyAuthChallengeResponse)
    __obj.asInstanceOf[LambdaConfigType]
  }
}

