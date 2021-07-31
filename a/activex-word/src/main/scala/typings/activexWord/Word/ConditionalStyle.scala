package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalStyle extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Borders: typings.activexWord.Word.Borders
  
  var BottomPadding: Double
  
  val Creator: Double
  
  var Font: typings.activexWord.Word.Font
  
  var LeftPadding: Double
  
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat
  
  val Parent: js.Any
  
  var RightPadding: Double
  
  val Shading: typings.activexWord.Word.Shading
  
  var TopPadding: Double
  
  @JSName("Word.ConditionalStyle_typekey")
  var WordDotConditionalStyle_typekey: ConditionalStyle
}
object ConditionalStyle {
  
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    BottomPadding: Double,
    Creator: Double,
    Font: Font,
    LeftPadding: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    RightPadding: Double,
    Shading: Shading,
    TopPadding: Double,
    WordDotConditionalStyle_typekey: ConditionalStyle
  ): ConditionalStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], BottomPadding = BottomPadding.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], LeftPadding = LeftPadding.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightPadding = RightPadding.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], TopPadding = TopPadding.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ConditionalStyle_typekey")(WordDotConditionalStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalStyle]
  }
  
  @scala.inline
  implicit class ConditionalStyleMutableBuilder[Self <: ConditionalStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomPadding(value: Double): Self = StObject.set(x, "BottomPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPadding(value: Double): Self = StObject.set(x, "LeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphFormat(value: ParagraphFormat): Self = StObject.set(x, "ParagraphFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPadding(value: Double): Self = StObject.set(x, "RightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShading(value: Shading): Self = StObject.set(x, "Shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopPadding(value: Double): Self = StObject.set(x, "TopPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotConditionalStyle_typekey(value: ConditionalStyle): Self = StObject.set(x, "Word.ConditionalStyle_typekey", value.asInstanceOf[js.Any])
  }
}
