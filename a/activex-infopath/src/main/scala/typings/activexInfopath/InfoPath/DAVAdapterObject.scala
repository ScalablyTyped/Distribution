package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DAVAdapterObject extends StObject {
  
  var FileName: String
  
  var FolderURL: String
  
  @JSName("InfoPath.DAVAdapterObject_typekey")
  var InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
  
  def SubmitData(pData: IXMLDOMNode): Unit
}
object DAVAdapterObject {
  
  @scala.inline
  def apply(
    FileName: String,
    FolderURL: String,
    InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    SubmitData: IXMLDOMNode => Unit
  ): DAVAdapterObject = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], FolderURL = FolderURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], SubmitData = js.Any.fromFunction1(SubmitData))
    __obj.updateDynamic("InfoPath.DAVAdapterObject_typekey")(InfoPathDotDAVAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DAVAdapterObject]
  }
  
  @scala.inline
  implicit class DAVAdapterObjectMutableBuilder[Self <: DAVAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderURL(value: String): Self = StObject.set(x, "FolderURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotDAVAdapterObject_typekey(value: DAVAdapterObject): Self = StObject.set(x, "InfoPath.DAVAdapterObject_typekey", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setSubmitData(value: IXMLDOMNode => Unit): Self = StObject.set(x, "SubmitData", js.Any.fromFunction1(value))
  }
}
