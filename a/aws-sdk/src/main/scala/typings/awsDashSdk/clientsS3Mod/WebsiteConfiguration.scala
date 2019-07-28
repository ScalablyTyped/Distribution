package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteConfiguration extends js.Object {
  /**
    * The name of the error document for the website.
    */
  var ErrorDocument: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ErrorDocument] = js.undefined
  /**
    * The name of the index document for the website.
    */
  var IndexDocument: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IndexDocument] = js.undefined
  /**
    * The redirect behavior for every request to this bucket's website endpoint.  If you specify this property, you can't specify any other property. 
    */
  var RedirectAllRequestsTo: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RedirectAllRequestsTo] = js.undefined
  /**
    * Rules that define when a redirect is applied and the redirect behavior.
    */
  var RoutingRules: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RoutingRules] = js.undefined
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

