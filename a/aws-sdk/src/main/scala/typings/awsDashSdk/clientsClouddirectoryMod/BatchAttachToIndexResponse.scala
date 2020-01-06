package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachToIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object BatchAttachToIndexResponse {
  @scala.inline
  def apply(AttachedObjectIdentifier: ObjectIdentifier = null): BatchAttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedObjectIdentifier != null) __obj.updateDynamic("AttachedObjectIdentifier")(AttachedObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachToIndexResponse]
  }
}

