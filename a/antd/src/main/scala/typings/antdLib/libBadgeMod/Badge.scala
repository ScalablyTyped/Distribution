package typings
package antdLib.libBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge
  extends reactLib.reactMod.Component[BadgeProps, js.Any, js.Any] {
  def getBadgeClassName(prefixCls: java.lang.String): java.lang.String = js.native
  def getDispayCount(): java.lang.String | scala.Double | scala.Null = js.native
  def getNumberedDispayCount(): java.lang.String | scala.Double | scala.Null = js.native
  def getScrollNumberTitle(): js.UndefOr[java.lang.String | scala.Double] = js.native
  def getStyleWithOffset(): js.UndefOr[reactLib.reactMod.CSSProperties] = js.native
  def hasStatus(): scala.Boolean = js.native
  def isDot(): scala.Boolean = js.native
  def isHidden(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def renderBadge(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderBadgeNumber(prefixCls: java.lang.String, scrollNumberPrefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderDispayComponent(): js.UndefOr[reactLib.reactMod.ReactElement] = js.native
  def renderStatusText(prefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
}

