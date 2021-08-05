package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageNumber extends StObject {
  
  var Alignment: WdPageNumberAlignment
  
  val Application: typings.activexWord.Word.Application
  
  def Copy(): Unit
  
  val Creator: Double
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  val Index: Double
  
  val Parent: js.Any
  
  def Select(): Unit
  
  /* private */ @JSName("Word.PageNumber_typekey")
  var WordDotPageNumber_typekey: PageNumber
}
object PageNumber {
  
  inline def apply(
    Alignment: WdPageNumberAlignment,
    Application: Application,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Index: Double,
    Parent: js.Any,
    Select: () => Unit,
    WordDotPageNumber_typekey: PageNumber
  ): PageNumber = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.PageNumber_typekey")(WordDotPageNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageNumber]
  }
  
  extension [Self <: PageNumber](x: Self) {
    
    inline def setAlignment(value: WdPageNumberAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setWordDotPageNumber_typekey(value: PageNumber): Self = StObject.set(x, "Word.PageNumber_typekey", value.asInstanceOf[js.Any])
  }
}
