package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SaveEventObject")
@js.native
class SaveEventObject protected () extends js.Object {
  val FileName: java.lang.String = js.native
  var `InfoPath.SaveEventObject_typekey`: SaveEventObject = js.native
  var IsCancelled: scala.Boolean = js.native
  val IsSaveAs: scala.Boolean = js.native
  var ReturnStatus: scala.Boolean = js.native
  val XDocument: _XDocument = js.native
  def PerformSaveOperation(): scala.Boolean = js.native
}

