package typings.awsDashSdk.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * The attributes that are available for this service.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.native
  /**
    * The code for the AWS service.
    */
  var ServiceCode: js.UndefOr[String] = js.native
}

object Service {
  @scala.inline
  def apply(AttributeNames: AttributeNameList = null, ServiceCode: String = null): Service = {
    val __obj = js.Dynamic.literal()
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames.asInstanceOf[js.Any])
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

