package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBindings extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Context: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.KeyBindings_typekey")
  var WordDotKeyBindings_typekey: KeyBindings = js.native
  def Add(KeyCategory: WdKeyCategory, Command: String, KeyCode: Double): KeyBinding = js.native
  def Add(KeyCategory: WdKeyCategory, Command: String, KeyCode: Double, KeyCode2: js.Any): KeyBinding = js.native
  def Add(
    KeyCategory: WdKeyCategory,
    Command: String,
    KeyCode: Double,
    KeyCode2: js.Any,
    CommandParameter: js.Any
  ): KeyBinding = js.native
  def ClearAll(): Unit = js.native
  def Item(Index: Double): KeyBinding = js.native
  def Key(KeyCode: Double): KeyBinding = js.native
  def Key(KeyCode: Double, KeyCode2: js.Any): KeyBinding = js.native
}

