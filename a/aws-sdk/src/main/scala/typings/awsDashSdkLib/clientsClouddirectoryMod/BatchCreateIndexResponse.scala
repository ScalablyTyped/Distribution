package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the index created by this operation.
    */
  var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object BatchCreateIndexResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): BatchCreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    __obj.asInstanceOf[BatchCreateIndexResponse]
  }
}

