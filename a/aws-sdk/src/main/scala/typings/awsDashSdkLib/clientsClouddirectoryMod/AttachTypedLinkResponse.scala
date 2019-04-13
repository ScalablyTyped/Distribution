package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachTypedLinkResponse extends js.Object {
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
}

object AttachTypedLinkResponse {
  @scala.inline
  def apply(TypedLinkSpecifier: TypedLinkSpecifier = null): AttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (TypedLinkSpecifier != null) __obj.updateDynamic("TypedLinkSpecifier")(TypedLinkSpecifier)
    __obj.asInstanceOf[AttachTypedLinkResponse]
  }
}

