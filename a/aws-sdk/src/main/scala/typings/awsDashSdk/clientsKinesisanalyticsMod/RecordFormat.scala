package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordFormat extends js.Object {
  /**
    * When configuring application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var MappingParameters: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.MappingParameters] = js.native
  /**
    * The type of record format.
    */
  var RecordFormatType: typings.awsDashSdk.clientsKinesisanalyticsMod.RecordFormatType = js.native
}

object RecordFormat {
  @scala.inline
  def apply(RecordFormatType: RecordFormatType, MappingParameters: MappingParameters = null): RecordFormat = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
    if (MappingParameters != null) __obj.updateDynamic("MappingParameters")(MappingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFormat]
  }
}

