package typings.ava

import typings.ava.avaStrings.experimental
import typings.ava.pluginMod.SharedWorker.Plugin.Experimental.Protocol
import typings.ava.pluginMod.SharedWorker.Plugin.RegistrationOptions
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("ava/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerSharedWorker_experimental[Data](options: RegistrationOptions[experimental, Data]): Protocol[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSharedWorker")(options.asInstanceOf[js.Any]).asInstanceOf[Protocol[Data]]
  
  object SharedWorker {
    
    object Experimental {
      
      trait BroadcastMessage[Data] extends StObject {
        
        val id: String
        
        def replies(): AsyncIterableIterator[ReceivedMessage[Data]]
      }
      object BroadcastMessage {
        
        @scala.inline
        def apply[Data](id: String, replies: () => AsyncIterableIterator[ReceivedMessage[Data]]): BroadcastMessage[Data] = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replies = js.Any.fromFunction0(replies))
          __obj.asInstanceOf[BroadcastMessage[Data]]
        }
        
        @scala.inline
        implicit class BroadcastMessageMutableBuilder[Self <: BroadcastMessage[?], Data] (val x: Self & BroadcastMessage[Data]) extends AnyVal {
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReplies(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "replies", js.Any.fromFunction0(value))
        }
      }
      
      trait Protocol[Data] extends StObject {
        
        def broadcast(data: Data): BroadcastMessage[Data]
        
        val initialData: Data
        
        val protocol: experimental
        
        def ready(): typings.ava.pluginMod.SharedWorker.Experimental.Protocol[Data]
        
        def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]]
        
        def testWorkers(): AsyncIterableIterator[TestWorker[Data]]
      }
      object Protocol {
        
        @scala.inline
        def apply[Data](
          broadcast: Data => BroadcastMessage[Data],
          initialData: Data,
          ready: () => typings.ava.pluginMod.SharedWorker.Experimental.Protocol[Data],
          subscribe: () => AsyncIterableIterator[ReceivedMessage[Data]],
          testWorkers: () => AsyncIterableIterator[TestWorker[Data]]
        ): typings.ava.pluginMod.SharedWorker.Experimental.Protocol[Data] = {
          val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction1(broadcast), initialData = initialData.asInstanceOf[js.Any], protocol = "experimental", ready = js.Any.fromFunction0(ready), subscribe = js.Any.fromFunction0(subscribe), testWorkers = js.Any.fromFunction0(testWorkers))
          __obj.asInstanceOf[typings.ava.pluginMod.SharedWorker.Experimental.Protocol[Data]]
        }
        
        @scala.inline
        implicit class ProtocolMutableBuilder[Self <: typings.ava.pluginMod.SharedWorker.Experimental.Protocol[?], Data] (val x: Self & typings.ava.pluginMod.SharedWorker.Experimental.Protocol[Data]) extends AnyVal {
          
          @scala.inline
          def setBroadcast(value: Data => BroadcastMessage[Data]): Self = StObject.set(x, "broadcast", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInitialData(value: Data): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProtocol(value: experimental): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReady(value: () => typings.ava.pluginMod.SharedWorker.Experimental.Protocol[Data]): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
          
          @scala.inline
          def setSubscribe(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "subscribe", js.Any.fromFunction0(value))
          
          @scala.inline
          def setTestWorkers(value: () => AsyncIterableIterator[TestWorker[Data]]): Self = StObject.set(x, "testWorkers", js.Any.fromFunction0(value))
        }
      }
      
      trait PublishedMessage[Data] extends StObject {
        
        val id: String
        
        def replies(): AsyncIterableIterator[ReceivedMessage[Data]]
      }
      object PublishedMessage {
        
        @scala.inline
        def apply[Data](id: String, replies: () => AsyncIterableIterator[ReceivedMessage[Data]]): PublishedMessage[Data] = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replies = js.Any.fromFunction0(replies))
          __obj.asInstanceOf[PublishedMessage[Data]]
        }
        
        @scala.inline
        implicit class PublishedMessageMutableBuilder[Self <: PublishedMessage[?], Data] (val x: Self & PublishedMessage[Data]) extends AnyVal {
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReplies(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "replies", js.Any.fromFunction0(value))
        }
      }
      
      trait ReceivedMessage[Data] extends StObject {
        
        val data: Data
        
        val id: String
        
        def reply(data: Data): PublishedMessage[Data]
        
        val testWorker: TestWorker[js.Any]
      }
      object ReceivedMessage {
        
        @scala.inline
        def apply[Data](data: Data, id: String, reply: Data => PublishedMessage[Data], testWorker: TestWorker[js.Any]): ReceivedMessage[Data] = {
          val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reply = js.Any.fromFunction1(reply), testWorker = testWorker.asInstanceOf[js.Any])
          __obj.asInstanceOf[ReceivedMessage[Data]]
        }
        
        @scala.inline
        implicit class ReceivedMessageMutableBuilder[Self <: ReceivedMessage[?], Data] (val x: Self & ReceivedMessage[Data]) extends AnyVal {
          
          @scala.inline
          def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReply(value: Data => PublishedMessage[Data]): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTestWorker(value: TestWorker[js.Any]): Self = StObject.set(x, "testWorker", value.asInstanceOf[js.Any])
        }
      }
      
      trait TestWorker[Data] extends StObject {
        
        val file: String
        
        val id: String
        
        def publish(data: Data): PublishedMessage[Data]
        
        def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]]
        
        def teardown[TeardownFn /* <: js.Function0[Unit] */](fn: TeardownFn): TeardownFn
      }
      object TestWorker {
        
        @scala.inline
        def apply[Data](
          file: String,
          id: String,
          publish: Data => PublishedMessage[Data],
          subscribe: () => AsyncIterableIterator[ReceivedMessage[Data]],
          teardown: js.Any => js.Any
        ): TestWorker[Data] = {
          val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publish = js.Any.fromFunction1(publish), subscribe = js.Any.fromFunction0(subscribe), teardown = js.Any.fromFunction1(teardown))
          __obj.asInstanceOf[TestWorker[Data]]
        }
        
        @scala.inline
        implicit class TestWorkerMutableBuilder[Self <: TestWorker[?], Data] (val x: Self & TestWorker[Data]) extends AnyVal {
          
          @scala.inline
          def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPublish(value: Data => PublishedMessage[Data]): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
          
          @scala.inline
          def setSubscribe(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "subscribe", js.Any.fromFunction0(value))
          
          @scala.inline
          def setTeardown(value: js.Any => js.Any): Self = StObject.set(x, "teardown", js.Any.fromFunction1(value))
        }
      }
    }
    
    type Factory = js.Function1[/* options */ FactoryOptions, Unit]
    
    trait FactoryOptions extends StObject {
      
      @JSName("negotiateProtocol")
      def negotiateProtocol_experimental[Data](supported: js.Array[experimental]): typings.ava.pluginMod.SharedWorker.Experimental.Protocol[Data]
    }
    object FactoryOptions {
      
      @scala.inline
      def apply(
        negotiateProtocol: js.Array[experimental] => typings.ava.pluginMod.SharedWorker.Experimental.Protocol[js.Any]
      ): FactoryOptions = {
        val __obj = js.Dynamic.literal(negotiateProtocol = js.Any.fromFunction1(negotiateProtocol))
        __obj.asInstanceOf[FactoryOptions]
      }
      
      @scala.inline
      implicit class FactoryOptionsMutableBuilder[Self <: FactoryOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNegotiateProtocol(value: js.Array[experimental] => typings.ava.pluginMod.SharedWorker.Experimental.Protocol[js.Any]): Self = StObject.set(x, "negotiateProtocol", js.Any.fromFunction1(value))
      }
    }
    
    object Plugin {
      
      object Experimental {
        
        trait Protocol[Data] extends StObject {
          
          val available: js.Promise[Unit]
          
          val currentlyAvailable: Boolean
          
          val protocol: experimental
          
          def publish(data: Data): PublishedMessage[Data]
          
          def subscribe(): AsyncIterableIterator[ReceivedMessage[Data]]
        }
        object Protocol {
          
          @scala.inline
          def apply[Data](
            available: js.Promise[Unit],
            currentlyAvailable: Boolean,
            publish: Data => PublishedMessage[Data],
            subscribe: () => AsyncIterableIterator[ReceivedMessage[Data]]
          ): Protocol[Data] = {
            val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], currentlyAvailable = currentlyAvailable.asInstanceOf[js.Any], protocol = "experimental", publish = js.Any.fromFunction1(publish), subscribe = js.Any.fromFunction0(subscribe))
            __obj.asInstanceOf[Protocol[Data]]
          }
          
          @scala.inline
          implicit class ProtocolMutableBuilder[Self <: Protocol[?], Data] (val x: Self & Protocol[Data]) extends AnyVal {
            
            @scala.inline
            def setAvailable(value: js.Promise[Unit]): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setCurrentlyAvailable(value: Boolean): Self = StObject.set(x, "currentlyAvailable", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setProtocol(value: experimental): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPublish(value: Data => PublishedMessage[Data]): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSubscribe(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "subscribe", js.Any.fromFunction0(value))
          }
        }
        
        trait PublishedMessage[Data] extends StObject {
          
          val id: String
          
          def replies(): AsyncIterableIterator[ReceivedMessage[Data]]
        }
        object PublishedMessage {
          
          @scala.inline
          def apply[Data](id: String, replies: () => AsyncIterableIterator[ReceivedMessage[Data]]): PublishedMessage[Data] = {
            val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replies = js.Any.fromFunction0(replies))
            __obj.asInstanceOf[PublishedMessage[Data]]
          }
          
          @scala.inline
          implicit class PublishedMessageMutableBuilder[Self <: PublishedMessage[?], Data] (val x: Self & PublishedMessage[Data]) extends AnyVal {
            
            @scala.inline
            def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setReplies(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = StObject.set(x, "replies", js.Any.fromFunction0(value))
          }
        }
        
        trait ReceivedMessage[Data] extends StObject {
          
          val data: Data
          
          val id: String
          
          def reply(data: Data): PublishedMessage[Data]
        }
        object ReceivedMessage {
          
          @scala.inline
          def apply[Data](data: Data, id: String, reply: Data => PublishedMessage[Data]): ReceivedMessage[Data] = {
            val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reply = js.Any.fromFunction1(reply))
            __obj.asInstanceOf[ReceivedMessage[Data]]
          }
          
          @scala.inline
          implicit class ReceivedMessageMutableBuilder[Self <: ReceivedMessage[?], Data] (val x: Self & ReceivedMessage[Data]) extends AnyVal {
            
            @scala.inline
            def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setReply(value: Data => PublishedMessage[Data]): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
          }
        }
      }
      
      trait RegistrationOptions[Identifier /* <: ProtocolIdentifier */, Data] extends StObject {
        
        val filename: String
        
        val initialData: js.UndefOr[Data] = js.undefined
        
        val supportedProtocols: js.Array[Identifier]
        
        val teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
      }
      object RegistrationOptions {
        
        @scala.inline
        def apply[Identifier /* <: ProtocolIdentifier */, Data](filename: String, supportedProtocols: js.Array[Identifier]): RegistrationOptions[Identifier, Data] = {
          val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
          __obj.asInstanceOf[RegistrationOptions[Identifier, Data]]
        }
        
        @scala.inline
        implicit class RegistrationOptionsMutableBuilder[Self <: RegistrationOptions[?, ?], Identifier /* <: ProtocolIdentifier */, Data] (val x: Self & (RegistrationOptions[Identifier, Data])) extends AnyVal {
          
          @scala.inline
          def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInitialData(value: Data): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInitialDataUndefined: Self = StObject.set(x, "initialData", js.undefined)
          
          @scala.inline
          def setSupportedProtocols(value: js.Array[Identifier]): Self = StObject.set(x, "supportedProtocols", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSupportedProtocolsVarargs(value: Identifier*): Self = StObject.set(x, "supportedProtocols", js.Array(value :_*))
          
          @scala.inline
          def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
          
          @scala.inline
          def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
        }
      }
    }
    
    type ProtocolIdentifier = experimental
  }
}
