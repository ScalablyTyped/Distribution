package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shapes extends js.Object {
  val Application: js.Any = js.native
  val Background: Shape = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Default: Shape = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): Shape = js.native
  def AddCallout(
    Type: MsoCalloutType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddCanvas(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): Shape = js.native
  /**
    * @param Type [Type=-1]
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddChart(): Shape = js.native
  def AddChart(Type: XlChartType): Shape = js.native
  def AddChart(Type: XlChartType, Left: scala.Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: scala.Double, Top: scala.Double, Width: scala.Double): Shape = js.native
  def AddChart(
    Type: XlChartType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
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
    Style: js.UndefOr[scala.Double],
    Type: js.UndefOr[XlChartType],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double],
    NewLayout: js.UndefOr[scala.Boolean]
  ): Shape = js.native
  def AddConnector(
    Type: MsoConnectorType,
    BeginX: scala.Double,
    BeginY: scala.Double,
    EndX: scala.Double,
    EndY: scala.Double
  ): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddDiagram(
    Type: MsoDiagramType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddLabel(
    Orientation: MsoTextOrientation,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddLine(BeginX: scala.Double, BeginY: scala.Double, EndX: scala.Double, EndY: scala.Double): Shape = js.native
  /**
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddPicture(
    FileName: java.lang.String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: scala.Double,
    Top: scala.Double
  ): Shape = js.native
  def AddPicture(
    FileName: java.lang.String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double
  ): Shape = js.native
  def AddPicture(
    FileName: java.lang.String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddShape(
    Type: MsoAutoShapeType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  /**
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddSmartArt(Layout: SmartArtLayout): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: scala.Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: scala.Double, Top: scala.Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: scala.Double, Top: scala.Double, Width: scala.Double): Shape = js.native
  def AddSmartArt(
    Layout: SmartArtLayout,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
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
    PresetTextEffect: MsoPresetTextEffect,
    Text: java.lang.String,
    FontName: java.lang.String,
    FontSize: scala.Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: scala.Double,
    Top: scala.Double
  ): Shape = js.native
  def AddTextbox(
    Orientation: MsoTextOrientation,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def BuildFreeform(EditingType: MsoEditingType, X1: scala.Double, Y1: scala.Double): FreeformBuilder = js.native
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): scala.Unit = js.native
}

