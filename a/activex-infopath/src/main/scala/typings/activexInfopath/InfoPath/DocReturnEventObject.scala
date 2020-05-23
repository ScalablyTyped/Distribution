package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocReturnEventObject extends js.Object {
  @JSName("InfoPath.DocReturnEventObject_typekey")
  var InfoPathDotDocReturnEventObject_typekey: DocReturnEventObject
  var ReturnStatus: Boolean
  val XDocument: _XDocument
}

object DocReturnEventObject {
  @scala.inline
  def apply(
    InfoPathDotDocReturnEventObject_typekey: DocReturnEventObject,
    ReturnStatus: Boolean,
    XDocument: _XDocument
  ): DocReturnEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocReturnEventObject_typekey")(InfoPathDotDocReturnEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocReturnEventObject]
  }
}

