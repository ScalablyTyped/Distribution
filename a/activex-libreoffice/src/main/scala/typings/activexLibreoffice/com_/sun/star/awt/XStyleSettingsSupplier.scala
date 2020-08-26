package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the style settings of a component */
@js.native
trait XStyleSettingsSupplier extends js.Object {
  var StyleSettings: XStyleSettings = js.native
}

object XStyleSettingsSupplier {
  @scala.inline
  def apply(StyleSettings: XStyleSettings): XStyleSettingsSupplier = {
    val __obj = js.Dynamic.literal(StyleSettings = StyleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[XStyleSettingsSupplier]
  }
  @scala.inline
  implicit class XStyleSettingsSupplierOps[Self <: XStyleSettingsSupplier] (val x: Self) extends AnyVal {
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
    def setStyleSettings(value: XStyleSettings): Self = this.set("StyleSettings", value.asInstanceOf[js.Any])
  }
  
}

