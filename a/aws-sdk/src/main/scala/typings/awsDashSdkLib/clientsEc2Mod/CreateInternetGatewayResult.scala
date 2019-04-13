package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInternetGatewayResult extends js.Object {
  /**
    * Information about the internet gateway.
    */
  var InternetGateway: js.UndefOr[InternetGateway] = js.undefined
}

object CreateInternetGatewayResult {
  @scala.inline
  def apply(InternetGateway: InternetGateway = null): CreateInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (InternetGateway != null) __obj.updateDynamic("InternetGateway")(InternetGateway)
    __obj.asInstanceOf[CreateInternetGatewayResult]
  }
}

