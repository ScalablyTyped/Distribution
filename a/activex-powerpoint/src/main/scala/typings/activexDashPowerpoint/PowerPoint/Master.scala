package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoBackgroundStyleIndex
import typings.activexDashOffice.Office.OfficeTheme
import typings.activexDashOffice.Office.Script
import typings.activexDashOffice.Office.Scripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typings.activexDashPowerpoint.PowerPoint.ColorScheme = js.native
  val CustomLayouts: typings.activexDashPowerpoint.PowerPoint.CustomLayouts = js.native
  val CustomerData: typings.activexDashPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typings.activexDashPowerpoint.PowerPoint.Design = js.native
  val HeadersFooters: typings.activexDashPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typings.activexDashPowerpoint.PowerPoint.Hyperlinks = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Master_typekey`: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val Shapes: typings.activexDashPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typings.activexDashPowerpoint.PowerPoint.SlideShowTransition = js.native
  val TextStyles: typings.activexDashPowerpoint.PowerPoint.TextStyles = js.native
  val Theme: OfficeTheme = js.native
  val TimeLine: typings.activexDashPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def ApplyTheme(themeName: String): Unit = js.native
  def Delete(): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
}

