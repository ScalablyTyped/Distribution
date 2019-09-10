package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /**
    * The token of the next page.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * A structure that contains values in multiple encoding formats.
    */
  var Values: js.UndefOr[ValueHolders] = js.undefined
}

object Page {
  @scala.inline
  def apply(NextPageToken: PageToken = null, Values: ValueHolders = null): Page = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Page]
  }
}

