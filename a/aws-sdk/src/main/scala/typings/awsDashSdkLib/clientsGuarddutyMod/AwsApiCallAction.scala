package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsApiCallAction extends js.Object {
  /**
    * AWS API name.
    */
  var Api: js.UndefOr[__string] = js.undefined
  /**
    * AWS API caller type.
    */
  var CallerType: js.UndefOr[__string] = js.undefined
  /**
    * Domain information for the AWS API call.
    */
  var DomainDetails: js.UndefOr[DomainDetails] = js.undefined
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
  /**
    * AWS service name whose API was invoked.
    */
  var ServiceName: js.UndefOr[__string] = js.undefined
}

object AwsApiCallAction {
  @scala.inline
  def apply(
    Api: __string = null,
    CallerType: __string = null,
    DomainDetails: DomainDetails = null,
    RemoteIpDetails: RemoteIpDetails = null,
    ServiceName: __string = null
  ): AwsApiCallAction = {
    val __obj = js.Dynamic.literal()
    if (Api != null) __obj.updateDynamic("Api")(Api)
    if (CallerType != null) __obj.updateDynamic("CallerType")(CallerType)
    if (DomainDetails != null) __obj.updateDynamic("DomainDetails")(DomainDetails)
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.asInstanceOf[AwsApiCallAction]
  }
}

