package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: activexDashOfficeLib.OfficeNs.MsoBackgroundStyleIndex = js.native
  var ColorScheme: ColorScheme = js.native
  val CustomLayouts: CustomLayouts = js.native
  val CustomerData: CustomerData = js.native
  val Design: Design = js.native
  val HeadersFooters: HeadersFooters = js.native
  val Height: scala.Double = js.native
  val Hyperlinks: Hyperlinks = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Master_typekey`: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: activexDashOfficeLib.OfficeNs.Scripts = js.native
  val Shapes: Shapes = js.native
  val SlideShowTransition: SlideShowTransition = js.native
  val TextStyles: TextStyles = js.native
  val Theme: activexDashOfficeLib.OfficeNs.OfficeTheme = js.native
  val TimeLine: TimeLine = js.native
  val Width: scala.Double = js.native
  def ApplyTheme(themeName: java.lang.String): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Scripts(Index: js.Any): activexDashOfficeLib.OfficeNs.Script = js.native
}

