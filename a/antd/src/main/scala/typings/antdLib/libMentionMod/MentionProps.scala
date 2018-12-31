package typings
package antdLib.libMentionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var getSuggestionContainer: js.UndefOr[js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement]] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var multiLines: js.UndefOr[scala.Boolean] = js.undefined
  var notFoundContent: js.UndefOr[js.Any] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLElement]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* contentState */ js.Any, _]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLElement]] = js.undefined
  var onSearchChange: js.UndefOr[js.Function2[/* value */ java.lang.String, /* trigger */ java.lang.String, _]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* suggestion */ java.lang.String, /* data */ js.UndefOr[js.Any], _]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var placement: js.UndefOr[MentionPlacement] = js.undefined
  var prefix: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suggestionStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suggestions: js.UndefOr[js.Array[_]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

