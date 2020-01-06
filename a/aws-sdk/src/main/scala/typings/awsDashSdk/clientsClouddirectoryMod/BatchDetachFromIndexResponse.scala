package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachFromIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that was detached from the index.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object BatchDetachFromIndexResponse {
  @scala.inline
  def apply(DetachedObjectIdentifier: ObjectIdentifier = null): BatchDetachFromIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (DetachedObjectIdentifier != null) __obj.updateDynamic("DetachedObjectIdentifier")(DetachedObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachFromIndexResponse]
  }
}

