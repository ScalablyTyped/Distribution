package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTerminologyResponse extends js.Object {
  /**
    * The data location of the custom terminology being retrieved. The custom terminology file is returned in a presigned url that has a 30 minute expiration.
    */
  var TerminologyDataLocation: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.TerminologyDataLocation] = js.undefined
  /**
    * The properties of the custom terminology being retrieved.
    */
  var TerminologyProperties: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.TerminologyProperties] = js.undefined
}

object GetTerminologyResponse {
  @scala.inline
  def apply(
    TerminologyDataLocation: TerminologyDataLocation = null,
    TerminologyProperties: TerminologyProperties = null
  ): GetTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    if (TerminologyDataLocation != null) __obj.updateDynamic("TerminologyDataLocation")(TerminologyDataLocation)
    if (TerminologyProperties != null) __obj.updateDynamic("TerminologyProperties")(TerminologyProperties)
    __obj.asInstanceOf[GetTerminologyResponse]
  }
}

