package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListOutgoingTypedLinksResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
}

object BatchListOutgoingTypedLinksResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TypedLinkSpecifiers: TypedLinkSpecifierList = null): BatchListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TypedLinkSpecifiers != null) __obj.updateDynamic("TypedLinkSpecifiers")(TypedLinkSpecifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListOutgoingTypedLinksResponse]
  }
}

