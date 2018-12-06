package typings
package antdLib.libBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge
  extends reactLib.reactMod.Component[BadgeProps, js.Any, js.Any] {
  def getBadgeClassName(): java.lang.String = js.native
  def getDispayCount(): java.lang.String | scala.Double | scala.Null = js.native
  def getNumberedDispayCount(): java.lang.String | scala.Double | scala.Null = js.native
  def getScollNumberTitle(): js.UndefOr[java.lang.String | scala.Double] = js.native
  def getStyleWithOffset(): js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  def isDot(): js.UndefOr[
    antdLib.antdLibNumbers.`true` | antdLib.antdLibStrings.default | antdLib.antdLibStrings.error | antdLib.antdLibStrings.success | antdLib.antdLibStrings.warning | antdLib.antdLibStrings.processing
  ] = js.native
  def isHidden(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def renderBadgeNumber(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderDispayComponent(): js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.native
  def renderStatusText(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
}

