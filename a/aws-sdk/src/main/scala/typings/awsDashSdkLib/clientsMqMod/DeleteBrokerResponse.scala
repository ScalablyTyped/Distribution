package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBrokerResponse extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[__string] = js.undefined
}

object DeleteBrokerResponse {
  @scala.inline
  def apply(BrokerId: __string = null): DeleteBrokerResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId)
    __obj.asInstanceOf[DeleteBrokerResponse]
  }
}

