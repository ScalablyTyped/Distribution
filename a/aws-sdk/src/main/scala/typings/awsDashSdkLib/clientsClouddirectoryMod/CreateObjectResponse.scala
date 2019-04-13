package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateObjectResponse extends js.Object {
  /**
    * The identifier that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object CreateObjectResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): CreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    __obj.asInstanceOf[CreateObjectResponse]
  }
}

