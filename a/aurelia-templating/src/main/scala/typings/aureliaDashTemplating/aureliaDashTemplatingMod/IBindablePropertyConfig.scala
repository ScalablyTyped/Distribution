package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import org.scalablytyped.runtime.StringDictionary
import typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode
import typings.aureliaDashTemplating.aureliaDashTemplatingStrings.fromView
import typings.aureliaDashTemplating.aureliaDashTemplatingStrings.oneTime
import typings.aureliaDashTemplating.aureliaDashTemplatingStrings.oneWay
import typings.aureliaDashTemplating.aureliaDashTemplatingStrings.toView
import typings.aureliaDashTemplating.aureliaDashTemplatingStrings.twoWay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBindablePropertyConfig
  extends // For compatibility and future extension
/* key */ StringDictionary[js.Any] {
  var attribute: js.UndefOr[String] = js.undefined
  /**
    * The name of a view model method to invoke when the property is updated.
    */
  var changeHandler: js.UndefOr[String] = js.undefined
  /**
    * The default binding mode of the property. If given string, will use to lookup
    */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.undefined
  /**
    * A default value for the property.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of the property.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Designates the property as the default bindable property among all the other bindable properties when used in a custom attribute with multiple bindable properties.
    */
  var primaryProperty: js.UndefOr[Boolean] = js.undefined
}

object IBindablePropertyConfig {
  @scala.inline
  def apply(
    StringDictionary: // For compatibility and future extension
  /* key */ StringDictionary[js.Any] = null,
    attribute: String = null,
    changeHandler: String = null,
    defaultBindingMode: bindingMode | oneTime | oneWay | twoWay | fromView | toView = null,
    defaultValue: js.Any = null,
    name: String = null,
    primaryProperty: js.UndefOr[Boolean] = js.undefined
  ): IBindablePropertyConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (changeHandler != null) __obj.updateDynamic("changeHandler")(changeHandler)
    if (defaultBindingMode != null) __obj.updateDynamic("defaultBindingMode")(defaultBindingMode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(primaryProperty)) __obj.updateDynamic("primaryProperty")(primaryProperty)
    __obj.asInstanceOf[IBindablePropertyConfig]
  }
}

