package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLevel extends StObject {
  
  var Alignment: WdListLevelAlignment
  
  val Application: typings.activexWord.Word.Application
  
  def ApplyPictureBullet(FileName: String): InlineShape
  
  val Creator: Double
  
  var Font: typings.activexWord.Word.Font
  
  val Index: Double
  
  var LinkedStyle: String
  
  var NumberFormat: String
  
  var NumberPosition: Double
  
  var NumberStyle: WdListNumberStyle
  
  val Parent: Any
  
  val PictureBullet: InlineShape
  
  var ResetOnHigher: Double
  
  var ResetOnHigherOld: Boolean
  
  var StartAt: Double
  
  var TabPosition: Double
  
  var TextPosition: Double
  
  var TrailingCharacter: WdTrailingCharacter
  
  /* private */ @JSName("Word.ListLevel_typekey")
  var WordDotListLevel_typekey: ListLevel
}
object ListLevel {
  
  inline def apply(
    Alignment: WdListLevelAlignment,
    Application: Application,
    ApplyPictureBullet: String => InlineShape,
    Creator: Double,
    Font: Font,
    Index: Double,
    LinkedStyle: String,
    NumberFormat: String,
    NumberPosition: Double,
    NumberStyle: WdListNumberStyle,
    Parent: Any,
    PictureBullet: InlineShape,
    ResetOnHigher: Double,
    ResetOnHigherOld: Boolean,
    StartAt: Double,
    TabPosition: Double,
    TextPosition: Double,
    TrailingCharacter: WdTrailingCharacter,
    WordDotListLevel_typekey: ListLevel
  ): ListLevel = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ApplyPictureBullet = js.Any.fromFunction1(ApplyPictureBullet), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], LinkedStyle = LinkedStyle.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberPosition = NumberPosition.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureBullet = PictureBullet.asInstanceOf[js.Any], ResetOnHigher = ResetOnHigher.asInstanceOf[js.Any], ResetOnHigherOld = ResetOnHigherOld.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], TabPosition = TabPosition.asInstanceOf[js.Any], TextPosition = TextPosition.asInstanceOf[js.Any], TrailingCharacter = TrailingCharacter.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListLevel_typekey")(WordDotListLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevel]
  }
  
  extension [Self <: ListLevel](x: Self) {
    
    inline def setAlignment(value: WdListLevelAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplyPictureBullet(value: String => InlineShape): Self = StObject.set(x, "ApplyPictureBullet", js.Any.fromFunction1(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setLinkedStyle(value: String): Self = StObject.set(x, "LinkedStyle", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberPosition(value: Double): Self = StObject.set(x, "NumberPosition", value.asInstanceOf[js.Any])
    
    inline def setNumberStyle(value: WdListNumberStyle): Self = StObject.set(x, "NumberStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPictureBullet(value: InlineShape): Self = StObject.set(x, "PictureBullet", value.asInstanceOf[js.Any])
    
    inline def setResetOnHigher(value: Double): Self = StObject.set(x, "ResetOnHigher", value.asInstanceOf[js.Any])
    
    inline def setResetOnHigherOld(value: Boolean): Self = StObject.set(x, "ResetOnHigherOld", value.asInstanceOf[js.Any])
    
    inline def setStartAt(value: Double): Self = StObject.set(x, "StartAt", value.asInstanceOf[js.Any])
    
    inline def setTabPosition(value: Double): Self = StObject.set(x, "TabPosition", value.asInstanceOf[js.Any])
    
    inline def setTextPosition(value: Double): Self = StObject.set(x, "TextPosition", value.asInstanceOf[js.Any])
    
    inline def setTrailingCharacter(value: WdTrailingCharacter): Self = StObject.set(x, "TrailingCharacter", value.asInstanceOf[js.Any])
    
    inline def setWordDotListLevel_typekey(value: ListLevel): Self = StObject.set(x, "Word.ListLevel_typekey", value.asInstanceOf[js.Any])
  }
}
