package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetachObjectResponse extends js.Object {
  /**
    * The ObjectIdentifier of the detached object.
    */
  var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object BatchDetachObjectResponse {
  @scala.inline
  def apply(detachedObjectIdentifier: ObjectIdentifier = null): BatchDetachObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (detachedObjectIdentifier != null) __obj.updateDynamic("detachedObjectIdentifier")(detachedObjectIdentifier)
    __obj.asInstanceOf[BatchDetachObjectResponse]
  }
}

