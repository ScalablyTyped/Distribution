package typings
package antdLib.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  /** Trigger when animation ending of Alert */
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var banner: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Whether Alert can be closed */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /** Close text to show */
  var closeText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional content of Alert */
  var description: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var iconType: js.UndefOr[java.lang.String] = js.undefined
  /** Content of Alert */
  var message: reactLib.reactMod.ReactNs.ReactNode
  /** Callback when close Alert */
  var onClose: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to show icon */
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Type of Alert styles, options:`success`, `info`, `warning`, `error`
    */
  var `type`: js.UndefOr[
    antdLib.antdLibStrings.success | antdLib.antdLibStrings.info | antdLib.antdLibStrings.warning | antdLib.antdLibStrings.error
  ] = js.undefined
}

