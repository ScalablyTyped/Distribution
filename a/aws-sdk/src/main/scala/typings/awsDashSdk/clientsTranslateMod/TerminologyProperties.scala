package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminologyProperties extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the custom terminology. 
    */
  var Arn: js.UndefOr[TerminologyArn] = js.undefined
  /**
    * The time at which the custom terminology was created, based on the timestamp.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the custom terminology properties.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.Description] = js.undefined
  /**
    * The encryption key for the custom terminology.
    */
  var EncryptionKey: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.EncryptionKey] = js.undefined
  /**
    * The time at which the custom terminology was last update, based on the timestamp.
    */
  var LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the custom terminology.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The size of the file used when importing a custom terminology.
    */
  var SizeBytes: js.UndefOr[Integer] = js.undefined
  /**
    * The language code for the source text of the translation request for which the custom terminology is being used.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined
  /**
    * The language codes for the target languages available with the custom terminology file. All possible target languages are returned in array.
    */
  var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined
  /**
    * The number of terms included in the custom terminology.
    */
  var TermCount: js.UndefOr[Integer] = js.undefined
}

object TerminologyProperties {
  @scala.inline
  def apply(
    Arn: TerminologyArn = null,
    CreatedAt: Timestamp = null,
    Description: Description = null,
    EncryptionKey: EncryptionKey = null,
    LastUpdatedAt: Timestamp = null,
    Name: ResourceName = null,
    SizeBytes: js.UndefOr[Integer] = js.undefined,
    SourceLanguageCode: LanguageCodeString = null,
    TargetLanguageCodes: LanguageCodeStringList = null,
    TermCount: js.UndefOr[Integer] = js.undefined
  ): TerminologyProperties = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EncryptionKey != null) __obj.updateDynamic("EncryptionKey")(EncryptionKey)
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(SizeBytes)) __obj.updateDynamic("SizeBytes")(SizeBytes)
    if (SourceLanguageCode != null) __obj.updateDynamic("SourceLanguageCode")(SourceLanguageCode)
    if (TargetLanguageCodes != null) __obj.updateDynamic("TargetLanguageCodes")(TargetLanguageCodes)
    if (!js.isUndefined(TermCount)) __obj.updateDynamic("TermCount")(TermCount)
    __obj.asInstanceOf[TerminologyProperties]
  }
}

