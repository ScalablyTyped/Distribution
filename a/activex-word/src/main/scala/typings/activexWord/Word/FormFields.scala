package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormFields extends StObject {
  
  def Add(Range: Range, Type: WdFieldType): FormField
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): FormField
  
  val Parent: js.Any
  
  var Shaded: Boolean
  
  /* private */ @JSName("Word.FormFields_typekey")
  var WordDotFormFields_typekey: FormFields
}
object FormFields {
  
  inline def apply(
    Add: (Range, WdFieldType) => FormField,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => FormField,
    Parent: js.Any,
    Shaded: Boolean,
    WordDotFormFields_typekey: FormFields
  ): FormFields = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Shaded = Shaded.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FormFields_typekey")(WordDotFormFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFields]
  }
  
  extension [Self <: FormFields](x: Self) {
    
    inline def setAdd(value: (Range, WdFieldType) => FormField): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => FormField): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setShaded(value: Boolean): Self = StObject.set(x, "Shaded", value.asInstanceOf[js.Any])
    
    inline def setWordDotFormFields_typekey(value: FormFields): Self = StObject.set(x, "Word.FormFields_typekey", value.asInstanceOf[js.Any])
  }
}
