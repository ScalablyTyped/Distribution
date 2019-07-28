package typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identified extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object Identified {
  @scala.inline
  def apply(id: String = null): Identified = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Identified]
  }
}

