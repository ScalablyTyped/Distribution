package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseBundlesResult extends js.Object {
  /**
    * An object describing the result of your get relational database bundles request.
    */
  var bundles: js.UndefOr[RelationalDatabaseBundleList] = js.native
  /**
    * A token used for advancing to the next page of results of your get relational database bundles request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabaseBundlesResult {
  @scala.inline
  def apply(bundles: RelationalDatabaseBundleList = null, nextPageToken: String = null): GetRelationalDatabaseBundlesResult = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseBundlesResult]
  }
}

