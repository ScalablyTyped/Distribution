package typings.acceptLanguageParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  var code: String = js.native
  var quality: Double = js.native
  var region: js.UndefOr[String] = js.native
  var script: js.UndefOr[String | Null] = js.native
}

object Language {
  @scala.inline
  def apply(code: String, quality: Double): Language = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setScriptNull: Self = this.set("script", null)
  }
  
}

