package typings.activexWord.Word

import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasShapes extends StObject {
  
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape
  
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape
  
  def AddCurve(SafeArrayOfPoints: Any): Shape
  
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape
  
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape
  
  def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[Any],
    SaveWithDocument: js.UndefOr[Any],
    Left: js.UndefOr[Any],
    Top: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    Height: js.UndefOr[Any]
  ): Shape
  
  def AddPolyline(SafeArrayOfPoints: Any): Shape
  
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
  
  val Application: typings.activexWord.Word.Application
  
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Shape
  
  val Parent: Any
  
  def Range(Index: Any): ShapeRange
  
  def SelectAll(): Unit
  
  /* private */ @JSName("Word.CanvasShapes_typekey")
  var WordDotCanvasShapes_typekey: CanvasShapes
}
object CanvasShapes {
  
  inline def apply(
    AddCallout: (MsoCalloutType, Double, Double, Double, Double) => Shape,
    AddConnector: (MsoConnectorType, Double, Double, Double, Double) => Shape,
    AddCurve: Any => Shape,
    AddLabel: (MsoTextOrientation, Double, Double, Double, Double) => Shape,
    AddLine: (Double, Double, Double, Double) => Shape,
    AddPicture: (String, js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Shape,
    AddPolyline: Any => Shape,
    AddShape: (Double, Double, Double, Double, Double) => Shape,
    AddTextEffect: (MsoPresetTextEffect, String, String, Double, MsoTriState, MsoTriState, Double, Double) => Shape,
    AddTextbox: (MsoTextOrientation, Double, Double, Double, Double) => Shape,
    Application: Application,
    BuildFreeform: (MsoEditingType, Double, Double) => FreeformBuilder,
    Count: Double,
    Creator: Double,
    Item: Any => Shape,
    Parent: Any,
    Range: Any => ShapeRange,
    SelectAll: () => Unit,
    WordDotCanvasShapes_typekey: CanvasShapes
  ): CanvasShapes = {
    val __obj = js.Dynamic.literal(AddCallout = js.Any.fromFunction5(AddCallout), AddConnector = js.Any.fromFunction5(AddConnector), AddCurve = js.Any.fromFunction1(AddCurve), AddLabel = js.Any.fromFunction5(AddLabel), AddLine = js.Any.fromFunction4(AddLine), AddPicture = js.Any.fromFunction7(AddPicture), AddPolyline = js.Any.fromFunction1(AddPolyline), AddShape = js.Any.fromFunction5(AddShape), AddTextEffect = js.Any.fromFunction8(AddTextEffect), AddTextbox = js.Any.fromFunction5(AddTextbox), Application = Application.asInstanceOf[js.Any], BuildFreeform = js.Any.fromFunction3(BuildFreeform), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Range = js.Any.fromFunction1(Range), SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.CanvasShapes_typekey")(WordDotCanvasShapes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasShapes]
  }
  
  extension [Self <: CanvasShapes](x: Self) {
    
    inline def setAddCallout(value: (MsoCalloutType, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddCallout", js.Any.fromFunction5(value))
    
    inline def setAddConnector(value: (MsoConnectorType, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddConnector", js.Any.fromFunction5(value))
    
    inline def setAddCurve(value: Any => Shape): Self = StObject.set(x, "AddCurve", js.Any.fromFunction1(value))
    
    inline def setAddLabel(value: (MsoTextOrientation, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddLabel", js.Any.fromFunction5(value))
    
    inline def setAddLine(value: (Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddLine", js.Any.fromFunction4(value))
    
    inline def setAddPicture(
      value: (String, js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Shape
    ): Self = StObject.set(x, "AddPicture", js.Any.fromFunction7(value))
    
    inline def setAddPolyline(value: Any => Shape): Self = StObject.set(x, "AddPolyline", js.Any.fromFunction1(value))
    
    inline def setAddShape(value: (Double, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddShape", js.Any.fromFunction5(value))
    
    inline def setAddTextEffect(
      value: (MsoPresetTextEffect, String, String, Double, MsoTriState, MsoTriState, Double, Double) => Shape
    ): Self = StObject.set(x, "AddTextEffect", js.Any.fromFunction8(value))
    
    inline def setAddTextbox(value: (MsoTextOrientation, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddTextbox", js.Any.fromFunction5(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuildFreeform(value: (MsoEditingType, Double, Double) => FreeformBuilder): Self = StObject.set(x, "BuildFreeform", js.Any.fromFunction3(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Shape): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Any => ShapeRange): Self = StObject.set(x, "Range", js.Any.fromFunction1(value))
    
    inline def setSelectAll(value: () => Unit): Self = StObject.set(x, "SelectAll", js.Any.fromFunction0(value))
    
    inline def setWordDotCanvasShapes_typekey(value: CanvasShapes): Self = StObject.set(x, "Word.CanvasShapes_typekey", value.asInstanceOf[js.Any])
  }
}
