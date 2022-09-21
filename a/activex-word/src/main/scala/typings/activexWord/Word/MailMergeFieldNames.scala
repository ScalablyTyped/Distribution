package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMergeFieldNames extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): MailMergeFieldName
  
  val Parent: Any
  
  /* private */ @JSName("Word.MailMergeFieldNames_typekey")
  var WordDotMailMergeFieldNames_typekey: MailMergeFieldNames
}
object MailMergeFieldNames {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => MailMergeFieldName,
    Parent: Any,
    WordDotMailMergeFieldNames_typekey: MailMergeFieldNames
  ): MailMergeFieldNames = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeFieldNames_typekey")(WordDotMailMergeFieldNames_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeFieldNames]
  }
  
  extension [Self <: MailMergeFieldNames](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => MailMergeFieldName): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotMailMergeFieldNames_typekey(value: MailMergeFieldNames): Self = StObject.set(x, "Word.MailMergeFieldNames_typekey", value.asInstanceOf[js.Any])
  }
}
