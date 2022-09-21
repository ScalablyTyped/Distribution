package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pane extends StObject {
  
  def Activate(): Unit = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AutoScroll(Velocity: Double): Unit = js.native
  
  var BrowseToWindow: Boolean = js.native
  
  val BrowseWidth: Double = js.native
  
  def Close(): Unit = js.native
  
  val Creator: Double = js.native
  
  var DisplayRulers: Boolean = js.native
  
  var DisplayVerticalRuler: Boolean = js.native
  
  val Document: typings.activexWord.Word.Document = js.native
  
  val Frameset: typings.activexWord.Word.Frameset = js.native
  
  var HorizontalPercentScrolled: Double = js.native
  
  val Index: Double = js.native
  
  def LargeScroll(): Unit = js.native
  def LargeScroll(Down: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Unit, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Any, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def LargeScroll(Down: Unit, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  
  var MinimumFontSize: Double = js.native
  
  def NewFrameset(): Unit = js.native
  
  val Next: Pane = js.native
  
  def PageScroll(): Unit = js.native
  def PageScroll(Down: Any): Unit = js.native
  def PageScroll(Down: Any, Up: Any): Unit = js.native
  def PageScroll(Down: Unit, Up: Any): Unit = js.native
  
  val Pages: typings.activexWord.Word.Pages = js.native
  
  val Parent: Any = js.native
  
  val Previous: Pane = js.native
  
  val Selection: typings.activexWord.Word.Selection = js.native
  
  def SmallScroll(): Unit = js.native
  def SmallScroll(Down: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Unit, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Any, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Any, ToRight: Unit, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Any, ToLeft: Any): Unit = js.native
  def SmallScroll(Down: Unit, Up: Unit, ToRight: Unit, ToLeft: Any): Unit = js.native
  
  def TOCInFrameset(): Unit = js.native
  
  var VerticalPercentScrolled: Double = js.native
  
  val View: typings.activexWord.Word.View = js.native
  
  /* private */ @JSName("Word.Pane_typekey")
  var WordDotPane_typekey: Pane = js.native
  
  val Zooms: typings.activexWord.Word.Zooms = js.native
}
