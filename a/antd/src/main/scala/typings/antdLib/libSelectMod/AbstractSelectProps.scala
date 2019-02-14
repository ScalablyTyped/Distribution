package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractSelectProps extends js.Object {
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var autoClearSearchValue: js.UndefOr[scala.Boolean] = js.undefined
  var choiceTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[java.lang.String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var dropdownRender: js.UndefOr[
    js.Function2[
      /* menu */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
      /* props */ js.UndefOr[SelectProps[SelectValue]], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var dropdownStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var filterOption: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement, 
      _
    ])
  ] = js.undefined
  var getPopupContainer: js.UndefOr[
    js.Function1[/* triggerNode */ js.UndefOr[reactLib.Element], reactLib.HTMLElement]
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var notFoundContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | scala.Null] = js.undefined
  var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ java.lang.String, _]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showAction: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var size: /* import warning: ImportType.apply Failed type conversion: ['default', 'large', 'small'][number] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: ['default', 'large', 'small'][number] */ js.Any
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

