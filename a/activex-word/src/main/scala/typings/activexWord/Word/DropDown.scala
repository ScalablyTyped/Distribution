package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDown extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var Default: Double
  
  val ListEntries: typings.activexWord.Word.ListEntries
  
  val Parent: Any
  
  val Valid: Boolean
  
  var Value: Double
  
  /* private */ @JSName("Word.DropDown_typekey")
  var WordDotDropDown_typekey: DropDown
}
object DropDown {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Default: Double,
    ListEntries: ListEntries,
    Parent: Any,
    Valid: Boolean,
    Value: Double,
    WordDotDropDown_typekey: DropDown
  ): DropDown = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ListEntries = ListEntries.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropDown_typekey")(WordDotDropDown_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDown]
  }
  
  extension [Self <: DropDown](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Double): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    inline def setListEntries(value: ListEntries): Self = StObject.set(x, "ListEntries", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordDotDropDown_typekey(value: DropDown): Self = StObject.set(x, "Word.DropDown_typekey", value.asInstanceOf[js.Any])
  }
}
