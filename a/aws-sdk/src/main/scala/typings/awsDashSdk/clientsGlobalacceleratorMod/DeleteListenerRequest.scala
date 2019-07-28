package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteListenerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString
}

object DeleteListenerRequest {
  @scala.inline
  def apply(ListenerArn: GenericString): DeleteListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn)
  
    __obj.asInstanceOf[DeleteListenerRequest]
  }
}

