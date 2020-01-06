package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectChildrenResponse extends js.Object {
  /**
    * The children structure, which is a map with the key as the LinkName and ObjectIdentifier as the value.
    */
  var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
}

object BatchListObjectChildrenResponse {
  @scala.inline
  def apply(Children: LinkNameToObjectIdentifierMap = null, NextToken: NextToken = null): BatchListObjectChildrenResponse = {
    val __obj = js.Dynamic.literal()
    if (Children != null) __obj.updateDynamic("Children")(Children.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectChildrenResponse]
  }
}

