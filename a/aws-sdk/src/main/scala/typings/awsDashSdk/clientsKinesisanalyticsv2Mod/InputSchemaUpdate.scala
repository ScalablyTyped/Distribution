package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSchemaUpdate extends js.Object {
  /**
    * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream.
    */
  var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.undefined
  /**
    * Specifies the encoding of the records in the streaming source; for example, UTF-8.
    */
  var RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.undefined
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined
}

object InputSchemaUpdate {
  @scala.inline
  def apply(
    RecordColumnUpdates: RecordColumns = null,
    RecordEncodingUpdate: RecordEncoding = null,
    RecordFormatUpdate: RecordFormat = null
  ): InputSchemaUpdate = {
    val __obj = js.Dynamic.literal()
    if (RecordColumnUpdates != null) __obj.updateDynamic("RecordColumnUpdates")(RecordColumnUpdates)
    if (RecordEncodingUpdate != null) __obj.updateDynamic("RecordEncodingUpdate")(RecordEncodingUpdate)
    if (RecordFormatUpdate != null) __obj.updateDynamic("RecordFormatUpdate")(RecordFormatUpdate)
    __obj.asInstanceOf[InputSchemaUpdate]
  }
}

