package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartObjects extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Border: activexDashExcelLib.ExcelNs.Border = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  var Enabled: scala.Boolean = js.native
  var Height: scala.Double = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  var Left: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var OnAction: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Placement: XlPlacement = js.native
  var PrintObject: scala.Boolean = js.native
  var ProtectChartObject: scala.Boolean = js.native
  var RoundedCorners: scala.Boolean = js.native
  var Shadow: scala.Boolean = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  def apply(Index: java.lang.String): js.Any = js.native
  def apply(Index: scala.Double): js.Any = js.native
  def Add(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): ChartObject = js.native
  def BringToFront(): js.Any = js.native
  def Copy(): js.Any = js.native
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  def Cut(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Duplicate(): js.Any = js.native
  def Group(): GroupObject = js.native
  def Item(Index: java.lang.String): ChartObject = js.native
  def Item(Index: scala.Double): ChartObject = js.native
  def Select(): js.Any = js.native
  def Select(Replace: scala.Boolean): js.Any = js.native
  def SendToBack(): js.Any = js.native
  def ShapeRange(Index: java.lang.String): Shape = js.native
  def ShapeRange(Index: scala.Double): Shape = js.native
  def _Copy(): js.Any = js.native
  def _Default(Index: js.Any): js.Any = js.native
}

