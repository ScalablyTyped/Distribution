package typings.antd.libTagMod

import typings.antd.Anon_Absolute
import typings.antd.Anon_BackgroundColor
import typings.antd.Anon_VisibleBoolean
import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: Anon_VisibleBoolean = js.native
  def getTagClassName(hasGetPrefixCls: ConfigConsumerProps): String = js.native
  def getTagStyle(): Anon_BackgroundColor | Anon_Absolute = js.native
  def handleIconClick(e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def isPresetColor(): Boolean = js.native
  def renderCloseIcon(): Element | Null = js.native
  def renderTag(configProps: ConfigConsumerProps): Element = js.native
  def setVisible(visible: Boolean, e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
}

