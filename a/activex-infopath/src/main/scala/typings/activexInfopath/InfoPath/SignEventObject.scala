package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignEventObject extends js.Object {
  @JSName("InfoPath.SignEventObject_typekey")
  var InfoPathDotSignEventObject_typekey: SignEventObject
  var ReturnStatus: Boolean
  val SignedDataBlock: SignedDataBlockObject
  val XDocument: _XDocument
}

object SignEventObject {
  @scala.inline
  def apply(
    InfoPathDotSignEventObject_typekey: SignEventObject,
    ReturnStatus: Boolean,
    SignedDataBlock: SignedDataBlockObject,
    XDocument: _XDocument
  ): SignEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], SignedDataBlock = SignedDataBlock.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignEventObject_typekey")(InfoPathDotSignEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignEventObject]
  }
}

