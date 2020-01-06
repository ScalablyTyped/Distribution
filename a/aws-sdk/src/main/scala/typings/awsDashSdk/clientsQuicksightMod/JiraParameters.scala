package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JiraParameters extends js.Object {
  /**
    * The base URL of the Jira site.
    */
  var SiteBaseUrl: typings.awsDashSdk.clientsQuicksightMod.SiteBaseUrl = js.native
}

object JiraParameters {
  @scala.inline
  def apply(SiteBaseUrl: SiteBaseUrl): JiraParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JiraParameters]
  }
}

