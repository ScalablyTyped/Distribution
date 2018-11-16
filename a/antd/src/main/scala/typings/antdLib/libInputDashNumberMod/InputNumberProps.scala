package typings
package antdLib.libInputDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait InputNumberProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[
    js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], java.lang.String]
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], scala.Unit]
  ] = js.undefined
  var parser: js.UndefOr[js.Function1[/* displayValue */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default
  ] = js.undefined
  var step: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

