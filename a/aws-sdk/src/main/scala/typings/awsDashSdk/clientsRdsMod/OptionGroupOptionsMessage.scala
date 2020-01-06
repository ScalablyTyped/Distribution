package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOptionsMessage extends js.Object {
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.native
}

object OptionGroupOptionsMessage {
  @scala.inline
  def apply(Marker: String = null, OptionGroupOptions: OptionGroupOptionsList = null): OptionGroupOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (OptionGroupOptions != null) __obj.updateDynamic("OptionGroupOptions")(OptionGroupOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOptionsMessage]
  }
}

