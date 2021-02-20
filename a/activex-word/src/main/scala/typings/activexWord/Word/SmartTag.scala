package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTag extends StObject {
  
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
  implicit class SmartTagMutableBuilder[Self <: SmartTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CustomProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSmartTagActions(value: SmartTagActions): Self = StObject.set(x, "SmartTagActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSmartTag_typekey(value: SmartTag): Self = StObject.set(x, "Word.SmartTag_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLNode(value: XMLNode): Self = StObject.set(x, "XMLNode", value.asInstanceOf[js.Any])
  }
}
