package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamProcessorRequest extends js.Object {
  /**
    * Name of the stream processor for which you want information.
    */
  var Name: StreamProcessorName = js.native
}

object DescribeStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): DescribeStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStreamProcessorRequest]
  }
}

