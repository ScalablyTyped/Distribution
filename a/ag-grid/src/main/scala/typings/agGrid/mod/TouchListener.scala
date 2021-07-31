package typings.agGrid.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "TouchListener")
@js.native
class TouchListener protected ()
  extends typings.agGrid.touchListenerMod.TouchListener {
  def this(eElement: HTMLElement) = this()
  def this(eElement: HTMLElement, preventMouseClick: Boolean) = this()
}
/* static members */
object TouchListener {
  
  @JSImport("ag-grid", "TouchListener")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "TouchListener.DOUBLE_TAP_MILLIS")
  @js.native
  def DOUBLE_TAP_MILLIS: js.Any = js.native
  @scala.inline
  def DOUBLE_TAP_MILLIS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP_MILLIS")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "TouchListener.EVENT_DOUBLE_TAP")
  @js.native
  def EVENT_DOUBLE_TAP: String = js.native
  @scala.inline
  def EVENT_DOUBLE_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DOUBLE_TAP")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "TouchListener.EVENT_LONG_TAP")
  @js.native
  def EVENT_LONG_TAP: String = js.native
  @scala.inline
  def EVENT_LONG_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LONG_TAP")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "TouchListener.EVENT_TAP")
  @js.native
  def EVENT_TAP: String = js.native
  @scala.inline
  def EVENT_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TAP")(x.asInstanceOf[js.Any])
}
