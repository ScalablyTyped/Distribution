package typings.antd.esBadgeMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge
  extends Component[BadgeProps, js.Any, js.Any] {
  def getBadgeClassName(prefixCls: String): String = js.native
  def getDispayCount(): String | Double | Null = js.native
  def getNumberedDispayCount(): String | Double | Null = js.native
  def getScrollNumberTitle(): js.UndefOr[String | Double] = js.native
  def getStyleWithOffset(): js.UndefOr[CSSProperties] = js.native
  def hasStatus(): Boolean = js.native
  def isDot(): Boolean = js.native
  def isHidden(): Boolean = js.native
  def isZero(): Boolean = js.native
  def renderBadge(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderBadgeNumber(prefixCls: String, scrollNumberPrefixCls: String): Element | Null = js.native
  def renderDispayComponent(): js.UndefOr[ReactElement] = js.native
  def renderStatusText(prefixCls: String): Element | Null = js.native
}

