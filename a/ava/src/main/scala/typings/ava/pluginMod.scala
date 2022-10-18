package typings.ava

import typings.ava.avaStrings.`ava-4`
import typings.ava.pluginMod.SharedWorker.Plugin.Protocol
import typings.ava.pluginMod.SharedWorker.Plugin.RegistrationOptions
import typings.node.nodeColonurlMod.URL
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("ava/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerSharedWorker_ava4[Data](options: RegistrationOptions[`ava-4`, Data]): Protocol[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSharedWorker")(options.asInstanceOf[js.Any]).asInstanceOf[Protocol[Data]]
  
  object SharedWorker {
    
    trait BroadcastMessage[Data] extends StObject {
      
      val id: String
      
      def replies(): AsyncIterableIterator[ReceivedMessage[Data]]
    }
    object BroadcastMessage {
      
      inline def apply[Data](id: String, replies: () => AsyncIterableIterator[ReceivedMessage[Data]]): BroadcastMessage[Data] = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replies = js.Any.fromFunction0(replies))
        __obj.asInstanceOf[BroadcastMessage[Data]]
      }
      
      extension [Self <: BroadcastMessage[?], Data](x: Self & BroadcastMessage[Data]) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setReplies(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "replies", js.Any.fromFunction0(value))
      }
    }
    
    type Factory = js.Function1[/* options */ FactoryOptions, Unit]
    
    trait FactoryOptions extends StObject {
      
      @JSName("negotiateProtocol")
      def negotiateProtocol_ava4[Data](supported: js.Array[`ava-4`]): typings.ava.pluginMod.SharedWorker.Protocol[Data]
    }
    object FactoryOptions {
      
      inline def apply(negotiateProtocol: js.Array[`ava-4`] => typings.ava.pluginMod.SharedWorker.Protocol[Any]): FactoryOptions = {
        val __obj = js.Dynamic.literal(negotiateProtocol = js.Any.fromFunction1(negotiateProtocol))
        __obj.asInstanceOf[FactoryOptions]
      }
      
      extension [Self <: FactoryOptions](x: Self) {
        
        inline def setNegotiateProtocol(value: js.Array[`ava-4`] => typings.ava.pluginMod.SharedWorker.Protocol[Any]): Self = StObject.set(x, "negotiateProtocol", js.Any.fromFunction1(value))
      }
    }
    
    object Plugin {
      
      trait Protocol[Data] extends StObject {
        
        val available: js.Promise[Unit]
        
        val currentlyAvailable: Boolean
        
        val protocol: `ava-4`
        
        def publish(data: Data): typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data]
        
        def subscribe(): AsyncIterableIterator[typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]]
      }
      object Protocol {
        
        inline def apply[Data](
          available: js.Promise[Unit],
          currentlyAvailable: Boolean,
          publish: Data => typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data],
          subscribe: () => AsyncIterableIterator[typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]]
        ): typings.ava.pluginMod.SharedWorker.Plugin.Protocol[Data] = {
          val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], currentlyAvailable = currentlyAvailable.asInstanceOf[js.Any], protocol = "ava-4", publish = js.Any.fromFunction1(publish), subscribe = js.Any.fromFunction0(subscribe))
          __obj.asInstanceOf[typings.ava.pluginMod.SharedWorker.Plugin.Protocol[Data]]
        }
        
        extension [Self <: typings.ava.pluginMod.SharedWorker.Plugin.Protocol[?], Data](x: Self & typings.ava.pluginMod.SharedWorker.Plugin.Protocol[Data]) {
          
          inline def setAvailable(value: js.Promise[Unit]): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
          
          inline def setCurrentlyAvailable(value: Boolean): Self = StObject.set(x, "currentlyAvailable", value.asInstanceOf[js.Any])
          
          inline def setProtocol(value: `ava-4`): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
          
          inline def setPublish(value: Data => typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data]): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
          
          inline def setSubscribe(
            value: () => AsyncIterableIterator[typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]]
          ): Self = StObject.set(x, "subscribe", js.Any.fromFunction0(value))
        }
      }
      
      trait PublishedMessage[Data] extends StObject {
        
        val id: String
        
        def replies(): AsyncIterableIterator[typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]]
      }
      object PublishedMessage {
        
        inline def apply[Data](
          id: String,
          replies: () => AsyncIterableIterator[typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]]
        ): typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data] = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replies = js.Any.fromFunction0(replies))
          __obj.asInstanceOf[typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data]]
        }
        
        extension [Self <: typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[?], Data](x: Self & typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data]) {
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setReplies(
            value: () => AsyncIterableIterator[typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]]
          ): Self = StObject.set(x, "replies", js.Any.fromFunction0(value))
        }
      }
      
      trait ReceivedMessage[Data] extends StObject {
        
        val data: Data
        
        val id: String
        
        def reply(data: Data): typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data]
      }
      object ReceivedMessage {
        
        inline def apply[Data](
          data: Data,
          id: String,
          reply: Data => typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data]
        ): typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data] = {
          val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reply = js.Any.fromFunction1(reply))
          __obj.asInstanceOf[typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]]
        }
        
        extension [Self <: typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[?], Data](x: Self & typings.ava.pluginMod.SharedWorker.Plugin.ReceivedMessage[Data]) {
          
          inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setReply(value: Data => typings.ava.pluginMod.SharedWorker.Plugin.PublishedMessage[Data]): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
        }
      }
      
      trait RegistrationOptions[Identifier /* <: ProtocolIdentifier */, Data] extends StObject {
        
        val filename: String | URL
        
        val initialData: js.UndefOr[Data] = js.undefined
        
        val supportedProtocols: js.Array[Identifier]
        
        val teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
      }
      object RegistrationOptions {
        
        inline def apply[Identifier /* <: ProtocolIdentifier */, Data](filename: String | URL, supportedProtocols: js.Array[Identifier]): RegistrationOptions[Identifier, Data] = {
          val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
          __obj.asInstanceOf[RegistrationOptions[Identifier, Data]]
        }
        
        extension [Self <: RegistrationOptions[?, ?], Identifier /* <: ProtocolIdentifier */, Data](x: Self & (RegistrationOptions[Identifier, Data])) {
          
          inline def setFilename(value: String | URL): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
          
          inline def setInitialData(value: Data): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
          
          inline def setInitialDataUndefined: Self = StObject.set(x, "initialData", js.undefined)
          
          inline def setSupportedProtocols(value: js.Array[Identifier]): Self = StObject.set(x, "supportedProtocols", value.asInstanceOf[js.Any])
          
          inline def setSupportedProtocolsVarargs(value: Identifier*): Self = StObject.set(x, "supportedProtocols", js.Array(value*))
          
          inline def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
          
          inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
        }
      }
    }
    
    trait Protocol[Data] extends StObject {
      
      def broadcast(data: Data): BroadcastMessage[Data]
      
      val initialData: Data
      
      val protocol: `ava-4`
      
      def ready(): typings.ava.pluginMod.SharedWorker.Protocol[Data]
      
      def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]]
      
      def testWorkers(): AsyncIterableIterator[TestWorker[Data]]
    }
    object Protocol {
      
      inline def apply[Data](
        broadcast: Data => BroadcastMessage[Data],
        initialData: Data,
        ready: () => typings.ava.pluginMod.SharedWorker.Protocol[Data],
        subscribe: () => AsyncIterableIterator[ReceivedMessage[Data]],
        testWorkers: () => AsyncIterableIterator[TestWorker[Data]]
      ): typings.ava.pluginMod.SharedWorker.Protocol[Data] = {
        val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction1(broadcast), initialData = initialData.asInstanceOf[js.Any], protocol = "ava-4", ready = js.Any.fromFunction0(ready), subscribe = js.Any.fromFunction0(subscribe), testWorkers = js.Any.fromFunction0(testWorkers))
        __obj.asInstanceOf[typings.ava.pluginMod.SharedWorker.Protocol[Data]]
      }
      
      extension [Self <: typings.ava.pluginMod.SharedWorker.Protocol[?], Data](x: Self & typings.ava.pluginMod.SharedWorker.Protocol[Data]) {
        
        inline def setBroadcast(value: Data => BroadcastMessage[Data]): Self = StObject.set(x, "broadcast", js.Any.fromFunction1(value))
        
        inline def setInitialData(value: Data): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
        
        inline def setProtocol(value: `ava-4`): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        inline def setReady(value: () => typings.ava.pluginMod.SharedWorker.Protocol[Data]): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
        
        inline def setSubscribe(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "subscribe", js.Any.fromFunction0(value))
        
        inline def setTestWorkers(value: () => AsyncIterableIterator[TestWorker[Data]]): Self = StObject.set(x, "testWorkers", js.Any.fromFunction0(value))
      }
    }
    
    type ProtocolIdentifier = `ava-4`
    
    trait PublishedMessage[Data] extends StObject {
      
      val id: String
      
      def replies(): AsyncIterableIterator[ReceivedMessage[Data]]
    }
    object PublishedMessage {
      
      inline def apply[Data](id: String, replies: () => AsyncIterableIterator[ReceivedMessage[Data]]): PublishedMessage[Data] = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replies = js.Any.fromFunction0(replies))
        __obj.asInstanceOf[PublishedMessage[Data]]
      }
      
      extension [Self <: PublishedMessage[?], Data](x: Self & PublishedMessage[Data]) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setReplies(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "replies", js.Any.fromFunction0(value))
      }
    }
    
    trait ReceivedMessage[Data] extends StObject {
      
      val data: Data
      
      val id: String
      
      def reply(data: Data): PublishedMessage[Data]
      
      val testWorker: TestWorker[Any]
    }
    object ReceivedMessage {
      
      inline def apply[Data](data: Data, id: String, reply: Data => PublishedMessage[Data], testWorker: TestWorker[Any]): ReceivedMessage[Data] = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reply = js.Any.fromFunction1(reply), testWorker = testWorker.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReceivedMessage[Data]]
      }
      
      extension [Self <: ReceivedMessage[?], Data](x: Self & ReceivedMessage[Data]) {
        
        inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setReply(value: Data => PublishedMessage[Data]): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
        
        inline def setTestWorker(value: TestWorker[Any]): Self = StObject.set(x, "testWorker", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait TestWorker[Data] extends StObject {
      
      val file: String = js.native
      
      val id: String = js.native
      
      def publish(data: Data): PublishedMessage[Data] = js.native
      
      def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]] = js.native
      
      def teardown(fn: js.Function0[js.Promise[Unit] | Unit]): js.Function0[js.Promise[Unit]] = js.native
    }
  }
}
