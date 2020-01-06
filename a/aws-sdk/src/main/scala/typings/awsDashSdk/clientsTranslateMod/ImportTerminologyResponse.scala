package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportTerminologyResponse extends js.Object {
  /**
    * The properties of the custom terminology being imported.
    */
  var TerminologyProperties: js.UndefOr[typings.awsDashSdk.clientsTranslateMod.TerminologyProperties] = js.native
}

object ImportTerminologyResponse {
  @scala.inline
  def apply(TerminologyProperties: TerminologyProperties = null): ImportTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    if (TerminologyProperties != null) __obj.updateDynamic("TerminologyProperties")(TerminologyProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTerminologyResponse]
  }
}

