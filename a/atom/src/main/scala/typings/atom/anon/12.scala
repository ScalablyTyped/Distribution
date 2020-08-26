package typings.atom.anon

import typings.atom.atomStrings.`12px`
import typings.atom.atomStrings.`14px`
import typings.atom.atomStrings.`16px`
import typings.atom.atomStrings.`18px`
import typings.atom.atomStrings.`21px`
import typings.atom.atomStrings.`24px`
import typings.atom.atomStrings.`28px`
import typings.atom.atomStrings.`32px`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `12` extends js.Object {
  var newValue: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px` = js.native
  var oldValue: js.UndefOr[`12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`] = js.native
}

object `12` {
  @scala.inline
  def apply(newValue: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): `12` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  @scala.inline
  implicit class `12Ops`[Self <: `12`] (val x: Self) extends AnyVal {
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
    def setNewValue(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
  
}

