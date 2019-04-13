package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartStreamProcessorRequest extends js.Object {
  /**
    * The name of the stream processor to start processing.
    */
  var Name: StreamProcessorName
}

object StartStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): StartStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StartStreamProcessorRequest]
  }
}

