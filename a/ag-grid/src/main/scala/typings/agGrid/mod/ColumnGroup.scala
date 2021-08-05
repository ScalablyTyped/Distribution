package typings.agGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "ColumnGroup")
@js.native
class ColumnGroup protected ()
  extends typings.agGrid.columnGroupMod.ColumnGroup {
  def this(
    originalColumnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup,
    groupId: String,
    instanceId: Double
  ) = this()
}
/* static members */
object ColumnGroup {
  
  @JSImport("ag-grid", "ColumnGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "ColumnGroup.EVENT_DISPLAYED_CHILDREN_CHANGED")
  @js.native
  def EVENT_DISPLAYED_CHILDREN_CHANGED: String = js.native
  inline def EVENT_DISPLAYED_CHILDREN_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DISPLAYED_CHILDREN_CHANGED")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ColumnGroup.EVENT_LEFT_CHANGED")
  @js.native
  def EVENT_LEFT_CHANGED: String = js.native
  inline def EVENT_LEFT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LEFT_CHANGED")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ColumnGroup.HEADER_GROUP_SHOW_CLOSED")
  @js.native
  def HEADER_GROUP_SHOW_CLOSED: String = js.native
  inline def HEADER_GROUP_SHOW_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_GROUP_SHOW_CLOSED")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ColumnGroup.HEADER_GROUP_SHOW_OPEN")
  @js.native
  def HEADER_GROUP_SHOW_OPEN: String = js.native
  inline def HEADER_GROUP_SHOW_OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_GROUP_SHOW_OPEN")(x.asInstanceOf[js.Any])
  
  inline def createUniqueId(groupId: String, instanceId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createUniqueId")(groupId.asInstanceOf[js.Any], instanceId.asInstanceOf[js.Any])).asInstanceOf[String]
}
