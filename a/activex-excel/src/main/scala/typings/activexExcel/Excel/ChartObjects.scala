package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartObjects extends StObject {
  
  def apply(Index: String): js.Any = js.native
  def apply(Index: Double): js.Any = js.native
  
  def Add(Left: Double, Top: Double, Width: Double, Height: Double): ChartObject = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Border: typings.activexExcel.Excel.Border = js.native
  
  def BringToFront(): js.Any = js.native
  
  def Copy(): js.Any = js.native
  
  /**
    * @param Appearance [Appearance=2]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): js.Any = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: XlCopyPictureFormat): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): js.Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Cut(): js.Any = js.native
  
  def Delete(): js.Any = js.native
  
  def Duplicate(): js.Any = js.native
  
  var Enabled: Boolean = js.native
  
  def Group(): GroupObject = js.native
  
  var Height: Double = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  def Item(Index: String): ChartObject = js.native
  def Item(Index: Double): ChartObject = js.native
  
  var Left: Double = js.native
  
  var Locked: Boolean = js.native
  
  var OnAction: String = js.native
  
  val Parent: js.Any = js.native
  
  var Placement: XlPlacement = js.native
  
  var PrintObject: Boolean = js.native
  
  var ProtectChartObject: Boolean = js.native
  
  var RoundedCorners: Boolean = js.native
  
  def Select(): js.Any = js.native
  def Select(Replace: Boolean): js.Any = js.native
  
  def SendToBack(): js.Any = js.native
  
  var Shadow: Boolean = js.native
  
  def ShapeRange(Index: String): Shape = js.native
  def ShapeRange(Index: Double): Shape = js.native
  @JSName("ShapeRange")
  val ShapeRange_Original: ShapeRange = js.native
  
  var Top: Double = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
  
  def _Copy(): js.Any = js.native
  
  def _Default(Index: js.Any): js.Any = js.native
}
