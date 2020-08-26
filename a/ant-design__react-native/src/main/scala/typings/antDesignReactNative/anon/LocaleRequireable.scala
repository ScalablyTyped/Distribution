package typings.antDesignReactNative.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleRequireable extends js.Object {
  var locale: Requireable[js.Object] = js.native
}

object LocaleRequireable {
  @scala.inline
  def apply(locale: Requireable[js.Object]): LocaleRequireable = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleRequireable]
  }
  @scala.inline
  implicit class LocaleRequireableOps[Self <: LocaleRequireable] (val x: Self) extends AnyVal {
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
    def setLocale(value: Requireable[js.Object]): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
  
}

