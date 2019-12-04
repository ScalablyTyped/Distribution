package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDrawerMod {
  import typings.react.reactMod.KeyboardEvent
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.std.HTMLButtonElement
  import typings.std.HTMLDivElement
  import typings.std.HTMLElement

  type EventType = KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement | HTMLButtonElement, NativeMouseEvent])
  type getContainerFunc = js.Function0[HTMLElement]
}
