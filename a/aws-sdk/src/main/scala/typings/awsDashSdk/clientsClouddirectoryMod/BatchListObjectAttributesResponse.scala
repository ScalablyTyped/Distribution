package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectAttributesResponse extends js.Object {
  /**
    * The attributes map that is associated with the object. AttributeArn is the key; attribute value is the value.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}

object BatchListObjectAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null, NextToken: NextToken = null): BatchListObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListObjectAttributesResponse]
  }
}

