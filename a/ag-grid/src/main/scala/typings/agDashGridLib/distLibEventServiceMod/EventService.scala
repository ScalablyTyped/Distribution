package typings
package agDashGridLib.distLibEventServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/eventService", "EventService")
@js.native
class EventService ()
  extends agDashGridLib.distLibInterfacesIEventEmitterMod.IEventEmitter {
  var allAsyncListeners: js.Any = js.native
  var allSyncListeners: js.Any = js.native
  var asyncFunctionsQueue: js.Any = js.native
  var globalAsyncListeners: js.Any = js.native
  var globalSyncListeners: js.Any = js.native
  var logger: js.Any = js.native
  var scheduled: js.Any = js.native
  def addGlobalListener(listener: js.Function): scala.Unit = js.native
  def addGlobalListener(listener: js.Function, async: scala.Boolean): scala.Unit = js.native
  def addModalPriorityEventListener(eventType: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addModalPriorityEventListener(eventType: java.lang.String, listener: js.Function, async: scala.Boolean): scala.Unit = js.native
  /* private */ def dispatchAsync(func: js.Any): js.Any = js.native
  def dispatchEvent(event: agDashGridLib.distLibEventsMod.AgEvent): scala.Unit = js.native
  /* private */ def dispatchToListeners(event: js.Any, async: js.Any): js.Any = js.native
  /* private */ def flushAsyncQueue(): js.Any = js.native
  /* private */ def getListenerList(eventType: js.Any, async: js.Any): js.Any = js.native
  def removeGlobalListener(listener: js.Function): scala.Unit = js.native
  def removeGlobalListener(listener: js.Function, async: scala.Boolean): scala.Unit = js.native
  def setBeans(
    loggerFactory: agDashGridLib.distLibLoggerMod.LoggerFactory,
    gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper
  ): scala.Unit = js.native
  def setBeans(
    loggerFactory: agDashGridLib.distLibLoggerMod.LoggerFactory,
    gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    globalEventListener: js.Function
  ): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/eventService", "EventService")
@js.native
object EventService extends js.Object {
  var PRIORITY: js.Any = js.native
}

