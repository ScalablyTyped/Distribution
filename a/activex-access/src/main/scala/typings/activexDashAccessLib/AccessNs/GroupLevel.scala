package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.GroupLevel")
@js.native
class GroupLevel protected () extends js.Object {
  var `Access.GroupLevel_typekey`: GroupLevel = js.native
  val Application: Application = js.native
  var ControlSource: java.lang.String = js.native
  var GroupFooter: scala.Boolean = js.native
  var GroupHeader: scala.Boolean = js.native
  var GroupInterval: scala.Double = js.native
  var GroupOn: scala.Double = js.native
  var KeepTogether: scala.Double = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var SortOrder: scala.Boolean = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Properties(Index: java.lang.String): AccessProperty = js.native
  def Properties(Index: scala.Double): AccessProperty = js.native
}

