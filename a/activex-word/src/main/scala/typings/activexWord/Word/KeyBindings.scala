package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyBindings extends StObject {
  
  def Add(KeyCategory: WdKeyCategory, Command: String, KeyCode: Double): KeyBinding = js.native
  def Add(KeyCategory: WdKeyCategory, Command: String, KeyCode: Double, KeyCode2: Any): KeyBinding = js.native
  def Add(KeyCategory: WdKeyCategory, Command: String, KeyCode: Double, KeyCode2: Any, CommandParameter: Any): KeyBinding = js.native
  def Add(
    KeyCategory: WdKeyCategory,
    Command: String,
    KeyCode: Double,
    KeyCode2: Unit,
    CommandParameter: Any
  ): KeyBinding = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ClearAll(): Unit = js.native
  
  val Context: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): KeyBinding = js.native
  
  def Key(KeyCode: Double): KeyBinding = js.native
  def Key(KeyCode: Double, KeyCode2: Any): KeyBinding = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.KeyBindings_typekey")
  var WordDotKeyBindings_typekey: KeyBindings = js.native
}
