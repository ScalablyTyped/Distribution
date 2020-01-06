package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingOptions extends js.Object {
  /**
    * The domain that you want to use for tracking open and click events.
    */
  var CustomRedirectDomain: typings.awsDashSdk.clientsSesv2Mod.CustomRedirectDomain = js.native
}

object TrackingOptions {
  @scala.inline
  def apply(CustomRedirectDomain: CustomRedirectDomain): TrackingOptions = {
    val __obj = js.Dynamic.literal(CustomRedirectDomain = CustomRedirectDomain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackingOptions]
  }
}

