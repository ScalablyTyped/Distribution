package typings
package antdLib.libBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BadgeProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Number to show in badge */
  var count: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  /** whether to show red dot without number */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String]] = js.undefined
  /** Max count to show */
  var overflowCount: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var scrollNumberPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showZero: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[
    antdLib.antdLibStrings.success | antdLib.antdLibStrings.processing | antdLib.antdLibStrings.default | antdLib.antdLibStrings.error | antdLib.antdLibStrings.warning
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

