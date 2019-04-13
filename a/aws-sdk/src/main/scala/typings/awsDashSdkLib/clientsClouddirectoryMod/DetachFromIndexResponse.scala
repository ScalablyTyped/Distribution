package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachFromIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that was detached from the index.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object DetachFromIndexResponse {
  @scala.inline
  def apply(DetachedObjectIdentifier: ObjectIdentifier = null): DetachFromIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (DetachedObjectIdentifier != null) __obj.updateDynamic("DetachedObjectIdentifier")(DetachedObjectIdentifier)
    __obj.asInstanceOf[DetachFromIndexResponse]
  }
}

