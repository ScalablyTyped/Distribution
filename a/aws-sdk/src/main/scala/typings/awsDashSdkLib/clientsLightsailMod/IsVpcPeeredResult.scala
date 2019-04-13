package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsVpcPeeredResult extends js.Object {
  /**
    * Returns true if the Lightsail VPC is peered; otherwise, false.
    */
  var isPeered: js.UndefOr[scala.Boolean] = js.undefined
}

object IsVpcPeeredResult {
  @scala.inline
  def apply(isPeered: js.UndefOr[scala.Boolean] = js.undefined): IsVpcPeeredResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPeered)) __obj.updateDynamic("isPeered")(isPeered)
    __obj.asInstanceOf[IsVpcPeeredResult]
  }
}

