package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.KeyBindings")
@js.native
class KeyBindings protected () extends js.Object {
  val Application: Application = js.native
  val Context: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.KeyBindings_typekey`: KeyBindings = js.native
  def Add(KeyCategory: WdKeyCategory, Command: java.lang.String, KeyCode: scala.Double): KeyBinding = js.native
  def Add(KeyCategory: WdKeyCategory, Command: java.lang.String, KeyCode: scala.Double, KeyCode2: js.Any): KeyBinding = js.native
  def Add(
    KeyCategory: WdKeyCategory,
    Command: java.lang.String,
    KeyCode: scala.Double,
    KeyCode2: js.Any,
    CommandParameter: js.Any
  ): KeyBinding = js.native
  def ClearAll(): scala.Unit = js.native
  def Item(Index: scala.Double): KeyBinding = js.native
  def Key(KeyCode: scala.Double): KeyBinding = js.native
  def Key(KeyCode: scala.Double, KeyCode2: js.Any): KeyBinding = js.native
}

