package typings.antd.inputInputMod

import typings.react.mod.ChangeEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/input/Input", "resolveOnChange")
@js.native
object resolveOnChange extends js.Object {
  
  def apply(target: HTMLInputElement, e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement]): Unit = js.native
  def apply(
    target: HTMLInputElement,
    e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
  def apply(target: HTMLInputElement, e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def apply(
    target: HTMLInputElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
  def apply(target: HTMLTextAreaElement, e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement]): Unit = js.native
  def apply(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
  def apply(target: HTMLTextAreaElement, e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def apply(
    target: HTMLTextAreaElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
  ): Unit = js.native
}
