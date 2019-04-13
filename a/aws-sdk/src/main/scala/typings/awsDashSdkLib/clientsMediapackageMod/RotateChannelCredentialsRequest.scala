package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateChannelCredentialsRequest extends js.Object {
  /**
    * The ID of the channel to update.
    */
  var Id: __string
}

object RotateChannelCredentialsRequest {
  @scala.inline
  def apply(Id: __string): RotateChannelCredentialsRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[RotateChannelCredentialsRequest]
  }
}

