package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVOutput extends js.Object {
  /**
    * The value used to separate individual fields in a record.
    */
  var FieldDelimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.FieldDelimiter] = js.undefined
  /**
    * The value used for escaping where the field delimiter is part of the value.
    */
  var QuoteCharacter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteCharacter] = js.undefined
  /**
    * Th single character used for escaping the quote character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteEscapeCharacter] = js.undefined
  /**
    * Indicates whether or not all output fields should be quoted.
    */
  var QuoteFields: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteFields] = js.undefined
  /**
    * The value used to separate individual records.
    */
  var RecordDelimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RecordDelimiter] = js.undefined
}

object CSVOutput {
  @scala.inline
  def apply(
    FieldDelimiter: FieldDelimiter = null,
    QuoteCharacter: QuoteCharacter = null,
    QuoteEscapeCharacter: QuoteEscapeCharacter = null,
    QuoteFields: QuoteFields = null,
    RecordDelimiter: RecordDelimiter = null
  ): CSVOutput = {
    val __obj = js.Dynamic.literal()
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter)
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter)
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter)
    if (QuoteFields != null) __obj.updateDynamic("QuoteFields")(QuoteFields.asInstanceOf[js.Any])
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter)
    __obj.asInstanceOf[CSVOutput]
  }
}

