package typings.ajv.mod

import typings.ajv.ajvStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringFormatDefinition extends FormatDefinition {
  var async: js.UndefOr[Boolean] = js.native
  var compare: js.UndefOr[js.Function2[/* data1 */ String, /* data2 */ String, Double]] = js.native
  var `type`: js.UndefOr[string] = js.native
  var validate: FormatValidator = js.native
}

object StringFormatDefinition {
  @scala.inline
  def apply(validate: FormatValidator): StringFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormatDefinition]
  }
  @scala.inline
  implicit class StringFormatDefinitionOps[Self <: StringFormatDefinition] (val x: Self) extends AnyVal {
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
    def setValidateFunction1(value: /* data */ String => Boolean | js.Thenable[js.Any]): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def setValidate(value: FormatValidator): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setCompare(value: (/* data1 */ String, /* data2 */ String) => Double): Self = this.set("compare", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

