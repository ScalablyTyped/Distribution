package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomXMLSchema extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Location: String
  
  val NamespaceURI: String
  
  @JSName("Office.CustomXMLSchema_typekey")
  var OfficeDotCustomXMLSchema_typekey: CustomXMLSchema
  
  val Parent: js.Any
  
  def Reload(): Unit
}
object CustomXMLSchema {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    Location: String,
    NamespaceURI: String,
    OfficeDotCustomXMLSchema_typekey: CustomXMLSchema,
    Parent: js.Any,
    Reload: () => Unit
  ): CustomXMLSchema = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Location = Location.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reload = js.Any.fromFunction0(Reload))
    __obj.updateDynamic("Office.CustomXMLSchema_typekey")(OfficeDotCustomXMLSchema_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLSchema]
  }
  
  @scala.inline
  implicit class CustomXMLSchemaMutableBuilder[Self <: CustomXMLSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "NamespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCustomXMLSchema_typekey(value: CustomXMLSchema): Self = StObject.set(x, "Office.CustomXMLSchema_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: () => Unit): Self = StObject.set(x, "Reload", js.Any.fromFunction0(value))
  }
}
