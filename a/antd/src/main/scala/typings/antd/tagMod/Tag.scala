package typings.antd.tagMod

import typings.antd.AnonAlignContent
import typings.antd.AnonBackgroundColor
import typings.antd.AnonVisibleBoolean
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.NativeMouseEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: AnonVisibleBoolean = js.native
  def getTagClassName(hasGetPrefixClsDirection: ConfigConsumerProps): String = js.native
  def getTagStyle(): AnonBackgroundColor | AnonAlignContent = js.native
  def handleIconClick(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def isPresetColor(): Boolean = js.native
  def renderCloseIcon(): Element | Null = js.native
  def renderTag(configProps: ConfigConsumerProps): Element = js.native
  def setVisible(visible: Boolean, e: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
}

