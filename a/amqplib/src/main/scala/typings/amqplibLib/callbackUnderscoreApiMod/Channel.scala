package typings
package amqplibLib.callbackUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel
  extends nodeLib.eventsMod.EventEmitter {
  def ack(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  def ack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean): scala.Unit = js.native
  def ackAll(): scala.Unit = js.native
  def assertExchange(exchange: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def assertExchange(
    exchange: java.lang.String,
    `type`: java.lang.String,
    options: amqplibLib.propertiesMod.OptionsNs.AssertExchange
  ): scala.Unit = js.native
  def assertExchange(
    exchange: java.lang.String,
    `type`: java.lang.String,
    options: amqplibLib.propertiesMod.OptionsNs.AssertExchange,
    callback: js.Function2[
      /* err */ js.Any, 
      /* ok */ amqplibLib.propertiesMod.RepliesNs.AssertExchange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def assertQueue(): scala.Unit = js.native
  def assertQueue(queue: java.lang.String): scala.Unit = js.native
  def assertQueue(queue: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.AssertQueue): scala.Unit = js.native
  def assertQueue(
    queue: java.lang.String,
    options: amqplibLib.propertiesMod.OptionsNs.AssertQueue,
    callback: js.Function2[
      /* err */ js.Any, 
      /* ok */ amqplibLib.propertiesMod.RepliesNs.AssertQueue, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def bindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String): scala.Unit = js.native
  def bindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): scala.Unit = js.native
  def bindExchange(
    destination: java.lang.String,
    source: java.lang.String,
    pattern: java.lang.String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
  def bindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String): scala.Unit = js.native
  def bindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): scala.Unit = js.native
  def bindQueue(
    queue: java.lang.String,
    source: java.lang.String,
    pattern: java.lang.String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
  def cancel(consumerTag: java.lang.String): scala.Unit = js.native
  def cancel(
    consumerTag: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
  def checkExchange(exchange: java.lang.String): scala.Unit = js.native
  def checkExchange(
    exchange: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
  def checkQueue(queue: java.lang.String): scala.Unit = js.native
  def checkQueue(
    queue: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* ok */ amqplibLib.propertiesMod.RepliesNs.AssertQueue, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def consume(
    queue: java.lang.String,
    onMessage: js.Function1[/* msg */ amqplibLib.propertiesMod.Message | scala.Null, _]
  ): scala.Unit = js.native
  def consume(
    queue: java.lang.String,
    onMessage: js.Function1[/* msg */ amqplibLib.propertiesMod.Message | scala.Null, _],
    options: amqplibLib.propertiesMod.OptionsNs.Consume
  ): scala.Unit = js.native
  def consume(
    queue: java.lang.String,
    onMessage: js.Function1[/* msg */ amqplibLib.propertiesMod.Message | scala.Null, _],
    options: amqplibLib.propertiesMod.OptionsNs.Consume,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Consume, scala.Unit]
  ): scala.Unit = js.native
  def deleteExchange(exchange: java.lang.String): scala.Unit = js.native
  def deleteExchange(exchange: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.DeleteExchange): scala.Unit = js.native
  def deleteExchange(
    exchange: java.lang.String,
    options: amqplibLib.propertiesMod.OptionsNs.DeleteExchange,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
  def deleteQueue(queue: java.lang.String): scala.Unit = js.native
  def deleteQueue(queue: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.DeleteQueue): scala.Unit = js.native
  def deleteQueue(
    queue: java.lang.String,
    options: amqplibLib.propertiesMod.OptionsNs.DeleteQueue,
    callback: js.Function2[
      /* err */ js.Any, 
      /* ok */ amqplibLib.propertiesMod.RepliesNs.DeleteQueue, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def get(queue: java.lang.String): scala.Unit = js.native
  def get(queue: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.Get): scala.Unit = js.native
  @JSName("get")
  def get_false(
    queue: java.lang.String,
    options: amqplibLib.propertiesMod.OptionsNs.Get,
    callback: js.Function2[
      /* err */ js.Any, 
      /* ok */ amqplibLib.propertiesMod.Message | amqplibLib.amqplibLibNumbers.`false`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def nack(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  def nack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean): scala.Unit = js.native
  def nack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean, requeue: scala.Boolean): scala.Unit = js.native
  def nackAll(): scala.Unit = js.native
  def nackAll(requeue: scala.Boolean): scala.Unit = js.native
  def prefetch(count: scala.Double): scala.Unit = js.native
  def prefetch(count: scala.Double, global: scala.Boolean): scala.Unit = js.native
  def publish(exchange: java.lang.String, routingKey: java.lang.String, content: nodeLib.Buffer): scala.Boolean = js.native
  def publish(
    exchange: java.lang.String,
    routingKey: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish
  ): scala.Boolean = js.native
  def purgeQueue(queue: java.lang.String): scala.Unit = js.native
  def purgeQueue(
    queue: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.PurgeQueue, scala.Unit]
  ): scala.Unit = js.native
  def recover(): scala.Unit = js.native
  def recover(
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
  def reject(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  def reject(message: amqplibLib.propertiesMod.Message, requeue: scala.Boolean): scala.Unit = js.native
  def sendToQueue(queue: java.lang.String, content: nodeLib.Buffer): scala.Boolean = js.native
  def sendToQueue(
    queue: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish
  ): scala.Boolean = js.native
  def unbindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String): scala.Unit = js.native
  def unbindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): scala.Unit = js.native
  def unbindExchange(
    destination: java.lang.String,
    source: java.lang.String,
    pattern: java.lang.String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
  def unbindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String): scala.Unit = js.native
  def unbindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): scala.Unit = js.native
  def unbindQueue(
    queue: java.lang.String,
    source: java.lang.String,
    pattern: java.lang.String,
    args: js.Any,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Unit = js.native
}

