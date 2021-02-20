package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLFileAdapterObject extends StObject {
  
  var FileURL: String = js.native
  
  @JSName("InfoPath.XMLFileAdapterObject_typekey")
  var InfoPathDotXMLFileAdapterObject_typekey: XMLFileAdapterObject = js.native
  
  val Name: String = js.native
  
  def Query(): Unit = js.native
  
  val QueryAllowed: Boolean = js.native
  
  def Submit(): Unit = js.native
  
  val SubmitAllowed: Boolean = js.native
}
object XMLFileAdapterObject {
  
  @scala.inline
  def apply(
    FileURL: String,
    InfoPathDotXMLFileAdapterObject_typekey: XMLFileAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): XMLFileAdapterObject = {
    val __obj = js.Dynamic.literal(FileURL = FileURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.XMLFileAdapterObject_typekey")(InfoPathDotXMLFileAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLFileAdapterObject]
  }
  
  @scala.inline
  implicit class XMLFileAdapterObjectMutableBuilder[Self <: XMLFileAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileURL(value: String): Self = StObject.set(x, "FileURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotXMLFileAdapterObject_typekey(value: XMLFileAdapterObject): Self = StObject.set(x, "InfoPath.XMLFileAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
