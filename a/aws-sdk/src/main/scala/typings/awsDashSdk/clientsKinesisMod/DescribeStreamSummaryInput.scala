package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamSummaryInput extends js.Object {
  /**
    * The name of the stream to describe.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object DescribeStreamSummaryInput {
  @scala.inline
  def apply(StreamName: StreamName): DescribeStreamSummaryInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName)
  
    __obj.asInstanceOf[DescribeStreamSummaryInput]
  }
}

