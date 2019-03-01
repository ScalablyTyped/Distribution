package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var decoration: js.UndefOr[
    arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.`line-through` | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.underline | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.none
  ] = js.undefined
  var family: js.UndefOr[java.lang.String] = js.undefined
   // "<fontFamily>";
  var size: js.UndefOr[scala.Double] = js.undefined
   // <fontSize>;
  var style: js.UndefOr[
    arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.italic | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.normal | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.oblique
  ] = js.undefined
  var weight: js.UndefOr[
    arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.bold | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.bolder | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.lighter | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.normal
  ] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    decoration: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.`line-through` | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.underline | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.none = null,
    family: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    style: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.italic | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.normal | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.oblique = null,
    weight: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.bold | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.bolder | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.lighter | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.normal = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (decoration != null) __obj.updateDynamic("decoration")(decoration.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

