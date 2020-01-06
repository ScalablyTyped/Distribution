package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVOutput extends js.Object {
  /**
    * The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
    */
  var FieldDelimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.FieldDelimiter] = js.native
  /**
    * A single character used for escaping when the field delimiter is part of the value. For example, if the value is a, b, Amazon S3 wraps this field value in quotation marks, as follows: " a , b ".
    */
  var QuoteCharacter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteCharacter] = js.native
  /**
    * The single character used for escaping the quote character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteEscapeCharacter] = js.native
  /**
    * Indicates whether to use quotation marks around output fields.     ALWAYS: Always use quotation marks for output fields.    ASNEEDED: Use quotation marks for output fields when needed.  
    */
  var QuoteFields: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteFields] = js.native
  /**
    * A single character used to separate individual records in the output. Instead of the default value, you can specify an arbitrary delimiter.
    */
  var RecordDelimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RecordDelimiter] = js.native
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
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter.asInstanceOf[js.Any])
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter.asInstanceOf[js.Any])
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter.asInstanceOf[js.Any])
    if (QuoteFields != null) __obj.updateDynamic("QuoteFields")(QuoteFields.asInstanceOf[js.Any])
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVOutput]
  }
}

