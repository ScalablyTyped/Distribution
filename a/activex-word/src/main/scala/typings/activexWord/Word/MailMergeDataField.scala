package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMergeDataField extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Index: Double
  
  val Name: String
  
  val Parent: js.Any
  
  val Value: String
  
  @JSName("Word.MailMergeDataField_typekey")
  var WordDotMailMergeDataField_typekey: MailMergeDataField
}
object MailMergeDataField {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotMailMergeDataField_typekey: MailMergeDataField
  ): MailMergeDataField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeDataField_typekey")(WordDotMailMergeDataField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeDataField]
  }
  
  @scala.inline
  implicit class MailMergeDataFieldMutableBuilder[Self <: MailMergeDataField] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotMailMergeDataField_typekey(value: MailMergeDataField): Self = StObject.set(x, "Word.MailMergeDataField_typekey", value.asInstanceOf[js.Any])
  }
}
