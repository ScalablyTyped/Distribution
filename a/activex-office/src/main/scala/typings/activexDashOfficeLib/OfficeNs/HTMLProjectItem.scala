package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.HTMLProjectItem")
@js.native
class HTMLProjectItem protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  val IsOpen: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  var `Office.HTMLProjectItem_typekey`: HTMLProjectItem = js.native
  val Parent: js.Any = js.native
  var Text: java.lang.String = js.native
  def LoadFromFile(FileName: java.lang.String): scala.Unit = js.native
  /** @param OpenKind [OpenKind=0] */
  def Open(): scala.Unit = js.native
  def Open(OpenKind: MsoHTMLProjectOpen): scala.Unit = js.native
  def SaveCopyAs(FileName: java.lang.String): scala.Unit = js.native
}

