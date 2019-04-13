package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachObjectResponse extends js.Object {
  /**
    * The ObjectIdentifier that was detached from the object.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object DetachObjectResponse {
  @scala.inline
  def apply(DetachedObjectIdentifier: ObjectIdentifier = null): DetachObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (DetachedObjectIdentifier != null) __obj.updateDynamic("DetachedObjectIdentifier")(DetachedObjectIdentifier)
    __obj.asInstanceOf[DetachObjectResponse]
  }
}

