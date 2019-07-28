package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketWebsiteOutput extends js.Object {
  /**
    * 
    */
  var ErrorDocument: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ErrorDocument] = js.undefined
  /**
    * 
    */
  var IndexDocument: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IndexDocument] = js.undefined
  /**
    * 
    */
  var RedirectAllRequestsTo: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RedirectAllRequestsTo] = js.undefined
  /**
    * 
    */
  var RoutingRules: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RoutingRules] = js.undefined
}

object GetBucketWebsiteOutput {
  @scala.inline
  def apply(
    ErrorDocument: ErrorDocument = null,
    IndexDocument: IndexDocument = null,
    RedirectAllRequestsTo: RedirectAllRequestsTo = null,
    RoutingRules: RoutingRules = null
  ): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal()
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument)
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument)
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo)
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules)
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
}

