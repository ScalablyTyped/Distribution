package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamSummaryInput extends js.Object {
  /**
    * The name of the stream to describe.
    */
  var StreamName: awsDashSdkLib.clientsKinesisMod.StreamName
}

object DescribeStreamSummaryInput {
  @scala.inline
  def apply(StreamName: StreamName): DescribeStreamSummaryInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName)
  
    __obj.asInstanceOf[DescribeStreamSummaryInput]
  }
}

