package typings.activexWord.Word

import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasShapes extends StObject {
  
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  
  def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[js.Any],
    SaveWithDocument: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any]
  ): Shape = js.native
  
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape = js.native
  
  def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  
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
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): Shape = js.native
  
  val Parent: js.Any = js.native
  
  def Range(Index: js.Any): ShapeRange = js.native
  
  def SelectAll(): Unit = js.native
  
  @JSName("Word.CanvasShapes_typekey")
  var WordDotCanvasShapes_typekey: CanvasShapes = js.native
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
  
  @scala.inline
  implicit class CanvasShapesMutableBuilder[Self <: CanvasShapes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCallout(value: (MsoCalloutType, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddCallout", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddConnector(value: (MsoConnectorType, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddConnector", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddCurve(value: js.Any => Shape): Self = StObject.set(x, "AddCurve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddLabel(value: (MsoTextOrientation, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddLabel", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddLine(value: (Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddLine", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddPicture(
      value: (String, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Shape
    ): Self = StObject.set(x, "AddPicture", js.Any.fromFunction7(value))
    
    @scala.inline
    def setAddPolyline(value: js.Any => Shape): Self = StObject.set(x, "AddPolyline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddShape(value: (Double, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddShape", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddTextEffect(
      value: (MsoPresetTextEffect, String, String, Double, MsoTriState, MsoTriState, Double, Double) => Shape
    ): Self = StObject.set(x, "AddTextEffect", js.Any.fromFunction8(value))
    
    @scala.inline
    def setAddTextbox(value: (MsoTextOrientation, Double, Double, Double, Double) => Shape): Self = StObject.set(x, "AddTextbox", js.Any.fromFunction5(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildFreeform(value: (MsoEditingType, Double, Double) => FreeformBuilder): Self = StObject.set(x, "BuildFreeform", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Shape): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Any => ShapeRange): Self = StObject.set(x, "Range", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectAll(value: () => Unit): Self = StObject.set(x, "SelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotCanvasShapes_typekey(value: CanvasShapes): Self = StObject.set(x, "Word.CanvasShapes_typekey", value.asInstanceOf[js.Any])
  }
}
