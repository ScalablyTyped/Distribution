package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTag extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val DownloadURL: String = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Properties: CustomProperties = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def Select(): Unit = js.native
  
  val SmartTagActions: typings.activexWord.Word.SmartTagActions = js.native
  
  @JSName("Word.SmartTag_typekey")
  var WordDotSmartTag_typekey: SmartTag = js.native
  
  val XML: String = js.native
  
  val XMLNode: typings.activexWord.Word.XMLNode = js.native
}
object SmartTag {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DownloadURL: String,
    Name: String,
    Parent: js.Any,
    Properties: CustomProperties,
    Range: Range,
    Select: () => Unit,
    SmartTagActions: SmartTagActions,
    WordDotSmartTag_typekey: SmartTag,
    XML: String,
    XMLNode: XMLNode
  ): SmartTag = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DownloadURL = DownloadURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), SmartTagActions = SmartTagActions.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any], XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTag_typekey")(WordDotSmartTag_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTag]
  }
  
  @scala.inline
  implicit class SmartTagOps[Self <: SmartTag] (val x: Self) extends AnyVal {
    
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
    def setDownloadURL(value: String): Self = this.set("DownloadURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CustomProperties): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSmartTagActions(value: SmartTagActions): Self = this.set("SmartTagActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSmartTag_typekey(value: SmartTag): Self = this.set("Word.SmartTag_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXML(value: String): Self = this.set("XML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLNode(value: XMLNode): Self = this.set("XMLNode", value.asInstanceOf[js.Any])
  }
}
