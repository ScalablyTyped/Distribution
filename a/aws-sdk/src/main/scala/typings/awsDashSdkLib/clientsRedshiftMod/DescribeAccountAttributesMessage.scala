package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAttributesMessage extends js.Object {
  /**
    * A list of attribute names.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
}

object DescribeAccountAttributesMessage {
  @scala.inline
  def apply(AttributeNames: AttributeNameList = null): DescribeAccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames)
    __obj.asInstanceOf[DescribeAccountAttributesMessage]
  }
}

