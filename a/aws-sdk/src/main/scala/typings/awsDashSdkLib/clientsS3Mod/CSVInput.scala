package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVInput extends js.Object {
  /**
    * Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.
    */
  var AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter] = js.undefined
  /**
    * The single character used to indicate a row should be ignored when present at the start of a row.
    */
  var Comments: js.UndefOr[Comments] = js.undefined
  /**
    * The value used to separate individual fields in a record.
    */
  var FieldDelimiter: js.UndefOr[FieldDelimiter] = js.undefined
  /**
    * Describes the first line of input. Valid values: None, Ignore, Use.
    */
  var FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined
  /**
    * Value used for escaping where the field delimiter is part of the value.
    */
  var QuoteCharacter: js.UndefOr[QuoteCharacter] = js.undefined
  /**
    * The single character used for escaping the quote character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter] = js.undefined
  /**
    * The value used to separate individual records.
    */
  var RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
}

object CSVInput {
  @scala.inline
  def apply(
    AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter] = js.undefined,
    Comments: Comments = null,
    FieldDelimiter: FieldDelimiter = null,
    FileHeaderInfo: FileHeaderInfo = null,
    QuoteCharacter: QuoteCharacter = null,
    QuoteEscapeCharacter: QuoteEscapeCharacter = null,
    RecordDelimiter: RecordDelimiter = null
  ): CSVInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowQuotedRecordDelimiter)) __obj.updateDynamic("AllowQuotedRecordDelimiter")(AllowQuotedRecordDelimiter)
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter)
    if (FileHeaderInfo != null) __obj.updateDynamic("FileHeaderInfo")(FileHeaderInfo.asInstanceOf[js.Any])
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter)
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter)
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter)
    __obj.asInstanceOf[CSVInput]
  }
}

