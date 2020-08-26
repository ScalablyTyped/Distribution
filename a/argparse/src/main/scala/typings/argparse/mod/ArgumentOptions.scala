package typings.argparse.mod

import typings.argparse.anon.InstantiableAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgumentOptions extends js.Object {
  var action: js.UndefOr[String | InstantiableAction] = js.native
   // tslint:disable-line:ban-types
  var choices: js.UndefOr[String | js.Array[String]] = js.native
  var constant: js.UndefOr[js.Any] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var dest: js.UndefOr[String] = js.native
  var help: js.UndefOr[String] = js.native
  var metavar: js.UndefOr[String | js.Array[String]] = js.native
  var nargs: js.UndefOr[String | Double] = js.native
  var optionStrings: js.UndefOr[js.Array[String]] = js.native
  var required: js.UndefOr[Boolean] = js.native
  // type may be a string (primitive) or a Function (constructor)
  var `type`: js.UndefOr[String | js.Function] = js.native
}

object ArgumentOptions {
  @scala.inline
  def apply(): ArgumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentOptions]
  }
  @scala.inline
  implicit class ArgumentOptionsOps[Self <: ArgumentOptions] (val x: Self) extends AnyVal {
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
    def setAction(value: String | InstantiableAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setChoicesVarargs(value: String*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: String | js.Array[String]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    @scala.inline
    def setConstant(value: js.Any): Self = this.set("constant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstant: Self = this.set("constant", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setMetavarVarargs(value: String*): Self = this.set("metavar", js.Array(value :_*))
    @scala.inline
    def setMetavar(value: String | js.Array[String]): Self = this.set("metavar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetavar: Self = this.set("metavar", js.undefined)
    @scala.inline
    def setNargs(value: String | Double): Self = this.set("nargs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNargs: Self = this.set("nargs", js.undefined)
    @scala.inline
    def setOptionStringsVarargs(value: String*): Self = this.set("optionStrings", js.Array(value :_*))
    @scala.inline
    def setOptionStrings(value: js.Array[String]): Self = this.set("optionStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionStrings: Self = this.set("optionStrings", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setType(value: String | js.Function): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

