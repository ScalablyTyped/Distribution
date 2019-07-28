package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoThemeColorSchemeIndex
import typings.activexDashOffice.OfficeNs.MsoTriState
import typings.activexDashOffice.OfficeNs.ThemeColor
import typings.activexDashOffice.OfficeNs.ThemeColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayout")
@js.native
class CustomLayout protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Background: ShapeRange = js.native
  val CustomerData: typings.activexDashPowerpoint.PowerPointNs.CustomerData = js.native
  val Design: typings.activexDashPowerpoint.PowerPointNs.Design = js.native
  var DisplayMasterShapes: MsoTriState = js.native
  var FollowMasterBackground: MsoTriState = js.native
  val HeadersFooters: typings.activexDashPowerpoint.PowerPointNs.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typings.activexDashPowerpoint.PowerPointNs.Hyperlinks = js.native
  val Index: Double = js.native
  var MatchingName: String = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.CustomLayout_typekey`: CustomLayout = js.native
  var Preserved: MsoTriState = js.native
  val Shapes: typings.activexDashPowerpoint.PowerPointNs.Shapes = js.native
  val SlideShowTransition: typings.activexDashPowerpoint.PowerPointNs.SlideShowTransition = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val TimeLine: typings.activexDashPowerpoint.PowerPointNs.TimeLine = js.native
  val Width: Double = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Duplicate(): CustomLayout = js.native
  def MoveTo(toPos: Double): Unit = js.native
  def Select(): Unit = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

