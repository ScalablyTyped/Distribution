package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIncomingTypedLinksResponse extends js.Object {
  /**
    * Returns one or more typed link specifiers as output.
    */
  var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListIncomingTypedLinksResponse {
  @scala.inline
  def apply(LinkSpecifiers: TypedLinkSpecifierList = null, NextToken: NextToken = null): ListIncomingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    if (LinkSpecifiers != null) __obj.updateDynamic("LinkSpecifiers")(LinkSpecifiers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIncomingTypedLinksResponse]
  }
}

