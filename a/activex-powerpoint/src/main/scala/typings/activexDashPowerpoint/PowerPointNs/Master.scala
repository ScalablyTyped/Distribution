package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoBackgroundStyleIndex
import typings.activexDashOffice.OfficeNs.OfficeTheme
import typings.activexDashOffice.OfficeNs.Script
import typings.activexDashOffice.OfficeNs.Scripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typings.activexDashPowerpoint.PowerPointNs.ColorScheme = js.native
  val CustomLayouts: typings.activexDashPowerpoint.PowerPointNs.CustomLayouts = js.native
  val CustomerData: typings.activexDashPowerpoint.PowerPointNs.CustomerData = js.native
  val Design: typings.activexDashPowerpoint.PowerPointNs.Design = js.native
  val HeadersFooters: typings.activexDashPowerpoint.PowerPointNs.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typings.activexDashPowerpoint.PowerPointNs.Hyperlinks = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Master_typekey`: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val Shapes: typings.activexDashPowerpoint.PowerPointNs.Shapes = js.native
  val SlideShowTransition: typings.activexDashPowerpoint.PowerPointNs.SlideShowTransition = js.native
  val TextStyles: typings.activexDashPowerpoint.PowerPointNs.TextStyles = js.native
  val Theme: OfficeTheme = js.native
  val TimeLine: typings.activexDashPowerpoint.PowerPointNs.TimeLine = js.native
  val Width: Double = js.native
  def ApplyTheme(themeName: String): Unit = js.native
  def Delete(): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
}

