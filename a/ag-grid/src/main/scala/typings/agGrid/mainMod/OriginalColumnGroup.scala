package typings.agGrid.mainMod

import typings.agGrid.colDefMod.ColGroupDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "OriginalColumnGroup")
@js.native
class OriginalColumnGroup protected ()
  extends typings.agGrid.originalColumnGroupMod.OriginalColumnGroup {
  def this(colGroupDef: ColGroupDef, groupId: String, padding: Boolean, level: Double) = this()
}
/* static members */
object OriginalColumnGroup {
  
  @JSImport("ag-grid/dist/lib/main", "OriginalColumnGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "OriginalColumnGroup.EVENT_EXPANDABLE_CHANGED")
  @js.native
  def EVENT_EXPANDABLE_CHANGED: String = js.native
  @scala.inline
  def EVENT_EXPANDABLE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_EXPANDABLE_CHANGED")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "OriginalColumnGroup.EVENT_EXPANDED_CHANGED")
  @js.native
  def EVENT_EXPANDED_CHANGED: String = js.native
  @scala.inline
  def EVENT_EXPANDED_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_EXPANDED_CHANGED")(x.asInstanceOf[js.Any])
}
