package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStops extends StObject {
  
  def Add(Position: Double): TabStop = js.native
  def Add(Position: Double, Alignment: js.UndefOr[scala.Nothing], Leader: js.Any): TabStop = js.native
  def Add(Position: Double, Alignment: js.Any): TabStop = js.native
  def Add(Position: Double, Alignment: js.Any, Leader: js.Any): TabStop = js.native
  
  def After(Position: Double): TabStop = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Before(Position: Double): TabStop = js.native
  
  def ClearAll(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): TabStop = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.TabStops_typekey")
  var WordDotTabStops_typekey: TabStops = js.native
}
