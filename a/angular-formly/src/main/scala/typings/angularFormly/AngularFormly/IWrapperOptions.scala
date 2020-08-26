package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWrapperOptions extends js.Object {
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.native
  var apiCheckFunction: js.UndefOr[String] = js.native
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.native
  var apiCheckOptions: js.UndefOr[js.Object] = js.native
  var name: js.UndefOr[String] = js.native
  var overwriteOk: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[String] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
  var validateOptions: js.UndefOr[js.Function] = js.native
}

object IWrapperOptions {
  @scala.inline
  def apply(): IWrapperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrapperOptions]
  }
  @scala.inline
  implicit class IWrapperOptionsOps[Self <: IWrapperOptions] (val x: Self) extends AnyVal {
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
    def setApiCheck(value: StringDictionary[js.Function]): Self = this.set("apiCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiCheck: Self = this.set("apiCheck", js.undefined)
    @scala.inline
    def setApiCheckFunction(value: String): Self = this.set("apiCheckFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiCheckFunction: Self = this.set("apiCheckFunction", js.undefined)
    @scala.inline
    def setApiCheckInstance(value: js.Any): Self = this.set("apiCheckInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiCheckInstance: Self = this.set("apiCheckInstance", js.undefined)
    @scala.inline
    def setApiCheckOptions(value: js.Object): Self = this.set("apiCheckOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiCheckOptions: Self = this.set("apiCheckOptions", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverwriteOk(value: Boolean): Self = this.set("overwriteOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwriteOk: Self = this.set("overwriteOk", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setValidateOptions(value: js.Function): Self = this.set("validateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOptions: Self = this.set("validateOptions", js.undefined)
  }
  
}

