package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoBackgroundStyleIndex
import typings.activexOffice.Office.OfficeTheme
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typings.activexPowerpoint.PowerPoint.ColorScheme = js.native
  val CustomLayouts: typings.activexPowerpoint.PowerPoint.CustomLayouts = js.native
  val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typings.activexPowerpoint.PowerPoint.Design = js.native
  val HeadersFooters: typings.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typings.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Master_typekey")
  var PowerPointDotMaster_typekey: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val Shapes: typings.activexPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typings.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  val TextStyles: typings.activexPowerpoint.PowerPoint.TextStyles = js.native
  val Theme: OfficeTheme = js.native
  val TimeLine: typings.activexPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def ApplyTheme(themeName: String): Unit = js.native
  def Delete(): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
}

