package typings.appBuilderLib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var file: String = js.native
  var lang: String = js.native
  var langName: js.Any = js.native
  var langWithRegion: String = js.native
}

object File {
  @scala.inline
  def apply(file: String, lang: String, langName: js.Any, langWithRegion: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setLangName(value: js.Any): Self = this.set("langName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLangWithRegion(value: String): Self = this.set("langWithRegion", value.asInstanceOf[js.Any])
  }
  
}

