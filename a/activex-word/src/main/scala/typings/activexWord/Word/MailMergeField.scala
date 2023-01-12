package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMergeField extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Code: Range
  
  def Copy(): Unit
  
  val Creator: Double
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  var Locked: Boolean
  
  val Next: MailMergeField
  
  val Parent: Any
  
  val Previous: MailMergeField
  
  def Select(): Unit
  
  val Type: WdFieldType
  
  /* private */ @JSName("Word.MailMergeField_typekey")
  var WordDotMailMergeField_typekey: MailMergeField
}
object MailMergeField {
  
  inline def apply(
    Application: Application,
    Code: Range,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Locked: Boolean,
    Next: MailMergeField,
    Parent: Any,
    Previous: MailMergeField,
    Select: () => Unit,
    Type: WdFieldType,
    WordDotMailMergeField_typekey: MailMergeField
  ): MailMergeField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Locked = Locked.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeField_typekey")(WordDotMailMergeField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailMergeField] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Range): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setNext(value: MailMergeField): Self = StObject.set(x, "Next", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: MailMergeField): Self = StObject.set(x, "Previous", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setType(value: WdFieldType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotMailMergeField_typekey(value: MailMergeField): Self = StObject.set(x, "Word.MailMergeField_typekey", value.asInstanceOf[js.Any])
  }
}
