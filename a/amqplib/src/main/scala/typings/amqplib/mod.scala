package typings.amqplib

import typings.amqplib.amqplibBooleans.`false`
import typings.amqplib.amqplibStrings.`match`
import typings.amqplib.amqplibStrings.direct
import typings.amqplib.amqplibStrings.fanout
import typings.amqplib.amqplibStrings.headers
import typings.amqplib.amqplibStrings.topic
import typings.amqplib.anon.Mechanism
import typings.amqplib.anon.Response
import typings.amqplib.anon.ServerProperties
import typings.amqplib.propertiesMod.ConsumeMessage
import typings.amqplib.propertiesMod.GetMessage
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.Options.Connect
import typings.amqplib.propertiesMod.Options.DeleteExchange
import typings.amqplib.propertiesMod.Options.Get
import typings.amqplib.propertiesMod.Options.Publish
import typings.amqplib.propertiesMod.Replies.AssertExchange
import typings.amqplib.propertiesMod.Replies.AssertQueue
import typings.amqplib.propertiesMod.Replies.Consume
import typings.amqplib.propertiesMod.Replies.DeleteQueue
import typings.amqplib.propertiesMod.Replies.Empty
import typings.amqplib.propertiesMod.Replies.PurgeQueue
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqplib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(url: String): js.Promise[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Connection]]
  inline def connect(url: String, socketOptions: Any): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  inline def connect(url: Connect): js.Promise[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Connection]]
  inline def connect(url: Connect, socketOptions: Any): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  object credentials {
    
    @JSImport("amqplib", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def amqplain(username: String, password: String): Mechanism = (^.asInstanceOf[js.Dynamic].applyDynamic("amqplain")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Mechanism]
    
    inline def external(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("external")().asInstanceOf[Response]
    
    inline def plain(username: String, password: String): Mechanism = (^.asInstanceOf[js.Dynamic].applyDynamic("plain")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Mechanism]
  }
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    def ackAll(): Unit = js.native
    
    def assertExchange(exchange: String, `type`: direct | topic | headers | fanout | `match`): js.Promise[AssertExchange] = js.native
    def assertExchange(
      exchange: String,
      `type`: direct | topic | headers | fanout | `match`,
      options: typings.amqplib.propertiesMod.Options.AssertExchange
    ): js.Promise[AssertExchange] = js.native
    def assertExchange(exchange: String, `type`: String): js.Promise[AssertExchange] = js.native
    def assertExchange(exchange: String, `type`: String, options: typings.amqplib.propertiesMod.Options.AssertExchange): js.Promise[AssertExchange] = js.native
    
    def assertQueue(queue: String): js.Promise[AssertQueue] = js.native
    def assertQueue(queue: String, options: typings.amqplib.propertiesMod.Options.AssertQueue): js.Promise[AssertQueue] = js.native
    
    def bindExchange(destination: String, source: String, pattern: String): js.Promise[Empty] = js.native
    def bindExchange(destination: String, source: String, pattern: String, args: Any): js.Promise[Empty] = js.native
    
    def bindQueue(queue: String, source: String, pattern: String): js.Promise[Empty] = js.native
    def bindQueue(queue: String, source: String, pattern: String, args: Any): js.Promise[Empty] = js.native
    
    def cancel(consumerTag: String): js.Promise[Empty] = js.native
    
    def checkExchange(exchange: String): js.Promise[Empty] = js.native
    
    def checkQueue(queue: String): js.Promise[AssertQueue] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var connection: Connection = js.native
    
    def consume(queue: String, onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit]): js.Promise[Consume] = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit],
      options: typings.amqplib.propertiesMod.Options.Consume
    ): js.Promise[Consume] = js.native
    
    def deleteExchange(exchange: String): js.Promise[Empty] = js.native
    def deleteExchange(exchange: String, options: DeleteExchange): js.Promise[Empty] = js.native
    
    def deleteQueue(queue: String): js.Promise[DeleteQueue] = js.native
    def deleteQueue(queue: String, options: typings.amqplib.propertiesMod.Options.DeleteQueue): js.Promise[DeleteQueue] = js.native
    
    def get(queue: String): js.Promise[GetMessage | `false`] = js.native
    def get(queue: String, options: Get): js.Promise[GetMessage | `false`] = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Unit, requeue: Boolean): Unit = js.native
    
    def nackAll(): Unit = js.native
    def nackAll(requeue: Boolean): Unit = js.native
    
    def prefetch(count: Double): js.Promise[Empty] = js.native
    def prefetch(count: Double, global: Boolean): js.Promise[Empty] = js.native
    
    def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
    
    def purgeQueue(queue: String): js.Promise[PurgeQueue] = js.native
    
    def recover(): js.Promise[Empty] = js.native
    
    def reject(message: Message): Unit = js.native
    def reject(message: Message, requeue: Boolean): Unit = js.native
    
    def sendToQueue(queue: String, content: Buffer): Boolean = js.native
    def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
    
    def unbindExchange(destination: String, source: String, pattern: String): js.Promise[Empty] = js.native
    def unbindExchange(destination: String, source: String, pattern: String, args: Any): js.Promise[Empty] = js.native
    
    def unbindQueue(queue: String, source: String, pattern: String): js.Promise[Empty] = js.native
    def unbindQueue(queue: String, source: String, pattern: String, args: Any): js.Promise[Empty] = js.native
  }
  
  @js.native
  trait ConfirmChannel extends Channel {
    
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def waitForConfirms(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Connection extends EventEmitter {
    
    def close(): js.Promise[Unit] = js.native
    
    var connection: ServerProperties = js.native
    
    def createChannel(): js.Promise[Channel] = js.native
    
    def createConfirmChannel(): js.Promise[ConfirmChannel] = js.native
  }
}
