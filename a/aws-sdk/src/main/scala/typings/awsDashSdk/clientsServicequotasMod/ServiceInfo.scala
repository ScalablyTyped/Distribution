package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceInfo extends js.Object {
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceCode] = js.undefined
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceName] = js.undefined
}

object ServiceInfo {
  @scala.inline
  def apply(ServiceCode: ServiceCode = null, ServiceName: ServiceName = null): ServiceInfo = {
    val __obj = js.Dynamic.literal()
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.asInstanceOf[ServiceInfo]
  }
}

