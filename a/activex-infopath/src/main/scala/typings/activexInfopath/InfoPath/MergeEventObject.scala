package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeEventObject extends js.Object {
  val Count: Double
  val DOM: IXMLDOMDocument
  @JSName("InfoPath.MergeEventObject_typekey")
  var InfoPathDotMergeEventObject_typekey: MergeEventObject
  var ReturnStatus: Boolean
  var RollBack: Boolean
  val XDocument: _XDocument
  val index: Double
}

object MergeEventObject {
  @scala.inline
  def apply(
    Count: Double,
    DOM: IXMLDOMDocument,
    InfoPathDotMergeEventObject_typekey: MergeEventObject,
    ReturnStatus: Boolean,
    RollBack: Boolean,
    XDocument: _XDocument,
    index: Double
  ): MergeEventObject = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DOM = DOM.asInstanceOf[js.Any], ReturnStatus = ReturnStatus.asInstanceOf[js.Any], RollBack = RollBack.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MergeEventObject_typekey")(InfoPathDotMergeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeEventObject]
  }
}

