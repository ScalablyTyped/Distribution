package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduChannelRequest extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  var ApiKey: js.UndefOr[__string] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * Platform credential Secret key from Baidu.
    */
  var SecretKey: js.UndefOr[__string] = js.undefined
}

object BaiduChannelRequest {
  @scala.inline
  def apply(ApiKey: __string = null, Enabled: js.UndefOr[__boolean] = js.undefined, SecretKey: __string = null): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ApiKey != null) __obj.updateDynamic("ApiKey")(ApiKey)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey)
    __obj.asInstanceOf[BaiduChannelRequest]
  }
}

