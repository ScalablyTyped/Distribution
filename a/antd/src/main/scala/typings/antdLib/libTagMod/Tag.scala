package typings
package antdLib.libTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends reactLib.reactMod.Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: antdLib.Anon_VisibleBoolean = js.native
  def animationEnd(): scala.Unit = js.native
  def getTagClassName(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): java.lang.String = js.native
  def getTagStyle(): antdLib.Anon_BackgroundColor | antdLib.Anon_OffsetBlockEnd = js.native
  def handleIconClick(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.MouseEvent]): scala.Unit = js.native
  def isPresetColor(): scala.Boolean = js.native
  def isPresetColor(color: java.lang.String): scala.Boolean = js.native
  def renderCloseIcon(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderTag(configProps: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setVisible(
    visible: scala.Boolean,
    e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
}

