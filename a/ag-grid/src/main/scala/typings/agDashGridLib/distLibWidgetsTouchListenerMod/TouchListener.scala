package typings
package agDashGridLib.distLibWidgetsTouchListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
@js.native
class TouchListener protected ()
  extends agDashGridLib.distLibInterfacesIEventEmitterMod.IEventEmitter {
  def this(eElement: stdLib.HTMLElement) = this()
  def this(eElement: stdLib.HTMLElement, preventMouseClick: scala.Boolean) = this()
  var destroyFuncs: js.Any = js.native
  var eElement: js.Any = js.native
  var eventService: js.Any = js.native
  var lastTapTime: js.Any = js.native
  var moved: js.Any = js.native
  var preventMouseClick: js.Any = js.native
  var touchStart: js.Any = js.native
  var touching: js.Any = js.native
  /* private */ def checkForDoubleTap(): js.Any = js.native
  def destroy(): scala.Unit = js.native
  /* private */ def getActiveTouch(touchList: js.Any): js.Any = js.native
  /* private */ def onTouchEnd(touchEvent: js.Any): js.Any = js.native
  /* private */ def onTouchMove(touchEvent: js.Any): js.Any = js.native
  /* private */ def onTouchStart(touchEvent: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
@js.native
object TouchListener extends js.Object {
  var DOUBLE_TAP_MILLIS: js.Any = js.native
  var EVENT_DOUBLE_TAP: java.lang.String = js.native
  var EVENT_LONG_TAP: java.lang.String = js.native
  var EVENT_TAP: java.lang.String = js.native
}

