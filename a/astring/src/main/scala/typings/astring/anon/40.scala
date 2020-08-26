package typings.astring.anon

import typings.astring.astringStrings.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `40` extends js.Object {
  var `type`: VariableDeclarator = js.native
}

object `40` {
  @scala.inline
  def apply(`type`: VariableDeclarator): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  @scala.inline
  implicit class `40Ops`[Self <: `40`] (val x: Self) extends AnyVal {
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
    def setType(value: VariableDeclarator): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

