package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDestinationRequest extends js.Object {
  /**
    * The name of the destination.
    */
  var destinationName: DestinationName
}

object DeleteDestinationRequest {
  @scala.inline
  def apply(destinationName: DestinationName): DeleteDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationName = destinationName)
  
    __obj.asInstanceOf[DeleteDestinationRequest]
  }
}

