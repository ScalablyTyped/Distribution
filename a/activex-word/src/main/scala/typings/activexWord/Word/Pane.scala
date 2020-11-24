package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pane extends js.Object {
  
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
  def LargeScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: js.Any
  ): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  
  var MinimumFontSize: Double = js.native
  
  def NewFrameset(): Unit = js.native
  
  val Next: Pane = js.native
  
  def PageScroll(): Unit = js.native
  def PageScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any): Unit = js.native
  def PageScroll(Down: js.Any): Unit = js.native
  def PageScroll(Down: js.Any, Up: js.Any): Unit = js.native
  
  val Pages: typings.activexWord.Word.Pages = js.native
  
  val Parent: js.Any = js.native
  
  val Previous: Pane = js.native
  
  val Selection: typings.activexWord.Word.Selection = js.native
  
  def SmallScroll(): Unit = js.native
  def SmallScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: js.Any
  ): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.UndefOr[scala.Nothing], ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.UndefOr[scala.Nothing], ToLeft: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): Unit = js.native
  
  def TOCInFrameset(): Unit = js.native
  
  var VerticalPercentScrolled: Double = js.native
  
  val View: typings.activexWord.Word.View = js.native
  
  @JSName("Word.Pane_typekey")
  var WordDotPane_typekey: Pane = js.native
  
  val Zooms: typings.activexWord.Word.Zooms = js.native
}
