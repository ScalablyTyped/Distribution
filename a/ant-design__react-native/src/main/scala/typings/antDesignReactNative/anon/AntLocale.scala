package typings.antDesignReactNative.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntLocale extends js.Object {
  var antLocale: Requireable[js.Object] = js.native
}

object AntLocale {
  @scala.inline
  def apply(antLocale: Requireable[js.Object]): AntLocale = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocale]
  }
  @scala.inline
  implicit class AntLocaleOps[Self <: AntLocale] (val x: Self) extends AnyVal {
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
    def setAntLocale(value: Requireable[js.Object]): Self = this.set("antLocale", value.asInstanceOf[js.Any])
  }
  
}

