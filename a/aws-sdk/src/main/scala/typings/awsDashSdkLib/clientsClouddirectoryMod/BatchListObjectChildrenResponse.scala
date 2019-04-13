package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectChildrenResponse extends js.Object {
  /**
    * The children structure, which is a map with the key as the LinkName and ObjectIdentifier as the value.
    */
  var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object BatchListObjectChildrenResponse {
  @scala.inline
  def apply(Children: LinkNameToObjectIdentifierMap = null, NextToken: NextToken = null): BatchListObjectChildrenResponse = {
    val __obj = js.Dynamic.literal()
    if (Children != null) __obj.updateDynamic("Children")(Children)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListObjectChildrenResponse]
  }
}

