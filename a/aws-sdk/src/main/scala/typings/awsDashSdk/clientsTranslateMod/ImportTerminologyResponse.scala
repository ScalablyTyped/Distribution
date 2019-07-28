package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportTerminologyResponse extends js.Object {
  /**
    * The properties of the custom terminology being imported.
    */
  var TerminologyProperties: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.TerminologyProperties] = js.undefined
}

object ImportTerminologyResponse {
  @scala.inline
  def apply(TerminologyProperties: TerminologyProperties = null): ImportTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    if (TerminologyProperties != null) __obj.updateDynamic("TerminologyProperties")(TerminologyProperties)
    __obj.asInstanceOf[ImportTerminologyResponse]
  }
}

