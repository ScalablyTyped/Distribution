package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phonetic extends StObject {
  
  var Alignment: Double
  
  val Application: typings.activexExcel.Excel.Application
  
  var CharacterType: Double
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Phonetic_typekey")
  var ExcelDotPhonetic_typekey: Phonetic
  
  val Font: typings.activexExcel.Excel.Font
  
  val Parent: Any
  
  var Text: String
  
  var Visible: Boolean
}
object Phonetic {
  
  inline def apply(
    Alignment: Double,
    Application: Application,
    CharacterType: Double,
    Creator: XlCreator,
    ExcelDotPhonetic_typekey: Phonetic,
    Font: Font,
    Parent: Any,
    Text: String,
    Visible: Boolean
  ): Phonetic = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CharacterType = CharacterType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Phonetic_typekey")(ExcelDotPhonetic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phonetic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phonetic] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCharacterType(value: Double): Self = StObject.set(x, "CharacterType", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotPhonetic_typekey(value: Phonetic): Self = StObject.set(x, "Excel.Phonetic_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
