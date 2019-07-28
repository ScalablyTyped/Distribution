package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStreamProcessorRequest extends js.Object {
  /**
    * The name of the stream processor you want to delete.
    */
  var Name: StreamProcessorName
}

object DeleteStreamProcessorRequest {
  @scala.inline
  def apply(Name: StreamProcessorName): DeleteStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteStreamProcessorRequest]
  }
}

