package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "ColumnGroup")
@js.native
class ColumnGroup protected ()
  extends agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup {
  def this(originalColumnGroup: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup, groupId: java.lang.String, instanceId: scala.Double) = this()
}

/* static members */
@JSImport("ag-grid", "ColumnGroup")
@js.native
object ColumnGroup extends js.Object {
  var EVENT_DISPLAYED_CHILDREN_CHANGED: java.lang.String = js.native
  var EVENT_LEFT_CHANGED: java.lang.String = js.native
  var HEADER_GROUP_SHOW_CLOSED: java.lang.String = js.native
  var HEADER_GROUP_SHOW_OPEN: java.lang.String = js.native
  def createUniqueId(groupId: java.lang.String, instanceId: scala.Double): java.lang.String = js.native
}

