package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panes extends StObject {
  
  def Add(): Pane = js.native
  def Add(SplitVertical: js.Any): Pane = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Pane = js.native
  
  val Parent: js.Any = js.native
  
  /* private */ @JSName("Word.Panes_typekey")
  var WordDotPanes_typekey: Panes = js.native
}
