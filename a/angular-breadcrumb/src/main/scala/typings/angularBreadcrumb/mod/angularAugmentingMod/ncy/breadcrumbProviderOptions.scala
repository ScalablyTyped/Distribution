package typings.angularBreadcrumb.mod.angularAugmentingMod.ncy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait breadcrumbProviderOptions extends js.Object {
  /**
    * If true, abstract states are included in the breadcrumb. This option has a lower priority than the state-specific option skip
    **/
  var includeAbstract: js.UndefOr[Boolean] = js.undefined
  /**
    * An existing state's name to be the state is the first step of the breadcrumb
    **/
  var prefixStateName: js.UndefOr[String] = js.undefined
  /**
    * Contains a predefined template's name; 'bootstrap3' (default), 'bootstrap2' or HTML for a custom template. This property is ignored if templateUrl is defined.
    **/
  var template: js.UndefOr[String] = js.undefined
  /**
    * Contains the path to a template file. This property takes precedence over the template property.
    **/
  var templateUrl: js.UndefOr[String] = js.undefined
}

object breadcrumbProviderOptions {
  @scala.inline
  def apply(
    includeAbstract: js.UndefOr[Boolean] = js.undefined,
    prefixStateName: String = null,
    template: String = null,
    templateUrl: String = null
  ): breadcrumbProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAbstract)) __obj.updateDynamic("includeAbstract")(includeAbstract.get.asInstanceOf[js.Any])
    if (prefixStateName != null) __obj.updateDynamic("prefixStateName")(prefixStateName.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[breadcrumbProviderOptions]
  }
}

