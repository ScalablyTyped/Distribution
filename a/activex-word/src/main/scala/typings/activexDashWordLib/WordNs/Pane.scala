package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Pane")
@js.native
class Pane protected () extends js.Object {
  val Application: Application = js.native
  var BrowseToWindow: scala.Boolean = js.native
  val BrowseWidth: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DisplayRulers: scala.Boolean = js.native
  var DisplayVerticalRuler: scala.Boolean = js.native
  val Document: Document = js.native
  val Frameset: Frameset = js.native
  var HorizontalPercentScrolled: scala.Double = js.native
  val Index: scala.Double = js.native
  var MinimumFontSize: scala.Double = js.native
  val Next: Pane = js.native
  val Pages: Pages = js.native
  val Parent: js.Any = js.native
  val Previous: Pane = js.native
  val Selection: Selection = js.native
  var VerticalPercentScrolled: scala.Double = js.native
  val View: View = js.native
  var `Word.Pane_typekey`: Pane = js.native
  val Zooms: Zooms = js.native
  def Activate(): scala.Unit = js.native
  def AutoScroll(Velocity: scala.Double): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def LargeScroll(): scala.Unit = js.native
  def LargeScroll(Down: js.Any): scala.Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any): scala.Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): scala.Unit = js.native
  def LargeScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): scala.Unit = js.native
  def NewFrameset(): scala.Unit = js.native
  def PageScroll(): scala.Unit = js.native
  def PageScroll(Down: js.Any): scala.Unit = js.native
  def PageScroll(Down: js.Any, Up: js.Any): scala.Unit = js.native
  def SmallScroll(): scala.Unit = js.native
  def SmallScroll(Down: js.Any): scala.Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any): scala.Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any): scala.Unit = js.native
  def SmallScroll(Down: js.Any, Up: js.Any, ToRight: js.Any, ToLeft: js.Any): scala.Unit = js.native
  def TOCInFrameset(): scala.Unit = js.native
}

