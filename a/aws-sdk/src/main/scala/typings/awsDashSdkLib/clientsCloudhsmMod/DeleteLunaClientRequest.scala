package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLunaClientRequest extends js.Object {
  /**
    * The ARN of the client to delete.
    */
  var ClientArn: awsDashSdkLib.clientsCloudhsmMod.ClientArn
}

object DeleteLunaClientRequest {
  @scala.inline
  def apply(ClientArn: ClientArn): DeleteLunaClientRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn)
  
    __obj.asInstanceOf[DeleteLunaClientRequest]
  }
}

