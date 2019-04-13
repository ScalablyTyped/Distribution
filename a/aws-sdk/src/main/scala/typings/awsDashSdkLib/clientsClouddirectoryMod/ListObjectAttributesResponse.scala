package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectAttributesResponse extends js.Object {
  /**
    * Attributes map that is associated with the object. AttributeArn is the key, and attribute value is the value.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListObjectAttributesResponse {
  @scala.inline
  def apply(Attributes: AttributeKeyAndValueList = null, NextToken: NextToken = null): ListObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListObjectAttributesResponse]
  }
}

