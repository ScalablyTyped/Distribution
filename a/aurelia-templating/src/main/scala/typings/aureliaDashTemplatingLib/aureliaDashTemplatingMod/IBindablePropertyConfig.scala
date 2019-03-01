package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBindablePropertyConfig
  extends // For compatibility and future extension
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var attribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of a view model method to invoke when the property is updated.
    */
  var changeHandler: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default binding mode of the property. If given string, will use to lookup
    */
  var defaultBindingMode: js.UndefOr[
    aureliaDashBindingLib.aureliaDashBindingMod.bindingMode | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneTime | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.twoWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.fromView | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.toView
  ] = js.undefined
  /**
    * A default value for the property.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of the property.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Designates the property as the default bindable property among all the other bindable properties when used in a custom attribute with multiple bindable properties.
    */
  var primaryProperty: js.UndefOr[scala.Boolean] = js.undefined
}

object IBindablePropertyConfig {
  @scala.inline
  def apply(
    StringDictionary: // For compatibility and future extension
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    attribute: java.lang.String = null,
    changeHandler: java.lang.String = null,
    defaultBindingMode: aureliaDashBindingLib.aureliaDashBindingMod.bindingMode | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneTime | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.oneWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.twoWay | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.fromView | aureliaDashTemplatingLib.aureliaDashTemplatingLibStrings.toView = null,
    defaultValue: js.Any = null,
    name: java.lang.String = null,
    primaryProperty: js.UndefOr[scala.Boolean] = js.undefined
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

