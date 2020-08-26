package typings.angularOdataResources.OData

import typings.angularOdataResources.anon.Add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operators extends js.Object {
  var operators: Add = js.native
  var rtrim: js.Any = js.native
  def convert(from: String): js.Any = js.native
  /* private */ def trim(value: js.Any): js.Any = js.native
}

object Operators {
  @scala.inline
  def apply(convert: String => js.Any, operators: Add, rtrim: js.Any, trim: js.Any => js.Any): Operators = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), operators = operators.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], trim = js.Any.fromFunction1(trim))
    __obj.asInstanceOf[Operators]
  }
  @scala.inline
  implicit class OperatorsOps[Self <: Operators] (val x: Self) extends AnyVal {
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
    def setConvert(value: String => js.Any): Self = this.set("convert", js.Any.fromFunction1(value))
    @scala.inline
    def setOperators(value: Add): Self = this.set("operators", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtrim(value: js.Any): Self = this.set("rtrim", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrim(value: js.Any => js.Any): Self = this.set("trim", js.Any.fromFunction1(value))
  }
  
}

