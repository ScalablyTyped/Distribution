package typings
package antdLib.esTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends reactLib.reactMod.Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: antdLib.Anon_VisibleBoolean = js.native
  def getTagClassName(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): java.lang.String = js.native
  def getTagStyle(): antdLib.Anon_BackgroundColor | antdLib.Anon_Absolute = js.native
  def handleIconClick(e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def isPresetColor(): scala.Boolean = js.native
  def isPresetColor(color: java.lang.String): scala.Boolean = js.native
  def renderCloseIcon(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderTag(configProps: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setVisible(
    visible: scala.Boolean,
    e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
}

