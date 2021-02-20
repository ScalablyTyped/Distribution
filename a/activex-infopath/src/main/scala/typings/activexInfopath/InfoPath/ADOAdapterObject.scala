package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADOAdapterObject extends StObject {
  
  def BuildSQLFromXMLNodes(pXmlNode: IXMLDOMNode): String = js.native
  
  var Command: String = js.native
  
  var Connection: String = js.native
  
  @JSName("InfoPath.ADOAdapterObject_typekey")
  var InfoPathDotADOAdapterObject_typekey: ADOAdapterObject = js.native
  
  val Name: String = js.native
  
  def Query(): Unit = js.native
  
  val QueryAllowed: Boolean = js.native
  
  def Submit(): Unit = js.native
  
  val SubmitAllowed: Boolean = js.native
  
  var Timeout: Double = js.native
}
object ADOAdapterObject {
  
  @scala.inline
  def apply(
    BuildSQLFromXMLNodes: IXMLDOMNode => String,
    Command: String,
    Connection: String,
    InfoPathDotADOAdapterObject_typekey: ADOAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    Timeout: Double
  ): ADOAdapterObject = {
    val __obj = js.Dynamic.literal(BuildSQLFromXMLNodes = js.Any.fromFunction1(BuildSQLFromXMLNodes), Command = Command.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ADOAdapterObject_typekey")(InfoPathDotADOAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADOAdapterObject]
  }
  
  @scala.inline
  implicit class ADOAdapterObjectMutableBuilder[Self <: ADOAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildSQLFromXMLNodes(value: IXMLDOMNode => String): Self = StObject.set(x, "BuildSQLFromXMLNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotADOAdapterObject_typekey(value: ADOAdapterObject): Self = StObject.set(x, "InfoPath.ADOAdapterObject_typekey", value.asInstanceOf[js.Any])
    
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
    def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
  }
}
