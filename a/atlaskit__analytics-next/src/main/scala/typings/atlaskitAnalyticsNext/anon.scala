package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.analyticsErrorBoundaryMod.AnalyticsErrorBoundaryErrorInfo
import typings.atlaskitAnalyticsNext.uianalyticseventMod.default
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
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
    
    extension [Self <: Children](x: Self) {
      
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
    
    extension [Self <: GetAtlaskitAnalyticsContext](x: Self) {
      
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
    
    extension [Self <: GetAtlaskitAnalyticsEventHandlers](x: Self) {
      
      inline def setGetAtlaskitAnalyticsContext(value: () => Any): Self = StObject.set(x, "getAtlaskitAnalyticsContext", js.Any.fromFunction0(value))
      
      inline def setGetAtlaskitAnalyticsEventHandlers(value: () => js.Array[Any]): Self = StObject.set(x, "getAtlaskitAnalyticsEventHandlers", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Omit<@atlaskit/analytics-next.@atlaskit/analytics-next/dist/types/components/AnalyticsErrorBoundary.AnalyticsErrorBoundaryProps, keyof @atlaskit/analytics-next.@atlaskit/analytics-next/dist/types/hocs/withAnalyticsEvents.WithAnalyticsEventsProps> & react.react.RefAttributes<any> */
  trait OmitAnalyticsErrorBoundar extends StObject {
    
    var ErrorComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var channel: String
    
    var children: ReactNode
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var onError: js.UndefOr[
        js.Function2[/* error */ js.Error, /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo], Unit]
      ] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object OmitAnalyticsErrorBoundar {
    
    inline def apply(channel: String): OmitAnalyticsErrorBoundar = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitAnalyticsErrorBoundar]
    }
    
    extension [Self <: OmitAnalyticsErrorBoundar](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setErrorComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "ErrorComponent", value.asInstanceOf[js.Any])
      
      inline def setErrorComponentUndefined: Self = StObject.set(x, "ErrorComponent", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
