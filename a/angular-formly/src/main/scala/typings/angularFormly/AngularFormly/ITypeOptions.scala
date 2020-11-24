package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirectiveLinkFn
import typings.angular.mod.IScope
import typings.angular.mod.ITranscludeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  *
  * see http://docs.angular-formly.com/docs/custom-templates#section-formlyconfig-settype-options
  */
@js.native
trait ITypeOptions extends js.Object {
  
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var apiCheckFunction: js.UndefOr[String] = js.native
  
   //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.native
  
  var apiCheckOptions: js.UndefOr[js.Object] = js.native
  
  var controller: js.UndefOr[js.Function | String | js.Array[_]] = js.native
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var defaultOptions: js.UndefOr[IFieldConfigurationObject | js.Function] = js.native
  
  var `extends`: js.UndefOr[String] = js.native
  
  var link: js.UndefOr[IDirectiveLinkFn[IScope, JQLite, IAttributes, IController]] = js.native
  
  var name: String = js.native
  
  var overwriteOk: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[js.Function | String] = js.native
  
  var templateUrl: js.UndefOr[js.Function | String] = js.native
  
  var validateOptions: js.UndefOr[js.Function] = js.native
  
  var wrapper: js.UndefOr[String | js.Array[String]] = js.native
}
object ITypeOptions {
  
  @scala.inline
  def apply(name: String): ITypeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeOptions]
  }
  
  @scala.inline
  implicit class ITypeOptionsOps[Self <: ITypeOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
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
    def setControllerVarargs(value: js.Any*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setController(value: js.Function | String | js.Array[_]): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDefaultOptions(value: IFieldConfigurationObject | js.Function): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
    
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    
    @scala.inline
    def setLink(
      value: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = this.set("link", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setOverwriteOk(value: Boolean): Self = this.set("overwriteOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteOk: Self = this.set("overwriteOk", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Function | String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: js.Function | String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setValidateOptions(value: js.Function): Self = this.set("validateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOptions: Self = this.set("validateOptions", js.undefined)
    
    @scala.inline
    def setWrapperVarargs(value: String*): Self = this.set("wrapper", js.Array(value :_*))
    
    @scala.inline
    def setWrapper(value: String | js.Array[String]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
