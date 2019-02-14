package typings
package antdLib.libTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeKey: js.UndefOr[java.lang.String] = js.undefined
  var animated: js.UndefOr[scala.Boolean | antdLib.Anon_InkBar] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultActiveKey: js.UndefOr[java.lang.String] = js.undefined
  var hideAdd: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* activeKey */ java.lang.String, scala.Unit]] = js.undefined
  var onEdit: js.UndefOr[
    js.Function2[
      /* targetKey */ java.lang.String | (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]), 
      /* action */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onNextClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
  var onPrevClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
  var onTabClick: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderTabBar: js.UndefOr[
    js.Function2[
      /* props */ TabsProps, 
      /* DefaultTabBar */ reactLib.reactMod.ReactNs.ReactNode, 
      reactLib.reactMod.ReactNs.ReactElement
    ]
  ] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabBarExtraContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | scala.Null] = js.undefined
  var tabBarGutter: js.UndefOr[scala.Double] = js.undefined
  var tabBarStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabPosition: js.UndefOr[TabsPosition] = js.undefined
  var `type`: js.UndefOr[TabsType] = js.undefined
}

