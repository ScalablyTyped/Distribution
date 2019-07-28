package typings.amqplib.callbackUnderscoreApiMod

import typings.amqplib.amqplibNumbers.`false`
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.OptionsNs.AssertExchange
import typings.amqplib.propertiesMod.OptionsNs.AssertQueue
import typings.amqplib.propertiesMod.OptionsNs.Consume
import typings.amqplib.propertiesMod.OptionsNs.DeleteExchange
import typings.amqplib.propertiesMod.OptionsNs.DeleteQueue
import typings.amqplib.propertiesMod.OptionsNs.Get
import typings.amqplib.propertiesMod.OptionsNs.Publish
import typings.amqplib.propertiesMod.RepliesNs.Empty
import typings.amqplib.propertiesMod.RepliesNs.PurgeQueue
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends EventEmitter {
  def ack(message: Message): Unit = js.native
  def ack(message: Message, allUpTo: Boolean): Unit = js.native
  def ackAll(): Unit = js.native
  def assertExchange(exchange: String, `type`: String): Unit = js.native
  def assertExchange(exchange: String, `type`: String, options: AssertExchange): Unit = js.native
  def assertExchange(
    exchange: String,
    `type`: String,
    options: AssertExchange,
    callback: js.Function2[
      /* err */ js.Any, 
      /* ok */ typings.amqplib.propertiesMod.RepliesNs.AssertExchange, 
      Unit
    ]
  ): Unit = js.native
  def assertQueue(): Unit = js.native
  def assertQueue(queue: String): Unit = js.native
  def assertQueue(queue: String, options: AssertQueue): Unit = js.native
  def assertQueue(
    queue: String,
    options: AssertQueue,
    callback: js.Function2[/* err */ js.Any, /* ok */ typings.amqplib.propertiesMod.RepliesNs.AssertQueue, Unit]
  ): Unit = js.native
  def bindExchange(destination: String, source: String, pattern: String): Unit = js.native
  def bindExchange(destination: String, source: String, pattern: String, args: js.Any): Unit = js.native
  def bindExchange(
    destination: String,
    source: String,
    pattern: String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): Unit = js.native
  def bindQueue(queue: String, source: String, pattern: String): Unit = js.native
  def bindQueue(queue: String, source: String, pattern: String, args: js.Any): Unit = js.native
  def bindQueue(
    queue: String,
    source: String,
    pattern: String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): Unit = js.native
  def cancel(consumerTag: String): Unit = js.native
  def cancel(consumerTag: String, callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
  def checkExchange(exchange: String): Unit = js.native
  def checkExchange(exchange: String, callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
  def checkQueue(queue: String): Unit = js.native
  def checkQueue(
    queue: String,
    callback: js.Function2[/* err */ js.Any, /* ok */ typings.amqplib.propertiesMod.RepliesNs.AssertQueue, Unit]
  ): Unit = js.native
  def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def consume(queue: String, onMessage: js.Function1[/* msg */ Message | Null, _]): Unit = js.native
  def consume(queue: String, onMessage: js.Function1[/* msg */ Message | Null, _], options: Consume): Unit = js.native
  def consume(
    queue: String,
    onMessage: js.Function1[/* msg */ Message | Null, _],
    options: Consume,
    callback: js.Function2[/* err */ js.Any, /* ok */ typings.amqplib.propertiesMod.RepliesNs.Consume, Unit]
  ): Unit = js.native
  def deleteExchange(exchange: String): Unit = js.native
  def deleteExchange(exchange: String, options: DeleteExchange): Unit = js.native
  def deleteExchange(
    exchange: String,
    options: DeleteExchange,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): Unit = js.native
  def deleteQueue(queue: String): Unit = js.native
  def deleteQueue(queue: String, options: DeleteQueue): Unit = js.native
  def deleteQueue(
    queue: String,
    options: DeleteQueue,
    callback: js.Function2[/* err */ js.Any, /* ok */ typings.amqplib.propertiesMod.RepliesNs.DeleteQueue, Unit]
  ): Unit = js.native
  def get(queue: String): Unit = js.native
  def get(queue: String, options: Get): Unit = js.native
  @JSName("get")
  def get_false(
    queue: String,
    options: Get,
    callback: js.Function2[/* err */ js.Any, /* ok */ Message | `false`, Unit]
  ): Unit = js.native
  def nack(message: Message): Unit = js.native
  def nack(message: Message, allUpTo: Boolean): Unit = js.native
  def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
  def nackAll(): Unit = js.native
  def nackAll(requeue: Boolean): Unit = js.native
  def prefetch(count: Double): Unit = js.native
  def prefetch(count: Double, global: Boolean): Unit = js.native
  def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
  def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
  def purgeQueue(queue: String): Unit = js.native
  def purgeQueue(queue: String, callback: js.Function2[/* err */ js.Any, /* ok */ PurgeQueue, Unit]): Unit = js.native
  def recover(): Unit = js.native
  def recover(callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
  def reject(message: Message): Unit = js.native
  def reject(message: Message, requeue: Boolean): Unit = js.native
  def sendToQueue(queue: String, content: Buffer): Boolean = js.native
  def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
  def unbindExchange(destination: String, source: String, pattern: String): Unit = js.native
  def unbindExchange(destination: String, source: String, pattern: String, args: js.Any): Unit = js.native
  def unbindExchange(
    destination: String,
    source: String,
    pattern: String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): Unit = js.native
  def unbindQueue(queue: String, source: String, pattern: String): Unit = js.native
  def unbindQueue(queue: String, source: String, pattern: String, args: js.Any): Unit = js.native
  def unbindQueue(
    queue: String,
    source: String,
    pattern: String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): Unit = js.native
}

