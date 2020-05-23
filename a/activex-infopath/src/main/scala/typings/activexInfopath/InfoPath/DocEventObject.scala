package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocEventObject extends js.Object {
  @JSName("InfoPath.DocEventObject_typekey")
  var InfoPathDotDocEventObject_typekey: DocEventObject
  val XDocument: _XDocument
}

object DocEventObject {
  @scala.inline
  def apply(InfoPathDotDocEventObject_typekey: DocEventObject, XDocument: _XDocument): DocEventObject = {
    val __obj = js.Dynamic.literal(XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocEventObject_typekey")(InfoPathDotDocEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocEventObject]
  }
}

