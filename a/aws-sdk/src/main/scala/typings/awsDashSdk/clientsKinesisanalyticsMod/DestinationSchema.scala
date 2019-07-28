package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationSchema extends js.Object {
  /**
    * Specifies the format of the records on the output stream.
    */
  var RecordFormatType: typings.awsDashSdk.clientsKinesisanalyticsMod.RecordFormatType
}

object DestinationSchema {
  @scala.inline
  def apply(RecordFormatType: RecordFormatType): DestinationSchema = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DestinationSchema]
  }
}

