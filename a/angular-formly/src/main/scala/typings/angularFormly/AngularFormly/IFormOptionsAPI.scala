package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormOptionsAPI extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var fieldTransform: js.UndefOr[js.Function | js.Array[js.Function]] = js.native
  var formState: js.UndefOr[js.Object] = js.native
  var removeChromeAutoComplete: js.UndefOr[Boolean] = js.native
  var resetModel: js.UndefOr[js.Function] = js.native
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.native
  var updateInitialValue: js.UndefOr[js.Function] = js.native
  var wrapper: js.UndefOr[String | js.Array[String]] = js.native
}

object IFormOptionsAPI {
  @scala.inline
  def apply(): IFormOptionsAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormOptionsAPI]
  }
  @scala.inline
  implicit class IFormOptionsAPIOps[Self <: IFormOptionsAPI] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFieldTransformVarargs(value: js.Function*): Self = this.set("fieldTransform", js.Array(value :_*))
    @scala.inline
    def setFieldTransform(value: js.Function | js.Array[js.Function]): Self = this.set("fieldTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTransform: Self = this.set("fieldTransform", js.undefined)
    @scala.inline
    def setFormState(value: js.Object): Self = this.set("formState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormState: Self = this.set("formState", js.undefined)
    @scala.inline
    def setRemoveChromeAutoComplete(value: Boolean): Self = this.set("removeChromeAutoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveChromeAutoComplete: Self = this.set("removeChromeAutoComplete", js.undefined)
    @scala.inline
    def setResetModel(value: js.Function): Self = this.set("resetModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetModel: Self = this.set("resetModel", js.undefined)
    @scala.inline
    def setTemplateManipulators(value: ITemplateManipulators): Self = this.set("templateManipulators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateManipulators: Self = this.set("templateManipulators", js.undefined)
    @scala.inline
    def setUpdateInitialValue(value: js.Function): Self = this.set("updateInitialValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateInitialValue: Self = this.set("updateInitialValue", js.undefined)
    @scala.inline
    def setWrapperVarargs(value: String*): Self = this.set("wrapper", js.Array(value :_*))
    @scala.inline
    def setWrapper(value: String | js.Array[String]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

