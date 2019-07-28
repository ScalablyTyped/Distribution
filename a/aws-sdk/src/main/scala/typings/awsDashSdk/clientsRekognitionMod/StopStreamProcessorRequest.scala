package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopStreamProcessorRequest extends js.Object {
  /**
    * The name of a stream processor created by CreateStreamProcessor.
    */
  var Name: StreamProcessorName
}

object StopStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): StopStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StopStreamProcessorRequest]
  }
}

