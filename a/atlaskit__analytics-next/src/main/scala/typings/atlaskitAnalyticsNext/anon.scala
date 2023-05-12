package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Channel extends StObject {
    
    /** The channel to listen for events on. */
    var channel: js.UndefOr[String] = js.native
    
    /** Children! */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** A function which will be called when an event is fired on this Listener's
      * channel. It is passed the event and the channel as arguments. */
    def onEvent(event: default): Unit = js.native
    def onEvent(event: default, channel: String): Unit = js.native
  }
  
  trait Children extends StObject {
    
    /** Children! */
    var children: ReactNode
    
    /** Arbitrary data. Any events created below this component in the tree will
      * have this added as an item in their context array. */
    var data: js.Object
  }
  object Children {
    
    inline def apply(data: js.Object): Children = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAtlaskitAnalyticsContext extends StObject {
    
    def getAtlaskitAnalyticsContext(): js.Array[Any]
  }
  object GetAtlaskitAnalyticsContext {
    
    inline def apply(getAtlaskitAnalyticsContext: () => js.Array[Any]): GetAtlaskitAnalyticsContext = {
      val __obj = js.Dynamic.literal(getAtlaskitAnalyticsContext = js.Any.fromFunction0(getAtlaskitAnalyticsContext))
      __obj.asInstanceOf[GetAtlaskitAnalyticsContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAtlaskitAnalyticsContext] (val x: Self) extends AnyVal {
      
      inline def setGetAtlaskitAnalyticsContext(value: () => js.Array[Any]): Self = StObject.set(x, "getAtlaskitAnalyticsContext", js.Any.fromFunction0(value))
    }
  }
  
  trait GetAtlaskitAnalyticsEventHandlers extends StObject {
    
    def getAtlaskitAnalyticsContext(): Any
    
    def getAtlaskitAnalyticsEventHandlers(): js.Array[Any]
  }
  object GetAtlaskitAnalyticsEventHandlers {
    
    inline def apply(getAtlaskitAnalyticsContext: () => Any, getAtlaskitAnalyticsEventHandlers: () => js.Array[Any]): GetAtlaskitAnalyticsEventHandlers = {
      val __obj = js.Dynamic.literal(getAtlaskitAnalyticsContext = js.Any.fromFunction0(getAtlaskitAnalyticsContext), getAtlaskitAnalyticsEventHandlers = js.Any.fromFunction0(getAtlaskitAnalyticsEventHandlers))
      __obj.asInstanceOf[GetAtlaskitAnalyticsEventHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAtlaskitAnalyticsEventHandlers] (val x: Self) extends AnyVal {
      
      inline def setGetAtlaskitAnalyticsContext(value: () => Any): Self = StObject.set(x, "getAtlaskitAnalyticsContext", js.Any.fromFunction0(value))
      
      inline def setGetAtlaskitAnalyticsEventHandlers(value: () => js.Array[Any]): Self = StObject.set(x, "getAtlaskitAnalyticsEventHandlers", js.Any.fromFunction0(value))
    }
  }
}
