package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAttachTypedLinkResponse extends js.Object {
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
}

object BatchAttachTypedLinkResponse {
  @scala.inline
  def apply(TypedLinkSpecifier: TypedLinkSpecifier = null): BatchAttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (TypedLinkSpecifier != null) __obj.updateDynamic("TypedLinkSpecifier")(TypedLinkSpecifier)
    __obj.asInstanceOf[BatchAttachTypedLinkResponse]
  }
}

