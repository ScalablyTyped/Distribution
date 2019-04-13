package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamProcessorRequest extends js.Object {
  /**
    * Name of the stream processor for which you want information.
    */
  var Name: StreamProcessorName
}

object DescribeStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): DescribeStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DescribeStreamProcessorRequest]
  }
}

