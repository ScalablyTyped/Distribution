package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMergeFieldNames extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): MailMergeFieldName = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.MailMergeFieldNames_typekey")
  var WordDotMailMergeFieldNames_typekey: MailMergeFieldNames = js.native
}
object MailMergeFieldNames {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => MailMergeFieldName,
    Parent: js.Any,
    WordDotMailMergeFieldNames_typekey: MailMergeFieldNames
  ): MailMergeFieldNames = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeFieldNames_typekey")(WordDotMailMergeFieldNames_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeFieldNames]
  }
  
  @scala.inline
  implicit class MailMergeFieldNamesMutableBuilder[Self <: MailMergeFieldNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => MailMergeFieldName): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotMailMergeFieldNames_typekey(value: MailMergeFieldNames): Self = StObject.set(x, "Word.MailMergeFieldNames_typekey", value.asInstanceOf[js.Any])
  }
}
