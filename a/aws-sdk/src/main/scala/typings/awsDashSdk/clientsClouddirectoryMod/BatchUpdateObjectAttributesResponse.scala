package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateObjectAttributesResponse extends js.Object {
  /**
    * ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}

object BatchUpdateObjectAttributesResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): BatchUpdateObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    __obj.asInstanceOf[BatchUpdateObjectAttributesResponse]
  }
}

