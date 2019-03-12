package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: activexDashOfficeLib.OfficeNs.MsoBackgroundStyleIndex = js.native
  var ColorScheme: activexDashPowerpointLib.PowerPointNs.ColorScheme = js.native
  val CustomLayouts: activexDashPowerpointLib.PowerPointNs.CustomLayouts = js.native
  val CustomerData: activexDashPowerpointLib.PowerPointNs.CustomerData = js.native
  val Design: activexDashPowerpointLib.PowerPointNs.Design = js.native
  val HeadersFooters: activexDashPowerpointLib.PowerPointNs.HeadersFooters = js.native
  val Height: scala.Double = js.native
  val Hyperlinks: activexDashPowerpointLib.PowerPointNs.Hyperlinks = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Master_typekey`: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: activexDashOfficeLib.OfficeNs.Scripts = js.native
  val Shapes: activexDashPowerpointLib.PowerPointNs.Shapes = js.native
  val SlideShowTransition: activexDashPowerpointLib.PowerPointNs.SlideShowTransition = js.native
  val TextStyles: activexDashPowerpointLib.PowerPointNs.TextStyles = js.native
  val Theme: activexDashOfficeLib.OfficeNs.OfficeTheme = js.native
  val TimeLine: activexDashPowerpointLib.PowerPointNs.TimeLine = js.native
  val Width: scala.Double = js.native
  def ApplyTheme(themeName: java.lang.String): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Scripts(Index: js.Any): activexDashOfficeLib.OfficeNs.Script = js.native
}

