package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoThemeColorSchemeIndex
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.ThemeColor
import typings.activexDashOffice.Office.ThemeColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayout")
@js.native
class CustomLayout protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  val CustomerData: typings.activexDashPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typings.activexDashPowerpoint.PowerPoint.Design = js.native
  var DisplayMasterShapes: MsoTriState = js.native
  var FollowMasterBackground: MsoTriState = js.native
  val HeadersFooters: typings.activexDashPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typings.activexDashPowerpoint.PowerPoint.Hyperlinks = js.native
  val Index: Double = js.native
  var MatchingName: String = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CustomLayout_typekey")
  var PowerPointDotCustomLayout_typekey: CustomLayout = js.native
  var Preserved: MsoTriState = js.native
  val Shapes: typings.activexDashPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typings.activexDashPowerpoint.PowerPoint.SlideShowTransition = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val TimeLine: typings.activexDashPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Duplicate(): CustomLayout = js.native
  def MoveTo(toPos: Double): Unit = js.native
  def Select(): Unit = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

