package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetLinkAttributesResponse extends js.Object {
  /**
    * The attributes that are associated with the typed link.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
}

object BatchGetLinkAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null): BatchGetLinkAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[BatchGetLinkAttributesResponse]
  }
}

