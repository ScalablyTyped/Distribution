package typings
package angularDashBreadcrumbLib.angularDashBreadcrumbMod.angularMod.ncyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait breadcrumbProviderOptions extends js.Object {
  /**
    * If true, abstract states are included in the breadcrumb. This option has a lower priority than the state-specific option skip
    **/
  var includeAbstract: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An existing state's name to be the state is the first step of the breadcrumb
    **/
  var prefixStateName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains a predefined template's name; 'bootstrap3' (default), 'bootstrap2' or HTML for a custom template. This property is ignored if templateUrl is defined.
    **/
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains the path to a template file. This property takes precedence over the template property.
    **/
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
}

object breadcrumbProviderOptions {
  @scala.inline
  def apply(
    includeAbstract: js.UndefOr[scala.Boolean] = js.undefined,
    prefixStateName: java.lang.String = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null
  ): breadcrumbProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAbstract)) __obj.updateDynamic("includeAbstract")(includeAbstract)
    if (prefixStateName != null) __obj.updateDynamic("prefixStateName")(prefixStateName)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[breadcrumbProviderOptions]
  }
}

