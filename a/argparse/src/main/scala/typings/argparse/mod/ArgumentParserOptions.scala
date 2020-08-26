package typings.argparse.mod

import typings.argparse.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgumentParserOptions extends js.Object {
  var addHelp: js.UndefOr[Boolean] = js.native
  var argumentDefault: js.UndefOr[js.Any] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var epilog: js.UndefOr[String] = js.native
  var formatterClass: js.UndefOr[`0`] = js.native
  var parents: js.UndefOr[js.Array[ArgumentParser]] = js.native
  var prefixChars: js.UndefOr[String] = js.native
  var prog: js.UndefOr[String] = js.native
  var usage: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object ArgumentParserOptions {
  @scala.inline
  def apply(): ArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentParserOptions]
  }
  @scala.inline
  implicit class ArgumentParserOptionsOps[Self <: ArgumentParserOptions] (val x: Self) extends AnyVal {
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
    def setAddHelp(value: Boolean): Self = this.set("addHelp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddHelp: Self = this.set("addHelp", js.undefined)
    @scala.inline
    def setArgumentDefault(value: js.Any): Self = this.set("argumentDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgumentDefault: Self = this.set("argumentDefault", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEpilog(value: String): Self = this.set("epilog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpilog: Self = this.set("epilog", js.undefined)
    @scala.inline
    def setFormatterClass(value: `0`): Self = this.set("formatterClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatterClass: Self = this.set("formatterClass", js.undefined)
    @scala.inline
    def setParentsVarargs(value: ArgumentParser*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[ArgumentParser]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    @scala.inline
    def setPrefixChars(value: String): Self = this.set("prefixChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixChars: Self = this.set("prefixChars", js.undefined)
    @scala.inline
    def setProg(value: String): Self = this.set("prog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProg: Self = this.set("prog", js.undefined)
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

