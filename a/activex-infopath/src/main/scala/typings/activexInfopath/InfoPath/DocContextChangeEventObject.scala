package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocContextChangeEventObject extends js.Object {
  val Context: IXMLDOMNode
  @JSName("InfoPath.DocContextChangeEventObject_typekey")
  var InfoPathDotDocContextChangeEventObject_typekey: DocContextChangeEventObject
  val IsUndoRedo: Boolean
  val Type: String
  val XDocument: _XDocument
}

object DocContextChangeEventObject {
  @scala.inline
  def apply(
    Context: IXMLDOMNode,
    InfoPathDotDocContextChangeEventObject_typekey: DocContextChangeEventObject,
    IsUndoRedo: Boolean,
    Type: String,
    XDocument: _XDocument
  ): DocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], IsUndoRedo = IsUndoRedo.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocContextChangeEventObject_typekey")(InfoPathDotDocContextChangeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocContextChangeEventObject]
  }
}

