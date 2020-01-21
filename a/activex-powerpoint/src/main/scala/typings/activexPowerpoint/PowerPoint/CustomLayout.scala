package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoThemeColorSchemeIndex
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.ThemeColor
import typings.activexOffice.Office.ThemeColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayout")
@js.native
class CustomLayout protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typings.activexPowerpoint.PowerPoint.Design = js.native
  var DisplayMasterShapes: MsoTriState = js.native
  var FollowMasterBackground: MsoTriState = js.native
  val HeadersFooters: typings.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typings.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  val Index: Double = js.native
  var MatchingName: String = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CustomLayout_typekey")
  var PowerPointDotCustomLayout_typekey: CustomLayout = js.native
  var Preserved: MsoTriState = js.native
  val Shapes: typings.activexPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typings.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val TimeLine: typings.activexPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Duplicate(): CustomLayout = js.native
  def MoveTo(toPos: Double): Unit = js.native
  def Select(): Unit = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

