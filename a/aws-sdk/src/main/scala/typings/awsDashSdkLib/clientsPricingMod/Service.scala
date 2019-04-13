package typings
package awsDashSdkLib.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * The attributes that are available for this service.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
  /**
    * The code for the AWS service.
    */
  var ServiceCode: js.UndefOr[String] = js.undefined
}

object Service {
  @scala.inline
  def apply(AttributeNames: AttributeNameList = null, ServiceCode: String = null): Service = {
    val __obj = js.Dynamic.literal()
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    __obj.asInstanceOf[Service]
  }
}

