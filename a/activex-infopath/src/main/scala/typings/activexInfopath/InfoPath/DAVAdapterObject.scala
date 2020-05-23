package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DAVAdapterObject extends js.Object {
  var FileName: String
  var FolderURL: String
  @JSName("InfoPath.DAVAdapterObject_typekey")
  var InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject
  val Name: String
  val QueryAllowed: Boolean
  val SubmitAllowed: Boolean
  def Query(): Unit
  def Submit(): Unit
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
}

