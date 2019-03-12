package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Shapes")
@js.native
class Shapes protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.Shapes_typekey`: Shapes = js.native
  def AddCallout(
    Type: activexDashOfficeLib.OfficeNs.MsoCalloutType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddCallout(
    Type: activexDashOfficeLib.OfficeNs.MsoCalloutType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    Anchor: js.Any
  ): Shape = js.native
  def AddCanvas(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): Shape = js.native
  def AddCanvas(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double, Anchor: js.Any): Shape = js.native
  /** @param Office.XlChartType [Type=-1] */
  def AddChart(
    Type: js.UndefOr[activexDashOfficeLib.OfficeNs.XlChartType],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Anchor: js.UndefOr[js.Any]
  ): Shape = js.native
  def AddConnector(
    Type: activexDashOfficeLib.OfficeNs.MsoConnectorType,
    BeginX: scala.Double,
    BeginY: scala.Double,
    EndX: scala.Double,
    EndY: scala.Double
  ): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any, Anchor: js.Any): Shape = js.native
  def AddDiagram(
    Type: activexDashOfficeLib.OfficeNs.MsoDiagramType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddDiagram(
    Type: activexDashOfficeLib.OfficeNs.MsoDiagramType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    Anchor: js.Any
  ): Shape = js.native
  def AddLabel(
    Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation,
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
    Height: scala.Double,
    Anchor: js.Any
  ): Shape = js.native
  def AddLine(BeginX: scala.Double, BeginY: scala.Double, EndX: scala.Double, EndY: scala.Double): Shape = js.native
  def AddLine(BeginX: scala.Double, BeginY: scala.Double, EndX: scala.Double, EndY: scala.Double, Anchor: js.Any): Shape = js.native
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
    FileName: java.lang.String,
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
  def AddShape(
    Type: scala.Double,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddShape(
    Type: scala.Double,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    Anchor: js.Any
  ): Shape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout): Shape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout, Left: js.Any): Shape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout, Left: js.Any, Top: js.Any): Shape = js.native
  def AddSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout, Left: js.Any, Top: js.Any, Width: js.Any): Shape = js.native
  def AddSmartArt(
    Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout,
    Left: js.Any,
    Top: js.Any,
    Width: js.Any,
    Height: js.Any
  ): Shape = js.native
  def AddSmartArt(
    Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout,
    Left: js.Any,
    Top: js.Any,
    Width: js.Any,
    Height: js.Any,
    Anchor: js.Any
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
  def AddTextEffect(
    PresetTextEffect: activexDashOfficeLib.OfficeNs.MsoPresetTextEffect,
    Text: java.lang.String,
    FontName: java.lang.String,
    FontSize: scala.Double,
    FontBold: activexDashOfficeLib.OfficeNs.MsoTriState,
    FontItalic: activexDashOfficeLib.OfficeNs.MsoTriState,
    Left: scala.Double,
    Top: scala.Double,
    Anchor: js.Any
  ): Shape = js.native
  def AddTextbox(
    Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddTextbox(
    Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double,
    Anchor: js.Any
  ): Shape = js.native
  def BuildFreeform(EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType, X1: scala.Double, Y1: scala.Double): FreeformBuilder = js.native
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): scala.Unit = js.native
}

