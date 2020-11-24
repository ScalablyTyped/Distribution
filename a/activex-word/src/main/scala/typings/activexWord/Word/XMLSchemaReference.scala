package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLSchemaReference extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Location: String = js.native
  
  val NamespaceURI: String = js.native
  
  val Parent: js.Any = js.native
  
  def Reload(): Unit = js.native
  
  @JSName("Word.XMLSchemaReference_typekey")
  var WordDotXMLSchemaReference_typekey: XMLSchemaReference = js.native
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
  implicit class XMLSchemaReferenceOps[Self <: XMLSchemaReference] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("NamespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: () => Unit): Self = this.set("Reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotXMLSchemaReference_typekey(value: XMLSchemaReference): Self = this.set("Word.XMLSchemaReference_typekey", value.asInstanceOf[js.Any])
  }
}
