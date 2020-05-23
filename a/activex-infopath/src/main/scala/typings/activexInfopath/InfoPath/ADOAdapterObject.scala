package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADOAdapterObject extends js.Object {
  var Command: String
  var Connection: String
  @JSName("InfoPath.ADOAdapterObject_typekey")
  var InfoPathDotADOAdapterObject_typekey: ADOAdapterObject
  val Name: String
  val QueryAllowed: Boolean
  val SubmitAllowed: Boolean
  var Timeout: Double
  def BuildSQLFromXMLNodes(pXmlNode: IXMLDOMNode): String
  def Query(): Unit
  def Submit(): Unit
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
}

