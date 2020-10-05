package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralMapKey extends js.Object {
  var key: String = js.native
  var quoted: Boolean = js.native
}

object LiteralMapKey {
  @scala.inline
  def apply(key: String, quoted: Boolean): LiteralMapKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralMapKey]
  }
  @scala.inline
  implicit class LiteralMapKeyOps[Self <: LiteralMapKey] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuoted(value: Boolean): Self = this.set("quoted", value.asInstanceOf[js.Any])
  }
  
}

