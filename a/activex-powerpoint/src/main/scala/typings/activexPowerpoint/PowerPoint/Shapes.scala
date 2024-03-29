package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoAutoShapeType
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
  
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  /**
    * @param Office.XlChartType [Type=-1]
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
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
    * @param number [Left=1.25]
    * @param number [Top=1.25]
    * @param number [Width=145.25]
    * @param number [Height=145.25]
    */
  def AddComment(): Shape = js.native
  def AddComment(Left: Double): Shape = js.native
  def AddComment(Left: Double, Top: Double): Shape = js.native
  def AddComment(Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddComment(Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddComment(Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddComment(Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddComment(Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddComment(Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddComment(Left: Unit, Top: Double): Shape = js.native
  def AddComment(Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddComment(Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddComment(Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddComment(Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddComment(Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddComment(Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  def AddCurve(SafeArrayOfPoints: Any): Shape = js.native
  
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  /**
    * @param number [Left=0]
    * @param number [Top=0]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddMediaObject(FileName: String): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double, Top: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Unit, Top: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddMediaObject(FileName: String, Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  
  /**
    * @param Office.MsoTriState [LinkToFile=0]
    * @param Office.MsoTriState [SaveWithDocument=-1]
    * @param number [Left=0]
    * @param number [Top=0]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddMediaObject2(
    FileName: String,
    LinkToFile: js.UndefOr[MsoTriState],
    SaveWithDocument: js.UndefOr[MsoTriState],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Shape = js.native
  
  /**
    * @param number [Left=0]
    * @param number [Top=0]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddMediaObjectFromEmbedTag(EmbedTag: String): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double, Top: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Unit, Top: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: String, Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  
  /**
    * @param number [Left=0]
    * @param number [Top=0]
    * @param number [Width=-1]
    * @param number [Height=-1]
    * @param string [ClassName='']
    * @param string [FileName='']
    * @param Office.MsoTriState [DisplayAsIcon=0]
    * @param string [IconFileName='']
    * @param number [IconIndex=0]
    * @param string [IconLabel='']
    * @param Office.MsoTriState [Link=0]
    */
  def AddOLEObject(
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double],
    ClassName: js.UndefOr[String],
    FileName: js.UndefOr[String],
    DisplayAsIcon: js.UndefOr[MsoTriState],
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Link: js.UndefOr[MsoTriState]
  ): Shape = js.native
  
  /**
    * @param number [Width=-1]
    * @param number [Height=-1]
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
  
  /**
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddPlaceholder(Type: PpPlaceholderType): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double, Top: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Unit, Top: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  
  def AddPolyline(SafeArrayOfPoints: Any): Shape = js.native
  
  def AddShape(Type: MsoAutoShapeType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  /**
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
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
  
  /**
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddTable(NumRows: Double, NumColumns: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Unit, Width: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Unit, Top: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Unit, Top: Double, Width: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Unit, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Unit, Top: Double, Width: Unit, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Unit, Top: Unit, Width: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Unit, Top: Unit, Width: Double, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Unit, Top: Unit, Width: Unit, Height: Double): Shape = js.native
  
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
  
  def AddTitle(): Shape = js.native
  
  val Application: Any = js.native
  
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val HasTitle: MsoTriState = js.native
  
  def Item(Index: Any): Shape = js.native
  
  val Parent: Any = js.native
  
  def Paste(): ShapeRange = js.native
  
  /**
    * @param PowerPoint.PpPasteDataType [DataType=0]
    * @param Office.MsoTriState [DisplayAsIcon=0]
    * @param string [IconFileName='']
    * @param number [IconIndex=0]
    * @param string [IconLabel='']
    * @param Office.MsoTriState [Link=0]
    */
  def PasteSpecial(
    DataType: js.UndefOr[PpPasteDataType],
    DisplayAsIcon: js.UndefOr[MsoTriState],
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Link: js.UndefOr[MsoTriState]
  ): ShapeRange = js.native
  
  val Placeholders: typings.activexPowerpoint.PowerPoint.Placeholders = js.native
  
  /* private */ @JSName("PowerPoint.Shapes_typekey")
  var PowerPointDotShapes_typekey: Shapes = js.native
  
  def Range(): ShapeRange = js.native
  def Range(Index: Any): ShapeRange = js.native
  
  def SelectAll(): Unit = js.native
  
  val Title: Shape = js.native
}
