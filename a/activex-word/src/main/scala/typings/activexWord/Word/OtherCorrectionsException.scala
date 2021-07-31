package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherCorrectionsException extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  val Name: String
  
  val Parent: js.Any
  
  @JSName("Word.OtherCorrectionsException_typekey")
  var WordDotOtherCorrectionsException_typekey: OtherCorrectionsException
}
object OtherCorrectionsException {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotOtherCorrectionsException_typekey: OtherCorrectionsException
  ): OtherCorrectionsException = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OtherCorrectionsException_typekey")(WordDotOtherCorrectionsException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCorrectionsException]
  }
  
  @scala.inline
  implicit class OtherCorrectionsExceptionMutableBuilder[Self <: OtherCorrectionsException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOtherCorrectionsException_typekey(value: OtherCorrectionsException): Self = StObject.set(x, "Word.OtherCorrectionsException_typekey", value.asInstanceOf[js.Any])
  }
}
