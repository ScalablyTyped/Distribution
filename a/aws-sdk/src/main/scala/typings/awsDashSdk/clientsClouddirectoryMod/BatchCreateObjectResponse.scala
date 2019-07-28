package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateObjectResponse extends js.Object {
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}

object BatchCreateObjectResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): BatchCreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    __obj.asInstanceOf[BatchCreateObjectResponse]
  }
}

