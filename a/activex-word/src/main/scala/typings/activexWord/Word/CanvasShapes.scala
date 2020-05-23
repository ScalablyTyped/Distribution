package typings.activexWord.Word

import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasShapes extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.CanvasShapes_typekey")
  var WordDotCanvasShapes_typekey: CanvasShapes
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape
  def AddCurve(SafeArrayOfPoints: js.Any): Shape
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape
  def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[js.Any],
    SaveWithDocument: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any]
  ): Shape
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape
  def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape
  def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double
  ): Shape
  def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder
  def Item(Index: js.Any): Shape
  def Range(Index: js.Any): ShapeRange
  def SelectAll(): Unit
}

object CanvasShapes {
  @scala.inline
  def apply(
    AddCallout: (MsoCalloutType, Double, Double, Double, Double) => Shape,
    AddConnector: (MsoConnectorType, Double, Double, Double, Double) => Shape,
    AddCurve: js.Any => Shape,
    AddLabel: (MsoTextOrientation, Double, Double, Double, Double) => Shape,
    AddLine: (Double, Double, Double, Double) => Shape,
    AddPicture: (String, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Shape,
    AddPolyline: js.Any => Shape,
    AddShape: (Double, Double, Double, Double, Double) => Shape,
    AddTextEffect: (MsoPresetTextEffect, String, String, Double, MsoTriState, MsoTriState, Double, Double) => Shape,
    AddTextbox: (MsoTextOrientation, Double, Double, Double, Double) => Shape,
    Application: Application,
    BuildFreeform: (MsoEditingType, Double, Double) => FreeformBuilder,
    Count: Double,
    Creator: Double,
    Item: js.Any => Shape,
    Parent: js.Any,
    Range: js.Any => ShapeRange,
    SelectAll: () => Unit,
    WordDotCanvasShapes_typekey: CanvasShapes
  ): CanvasShapes = {
    val __obj = js.Dynamic.literal(AddCallout = js.Any.fromFunction5(AddCallout), AddConnector = js.Any.fromFunction5(AddConnector), AddCurve = js.Any.fromFunction1(AddCurve), AddLabel = js.Any.fromFunction5(AddLabel), AddLine = js.Any.fromFunction4(AddLine), AddPicture = js.Any.fromFunction7(AddPicture), AddPolyline = js.Any.fromFunction1(AddPolyline), AddShape = js.Any.fromFunction5(AddShape), AddTextEffect = js.Any.fromFunction8(AddTextEffect), AddTextbox = js.Any.fromFunction5(AddTextbox), Application = Application.asInstanceOf[js.Any], BuildFreeform = js.Any.fromFunction3(BuildFreeform), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Range = js.Any.fromFunction1(Range), SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.CanvasShapes_typekey")(WordDotCanvasShapes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasShapes]
  }
}

