package typings.atlaskitInProductTesting

import typings.cypress.Cypress.Chainable
import typings.cypress.Cypress.cy
import typings.cypress.typesCyBluebirdMod.BluebirdStatic
import typings.eventemitter2.mod.EventAndListener
import typings.eventemitter2.mod.GeneralEventEmitter
import typings.eventemitter2.mod.Listener
import typings.eventemitter2.mod.ListenerFn
import typings.eventemitter2.mod.event
import typings.eventemitter2.mod.eventNS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.cypress.CyEventEmitter because var conflicts: off_Original, on_Original, once_Original. Inlined emit_Original, hasListeners_Original, emitAsync_Original, removeAllListeners_Original, listenersAny_Original, prependMany_Original, setMaxListeners_Original, stopListeningTo_Original, prependListener_Original, eventNames_Original, getMaxListeners_Original, prependAny_Original, listeners_Original, addListener_Original, prependOnceListener_Original, constructor_Original, removeListener_Original, offAny_Original, defaultMaxListeners, onAny_Original, listenerCount_Original, many_Original, listenTo_Original, addListener, emit, emitAsync, emitMap, emitThen, eventNames, getMaxListeners, hasListeners, listenTo, listenerCount, listeners, listenersAny, many, offAny, onAny, prependAny, prependListener, prependMany, prependOnceListener, proxyTo, removeAllListeners, removeListener, setMaxListeners, stopListeningTo */ @js.native
  trait CypressType
    extends StObject
       with Chainable[Unit] {
    
    def addListener(event: event, listener: ListenerFn): this.type | Listener = js.native
    @JSName("addListener")
    var addListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener] = js.native
    
    @JSName("constructor")
    var constructor_Original: js.Function0[Any] = js.native
    
    var defaultMaxListeners: js.UndefOr[Any] = js.native
    
    def emit(event: event, values: Any*): Boolean = js.native
    
    def emitAsync(event: event, values: Any*): js.Promise[js.Array[Any]] = js.native
    @JSName("emitAsync")
    var emitAsync_Original: js.Function2[/* event */ event, /* repeated */ Any, js.Promise[js.Array[Any]]] = js.native
    
    def emitMap(eventName: String, args: js.Array[Any]): js.Array[js.Function1[/* repeated */ Any, Any]] = js.native
    
    def emitThen(eventName: String, args: js.Array[Any]): BluebirdStatic = js.native
    
    @JSName("emit")
    var emit_Original: js.Function2[/* event */ event, /* repeated */ Any, Boolean] = js.native
    
    def eventNames(): js.Array[event | eventNS] = js.native
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[event | eventNS]] = js.native
    
    def getMaxListeners(): Double = js.native
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double] = js.native
    
    def hasListeners(): Boolean = js.native
    @JSName("hasListeners")
    var hasListeners_Original: js.Function0[Boolean] = js.native
    
    def listenTo(target: GeneralEventEmitter, events: event): this.type = js.native
    @JSName("listenTo")
    var listenTo_Original: js.Function2[/* target */ GeneralEventEmitter, /* events */ event, this.type] = js.native
    
    def listenerCount(): Double = js.native
    @JSName("listenerCount")
    var listenerCount_Original: js.Function0[Double] = js.native
    
    def listeners(): js.Array[ListenerFn] = js.native
    
    def listenersAny(): js.Array[ListenerFn] = js.native
    @JSName("listenersAny")
    var listenersAny_Original: js.Function0[js.Array[ListenerFn]] = js.native
    
    @JSName("listeners")
    var listeners_Original: js.Function0[js.Array[ListenerFn]] = js.native
    
    def many(event: event, timesToListen: Double, listener: ListenerFn): this.type | Listener = js.native
    @JSName("many")
    var many_Original: js.Function3[
        /* event */ event, 
        /* timesToListen */ Double, 
        /* listener */ ListenerFn, 
        this.type | Listener
      ] = js.native
    
    def offAny(listener: ListenerFn): this.type = js.native
    @JSName("offAny")
    var offAny_Original: js.Function1[/* listener */ ListenerFn, this.type] = js.native
    
    def onAny(listener: EventAndListener): this.type = js.native
    @JSName("onAny")
    var onAny_Original: js.Function1[/* listener */ EventAndListener, this.type] = js.native
    
    def prependAny(listener: EventAndListener): this.type = js.native
    @JSName("prependAny")
    var prependAny_Original: js.Function1[/* listener */ EventAndListener, this.type] = js.native
    
    def prependListener(event: event, listener: ListenerFn): this.type | Listener = js.native
    @JSName("prependListener")
    var prependListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener] = js.native
    
    def prependMany(event: event, timesToListen: Double, listener: ListenerFn): this.type | Listener = js.native
    @JSName("prependMany")
    var prependMany_Original: js.Function3[
        /* event */ event, 
        /* timesToListen */ Double, 
        /* listener */ ListenerFn, 
        this.type | Listener
      ] = js.native
    
    def prependOnceListener(event: event, listener: ListenerFn): this.type | Listener = js.native
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type | Listener] = js.native
    
    def proxyTo(cy: cy): Null = js.native
    
    def removeAllListeners(): this.type = js.native
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type] = js.native
    
    def removeListener(event: event, listener: ListenerFn): this.type = js.native
    @JSName("removeListener")
    var removeListener_Original: js.Function2[/* event */ event, /* listener */ ListenerFn, this.type] = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, Unit] = js.native
    
    def stopListeningTo(): Boolean = js.native
    @JSName("stopListeningTo")
    var stopListeningTo_Original: js.Function0[Boolean] = js.native
  }
  
  trait InProductCommonTestCaseOpts extends StObject {
    
    var runOnly: js.UndefOr[js.Array[String]] = js.undefined
  }
  object InProductCommonTestCaseOpts {
    
    inline def apply(): InProductCommonTestCaseOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InProductCommonTestCaseOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InProductCommonTestCaseOpts] (val x: Self) extends AnyVal {
      
      inline def setRunOnly(value: js.Array[String]): Self = StObject.set(x, "runOnly", value.asInstanceOf[js.Any])
      
      inline def setRunOnlyUndefined: Self = StObject.set(x, "runOnly", js.undefined)
      
      inline def setRunOnlyVarargs(value: String*): Self = StObject.set(x, "runOnly", js.Array(value*))
    }
  }
}
