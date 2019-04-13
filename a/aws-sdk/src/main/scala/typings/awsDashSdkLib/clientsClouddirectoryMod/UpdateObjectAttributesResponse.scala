package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateObjectAttributesResponse extends js.Object {
  /**
    * The ObjectIdentifier of the updated object.
    */
  var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object UpdateObjectAttributesResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): UpdateObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    __obj.asInstanceOf[UpdateObjectAttributesResponse]
  }
}

