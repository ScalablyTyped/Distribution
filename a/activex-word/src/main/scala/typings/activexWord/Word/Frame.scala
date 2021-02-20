package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  def Copy(): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  var Height: Double = js.native
  
  var HeightRule: WdFrameSizeRule = js.native
  
  var HorizontalDistanceFromText: Double = js.native
  
  var HorizontalPosition: Double = js.native
  
  var LockAnchor: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  
  def Select(): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  var TextWrap: Boolean = js.native
  
  var VerticalDistanceFromText: Double = js.native
  
  var VerticalPosition: Double = js.native
  
  var Width: Double = js.native
  
  var WidthRule: WdFrameSizeRule = js.native
  
  @JSName("Word.Frame_typekey")
  var WordDotFrame_typekey: Frame = js.native
}
object Frame {
  
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Height: Double,
    HeightRule: WdFrameSizeRule,
    HorizontalDistanceFromText: Double,
    HorizontalPosition: Double,
    LockAnchor: Boolean,
    Parent: js.Any,
    Range: Range,
    RelativeHorizontalPosition: WdRelativeHorizontalPosition,
    RelativeVerticalPosition: WdRelativeVerticalPosition,
    Select: () => Unit,
    Shading: Shading,
    TextWrap: Boolean,
    VerticalDistanceFromText: Double,
    VerticalPosition: Double,
    Width: Double,
    WidthRule: WdFrameSizeRule,
    WordDotFrame_typekey: Frame
  ): Frame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], HeightRule = HeightRule.asInstanceOf[js.Any], HorizontalDistanceFromText = HorizontalDistanceFromText.asInstanceOf[js.Any], HorizontalPosition = HorizontalPosition.asInstanceOf[js.Any], LockAnchor = LockAnchor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RelativeHorizontalPosition = RelativeHorizontalPosition.asInstanceOf[js.Any], RelativeVerticalPosition = RelativeVerticalPosition.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shading = Shading.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], VerticalDistanceFromText = VerticalDistanceFromText.asInstanceOf[js.Any], VerticalPosition = VerticalPosition.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthRule = WidthRule.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frame_typekey")(WordDotFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightRule(value: WdFrameSizeRule): Self = StObject.set(x, "HeightRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalDistanceFromText(value: Double): Self = StObject.set(x, "HorizontalDistanceFromText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPosition(value: Double): Self = StObject.set(x, "HorizontalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockAnchor(value: Boolean): Self = StObject.set(x, "LockAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeHorizontalPosition(value: WdRelativeHorizontalPosition): Self = StObject.set(x, "RelativeHorizontalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeVerticalPosition(value: WdRelativeVerticalPosition): Self = StObject.set(x, "RelativeVerticalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShading(value: Shading): Self = StObject.set(x, "Shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWrap(value: Boolean): Self = StObject.set(x, "TextWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalDistanceFromText(value: Double): Self = StObject.set(x, "VerticalDistanceFromText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPosition(value: Double): Self = StObject.set(x, "VerticalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthRule(value: WdFrameSizeRule): Self = StObject.set(x, "WidthRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFrame_typekey(value: Frame): Self = StObject.set(x, "Word.Frame_typekey", value.asInstanceOf[js.Any])
  }
}
