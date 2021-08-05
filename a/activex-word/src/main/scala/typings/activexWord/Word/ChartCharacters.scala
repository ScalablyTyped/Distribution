package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCharacters extends StObject {
  
  val Application: js.Any
  
  var Caption: String
  
  val Count: Double
  
  val Creator: Double
  
  def Delete(): js.Any
  
  val Font: ChartFont
  
  def Insert(String: String): js.Any
  
  val Parent: js.Any
  
  var PhoneticCharacters: String
  
  var Text: String
  
  /* private */ @JSName("Word.ChartCharacters_typekey")
  var WordDotChartCharacters_typekey: ChartCharacters
}
object ChartCharacters {
  
  inline def apply(
    Application: js.Any,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: () => js.Any,
    Font: ChartFont,
    Insert: String => js.Any,
    Parent: js.Any,
    PhoneticCharacters: String,
    Text: String,
    WordDotChartCharacters_typekey: ChartCharacters
  ): ChartCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartCharacters_typekey")(WordDotChartCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCharacters]
  }
  
  extension [Self <: ChartCharacters](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setInsert(value: String => js.Any): Self = StObject.set(x, "Insert", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPhoneticCharacters(value: String): Self = StObject.set(x, "PhoneticCharacters", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setWordDotChartCharacters_typekey(value: ChartCharacters): Self = StObject.set(x, "Word.ChartCharacters_typekey", value.asInstanceOf[js.Any])
  }
}
