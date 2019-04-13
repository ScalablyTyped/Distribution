package typings
package applicationinsightsLib.outLibraryChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var _buffer: js.Array[java.lang.String] = js.native
  var _lastSend: scala.Double = js.native
  var _sender: applicationinsightsLib.outLibrarySenderMod.^ = js.native
  var _timeoutHandle: js.Any = js.native
  /* protected */ def _getBatchIntervalMs(): scala.Double = js.native
  /* protected */ def _getBatchSize(): scala.Double = js.native
  /* protected */ def _isDisabled(): scala.Boolean = js.native
  /* protected */ def _stringify(envelope: applicationinsightsLib.outDeclarationsContractsMod.Envelope): java.lang.String = js.native
  /**
    * Add a telemetry item to the send buffer
    */
  def send(envelope: applicationinsightsLib.outDeclarationsContractsMod.Envelope): scala.Unit = js.native
  /**
    * Enable or disable disk-backed retry caching to cache events when client is offline (enabled by default)
    * These cached events are stored in your system or user's temporary directory and access restricted to your user when possible.
    * @param value if true events that occured while client is offline will be cached on disk
    * @param resendInterval The wait interval for resending cached events.
    * @param maxBytesOnDisk The maximum size (in bytes) that the created temporary directory for cache events can grow to, before caching is disabled.
    * @returns {Configuration} this class
    */
  def setUseDiskRetryCaching(value: scala.Boolean): scala.Unit = js.native
  def setUseDiskRetryCaching(value: scala.Boolean, resendInterval: scala.Double): scala.Unit = js.native
  def setUseDiskRetryCaching(value: scala.Boolean, resendInterval: scala.Double, maxBytesOnDisk: scala.Double): scala.Unit = js.native
  /**
    * Immediately send buffered data
    */
  def triggerSend(isNodeCrashing: scala.Boolean): scala.Unit = js.native
  def triggerSend(isNodeCrashing: scala.Boolean, callback: js.Function1[/* v */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

