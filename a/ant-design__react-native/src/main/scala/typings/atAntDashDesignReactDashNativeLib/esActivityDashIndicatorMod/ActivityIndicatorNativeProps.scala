package typings
package atAntDashDesignReactDashNativeLib.esActivityDashIndicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorNativeProps
  extends atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[
      atAntDashDesignReactDashNativeLib.esActivityDashIndicatorStyleMod.ActivityIndicatorStyle
    ] {
  var animating: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.large | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.small
  ] = js.undefined
  @JSName("styles")
  var styles_ActivityIndicatorNativeProps: js.UndefOr[
    atAntDashDesignReactDashNativeLib.esActivityDashIndicatorStyleMod.ActivityIndicatorStyle
  ] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var toast: js.UndefOr[scala.Boolean] = js.undefined
}

object ActivityIndicatorNativeProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    size: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.large | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.small = null,
    styles: atAntDashDesignReactDashNativeLib.esActivityDashIndicatorStyleMod.ActivityIndicatorStyle = null,
    text: java.lang.String = null,
    toast: js.UndefOr[scala.Boolean] = js.undefined
  ): ActivityIndicatorNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast)
    __obj.asInstanceOf[ActivityIndicatorNativeProps]
  }
}

