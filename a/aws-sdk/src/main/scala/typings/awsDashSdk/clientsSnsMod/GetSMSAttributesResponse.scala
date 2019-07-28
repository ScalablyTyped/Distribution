package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSMSAttributesResponse extends js.Object {
  /**
    * The SMS attribute names and their values.
    */
  var attributes: js.UndefOr[MapStringToString] = js.undefined
}

object GetSMSAttributesResponse {
  @scala.inline
  def apply(attributes: MapStringToString = null): GetSMSAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[GetSMSAttributesResponse]
  }
}

