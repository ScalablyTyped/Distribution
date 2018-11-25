package typings
package amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmqpConnectionManager
  extends eventsLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Url, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.disconnect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Err, scala.Unit]
  ): this.type = js.native
  /**
  	 * Close this AmqpConnectionManager and free all associated resources.
  	 */
  def close(): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * Create a new ChannelWrapper. This is a proxy for the actual channel (which may or may not exist at any moment, depending on whether or not we are currently connected.)
  	 * @param opts
  	 */
  def createChannel(opts: CreateChannelOpts): ChannelWrapper = js.native
  /**
  	 * Returns true if the AmqpConnectionManager is connected to a broker, false otherwise.
  	 */
  def isConnected(): scala.Boolean = js.native
  @JSName("on")
  def on_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Url, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.disconnect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Err, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Url, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.disconnect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Err, scala.Unit]
  ): this.type = js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Url, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.disconnect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Err, scala.Unit]
  ): this.type = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.connect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Url, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(
    event: amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerLibStrings.disconnect,
    listener: js.Function1[/* arg */ amqpDashConnectionDashManagerLib.Anon_Err, scala.Unit]
  ): this.type = js.native
}

