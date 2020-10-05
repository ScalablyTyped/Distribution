package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreCancelled extends js.Object {
  var ignoreCancelled: js.UndefOr[Boolean] = js.native
}

object IgnoreCancelled {
  @scala.inline
  def apply(): IgnoreCancelled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreCancelled]
  }
  @scala.inline
  implicit class IgnoreCancelledOps[Self <: IgnoreCancelled] (val x: Self) extends AnyVal {
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
    def setIgnoreCancelled(value: Boolean): Self = this.set("ignoreCancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCancelled: Self = this.set("ignoreCancelled", js.undefined)
  }
  
}

