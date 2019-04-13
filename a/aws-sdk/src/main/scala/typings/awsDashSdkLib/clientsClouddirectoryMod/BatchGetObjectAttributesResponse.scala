package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetObjectAttributesResponse extends js.Object {
  /**
    * The attribute values that are associated with an object.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
}

object BatchGetObjectAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null): BatchGetObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[BatchGetObjectAttributesResponse]
  }
}

