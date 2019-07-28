package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSchema extends js.Object {
  /**
    * A list of RecordColumn objects. 
    */
  var RecordColumns: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RecordColumns
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncoding: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RecordEncoding] = js.undefined
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormat: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RecordFormat
}

object SourceSchema {
  @scala.inline
  def apply(RecordColumns: RecordColumns, RecordFormat: RecordFormat, RecordEncoding: RecordEncoding = null): SourceSchema = {
    val __obj = js.Dynamic.literal(RecordColumns = RecordColumns, RecordFormat = RecordFormat)
    if (RecordEncoding != null) __obj.updateDynamic("RecordEncoding")(RecordEncoding)
    __obj.asInstanceOf[SourceSchema]
  }
}

