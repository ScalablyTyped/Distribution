package typings.apolloCacheControl.mod

import typings.apolloCacheControl.anon.pathArraystringnumberCach
import typings.apolloCacheControl.apolloCacheControlNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheControlFormat extends js.Object {
  var hints: js.Array[pathArraystringnumberCach] = js.native
  var version: `1` = js.native
}

object CacheControlFormat {
  @scala.inline
  def apply(hints: js.Array[pathArraystringnumberCach], version: `1`): CacheControlFormat = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheControlFormat]
  }
  @scala.inline
  implicit class CacheControlFormatOps[Self <: CacheControlFormat] (val x: Self) extends AnyVal {
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
    def setHintsVarargs(value: pathArraystringnumberCach*): Self = this.set("hints", js.Array(value :_*))
    @scala.inline
    def setHints(value: js.Array[pathArraystringnumberCach]): Self = this.set("hints", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: `1`): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

