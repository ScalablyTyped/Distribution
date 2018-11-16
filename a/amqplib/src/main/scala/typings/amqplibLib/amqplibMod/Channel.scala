package typings
package amqplibLib.amqplibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel
  extends nodeLib.eventsMod.EventEmitter {
  def ack(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  def ack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean): scala.Unit = js.native
  def ackAll(): scala.Unit = js.native
  def assertExchange(exchange: java.lang.String, `type`: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.AssertExchange] = js.native
  def assertExchange(
    exchange: java.lang.String,
    `type`: java.lang.String,
    options: amqplibLib.propertiesMod.OptionsNs.AssertExchange
  ): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.AssertExchange] = js.native
  def assertQueue(queue: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.AssertQueue] = js.native
  def assertQueue(queue: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.AssertQueue): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.AssertQueue] = js.native
  def bindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def bindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def bindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def bindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def cancel(consumerTag: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def checkExchange(exchange: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def checkQueue(queue: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.AssertQueue] = js.native
  def close(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def consume(
    queue: java.lang.String,
    onMessage: js.Function1[/* msg */ amqplibLib.propertiesMod.ConsumeMessage | scala.Null, _]
  ): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Consume] = js.native
  def consume(
    queue: java.lang.String,
    onMessage: js.Function1[/* msg */ amqplibLib.propertiesMod.ConsumeMessage | scala.Null, _],
    options: amqplibLib.propertiesMod.OptionsNs.Consume
  ): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Consume] = js.native
  def deleteExchange(exchange: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def deleteExchange(exchange: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.DeleteExchange): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def deleteQueue(queue: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.DeleteQueue] = js.native
  def deleteQueue(queue: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.DeleteQueue): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.DeleteQueue] = js.native
  def get(queue: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.GetMessage | amqplibLib.amqplibLibNumbers.`false`] = js.native
  def get(queue: java.lang.String, options: amqplibLib.propertiesMod.OptionsNs.Get): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.GetMessage | amqplibLib.amqplibLibNumbers.`false`] = js.native
  def nack(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  def nack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean): scala.Unit = js.native
  def nack(message: amqplibLib.propertiesMod.Message, allUpTo: scala.Boolean, requeue: scala.Boolean): scala.Unit = js.native
  def nackAll(): scala.Unit = js.native
  def nackAll(requeue: scala.Boolean): scala.Unit = js.native
  def prefetch(count: scala.Double): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def prefetch(count: scala.Double, global: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def publish(exchange: java.lang.String, routingKey: java.lang.String, content: nodeLib.Buffer): scala.Boolean = js.native
  def publish(
    exchange: java.lang.String,
    routingKey: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish
  ): scala.Boolean = js.native
  def purgeQueue(queue: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.PurgeQueue] = js.native
  def recover(): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def reject(message: amqplibLib.propertiesMod.Message): scala.Unit = js.native
  def reject(message: amqplibLib.propertiesMod.Message, requeue: scala.Boolean): scala.Unit = js.native
  def sendToQueue(queue: java.lang.String, content: nodeLib.Buffer): scala.Boolean = js.native
  def sendToQueue(
    queue: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish
  ): scala.Boolean = js.native
  def unbindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def unbindExchange(destination: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def unbindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
  def unbindQueue(queue: java.lang.String, source: java.lang.String, pattern: java.lang.String, args: js.Any): bluebirdLib.bluebirdMod.namespaced[amqplibLib.propertiesMod.RepliesNs.Empty] = js.native
}

