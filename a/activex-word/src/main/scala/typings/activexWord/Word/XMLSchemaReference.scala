package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLSchemaReference extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Location: String
  
  val NamespaceURI: String
  
  val Parent: js.Any
  
  def Reload(): Unit
  
  @JSName("Word.XMLSchemaReference_typekey")
  var WordDotXMLSchemaReference_typekey: XMLSchemaReference
}
object XMLSchemaReference {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Location: String,
    NamespaceURI: String,
    Parent: js.Any,
    Reload: () => Unit,
    WordDotXMLSchemaReference_typekey: XMLSchemaReference
  ): XMLSchemaReference = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Location = Location.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reload = js.Any.fromFunction0(Reload))
    __obj.updateDynamic("Word.XMLSchemaReference_typekey")(WordDotXMLSchemaReference_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSchemaReference]
  }
  
  @scala.inline
  implicit class XMLSchemaReferenceMutableBuilder[Self <: XMLSchemaReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "NamespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: () => Unit): Self = StObject.set(x, "Reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotXMLSchemaReference_typekey(value: XMLSchemaReference): Self = StObject.set(x, "Word.XMLSchemaReference_typekey", value.asInstanceOf[js.Any])
  }
}
