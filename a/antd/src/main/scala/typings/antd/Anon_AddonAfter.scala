package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddonAfter extends js.Object {
  var addonAfter: Requireable[ReactNodeLike]
  var addonBefore: Requireable[ReactNodeLike]
  var allowClear: Requireable[Boolean]
  var className: Requireable[String]
  var defaultValue: Requireable[_]
  var disabled: Requireable[Boolean]
  var id: Requireable[String]
  var maxLength: Requireable[Double]
  var onBlur: Requireable[js.Function1[/* repeated */ _, _]]
  var onFocus: Requireable[js.Function1[/* repeated */ _, _]]
  var onKeyDown: Requireable[js.Function1[/* repeated */ _, _]]
  var onKeyUp: Requireable[js.Function1[/* repeated */ _, _]]
  var onPressEnter: Requireable[js.Function1[/* repeated */ _, _]]
  var prefix: Requireable[ReactNodeLike]
  var prefixCls: Requireable[String]
  var size: Requireable[small | default | large]
  var suffix: Requireable[ReactNodeLike]
  var `type`: Requireable[String]
  var value: Requireable[_]
}

object Anon_AddonAfter {
  @scala.inline
  def apply(
    addonAfter: Requireable[ReactNodeLike],
    addonBefore: Requireable[ReactNodeLike],
    allowClear: Requireable[Boolean],
    className: Requireable[String],
    defaultValue: Requireable[_],
    disabled: Requireable[Boolean],
    id: Requireable[String],
    maxLength: Requireable[Double],
    onBlur: Requireable[js.Function1[/* repeated */ _, _]],
    onFocus: Requireable[js.Function1[/* repeated */ _, _]],
    onKeyDown: Requireable[js.Function1[/* repeated */ _, _]],
    onKeyUp: Requireable[js.Function1[/* repeated */ _, _]],
    onPressEnter: Requireable[js.Function1[/* repeated */ _, _]],
    prefix: Requireable[ReactNodeLike],
    prefixCls: Requireable[String],
    size: Requireable[small | default | large],
    suffix: Requireable[ReactNodeLike],
    `type`: Requireable[String],
    value: Requireable[_]
  ): Anon_AddonAfter = {
    val __obj = js.Dynamic.literal(addonAfter = addonAfter, addonBefore = addonBefore, allowClear = allowClear, className = className, defaultValue = defaultValue, disabled = disabled, id = id, maxLength = maxLength, onBlur = onBlur, onFocus = onFocus, onKeyDown = onKeyDown, onKeyUp = onKeyUp, onPressEnter = onPressEnter, prefix = prefix, prefixCls = prefixCls, size = size, suffix = suffix, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AddonAfter]
  }
}

