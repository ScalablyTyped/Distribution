package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachObjectResponse extends js.Object {
  /**
    * The attached ObjectIdentifier, which is the child ObjectIdentifier.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object AttachObjectResponse {
  @scala.inline
  def apply(AttachedObjectIdentifier: ObjectIdentifier = null): AttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedObjectIdentifier != null) __obj.updateDynamic("AttachedObjectIdentifier")(AttachedObjectIdentifier)
    __obj.asInstanceOf[AttachObjectResponse]
  }
}

