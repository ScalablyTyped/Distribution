package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChallengeAnswer extends js.Object {
  var challengeAnswer: js.UndefOr[java.lang.String] = js.undefined
  var challengeName: js.UndefOr[java.lang.String] = js.undefined
  var codeParameter: js.UndefOr[java.lang.String] = js.undefined
  var newDeviceUsed: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var privateChallengeParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var session: js.UndefOr[js.Array[Anon_ADMINNOSRPAUTH]] = js.undefined
  var userAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var usernameParameter: js.UndefOr[java.lang.String] = js.undefined
  var validationData: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Anon_ChallengeAnswer {
  @scala.inline
  def apply(
    userAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    challengeAnswer: java.lang.String = null,
    challengeName: java.lang.String = null,
    codeParameter: java.lang.String = null,
    newDeviceUsed: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    privateChallengeParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    session: js.Array[Anon_ADMINNOSRPAUTH] = null,
    usernameParameter: java.lang.String = null,
    validationData: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_ChallengeAnswer = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes)
    if (challengeAnswer != null) __obj.updateDynamic("challengeAnswer")(challengeAnswer)
    if (challengeName != null) __obj.updateDynamic("challengeName")(challengeName)
    if (codeParameter != null) __obj.updateDynamic("codeParameter")(codeParameter)
    if (!js.isUndefined(newDeviceUsed)) __obj.updateDynamic("newDeviceUsed")(newDeviceUsed)
    if (password != null) __obj.updateDynamic("password")(password)
    if (privateChallengeParameters != null) __obj.updateDynamic("privateChallengeParameters")(privateChallengeParameters)
    if (session != null) __obj.updateDynamic("session")(session)
    if (usernameParameter != null) __obj.updateDynamic("usernameParameter")(usernameParameter)
    if (validationData != null) __obj.updateDynamic("validationData")(validationData)
    __obj.asInstanceOf[Anon_ChallengeAnswer]
  }
}

