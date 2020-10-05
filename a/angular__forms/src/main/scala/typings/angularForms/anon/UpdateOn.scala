package typings.angularForms.anon

import typings.angularForms.mod.FormHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOn extends js.Object {
  var updateOn: js.UndefOr[FormHooks] = js.native
}

object UpdateOn {
  @scala.inline
  def apply(): UpdateOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOn]
  }
  @scala.inline
  implicit class UpdateOnOps[Self <: UpdateOn] (val x: Self) extends AnyVal {
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
    def setUpdateOn(value: FormHooks): Self = this.set("updateOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateOn: Self = this.set("updateOn", js.undefined)
  }
  
}

