package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoAutoShapeType
import typings.activexDashOffice.Office.MsoCalloutType
import typings.activexDashOffice.Office.MsoConnectorType
import typings.activexDashOffice.Office.MsoEditingType
import typings.activexDashOffice.Office.MsoPresetTextEffect
import typings.activexDashOffice.Office.MsoTextOrientation
import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CanvasShapes")
@js.native
class CanvasShapes protected () extends js.Object {
  val Application: js.Any = js.native
  val Background: Shape = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CanvasShapes_typekey")
  var PowerPointDotCanvasShapes_typekey: CanvasShapes = js.native
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
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
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddShape(Type: MsoAutoShapeType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
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
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): Unit = js.native
}

