package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRandomPasswordRequest extends js.Object {
  /**
    * A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.
    */
  var ExcludeCharacters: js.UndefOr[ExcludeCharactersType] = js.undefined
  /**
    * Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.
    */
  var ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.undefined
  /**
    * Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.
    */
  var ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.undefined
  /**
    * Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included. The following are the punctuation characters that can be included in the generated password if you don't explicitly exclude them with ExcludeCharacters or ExcludePunctuation:  ! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~ 
    */
  var ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.undefined
  /**
    * Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.
    */
  var ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.undefined
  /**
    * Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.
    */
  var IncludeSpace: js.UndefOr[IncludeSpaceType] = js.undefined
  /**
    * The desired length of the generated password. The default value if you do not include this parameter is 32 characters.
    */
  var PasswordLength: js.UndefOr[PasswordLengthType] = js.undefined
  /**
    * A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is True and the operation requires at least one of every character type.
    */
  var RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.undefined
}

object GetRandomPasswordRequest {
  @scala.inline
  def apply(
    ExcludeCharacters: ExcludeCharactersType = null,
    ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.undefined,
    ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.undefined,
    ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.undefined,
    ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.undefined,
    IncludeSpace: js.UndefOr[IncludeSpaceType] = js.undefined,
    PasswordLength: js.UndefOr[PasswordLengthType] = js.undefined,
    RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.undefined
  ): GetRandomPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (ExcludeCharacters != null) __obj.updateDynamic("ExcludeCharacters")(ExcludeCharacters)
    if (!js.isUndefined(ExcludeLowercase)) __obj.updateDynamic("ExcludeLowercase")(ExcludeLowercase)
    if (!js.isUndefined(ExcludeNumbers)) __obj.updateDynamic("ExcludeNumbers")(ExcludeNumbers)
    if (!js.isUndefined(ExcludePunctuation)) __obj.updateDynamic("ExcludePunctuation")(ExcludePunctuation)
    if (!js.isUndefined(ExcludeUppercase)) __obj.updateDynamic("ExcludeUppercase")(ExcludeUppercase)
    if (!js.isUndefined(IncludeSpace)) __obj.updateDynamic("IncludeSpace")(IncludeSpace)
    if (!js.isUndefined(PasswordLength)) __obj.updateDynamic("PasswordLength")(PasswordLength)
    if (!js.isUndefined(RequireEachIncludedType)) __obj.updateDynamic("RequireEachIncludedType")(RequireEachIncludedType)
    __obj.asInstanceOf[GetRandomPasswordRequest]
  }
}

