package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventSourceMappingRequest extends js.Object {
  /**
    * The identifier of the event source mapping.
    */
  var UUID: String
}

object DeleteEventSourceMappingRequest {
  @scala.inline
  def apply(UUID: String): DeleteEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID)
  
    __obj.asInstanceOf[DeleteEventSourceMappingRequest]
  }
}

