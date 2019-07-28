package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseBundlesResult extends js.Object {
  /**
    * An object describing the result of your get relational database bundles request.
    */
  var bundles: js.UndefOr[RelationalDatabaseBundleList] = js.undefined
  /**
    * A token used for advancing to the next page of results of your get relational database bundles request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GetRelationalDatabaseBundlesResult {
  @scala.inline
  def apply(bundles: RelationalDatabaseBundleList = null, nextPageToken: String = null): GetRelationalDatabaseBundlesResult = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetRelationalDatabaseBundlesResult]
  }
}

