package typings.agGrid

import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.iEventEmitterMod.IEventEmitter
import typings.agGrid.loggerMod.LoggerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventServiceMod {
  
  @JSImport("ag-grid/dist/lib/eventService", "EventService")
  @js.native
  class EventService ()
    extends StObject
       with IEventEmitter {
    
    def addGlobalListener(listener: js.Function): Unit = js.native
    def addGlobalListener(listener: js.Function, async: Boolean): Unit = js.native
    
    def addModalPriorityEventListener(eventType: String, listener: js.Function): Unit = js.native
    def addModalPriorityEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
    
    /* private */ var allAsyncListeners: js.Any = js.native
    
    /* private */ var allSyncListeners: js.Any = js.native
    
    /* private */ var asyncFunctionsQueue: js.Any = js.native
    
    /* private */ def dispatchAsync(func: js.Any): js.Any = js.native
    
    def dispatchEvent(event: AgEvent): Unit = js.native
    
    /* private */ def dispatchToListeners(event: js.Any, async: js.Any): js.Any = js.native
    
    /* private */ def flushAsyncQueue(): js.Any = js.native
    
    /* private */ def getListenerList(eventType: js.Any, async: js.Any): js.Any = js.native
    
    /* private */ var globalAsyncListeners: js.Any = js.native
    
    /* private */ var globalSyncListeners: js.Any = js.native
    
    /* private */ var logger: js.Any = js.native
    
    def removeGlobalListener(listener: js.Function): Unit = js.native
    def removeGlobalListener(listener: js.Function, async: Boolean): Unit = js.native
    
    /* private */ var scheduled: js.Any = js.native
    
    def setBeans(loggerFactory: LoggerFactory, gridOptionsWrapper: GridOptionsWrapper): Unit = js.native
    def setBeans(
      loggerFactory: LoggerFactory,
      gridOptionsWrapper: GridOptionsWrapper,
      globalEventListener: js.Function
    ): Unit = js.native
  }
  /* static members */
  object EventService {
    
    @JSImport("ag-grid/dist/lib/eventService", "EventService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/eventService", "EventService.PRIORITY")
    @js.native
    def PRIORITY: js.Any = js.native
    inline def PRIORITY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
