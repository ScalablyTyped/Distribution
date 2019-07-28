package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignHook extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to send messages for a campaign.
    */
  var LambdaFunctionName: js.UndefOr[__string] = js.undefined
  /**
    * Specifies which Lambda mode to use when invoking the AWS Lambda function.
    */
  var Mode: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Mode] = js.undefined
  /**
    *  The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function over HTTPS.
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

