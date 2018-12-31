package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasShapes extends js.Object {
  val Application: js.Any = js.native
  val Background: Shape = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Shape = js.native
  def apply(Index: scala.Double): Shape = js.native
  def AddCallout(
    Type: MsoCalloutType,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Shape = js.native
  def AddConnector(
    Type: MsoConnectorType,
    BeginX: scala.Double,
    BeginY: scala.Double,
    EndX: scala.Double,
    EndY: scala.Double
  ): Shape = js.native
  def AddCurve(SafeArrayOfPoints: activexDashInteropLib.SafeArray[scala.Double]): Shape = js.native
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
  def AddPolyline(SafeArrayOfPoints: activexDashInteropLib.SafeArray[scala.Double]): Shape = js.native
  def AddShape(
    Type: MsoAutoShapeType,
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
  def Item(Index: java.lang.String): Shape = js.native
  def Item(Index: scala.Double): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): scala.Unit = js.native
}

