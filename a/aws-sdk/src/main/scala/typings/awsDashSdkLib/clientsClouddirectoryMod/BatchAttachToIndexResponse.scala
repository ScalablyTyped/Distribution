package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAttachToIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object BatchAttachToIndexResponse {
  @scala.inline
  def apply(AttachedObjectIdentifier: ObjectIdentifier = null): BatchAttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedObjectIdentifier != null) __obj.updateDynamic("AttachedObjectIdentifier")(AttachedObjectIdentifier)
    __obj.asInstanceOf[BatchAttachToIndexResponse]
  }
}

