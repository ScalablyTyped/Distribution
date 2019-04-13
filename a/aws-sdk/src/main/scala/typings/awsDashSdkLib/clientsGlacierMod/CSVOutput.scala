package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVOutput extends js.Object {
  /**
    * A value used to separate individual fields from each other within a record.
    */
  var FieldDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value used as an escape character where the field delimiter is part of the value.
    */
  var QuoteCharacter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A single character used for escaping the quotation-mark character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value that indicates whether all output fields should be contained within quotation marks.
    */
  var QuoteFields: js.UndefOr[QuoteFields] = js.undefined
  /**
    * A value used to separate individual records from each other.
    */
  var RecordDelimiter: js.UndefOr[java.lang.String] = js.undefined
}

object CSVOutput {
  @scala.inline
  def apply(
    FieldDelimiter: java.lang.String = null,
    QuoteCharacter: java.lang.String = null,
    QuoteEscapeCharacter: java.lang.String = null,
    QuoteFields: QuoteFields = null,
    RecordDelimiter: java.lang.String = null
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

