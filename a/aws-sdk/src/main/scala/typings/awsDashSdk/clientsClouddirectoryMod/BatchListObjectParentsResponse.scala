package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectParentsResponse extends js.Object {
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.native
}

object BatchListObjectParentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ParentLinks: ObjectIdentifierAndLinkNameList = null): BatchListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ParentLinks != null) __obj.updateDynamic("ParentLinks")(ParentLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectParentsResponse]
  }
}

