package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAttributesResponse extends js.Object {
  /**
    *  The attributes that are currently set for the account. 
    */
  var Attributes: js.UndefOr[AccountAttributes] = js.undefined
}

object DescribeAccountAttributesResponse {
  @scala.inline
  def apply(Attributes: AccountAttributes = null): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
}

