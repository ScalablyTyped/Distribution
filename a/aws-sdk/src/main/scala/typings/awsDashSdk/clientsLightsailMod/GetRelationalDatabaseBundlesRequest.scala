package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseBundlesRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database bundles request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetRelationalDatabaseBundlesRequest {
  @scala.inline
  def apply(pageToken: String = null): GetRelationalDatabaseBundlesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetRelationalDatabaseBundlesRequest]
  }
}

