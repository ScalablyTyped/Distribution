package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamSummaryOutput extends js.Object {
  /**
    * A StreamDescriptionSummary containing information about the stream.
    */
  var StreamDescriptionSummary: typings.awsDashSdk.clientsKinesisMod.StreamDescriptionSummary
}

object DescribeStreamSummaryOutput {
  @scala.inline
  def apply(StreamDescriptionSummary: StreamDescriptionSummary): DescribeStreamSummaryOutput = {
    val __obj = js.Dynamic.literal(StreamDescriptionSummary = StreamDescriptionSummary)
  
    __obj.asInstanceOf[DescribeStreamSummaryOutput]
  }
}

