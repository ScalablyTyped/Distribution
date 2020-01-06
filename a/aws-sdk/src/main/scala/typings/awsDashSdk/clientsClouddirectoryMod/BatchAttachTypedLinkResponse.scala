package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachTypedLinkResponse extends js.Object {
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.TypedLinkSpecifier] = js.native
}

object BatchAttachTypedLinkResponse {
  @scala.inline
  def apply(TypedLinkSpecifier: TypedLinkSpecifier = null): BatchAttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (TypedLinkSpecifier != null) __obj.updateDynamic("TypedLinkSpecifier")(TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachTypedLinkResponse]
  }
}

