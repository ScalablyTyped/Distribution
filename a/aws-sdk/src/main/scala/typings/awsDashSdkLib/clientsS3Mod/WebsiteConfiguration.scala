package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteConfiguration extends js.Object {
  /**
    * 
    */
  var ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined
  /**
    * 
    */
  var IndexDocument: js.UndefOr[IndexDocument] = js.undefined
  /**
    * 
    */
  var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined
  /**
    * 
    */
  var RoutingRules: js.UndefOr[RoutingRules] = js.undefined
}

object WebsiteConfiguration {
  @scala.inline
  def apply(
    ErrorDocument: ErrorDocument = null,
    IndexDocument: IndexDocument = null,
    RedirectAllRequestsTo: RedirectAllRequestsTo = null,
    RoutingRules: RoutingRules = null
  ): WebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument)
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument)
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo)
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules)
    __obj.asInstanceOf[WebsiteConfiguration]
  }
}

