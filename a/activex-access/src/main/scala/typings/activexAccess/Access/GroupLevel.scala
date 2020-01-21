package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.GroupLevel")
@js.native
class GroupLevel protected () extends js.Object {
  @JSName("Access.GroupLevel_typekey")
  var AccessDotGroupLevel_typekey: GroupLevel = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  var ControlSource: String = js.native
  var GroupFooter: Boolean = js.native
  var GroupHeader: Boolean = js.native
  var GroupInterval: Double = js.native
  var GroupOn: Double = js.native
  var KeepTogether: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var SortOrder: Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
}

