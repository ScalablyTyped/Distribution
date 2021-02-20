package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMergeFieldName extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Index: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.MailMergeFieldName_typekey")
  var WordDotMailMergeFieldName_typekey: MailMergeFieldName = js.native
}
object MailMergeFieldName {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotMailMergeFieldName_typekey: MailMergeFieldName
  ): MailMergeFieldName = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeFieldName_typekey")(WordDotMailMergeFieldName_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeFieldName]
  }
  
  @scala.inline
  implicit class MailMergeFieldNameMutableBuilder[Self <: MailMergeFieldName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotMailMergeFieldName_typekey(value: MailMergeFieldName): Self = StObject.set(x, "Word.MailMergeFieldName_typekey", value.asInstanceOf[js.Any])
  }
}
