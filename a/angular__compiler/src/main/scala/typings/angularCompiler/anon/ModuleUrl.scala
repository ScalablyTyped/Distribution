package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleUrl extends js.Object {
  var moduleUrl: js.UndefOr[String] = js.native
  var styleUrls: js.UndefOr[js.Array[String]] = js.native
  var styles: js.UndefOr[js.Array[String]] = js.native
}

object ModuleUrl {
  @scala.inline
  def apply(): ModuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleUrl]
  }
  @scala.inline
  implicit class ModuleUrlOps[Self <: ModuleUrl] (val x: Self) extends AnyVal {
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
    def setModuleUrl(value: String): Self = this.set("moduleUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleUrl: Self = this.set("moduleUrl", js.undefined)
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = this.set("styleUrls", js.Array(value :_*))
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = this.set("styleUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleUrls: Self = this.set("styleUrls", js.undefined)
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

