package typings.amqplib.amqplibMod

import typings.amqplib.amqplibNumbers.`false`
import typings.amqplib.propertiesMod.ConsumeMessage
import typings.amqplib.propertiesMod.GetMessage
import typings.amqplib.propertiesMod.Message
import typings.amqplib.propertiesMod.OptionsNs.DeleteExchange
import typings.amqplib.propertiesMod.OptionsNs.Get
import typings.amqplib.propertiesMod.OptionsNs.Publish
import typings.amqplib.propertiesMod.RepliesNs.AssertExchange
import typings.amqplib.propertiesMod.RepliesNs.AssertQueue
import typings.amqplib.propertiesMod.RepliesNs.Consume
import typings.amqplib.propertiesMod.RepliesNs.DeleteQueue
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
  def assertExchange(exchange: String, `type`: String): typings.bluebird.bluebirdMod.^[AssertExchange] = js.native
  def assertExchange(exchange: String, `type`: String, options: typings.amqplib.propertiesMod.OptionsNs.AssertExchange): typings.bluebird.bluebirdMod.^[AssertExchange] = js.native
  def assertQueue(queue: String): typings.bluebird.bluebirdMod.^[AssertQueue] = js.native
  def assertQueue(queue: String, options: typings.amqplib.propertiesMod.OptionsNs.AssertQueue): typings.bluebird.bluebirdMod.^[AssertQueue] = js.native
  def bindExchange(destination: String, source: String, pattern: String): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def bindExchange(destination: String, source: String, pattern: String, args: js.Any): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def bindQueue(queue: String, source: String, pattern: String): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def bindQueue(queue: String, source: String, pattern: String, args: js.Any): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def cancel(consumerTag: String): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def checkExchange(exchange: String): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def checkQueue(queue: String): typings.bluebird.bluebirdMod.^[AssertQueue] = js.native
  def close(): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def consume(queue: String, onMessage: js.Function1[/* msg */ ConsumeMessage | Null, _]): typings.bluebird.bluebirdMod.^[Consume] = js.native
  def consume(
    queue: String,
    onMessage: js.Function1[/* msg */ ConsumeMessage | Null, _],
    options: typings.amqplib.propertiesMod.OptionsNs.Consume
  ): typings.bluebird.bluebirdMod.^[Consume] = js.native
  def deleteExchange(exchange: String): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def deleteExchange(exchange: String, options: DeleteExchange): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def deleteQueue(queue: String): typings.bluebird.bluebirdMod.^[DeleteQueue] = js.native
  def deleteQueue(queue: String, options: typings.amqplib.propertiesMod.OptionsNs.DeleteQueue): typings.bluebird.bluebirdMod.^[DeleteQueue] = js.native
  def get(queue: String): typings.bluebird.bluebirdMod.^[GetMessage | `false`] = js.native
  def get(queue: String, options: Get): typings.bluebird.bluebirdMod.^[GetMessage | `false`] = js.native
  def nack(message: Message): Unit = js.native
  def nack(message: Message, allUpTo: Boolean): Unit = js.native
  def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
  def nackAll(): Unit = js.native
  def nackAll(requeue: Boolean): Unit = js.native
  def prefetch(count: Double): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def prefetch(count: Double, global: Boolean): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
  def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
  def purgeQueue(queue: String): typings.bluebird.bluebirdMod.^[PurgeQueue] = js.native
  def recover(): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def reject(message: Message): Unit = js.native
  def reject(message: Message, requeue: Boolean): Unit = js.native
  def sendToQueue(queue: String, content: Buffer): Boolean = js.native
  def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
  def unbindExchange(destination: String, source: String, pattern: String): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def unbindExchange(destination: String, source: String, pattern: String, args: js.Any): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def unbindQueue(queue: String, source: String, pattern: String): typings.bluebird.bluebirdMod.^[Empty] = js.native
  def unbindQueue(queue: String, source: String, pattern: String, args: js.Any): typings.bluebird.bluebirdMod.^[Empty] = js.native
}

