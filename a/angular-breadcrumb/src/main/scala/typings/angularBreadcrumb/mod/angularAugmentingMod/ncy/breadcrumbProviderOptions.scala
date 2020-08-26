package typings.angularBreadcrumb.mod.angularAugmentingMod.ncy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait breadcrumbProviderOptions extends js.Object {
  /**
    * If true, abstract states are included in the breadcrumb. This option has a lower priority than the state-specific option skip
    **/
  var includeAbstract: js.UndefOr[Boolean] = js.native
  /**
    * An existing state's name to be the state is the first step of the breadcrumb
    **/
  var prefixStateName: js.UndefOr[String] = js.native
  /**
    * Contains a predefined template's name; 'bootstrap3' (default), 'bootstrap2' or HTML for a custom template. This property is ignored if templateUrl is defined.
    **/
  var template: js.UndefOr[String] = js.native
  /**
    * Contains the path to a template file. This property takes precedence over the template property.
    **/
  var templateUrl: js.UndefOr[String] = js.native
}

object breadcrumbProviderOptions {
  @scala.inline
  def apply(): breadcrumbProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[breadcrumbProviderOptions]
  }
  @scala.inline
  implicit class breadcrumbProviderOptionsOps[Self <: breadcrumbProviderOptions] (val x: Self) extends AnyVal {
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
    def setIncludeAbstract(value: Boolean): Self = this.set("includeAbstract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAbstract: Self = this.set("includeAbstract", js.undefined)
    @scala.inline
    def setPrefixStateName(value: String): Self = this.set("prefixStateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixStateName: Self = this.set("prefixStateName", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
  }
  
}

