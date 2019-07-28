package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about each of the domain entries in the user's account.
    */
  var domains: js.UndefOr[DomainList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get active names request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GetDomainsResult {
  @scala.inline
  def apply(domains: DomainList = null, nextPageToken: String = null): GetDomainsResult = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetDomainsResult]
  }
}

