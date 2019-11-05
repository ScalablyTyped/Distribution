package typings.antd.libInputInputMod

import typings.react.reactMod.ChangeEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input/Input", "resolveOnChange")
@js.native
object resolveOnChange extends js.Object {
  def apply(target: HTMLInputElement, e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement]): Unit = js.native
  def apply(
    target: HTMLInputElement,
    e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
  def apply(target: HTMLInputElement, e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def apply(
    target: HTMLInputElement,
    e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
  def apply(target: HTMLTextAreaElement, e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement]): Unit = js.native
  def apply(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
  def apply(target: HTMLTextAreaElement, e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def apply(
    target: HTMLTextAreaElement,
    e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
}

