package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveEventObject extends js.Object {
  val FileName: String
  @JSName("InfoPath.SaveEventObject_typekey")
  var InfoPathDotSaveEventObject_typekey: SaveEventObject
  var IsCancelled: Boolean
  val IsSaveAs: Boolean
  var ReturnStatus: Boolean
  val XDocument: _XDocument
  def PerformSaveOperation(): Boolean
}

object SaveEventObject {
  @scala.inline
  def apply(
    FileName: String,
    InfoPathDotSaveEventObject_typekey: SaveEventObject,
    IsCancelled: Boolean,
    IsSaveAs: Boolean,
    PerformSaveOperation: () => Boolean,
    ReturnStatus: Boolean,
    XDocument: _XDocument
  ): SaveEventObject = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], IsCancelled = IsCancelled.asInstanceOf[js.Any], IsSaveAs = IsSaveAs.asInstanceOf[js.Any], PerformSaveOperation = js.Any.fromFunction0(PerformSaveOperation), ReturnStatus = ReturnStatus.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SaveEventObject_typekey")(InfoPathDotSaveEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveEventObject]
  }
}

