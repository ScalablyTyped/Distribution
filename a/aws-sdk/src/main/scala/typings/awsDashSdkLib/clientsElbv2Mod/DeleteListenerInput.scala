package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteListenerInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: awsDashSdkLib.clientsElbv2Mod.ListenerArn
}

object DeleteListenerInput {
  @scala.inline
  def apply(ListenerArn: ListenerArn): DeleteListenerInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn)
  
    __obj.asInstanceOf[DeleteListenerInput]
  }
}

