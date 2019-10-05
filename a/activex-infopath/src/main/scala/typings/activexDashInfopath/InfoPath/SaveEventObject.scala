package typings.activexDashInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SaveEventObject")
@js.native
class SaveEventObject protected () extends js.Object {
  val FileName: String = js.native
  var `InfoPath.SaveEventObject_typekey`: SaveEventObject = js.native
  var IsCancelled: Boolean = js.native
  val IsSaveAs: Boolean = js.native
  var ReturnStatus: Boolean = js.native
  val XDocument: _XDocument = js.native
  def PerformSaveOperation(): Boolean = js.native
}

