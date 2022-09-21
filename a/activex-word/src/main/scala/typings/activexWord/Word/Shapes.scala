package typings.activexWord.Word

import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.SmartArtLayout
import typings.activexOffice.Office.XlChartType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shapes extends StObject {
  
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double, Anchor: Any): Shape = js.native
  
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double, Anchor: Any): Shape = js.native
  
  /** @param Office.XlChartType [Type=-1] */
  def AddChart(
    Type: js.UndefOr[XlChartType],
    Left: js.UndefOr[Any],
    Top: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Anchor: js.UndefOr[Any]
  ): Shape = js.native
  
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  def AddCurve(SafeArrayOfPoints: Any): Shape = js.native
  def AddCurve(SafeArrayOfPoints: Any, Anchor: Any): Shape = js.native
  
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double, Anchor: Any): Shape = js.native
  
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddLabel(
    Orientation: MsoTextOrientation,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double,
    Anchor: Any
  ): Shape = js.native
  
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double, Anchor: Any): Shape = js.native
  
  def AddOLEControl(
    ClassType: js.UndefOr[Any],
    Left: js.UndefOr[Any],
    Top: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Anchor: js.UndefOr[Any]
  ): Shape = js.native
  
  def AddOLEObject(
    ClassType: js.UndefOr[Any],
    FileName: js.UndefOr[Any],
    LinkToFile: js.UndefOr[Any],
    DisplayAsIcon: js.UndefOr[Any],
    IconFileName: js.UndefOr[Any],
    IconIndex: js.UndefOr[Any],
    IconLabel: js.UndefOr[Any],
    Left: js.UndefOr[Any],
    Top: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Anchor: js.UndefOr[Any]
  ): Shape = js.native
  
  def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[Any],
    SaveWithDocument: js.UndefOr[Any],
    Left: js.UndefOr[Any],
    Top: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Anchor: js.UndefOr[Any]
  ): Shape = js.native
  
  def AddPolyline(SafeArrayOfPoints: Any): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: Any, Anchor: Any): Shape = js.native
  
  def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double, Anchor: Any): Shape = js.native
  
  def AddSmartArt(Layout: SmartArtLayout): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any, Width: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any, Width: Any, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any, Width: Any, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any, Width: Any, Height: Unit, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any, Width: Unit, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any, Width: Unit, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Any, Width: Unit, Height: Unit, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Unit, Width: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Unit, Width: Any, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Unit, Width: Any, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Unit, Width: Any, Height: Unit, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Unit, Width: Unit, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Unit, Width: Unit, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Any, Top: Unit, Width: Unit, Height: Unit, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any, Width: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any, Width: Any, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any, Width: Any, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any, Width: Any, Height: Unit, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any, Width: Unit, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any, Width: Unit, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Any, Width: Unit, Height: Unit, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Any, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Any, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Any, Height: Unit, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Unit, Height: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Unit, Height: Any, Anchor: Any): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Unit, Top: Unit, Width: Unit, Height: Unit, Anchor: Any): Shape = js.native
  
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
    Anchor: Any
  ): Shape = js.native
  
  def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddTextbox(
    Orientation: MsoTextOrientation,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double,
    Anchor: Any
  ): Shape = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): Shape = js.native
  
  val Parent: Any = js.native
  
  def Range(Index: Any): ShapeRange = js.native
  
  def SelectAll(): Unit = js.native
  
  /* private */ @JSName("Word.Shapes_typekey")
  var WordDotShapes_typekey: Shapes = js.native
}
