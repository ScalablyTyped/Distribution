package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVInput extends js.Object {
  /**
    * Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.
    */
  var AllowQuotedRecordDelimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AllowQuotedRecordDelimiter] = js.native
  /**
    * A single character used to indicate that a row should be ignored when the character is present at the start of that row. You can specify any character to indicate a comment line.
    */
  var Comments: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Comments] = js.native
  /**
    * A single character used to separate individual fields in a record. You can specify an arbitrary delimiter.
    */
  var FieldDelimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.FieldDelimiter] = js.native
  /**
    * Describes the first line of input. Valid values are:    NONE: First line is not a header.    IGNORE: First line is a header, but you can't use the header values to indicate the column in an expression. You can use column position (such as _1, _2, …) to indicate the column (SELECT s._1 FROM OBJECT s).    Use: First line is a header, and you can use the header value to identify a column in an expression (SELECT "name" FROM OBJECT).   
    */
  var FileHeaderInfo: js.UndefOr[typings.awsDashSdk.clientsS3Mod.FileHeaderInfo] = js.native
  /**
    * A single character used for escaping when the field delimiter is part of the value. For example, if the value is a, b, Amazon S3 wraps this field value in quotation marks, as follows: " a , b ". Type: String Default: "  Ancestors: CSV 
    */
  var QuoteCharacter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteCharacter] = js.native
  /**
    * A single character used for escaping the quotation mark character inside an already escaped value. For example, the value """ a , b """ is parsed as " a , b ".
    */
  var QuoteEscapeCharacter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.QuoteEscapeCharacter] = js.native
  /**
    * A single character used to separate individual records in the input. Instead of the default value, you can specify an arbitrary delimiter.
    */
  var RecordDelimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RecordDelimiter] = js.native
}

object CSVInput {
  @scala.inline
  def apply(
    AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.undefined,
    Comments: Comments = null,
    FieldDelimiter: FieldDelimiter = null,
    FileHeaderInfo: FileHeaderInfo = null,
    QuoteCharacter: QuoteCharacter = null,
    QuoteEscapeCharacter: QuoteEscapeCharacter = null,
    RecordDelimiter: RecordDelimiter = null
  ): CSVInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowQuotedRecordDelimiter)) __obj.updateDynamic("AllowQuotedRecordDelimiter")(AllowQuotedRecordDelimiter.asInstanceOf[js.Any])
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter.asInstanceOf[js.Any])
    if (FileHeaderInfo != null) __obj.updateDynamic("FileHeaderInfo")(FileHeaderInfo.asInstanceOf[js.Any])
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter.asInstanceOf[js.Any])
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter.asInstanceOf[js.Any])
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVInput]
  }
}

