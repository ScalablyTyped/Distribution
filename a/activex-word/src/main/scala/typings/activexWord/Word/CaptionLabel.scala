package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionLabel extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val BuiltIn: Boolean
  
  var ChapterStyleLevel: Double
  
  val Creator: Double
  
  def Delete(): Unit
  
  val ID: WdCaptionLabelID
  
  var IncludeChapterNumber: Boolean
  
  val Name: String
  
  var NumberStyle: WdCaptionNumberStyle
  
  val Parent: js.Any
  
  var Position: WdCaptionPosition
  
  var Separator: WdSeparatorType
  
  /* private */ @JSName("Word.CaptionLabel_typekey")
  var WordDotCaptionLabel_typekey: CaptionLabel
}
object CaptionLabel {
  
  inline def apply(
    Application: Application,
    BuiltIn: Boolean,
    ChapterStyleLevel: Double,
    Creator: Double,
    Delete: () => Unit,
    ID: WdCaptionLabelID,
    IncludeChapterNumber: Boolean,
    Name: String,
    NumberStyle: WdCaptionNumberStyle,
    Parent: js.Any,
    Position: WdCaptionPosition,
    Separator: WdSeparatorType,
    WordDotCaptionLabel_typekey: CaptionLabel
  ): CaptionLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], ChapterStyleLevel = ChapterStyleLevel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ID = ID.asInstanceOf[js.Any], IncludeChapterNumber = IncludeChapterNumber.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabel_typekey")(WordDotCaptionLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabel]
  }
  
  extension [Self <: CaptionLabel](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    inline def setChapterStyleLevel(value: Double): Self = StObject.set(x, "ChapterStyleLevel", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setID(value: WdCaptionLabelID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIncludeChapterNumber(value: Boolean): Self = StObject.set(x, "IncludeChapterNumber", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumberStyle(value: WdCaptionNumberStyle): Self = StObject.set(x, "NumberStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: WdCaptionPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: WdSeparatorType): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    inline def setWordDotCaptionLabel_typekey(value: CaptionLabel): Self = StObject.set(x, "Word.CaptionLabel_typekey", value.asInstanceOf[js.Any])
  }
}
