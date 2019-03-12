package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shapes extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Shape = js.native
  def apply(Index: scala.Double): Shape = js.native
  def AddCallout(
    Type: activexDashOfficeLib.OfficeNs.MsoCalloutType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddCanvas(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): Shape = js.native
  def AddChart(
    XlChartType: js.UndefOr[XlChartType],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double],
    NewLayout: js.UndefOr[scala.Boolean]
  ): Shape = js.native
  def AddConnector(
    Type: activexDashOfficeLib.OfficeNs.MsoConnectorType,
    BeginX: scala.Double,
    BeginY: scala.Double,
    EndX: scala.Double,
    EndY: scala.Double
  ): Shape = js.native
  def AddCurve(SafeArrayOfPoints: stdLib.SafeArray[scala.Double]): Shape = js.native
  def AddDiagram(
    Type: activexDashOfficeLib.OfficeNs.MsoDiagramType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddFormControl(
    Type: XlFormControl,
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
  def AddOLEObject(
    ClassType: java.lang.String,
    Filename: js.UndefOr[js.UndefOr[scala.Nothing]],
    Link: js.UndefOr[activexDashExcelLib.activexDashExcelLibNumbers.`false`],
    DisplayAsIcon: js.UndefOr[scala.Boolean],
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Shape = js.native
  def AddOLEObject(
    ClassType: js.UndefOr[scala.Nothing],
    Filename: java.lang.String,
    Link: js.UndefOr[scala.Boolean],
    DisplayAsIcon: js.UndefOr[scala.Boolean],
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Shape = js.native
  def AddPicture(
    Filename: java.lang.String,
    LinkToFile: activexDashOfficeLib.OfficeNs.MsoTriState,
    SaveWithDocument: activexDashOfficeLib.OfficeNs.MsoTriState,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: stdLib.SafeArray[scala.Double]): Shape = js.native
  def AddShape(
    Type: activexDashOfficeLib.OfficeNs.MsoAutoShapeType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
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
  def BuildFreeform(EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType, X1: scala.Double, Y1: scala.Double): FreeformBuilder = js.native
  def Item(Index: java.lang.String): Shape = js.native
  def Item(Index: scala.Double): Shape = js.native
  def Range(Index: java.lang.String): ShapeRange = js.native
  def Range(Index: scala.Double): ShapeRange = js.native
  def Range(Index: stdLib.SafeArray[scala.Double | java.lang.String]): ShapeRange = js.native
  def SelectAll(): scala.Unit = js.native
  def _Default(Index: js.Any): Shape = js.native
}

