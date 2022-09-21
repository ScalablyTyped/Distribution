package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTag extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val DownloadURL: String
  
  val Name: String
  
  val Parent: Any
  
  val Properties: CustomProperties
  
  val Range: typings.activexWord.Word.Range
  
  def Select(): Unit
  
  val SmartTagActions: typings.activexWord.Word.SmartTagActions
  
  /* private */ @JSName("Word.SmartTag_typekey")
  var WordDotSmartTag_typekey: SmartTag
  
  val XML: String
  
  val XMLNode: typings.activexWord.Word.XMLNode
}
object SmartTag {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DownloadURL: String,
    Name: String,
    Parent: Any,
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
  
  extension [Self <: SmartTag](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: CustomProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setSmartTagActions(value: SmartTagActions): Self = StObject.set(x, "SmartTagActions", value.asInstanceOf[js.Any])
    
    inline def setWordDotSmartTag_typekey(value: SmartTag): Self = StObject.set(x, "Word.SmartTag_typekey", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
    
    inline def setXMLNode(value: XMLNode): Self = StObject.set(x, "XMLNode", value.asInstanceOf[js.Any])
  }
}
