package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContactAttributesResponse extends js.Object {
  /**
    * The attributes to update.
    */
  var Attributes: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Attributes] = js.undefined
}

object GetContactAttributesResponse {
  @scala.inline
  def apply(Attributes: Attributes = null): GetContactAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[GetContactAttributesResponse]
  }
}

