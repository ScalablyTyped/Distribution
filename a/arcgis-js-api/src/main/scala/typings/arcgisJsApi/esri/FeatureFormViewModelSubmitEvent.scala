package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFormViewModelSubmitEvent extends js.Object {
  var invalid: js.Array[String] = js.native
  var valid: js.Array[String] = js.native
  var values: js.Any = js.native
}

object FeatureFormViewModelSubmitEvent {
  @scala.inline
  def apply(invalid: js.Array[String], valid: js.Array[String], values: js.Any): FeatureFormViewModelSubmitEvent = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormViewModelSubmitEvent]
  }
  @scala.inline
  implicit class FeatureFormViewModelSubmitEventOps[Self <: FeatureFormViewModelSubmitEvent] (val x: Self) extends AnyVal {
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
    def setInvalidVarargs(value: String*): Self = this.set("invalid", js.Array(value :_*))
    @scala.inline
    def setInvalid(value: js.Array[String]): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidVarargs(value: String*): Self = this.set("valid", js.Array(value :_*))
    @scala.inline
    def setValid(value: js.Array[String]): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

