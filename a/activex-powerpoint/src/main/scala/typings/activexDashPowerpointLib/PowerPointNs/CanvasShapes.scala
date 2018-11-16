package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CanvasShapes")
@js.native
class CanvasShapes protected () extends js.Object {
  val Application: js.Any = js.native
  val Background: Shape = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.CanvasShapes_typekey`: CanvasShapes = js.native
  def AddCallout(
    Type: activexDashOfficeLib.OfficeNs.MsoCalloutType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddConnector(
    Type: activexDashOfficeLib.OfficeNs.MsoConnectorType,
    BeginX: scala.Double,
    BeginY: scala.Double,
    EndX: scala.Double,
    EndY: scala.Double
  ): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddLabel(
    Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddLine(BeginX: scala.Double, BeginY: scala.Double, EndX: scala.Double, EndY: scala.Double): Shape = js.native
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
  /**
           * @param number [Width=-1]
           * @param number [Height=-1]
           */
  def AddPicture(
    FileName: java.lang.String,
    LinkToFile: activexDashOfficeLib.OfficeNs.MsoTriState,
    SaveWithDocument: activexDashOfficeLib.OfficeNs.MsoTriState,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double
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
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): scala.Unit = js.native
}

