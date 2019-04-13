package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupOptionsMessage extends js.Object {
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  var OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined
}

object OptionGroupOptionsMessage {
  @scala.inline
  def apply(Marker: String = null, OptionGroupOptions: OptionGroupOptionsList = null): OptionGroupOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (OptionGroupOptions != null) __obj.updateDynamic("OptionGroupOptions")(OptionGroupOptions)
    __obj.asInstanceOf[OptionGroupOptionsMessage]
  }
}

