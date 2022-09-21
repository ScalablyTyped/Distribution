package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeysBoundTo extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Command: String = js.native
  
  val CommandParameter: String = js.native
  
  val Context: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): KeyBinding = js.native
  
  def Key(KeyCode: Double): KeyBinding = js.native
  def Key(KeyCode: Double, KeyCode2: Any): KeyBinding = js.native
  
  val KeyCategory: WdKeyCategory = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.KeysBoundTo_typekey")
  var WordDotKeysBoundTo_typekey: KeysBoundTo = js.native
}
