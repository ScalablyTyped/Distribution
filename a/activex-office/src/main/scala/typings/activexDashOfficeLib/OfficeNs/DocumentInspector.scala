package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentInspector")
@js.native
class DocumentInspector protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  val Description: java.lang.String = js.native
  val Name: java.lang.String = js.native
  var `Office.DocumentInspector_typekey`: DocumentInspector = js.native
  val Parent: js.Any = js.native
  def Fix(Status: MsoDocInspectorStatus, Results: java.lang.String): scala.Unit = js.native
  def Inspect(Status: MsoDocInspectorStatus, Results: java.lang.String): scala.Unit = js.native
}

