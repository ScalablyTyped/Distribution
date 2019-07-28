package typings.awsDashLambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChallengeAnswer extends js.Object {
  var challengeAnswer: js.UndefOr[String] = js.undefined
  var challengeName: js.UndefOr[String] = js.undefined
  var codeParameter: js.UndefOr[String] = js.undefined
  var linkParameter: js.UndefOr[String] = js.undefined
  var newDeviceUsed: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var session: js.UndefOr[js.Array[Anon_ADMINNOSRPAUTH]] = js.undefined
  var userAttributes: StringDictionary[String]
  var usernameParameter: js.UndefOr[String] = js.undefined
  var validationData: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Anon_ChallengeAnswer {
  @scala.inline
  def apply(
    userAttributes: StringDictionary[String],
    challengeAnswer: String = null,
    challengeName: String = null,
    codeParameter: String = null,
    linkParameter: String = null,
    newDeviceUsed: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    privateChallengeParameters: StringDictionary[String] = null,
    session: js.Array[Anon_ADMINNOSRPAUTH] = null,
    usernameParameter: String = null,
    validationData: StringDictionary[String] = null
  ): Anon_ChallengeAnswer = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes)
    if (challengeAnswer != null) __obj.updateDynamic("challengeAnswer")(challengeAnswer)
    if (challengeName != null) __obj.updateDynamic("challengeName")(challengeName)
    if (codeParameter != null) __obj.updateDynamic("codeParameter")(codeParameter)
    if (linkParameter != null) __obj.updateDynamic("linkParameter")(linkParameter)
    if (!js.isUndefined(newDeviceUsed)) __obj.updateDynamic("newDeviceUsed")(newDeviceUsed)
    if (password != null) __obj.updateDynamic("password")(password)
    if (privateChallengeParameters != null) __obj.updateDynamic("privateChallengeParameters")(privateChallengeParameters)
    if (session != null) __obj.updateDynamic("session")(session)
    if (usernameParameter != null) __obj.updateDynamic("usernameParameter")(usernameParameter)
    if (validationData != null) __obj.updateDynamic("validationData")(validationData)
    __obj.asInstanceOf[Anon_ChallengeAnswer]
  }
}

