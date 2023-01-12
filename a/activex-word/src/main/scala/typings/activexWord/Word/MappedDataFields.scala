package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappedDataFields extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdMappedDataFields): MappedDataField
  
  val Parent: Any
  
  /* private */ @JSName("Word.MappedDataFields_typekey")
  var WordDotMappedDataFields_typekey: MappedDataFields
}
object MappedDataFields {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdMappedDataFields => MappedDataField,
    Parent: Any,
    WordDotMappedDataFields_typekey: MappedDataFields
  ): MappedDataFields = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MappedDataFields_typekey")(WordDotMappedDataFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedDataFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappedDataFields] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: WdMappedDataFields => MappedDataField): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotMappedDataFields_typekey(value: MappedDataFields): Self = StObject.set(x, "Word.MappedDataFields_typekey", value.asInstanceOf[js.Any])
  }
}
