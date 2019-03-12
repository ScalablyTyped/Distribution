package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Shapes")
@js.native
class Shapes protected () extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val HasTitle: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Parent: js.Any = js.native
  val Placeholders: activexDashPowerpointLib.PowerPointNs.Placeholders = js.native
  var `PowerPoint.Shapes_typekey`: Shapes = js.native
  val Title: Shape = js.native
  def AddCallout(
    Type: activexDashOfficeLib.OfficeNs.MsoCalloutType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddCanvas(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): Shape = js.native
  /**
    * @param Office.XlChartType [Type=-1]
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddChart(): Shape = js.native
  def AddChart(Type: activexDashOfficeLib.OfficeNs.XlChartType): Shape = js.native
  def AddChart(Type: activexDashOfficeLib.OfficeNs.XlChartType, Left: scala.Double): Shape = js.native
  def AddChart(Type: activexDashOfficeLib.OfficeNs.XlChartType, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddChart(
    Type: activexDashOfficeLib.OfficeNs.XlChartType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double
  ): Shape = js.native
  def AddChart(
    Type: activexDashOfficeLib.OfficeNs.XlChartType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  /**
    * @param number [Left=1.25]
    * @param number [Top=1.25]
    * @param number [Width=145.25]
    * @param number [Height=145.25]
    */
  def AddComment(): Shape = js.native
  def AddComment(Left: scala.Double): Shape = js.native
  def AddComment(Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddComment(Left: scala.Double, Top: scala.Double, Width: scala.Double): Shape = js.native
  def AddComment(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): Shape = js.native
  def AddConnector(
    Type: activexDashOfficeLib.OfficeNs.MsoConnectorType,
    BeginX: scala.Double,
    BeginY: scala.Double,
    EndX: scala.Double,
    EndY: scala.Double
  ): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddDiagram(
    Type: activexDashOfficeLib.OfficeNs.MsoDiagramType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddLabel(
    Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddLine(BeginX: scala.Double, BeginY: scala.Double, EndX: scala.Double, EndY: scala.Double): Shape = js.native
  /**
    * @param number [Left=0]
    * @param number [Top=0]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddMediaObject(FileName: java.lang.String): Shape = js.native
  def AddMediaObject(FileName: java.lang.String, Left: scala.Double): Shape = js.native
  def AddMediaObject(FileName: java.lang.String, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddMediaObject(FileName: java.lang.String, Left: scala.Double, Top: scala.Double, Width: scala.Double): Shape = js.native
  def AddMediaObject(
    FileName: java.lang.String,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  /**
    * @param Office.MsoTriState [LinkToFile=0]
    * @param Office.MsoTriState [SaveWithDocument=-1]
    * @param number [Left=0]
    * @param number [Top=0]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddMediaObject2(
    FileName: java.lang.String,
    LinkToFile: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    SaveWithDocument: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Shape = js.native
  /**
    * @param number [Left=0]
    * @param number [Top=0]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddMediaObjectFromEmbedTag(EmbedTag: java.lang.String): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: java.lang.String, Left: scala.Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: java.lang.String, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(EmbedTag: java.lang.String, Left: scala.Double, Top: scala.Double, Width: scala.Double): Shape = js.native
  def AddMediaObjectFromEmbedTag(
    EmbedTag: java.lang.String,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
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
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double],
    ClassName: js.UndefOr[java.lang.String],
    FileName: js.UndefOr[java.lang.String],
    DisplayAsIcon: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Link: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState]
  ): Shape = js.native
  /**
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddPicture(
    FileName: java.lang.String,
    LinkToFile: activexDashOfficeLib.OfficeNs.MsoTriState,
    SaveWithDocument: activexDashOfficeLib.OfficeNs.MsoTriState,
    Left: scala.Double,
    Top: scala.Double
  ): Shape = js.native
  def AddPicture(
    FileName: java.lang.String,
    LinkToFile: activexDashOfficeLib.OfficeNs.MsoTriState,
    SaveWithDocument: activexDashOfficeLib.OfficeNs.MsoTriState,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double
  ): Shape = js.native
  def AddPicture(
    FileName: java.lang.String,
    LinkToFile: activexDashOfficeLib.OfficeNs.MsoTriState,
    SaveWithDocument: activexDashOfficeLib.OfficeNs.MsoTriState,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  /**
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddPlaceholder(Type: PpPlaceholderType): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: scala.Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddPlaceholder(Type: PpPlaceholderType, Left: scala.Double, Top: scala.Double, Width: scala.Double): Shape = js.native
  def AddPlaceholder(
    Type: PpPlaceholderType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddShape(
    Type: activexDashOfficeLib.OfficeNs.MsoAutoShapeType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  /**
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout): Shape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout, Left: scala.Double): Shape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddSmartArt(
    Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double
  ): Shape = js.native
  def AddSmartArt(
    Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  /**
    * @param number [Left=-1]
    * @param number [Top=-1]
    * @param number [Width=-1]
    * @param number [Height=-1]
    */
  def AddTable(NumRows: scala.Double, NumColumns: scala.Double): Shape = js.native
  def AddTable(NumRows: scala.Double, NumColumns: scala.Double, Left: scala.Double): Shape = js.native
  def AddTable(NumRows: scala.Double, NumColumns: scala.Double, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddTable(
    NumRows: scala.Double,
    NumColumns: scala.Double,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double
  ): Shape = js.native
  def AddTable(
    NumRows: scala.Double,
    NumColumns: scala.Double,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddTextEffect(
    PresetTextEffect: activexDashOfficeLib.OfficeNs.MsoPresetTextEffect,
    Text: java.lang.String,
    FontName: java.lang.String,
    FontSize: scala.Double,
    FontBold: activexDashOfficeLib.OfficeNs.MsoTriState,
    FontItalic: activexDashOfficeLib.OfficeNs.MsoTriState,
    Left: scala.Double,
    Top: scala.Double
  ): Shape = js.native
  def AddTextbox(
    Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddTitle(): Shape = js.native
  def BuildFreeform(EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType, X1: scala.Double, Y1: scala.Double): FreeformBuilder = js.native
  def Item(Index: js.Any): Shape = js.native
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
    DisplayAsIcon: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Link: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState]
  ): ShapeRange = js.native
  def Range(): ShapeRange = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): scala.Unit = js.native
}

