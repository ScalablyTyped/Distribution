package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListOutgoingTypedLinksResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
}

object BatchListOutgoingTypedLinksResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TypedLinkSpecifiers: TypedLinkSpecifierList = null): BatchListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TypedLinkSpecifiers != null) __obj.updateDynamic("TypedLinkSpecifiers")(TypedLinkSpecifiers)
    __obj.asInstanceOf[BatchListOutgoingTypedLinksResponse]
  }
}

