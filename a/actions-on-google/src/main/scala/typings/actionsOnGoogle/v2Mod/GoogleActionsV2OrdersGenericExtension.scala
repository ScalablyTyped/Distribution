package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersGenericExtension extends js.Object {
  /**
    * Locations associated with the order. Up to 2 locations.
    */
  var locations: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderLocation]] = js.native
  /**
    * Time indicator associated with the proposed order.
    */
  var time: js.UndefOr[GoogleActionsV2OrdersTime] = js.native
}

object GoogleActionsV2OrdersGenericExtension {
  @scala.inline
  def apply(): GoogleActionsV2OrdersGenericExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersGenericExtension]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersGenericExtensionOps[Self <: GoogleActionsV2OrdersGenericExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocationsVarargs(value: GoogleActionsV2OrdersOrderLocation*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[GoogleActionsV2OrdersOrderLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setTime(value: GoogleActionsV2OrdersTime): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

