package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the index created by this operation.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
}

object CreateIndexResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): CreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    __obj.asInstanceOf[CreateIndexResponse]
  }
}

