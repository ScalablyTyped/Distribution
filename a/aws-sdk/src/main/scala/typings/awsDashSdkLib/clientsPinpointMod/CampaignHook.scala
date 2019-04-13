package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignHook extends js.Object {
  /**
    * Lambda function name or arn to be called for delivery
    */
  var LambdaFunctionName: js.UndefOr[__string] = js.undefined
  /**
    * What mode Lambda should be invoked in.
    */
  var Mode: js.UndefOr[Mode] = js.undefined
  /**
    * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request
    */
  var WebUrl: js.UndefOr[__string] = js.undefined
}

object CampaignHook {
  @scala.inline
  def apply(LambdaFunctionName: __string = null, Mode: Mode = null, WebUrl: __string = null): CampaignHook = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionName != null) __obj.updateDynamic("LambdaFunctionName")(LambdaFunctionName)
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (WebUrl != null) __obj.updateDynamic("WebUrl")(WebUrl)
    __obj.asInstanceOf[CampaignHook]
  }
}

