package typings.activexDashWord.Word

import typings.activexDashOffice.Office.MsoCalloutType
import typings.activexDashOffice.Office.MsoConnectorType
import typings.activexDashOffice.Office.MsoDiagramType
import typings.activexDashOffice.Office.MsoEditingType
import typings.activexDashOffice.Office.MsoPresetTextEffect
import typings.activexDashOffice.Office.MsoTextOrientation
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.SmartArtLayout
import typings.activexDashOffice.Office.XlChartType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Shapes")
@js.native
class Shapes protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Shapes_typekey")
  var WordDotShapes_typekey: Shapes = js.native
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double, Anchor: js.Any): Shape = js.native
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double, Anchor: js.Any): Shape = js.native
  /** @param Office.XlChartType [Type=-1] */
  def AddChart(
    Type: js.UndefOr[XlChartType],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Anchor: js.UndefOr[js.Any]
  ): Shape = js.native
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any, Anchor: js.Any): Shape = js.native
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double, Anchor: js.Any): Shape = js.native
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddLabel(
    Orientation: MsoTextOrientation,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double,
    Anchor: js.Any
  ): Shape = js.native
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double, Anchor: js.Any): Shape = js.native
  def AddOLEControl(
    ClassType: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Anchor: js.UndefOr[js.Any]
  ): Shape = js.native
  def AddOLEObject(
    ClassType: js.UndefOr[js.Any],
    FileName: js.UndefOr[js.Any],
    LinkToFile: js.UndefOr[js.Any],
    DisplayAsIcon: js.UndefOr[js.Any],
    IconFileName: js.UndefOr[js.Any],
    IconIndex: js.UndefOr[js.Any],
    IconLabel: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Anchor: js.UndefOr[js.Any]
  ): Shape = js.native
  def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[js.Any],
    SaveWithDocument: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Anchor: js.UndefOr[js.Any]
  ): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: js.Any, Anchor: js.Any): Shape = js.native
  def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double, Anchor: js.Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: js.Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: js.Any, Top: js.Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: js.Any, Top: js.Any, Width: js.Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: js.Any, Top: js.Any, Width: js.Any, Height: js.Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: js.Any, Top: js.Any, Width: js.Any, Height: js.Any, Anchor: js.Any): Shape = js.native
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
  def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double,
    Anchor: js.Any
  ): Shape = js.native
  def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddTextbox(
    Orientation: MsoTextOrientation,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double,
    Anchor: js.Any
  ): Shape = js.native
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): Unit = js.native
}

