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

