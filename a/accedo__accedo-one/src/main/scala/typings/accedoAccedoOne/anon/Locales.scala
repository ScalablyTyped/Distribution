package typings.accedoAccedoOne.anon

import typings.accedoAccedoOne.mod.AccedoLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locales extends js.Object {
  var locales: js.Array[AccedoLocale] = js.native
}

object Locales {
  @scala.inline
  def apply(locales: js.Array[AccedoLocale]): Locales = {
    val __obj = js.Dynamic.literal(locales = locales.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locales]
  }
  @scala.inline
  implicit class LocalesOps[Self <: Locales] (val x: Self) extends AnyVal {
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
    def setLocalesVarargs(value: AccedoLocale*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[AccedoLocale]): Self = this.set("locales", value.asInstanceOf[js.Any])
  }
  
}

