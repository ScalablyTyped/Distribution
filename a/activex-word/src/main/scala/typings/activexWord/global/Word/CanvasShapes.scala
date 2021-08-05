package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.CanvasShapes")
@js.native
/* private */ class CanvasShapes ()
  extends StObject
     with typings.activexWord.Word.CanvasShapes {
  
  /* CompleteClass */
  override def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddCurve(SafeArrayOfPoints: js.Any): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[js.Any],
    SaveWithDocument: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any]
  ): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddPolyline(SafeArrayOfPoints: js.Any): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double
  ): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): typings.activexWord.Word.FreeformBuilder = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Range(Index: js.Any): typings.activexWord.Word.ShapeRange = js.native
  
  /* CompleteClass */
  override def SelectAll(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.CanvasShapes_typekey")
  var WordDotCanvasShapes_typekey: typings.activexWord.Word.CanvasShapes = js.native
}
