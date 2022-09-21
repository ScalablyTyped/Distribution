package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`false`
import typings.activexOffice.Office.MsoAutoShapeType
import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.SmartArtLayout
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shapes extends StObject {
  
  def apply(Index: String): Shape = js.native
  def apply(Index: Double): Shape = js.native
  
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddChart(
    XlChartType: js.UndefOr[XlChartType],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double],
    NewLayout: js.UndefOr[Boolean]
  ): Shape = js.native
  
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  def AddCurve(SafeArrayOfPoints: SafeArray[Double]): Shape = js.native
  
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddFormControl(Type: XlFormControl, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  def AddOLEObject(
    ClassType: Unit,
    Filename: String,
    Link: js.UndefOr[Boolean],
    DisplayAsIcon: js.UndefOr[Boolean],
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Shape = js.native
  @JSName("AddOLEObject")
  def AddOLEObject_false(
    ClassType: String,
    Filename: Unit,
    Link: js.UndefOr[`false`],
    DisplayAsIcon: js.UndefOr[Boolean],
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Shape = js.native
  
  def AddPicture(
    Filename: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double
  ): Shape = js.native
  
  def AddPolyline(SafeArrayOfPoints: SafeArray[Double]): Shape = js.native
  
  def AddShape(Type: MsoAutoShapeType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddSmartArt(Layout: SmartArtLayout): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  
  def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double
  ): Shape = js.native
  
  def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Shape = js.native
  def Item(Index: Double): Shape = js.native
  
  val Parent: Any = js.native
  
  def Range(Index: String): ShapeRange = js.native
  def Range(Index: Double): ShapeRange = js.native
  def Range(Index: SafeArray[Double | String]): ShapeRange = js.native
  
  def SelectAll(): Unit = js.native
  
  def _Default(Index: Any): Shape = js.native
}
