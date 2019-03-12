package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.DocumentWindow")
@js.native
class DocumentWindow protected () extends js.Object {
  val Active: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ActivePane: Pane = js.native
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  var BlackAndWhite: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Caption: java.lang.String = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val Panes: activexDashPowerpointLib.PowerPointNs.Panes = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.DocumentWindow_typekey`: DocumentWindow = js.native
  val Presentation: activexDashPowerpointLib.PowerPointNs.Presentation = js.native
  val Selection: activexDashPowerpointLib.PowerPointNs.Selection = js.native
  var SplitHorizontal: scala.Double = js.native
  var SplitVertical: scala.Double = js.native
  var Top: scala.Double = js.native
  val View: activexDashPowerpointLib.PowerPointNs.View = js.native
  var ViewType: PpViewType = js.native
  var Width: scala.Double = js.native
  var WindowState: PpWindowState = js.native
  def Activate(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def ExpandSection(sectionIndex: scala.Double, Expand: scala.Boolean): scala.Unit = js.native
  def FitToPage(): scala.Unit = js.native
  def IsSectionExpanded(sectionIndex: scala.Double): scala.Boolean = js.native
  /**
    * @param number [Down=1]
    * @param number [Up=0]
    * @param number [ToRight=0]
    * @param number [ToLeft=0]
    */
  def LargeScroll(): scala.Unit = js.native
  def LargeScroll(Down: scala.Double): scala.Unit = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double): scala.Unit = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double): scala.Unit = js.native
  def LargeScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double, ToLeft: scala.Double): scala.Unit = js.native
  def NewWindow(): DocumentWindow = js.native
  def PointsToScreenPixelsX(Points: scala.Double): scala.Double = js.native
  def PointsToScreenPixelsY(Points: scala.Double): scala.Double = js.native
  def RangeFromPoint(X: scala.Double, Y: scala.Double): js.Any = js.native
  /** @param Office.MsoTriState [Start=-1] */
  def ScrollIntoView(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def ScrollIntoView(
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    Start: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
  /**
    * @param number [Down=1]
    * @param number [Up=0]
    * @param number [ToRight=0]
    * @param number [ToLeft=0]
    */
  def SmallScroll(): scala.Unit = js.native
  def SmallScroll(Down: scala.Double): scala.Unit = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double): scala.Unit = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double): scala.Unit = js.native
  def SmallScroll(Down: scala.Double, Up: scala.Double, ToRight: scala.Double, ToLeft: scala.Double): scala.Unit = js.native
}

