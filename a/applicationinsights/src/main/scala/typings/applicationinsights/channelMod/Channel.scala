package typings.applicationinsights.channelMod

import typings.applicationinsights.contractsMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var _buffer: js.Array[String] = js.native
  var _lastSend: Double = js.native
  var _sender: typings.applicationinsights.senderMod.^ = js.native
  var _timeoutHandle: js.Any = js.native
  /* protected */ def _getBatchIntervalMs(): Double = js.native
  /* protected */ def _getBatchSize(): Double = js.native
  /* protected */ def _isDisabled(): Boolean = js.native
  /* protected */ def _stringify(envelope: Envelope): String = js.native
  /**
    * Add a telemetry item to the send buffer
    */
  def send(envelope: Envelope): Unit = js.native
  /**
    * Enable or disable disk-backed retry caching to cache events when client is offline (enabled by default)
    * These cached events are stored in your system or user's temporary directory and access restricted to your user when possible.
    * @param value if true events that occured while client is offline will be cached on disk
    * @param resendInterval The wait interval for resending cached events.
    * @param maxBytesOnDisk The maximum size (in bytes) that the created temporary directory for cache events can grow to, before caching is disabled.
    * @returns {Configuration} this class
    */
  def setUseDiskRetryCaching(value: Boolean): Unit = js.native
  def setUseDiskRetryCaching(value: Boolean, resendInterval: Double): Unit = js.native
  def setUseDiskRetryCaching(value: Boolean, resendInterval: Double, maxBytesOnDisk: Double): Unit = js.native
  /**
    * Immediately send buffered data
    */
  def triggerSend(isNodeCrashing: Boolean): Unit = js.native
  def triggerSend(isNodeCrashing: Boolean, callback: js.Function1[/* v */ String, Unit]): Unit = js.native
}

