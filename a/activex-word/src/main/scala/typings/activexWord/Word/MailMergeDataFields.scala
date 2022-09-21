package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMergeDataFields extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): MailMergeDataField
  
  val Parent: Any
  
  /* private */ @JSName("Word.MailMergeDataFields_typekey")
  var WordDotMailMergeDataFields_typekey: MailMergeDataFields
}
object MailMergeDataFields {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => MailMergeDataField,
    Parent: Any,
    WordDotMailMergeDataFields_typekey: MailMergeDataFields
  ): MailMergeDataFields = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeDataFields_typekey")(WordDotMailMergeDataFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeDataFields]
  }
  
  extension [Self <: MailMergeDataFields](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => MailMergeDataField): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotMailMergeDataFields_typekey(value: MailMergeDataFields): Self = StObject.set(x, "Word.MailMergeDataFields_typekey", value.asInstanceOf[js.Any])
  }
}
