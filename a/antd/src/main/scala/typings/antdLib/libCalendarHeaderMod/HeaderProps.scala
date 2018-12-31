package typings
package antdLib.libCalendarHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var onTypeChange: js.UndefOr[js.Function1[/* type */ java.lang.String, scala.Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var validRange: js.UndefOr[
    js.Tuple2[momentLib.momentMod.momentNs.Moment, momentLib.momentMod.momentNs.Moment]
  ] = js.undefined
  var value: js.Any
  var yearSelectOffset: js.UndefOr[scala.Double] = js.undefined
  var yearSelectTotal: js.UndefOr[scala.Double] = js.undefined
}

