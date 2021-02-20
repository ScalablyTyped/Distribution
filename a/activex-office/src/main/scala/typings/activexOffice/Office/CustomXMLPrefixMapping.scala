package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLPrefixMapping extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val NamespaceURI: String = js.native
  
  @JSName("Office.CustomXMLPrefixMapping_typekey")
  var OfficeDotCustomXMLPrefixMapping_typekey: CustomXMLPrefixMapping = js.native
  
  val Parent: js.Any = js.native
  
  val Prefix: String = js.native
}
object CustomXMLPrefixMapping {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    NamespaceURI: String,
    OfficeDotCustomXMLPrefixMapping_typekey: CustomXMLPrefixMapping,
    Parent: js.Any,
    Prefix: String
  ): CustomXMLPrefixMapping = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomXMLPrefixMapping_typekey")(OfficeDotCustomXMLPrefixMapping_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLPrefixMapping]
  }
  
  @scala.inline
  implicit class CustomXMLPrefixMappingMutableBuilder[Self <: CustomXMLPrefixMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "NamespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCustomXMLPrefixMapping_typekey(value: CustomXMLPrefixMapping): Self = StObject.set(x, "Office.CustomXMLPrefixMapping_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
  }
}
