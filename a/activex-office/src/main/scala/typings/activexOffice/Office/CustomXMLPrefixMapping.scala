package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLPrefixMapping extends js.Object {
  
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
  implicit class CustomXMLPrefixMappingOps[Self <: CustomXMLPrefixMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("NamespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCustomXMLPrefixMapping_typekey(value: CustomXMLPrefixMapping): Self = this.set("Office.CustomXMLPrefixMapping_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
  }
}
