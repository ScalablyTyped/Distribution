package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomProperty extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Name: String
  
  val Parent: js.Any
  
  var Value: String
  
  @JSName("Word.CustomProperty_typekey")
  var WordDotCustomProperty_typekey: CustomProperty
}
object CustomProperty {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotCustomProperty_typekey: CustomProperty
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomProperty_typekey")(WordDotCustomProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  implicit class CustomPropertyMutableBuilder[Self <: CustomProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCustomProperty_typekey(value: CustomProperty): Self = StObject.set(x, "Word.CustomProperty_typekey", value.asInstanceOf[js.Any])
  }
}
