package typings.agGrid.mainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "Component")
@js.native
class Component ()
  extends typings.agGrid.componentMod.Component {
  def this(template: String) = this()
}
/* static members */
object Component {
  
  @JSImport("ag-grid/dist/lib/main", "Component")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Component.EVENT_VISIBLE_CHANGED")
  @js.native
  def EVENT_VISIBLE_CHANGED: String = js.native
  inline def EVENT_VISIBLE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_VISIBLE_CHANGED")(x.asInstanceOf[js.Any])
}
