package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAttachObjectResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that has been attached.
    */
  var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object BatchAttachObjectResponse {
  @scala.inline
  def apply(attachedObjectIdentifier: ObjectIdentifier = null): BatchAttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (attachedObjectIdentifier != null) __obj.updateDynamic("attachedObjectIdentifier")(attachedObjectIdentifier)
    __obj.asInstanceOf[BatchAttachObjectResponse]
  }
}

