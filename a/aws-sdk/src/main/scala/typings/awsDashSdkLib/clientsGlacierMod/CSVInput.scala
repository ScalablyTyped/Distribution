package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVInput extends js.Object {
  /**
    * A single character used to indicate that a row should be ignored when the character is present at the start of that row.
    */
  var Comments: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value used to separate individual fields from each other within a record.
    */
  var FieldDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Describes the first line of input. Valid values are None, Ignore, and Use.
    */
  var FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined
  /**
    * A value used as an escape character where the field delimiter is part of the value.
    */
  var QuoteCharacter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A single character used for escaping the quotation-mark character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value used to separate individual records from each other.
    */
  var RecordDelimiter: js.UndefOr[java.lang.String] = js.undefined
}

object CSVInput {
  @scala.inline
  def apply(
    Comments: java.lang.String = null,
    FieldDelimiter: java.lang.String = null,
    FileHeaderInfo: FileHeaderInfo = null,
    QuoteCharacter: java.lang.String = null,
    QuoteEscapeCharacter: java.lang.String = null,
    RecordDelimiter: java.lang.String = null
  ): CSVInput = {
    val __obj = js.Dynamic.literal()
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter)
    if (FileHeaderInfo != null) __obj.updateDynamic("FileHeaderInfo")(FileHeaderInfo.asInstanceOf[js.Any])
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter)
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter)
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter)
    __obj.asInstanceOf[CSVInput]
  }
}

