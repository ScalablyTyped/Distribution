package typings.apidevtoolsSwaggerParser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.apidevtoolsSwaggerParser.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] {
  var json: js.UndefOr[ParserOptions | Boolean] = js.native
  var text: js.UndefOr[ParserOptionsencodingstri | Boolean] = js.native
  var yaml: js.UndefOr[ParserOptions | Boolean] = js.native
}

object Dictkey {
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def setJson(value: ParserOptions | Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setText(value: ParserOptionsencodingstri | Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setYaml(value: ParserOptions | Boolean): Self = this.set("yaml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYaml: Self = this.set("yaml", js.undefined)
  }
  
}

