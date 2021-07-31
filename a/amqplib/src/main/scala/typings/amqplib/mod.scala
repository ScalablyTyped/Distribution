package typings.amqplib

import typings.amqplib.amqplibBooleans.`false`
import typings.amqplib.amqplibStrings.`match`
import typings.amqplib.amqplibStrings.direct
import typings.amqplib.amqplibStrings.fanout
import typings.amqplib.amqplibStrings.headers
import typings.amqplib.amqplibStrings.topic
import typings.amqplib.anon.Mechanism
import typings.amqplib.anon.Password
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
import typings.amqplib.propertiesMod.ServerProperties
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqplib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connect(url: String): typings.bluebird.mod.^[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Connection]]
  @scala.inline
  def connect(url: String, socketOptions: js.Any): typings.bluebird.mod.^[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Connection]]
  @scala.inline
  def connect(url: Connect): typings.bluebird.mod.^[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[Connection]]
  @scala.inline
  def connect(url: Connect, socketOptions: js.Any): typings.bluebird.mod.^[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[Connection]]
  
  object credentials {
    
    @JSImport("amqplib", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def external(): Mechanism = ^.asInstanceOf[js.Dynamic].applyDynamic("external")().asInstanceOf[Mechanism]
    
    @scala.inline
    def plain(username: String, password: String): Password = (^.asInstanceOf[js.Dynamic].applyDynamic("plain")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Password]
  }
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    def ackAll(): Unit = js.native
    
    def assertExchange(exchange: String, `type`: String): typings.bluebird.mod.^[AssertExchange] = js.native
    def assertExchange(exchange: String, `type`: String, options: typings.amqplib.propertiesMod.Options.AssertExchange): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_direct(exchange: String, `type`: direct): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_direct(exchange: String, `type`: direct, options: typings.amqplib.propertiesMod.Options.AssertExchange): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_fanout(exchange: String, `type`: fanout): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_fanout(exchange: String, `type`: fanout, options: typings.amqplib.propertiesMod.Options.AssertExchange): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_headers(exchange: String, `type`: headers): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_headers(exchange: String, `type`: headers, options: typings.amqplib.propertiesMod.Options.AssertExchange): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_match(exchange: String, `type`: `match`): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_match(exchange: String, `type`: `match`, options: typings.amqplib.propertiesMod.Options.AssertExchange): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_topic(exchange: String, `type`: topic): typings.bluebird.mod.^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_topic(exchange: String, `type`: topic, options: typings.amqplib.propertiesMod.Options.AssertExchange): typings.bluebird.mod.^[AssertExchange] = js.native
    
    def assertQueue(queue: String): typings.bluebird.mod.^[AssertQueue] = js.native
    def assertQueue(queue: String, options: typings.amqplib.propertiesMod.Options.AssertQueue): typings.bluebird.mod.^[AssertQueue] = js.native
    
    def bindExchange(destination: String, source: String, pattern: String): typings.bluebird.mod.^[Empty] = js.native
    def bindExchange(destination: String, source: String, pattern: String, args: js.Any): typings.bluebird.mod.^[Empty] = js.native
    
    def bindQueue(queue: String, source: String, pattern: String): typings.bluebird.mod.^[Empty] = js.native
    def bindQueue(queue: String, source: String, pattern: String, args: js.Any): typings.bluebird.mod.^[Empty] = js.native
    
    def cancel(consumerTag: String): typings.bluebird.mod.^[Empty] = js.native
    
    def checkExchange(exchange: String): typings.bluebird.mod.^[Empty] = js.native
    
    def checkQueue(queue: String): typings.bluebird.mod.^[AssertQueue] = js.native
    
    def close(): typings.bluebird.mod.^[Unit] = js.native
    
    def consume(queue: String, onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit]): typings.bluebird.mod.^[Consume] = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit],
      options: typings.amqplib.propertiesMod.Options.Consume
    ): typings.bluebird.mod.^[Consume] = js.native
    
    def deleteExchange(exchange: String): typings.bluebird.mod.^[Empty] = js.native
    def deleteExchange(exchange: String, options: DeleteExchange): typings.bluebird.mod.^[Empty] = js.native
    
    def deleteQueue(queue: String): typings.bluebird.mod.^[DeleteQueue] = js.native
    def deleteQueue(queue: String, options: typings.amqplib.propertiesMod.Options.DeleteQueue): typings.bluebird.mod.^[DeleteQueue] = js.native
    
    def get(queue: String): typings.bluebird.mod.^[GetMessage | `false`] = js.native
    def get(queue: String, options: Get): typings.bluebird.mod.^[GetMessage | `false`] = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Unit, requeue: Boolean): Unit = js.native
    
    def nackAll(): Unit = js.native
    def nackAll(requeue: Boolean): Unit = js.native
    
    def prefetch(count: Double): typings.bluebird.mod.^[Empty] = js.native
    def prefetch(count: Double, global: Boolean): typings.bluebird.mod.^[Empty] = js.native
    
    def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
    
    def purgeQueue(queue: String): typings.bluebird.mod.^[PurgeQueue] = js.native
    
    def recover(): typings.bluebird.mod.^[Empty] = js.native
    
    def reject(message: Message): Unit = js.native
    def reject(message: Message, requeue: Boolean): Unit = js.native
    
    def sendToQueue(queue: String, content: Buffer): Boolean = js.native
    def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
    
    def unbindExchange(destination: String, source: String, pattern: String): typings.bluebird.mod.^[Empty] = js.native
    def unbindExchange(destination: String, source: String, pattern: String, args: js.Any): typings.bluebird.mod.^[Empty] = js.native
    
    def unbindQueue(queue: String, source: String, pattern: String): typings.bluebird.mod.^[Empty] = js.native
    def unbindQueue(queue: String, source: String, pattern: String, args: js.Any): typings.bluebird.mod.^[Empty] = js.native
  }
  
  @js.native
  trait ConfirmChannel extends Channel {
    
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def waitForConfirms(): typings.bluebird.mod.^[Unit] = js.native
  }
  
  @js.native
  trait Connection extends EventEmitter {
    
    def close(): typings.bluebird.mod.^[Unit] = js.native
    
    def createChannel(): typings.bluebird.mod.^[Channel] = js.native
    
    def createConfirmChannel(): typings.bluebird.mod.^[ConfirmChannel] = js.native
    
    var serverProperties: ServerProperties = js.native
  }
}
