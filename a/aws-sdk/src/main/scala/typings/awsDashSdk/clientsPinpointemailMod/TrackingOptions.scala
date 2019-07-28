package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingOptions extends js.Object {
  /**
    * The domain that you want to use for tracking open and click events.
    */
  var CustomRedirectDomain: typings.awsDashSdk.clientsPinpointemailMod.CustomRedirectDomain
}

object TrackingOptions {
  @scala.inline
  def apply(CustomRedirectDomain: CustomRedirectDomain): TrackingOptions = {
    val __obj = js.Dynamic.literal(CustomRedirectDomain = CustomRedirectDomain)
  
    __obj.asInstanceOf[TrackingOptions]
  }
}

