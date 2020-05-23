package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLFileAdapterObject extends js.Object {
  var FileURL: String
  @JSName("InfoPath.XMLFileAdapterObject_typekey")
  var InfoPathDotXMLFileAdapterObject_typekey: XMLFileAdapterObject
  val Name: String
  val QueryAllowed: Boolean
  val SubmitAllowed: Boolean
  def Query(): Unit
  def Submit(): Unit
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
}

