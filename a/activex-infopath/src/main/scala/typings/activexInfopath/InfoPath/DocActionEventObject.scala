package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocActionEventObject extends js.Object {
  @JSName("InfoPath.DocActionEventObject_typekey")
  var InfoPathDotDocActionEventObject_typekey: DocActionEventObject
  var ReturnStatus: Boolean
  val Source: IXMLDOMNode
  val XDocument: _XDocument
}

object DocActionEventObject {
  @scala.inline
  def apply(
    InfoPathDotDocActionEventObject_typekey: DocActionEventObject,
    ReturnStatus: Boolean,
    Source: IXMLDOMNode,
    XDocument: _XDocument
  ): DocActionEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocActionEventObject_typekey")(InfoPathDotDocActionEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocActionEventObject]
  }
}

