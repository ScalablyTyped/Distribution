package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shapes extends StObject {
  
  def apply(Index: Any): Shape = js.native
  
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  /**
    * @param Type [Type=-1]
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddChart(): Shape = js.native
  def AddChart(Type: Unit, Left: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Double, Top: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Unit, Top: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: Unit, Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Unit, Top: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  
  /**
    * @param Style [Style=-1]
    * @param Type [Type=-1]
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    * @param NewLayout [NewLayout=true]
    */
  def AddChart2(
    Style: js.UndefOr[Double],
    Type: js.UndefOr[XlChartType],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double],
    NewLayout: js.UndefOr[Boolean]
  ): Shape = js.native
  
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  def AddCurve(SafeArrayOfPoints: Any): Shape = js.native
  
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  /**
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddPicture(
    FileName: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double
  ): Shape = js.native
  def AddPicture(
    FileName: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double,
    Width: Double
  ): Shape = js.native
  def AddPicture(
    FileName: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double
  ): Shape = js.native
  def AddPicture(
    FileName: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double,
    Width: Unit,
    Height: Double
  ): Shape = js.native
  
  def AddPolyline(SafeArrayOfPoints: Any): Shape = js.native
  
  def AddShape(Type: MsoAutoShapeType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  /**
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
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
  
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
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
  
  val Application: Any = js.native
  
  val Background: Shape = js.native
  
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val Default: Shape = js.native
  
  def Item(Index: Any): Shape = js.native
  
  val Parent: Any = js.native
  
  def Range(Index: Any): ShapeRange = js.native
  
  def SelectAll(): Unit = js.native
}
