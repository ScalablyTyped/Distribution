package typings.actioncable

import org.scalablytyped.runtime.StringDictionary
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionCable {
  
  trait Cable extends StObject {
    
    def connect(): Unit
    
    def disconnect(): Unit
    
    def ensureActiveConnection(): Unit
    
    def send(data: Any): Unit
    
    var subscriptions: Subscriptions
  }
  object Cable {
    
    inline def apply(
      connect: () => Unit,
      disconnect: () => Unit,
      ensureActiveConnection: () => Unit,
      send: Any => Unit,
      subscriptions: Subscriptions
    ): Cable = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), ensureActiveConnection = js.Any.fromFunction0(ensureActiveConnection), send = js.Any.fromFunction1(send), subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cable] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setEnsureActiveConnection(value: () => Unit): Self = StObject.set(x, "ensureActiveConnection", js.Any.fromFunction0(value))
      
      inline def setSend(value: Any => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Channel extends StObject {
    
    def perform(action: String, data: js.Object): Unit
    
    def send(data: Any): Boolean
    
    def unsubscribe(): Unit
  }
  object Channel {
    
    inline def apply(perform: (String, js.Object) => Unit, send: Any => Boolean, unsubscribe: () => Unit): Channel = {
      val __obj = js.Dynamic.literal(perform = js.Any.fromFunction2(perform), send = js.Any.fromFunction1(send), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      inline def setPerform(value: (String, js.Object) => Unit): Self = StObject.set(x, "perform", js.Any.fromFunction2(value))
      
      inline def setSend(value: Any => Boolean): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait ChannelNameWithParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var channel: String
  }
  object ChannelNameWithParams {
    
    inline def apply(channel: String): ChannelNameWithParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelNameWithParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelNameWithParams] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateMixin
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var received: js.UndefOr[js.Function1[/* obj */ Any, Unit]] = js.undefined
  }
  object CreateMixin {
    
    inline def apply(): CreateMixin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateMixin] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: () => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction0(value))
      
      inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      inline def setDisconnected(value: () => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction0(value))
      
      inline def setDisconnectedUndefined: Self = StObject.set(x, "disconnected", js.undefined)
      
      inline def setReceived(value: /* obj */ Any => Unit): Self = StObject.set(x, "received", js.Any.fromFunction1(value))
      
      inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
    }
  }
  
  @js.native
  trait Subscriptions extends StObject {
    
    def create[T /* <: CreateMixin */](channel: String): Channel & T = js.native
    def create[T /* <: CreateMixin */](channel: String, obj: T & ThisType[Channel]): Channel & T = js.native
    def create[T /* <: CreateMixin */](channel: ChannelNameWithParams): Channel & T = js.native
    def create[T /* <: CreateMixin */](channel: ChannelNameWithParams, obj: T & ThisType[Channel]): Channel & T = js.native
  }
}
