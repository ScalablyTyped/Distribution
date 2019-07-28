package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectChildrenResponse extends js.Object {
  /**
    * Children structure, which is a map with key as the LinkName and ObjectIdentifier as the value.
    */
  var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}

object ListObjectChildrenResponse {
  @scala.inline
  def apply(Children: LinkNameToObjectIdentifierMap = null, NextToken: NextToken = null): ListObjectChildrenResponse = {
    val __obj = js.Dynamic.literal()
    if (Children != null) __obj.updateDynamic("Children")(Children)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListObjectChildrenResponse]
  }
}

