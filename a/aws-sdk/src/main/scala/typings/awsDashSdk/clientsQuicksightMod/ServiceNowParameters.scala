package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceNowParameters extends js.Object {
  /**
    * URL of the base site.
    */
  var SiteBaseUrl: typings.awsDashSdk.clientsQuicksightMod.SiteBaseUrl = js.native
}

object ServiceNowParameters {
  @scala.inline
  def apply(SiteBaseUrl: SiteBaseUrl): ServiceNowParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceNowParameters]
  }
}

