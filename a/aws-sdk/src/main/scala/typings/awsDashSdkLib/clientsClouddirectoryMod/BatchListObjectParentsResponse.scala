package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectParentsResponse extends js.Object {
  var NextToken: js.UndefOr[NextToken] = js.undefined
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
}

object BatchListObjectParentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ParentLinks: ObjectIdentifierAndLinkNameList = null): BatchListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ParentLinks != null) __obj.updateDynamic("ParentLinks")(ParentLinks)
    __obj.asInstanceOf[BatchListObjectParentsResponse]
  }
}

