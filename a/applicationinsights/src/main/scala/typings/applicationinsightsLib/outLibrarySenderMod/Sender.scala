package typings
package applicationinsightsLib.outLibrarySenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sender extends js.Object {
  var _config: js.Any = js.native
  var _enableDiskRetryMode: js.Any = js.native
  var _maxBytesOnDisk: scala.Double = js.native
  var _numConsecutiveFailures: js.Any = js.native
  var _onError: js.Any = js.native
  var _onSuccess: js.Any = js.native
  var _resendInterval: scala.Double = js.native
  var _storageDirectory: js.Any = js.native
  /* private */ def _applyACLRules(directory: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def _applyACLRulesSync(directory: js.Any): js.Any = js.native
  /* private */ def _confirmDirExists(directory: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def _getACLArguments(directory: js.Any, identity: js.Any): js.Any = js.native
  /* private */ def _getACLIdentity(callback: js.Any): js.Any = js.native
  /* private */ def _getACLIdentitySync(): js.Any = js.native
  /**
    * Computes the size (in bytes) of all files in a directory at the root level. Asynchronously.
    */
  /* private */ def _getShallowDirectorySize(directory: js.Any, callback: js.Any): js.Any = js.native
  /**
    * Computes the size (in bytes) of all files in a directory at the root level. Synchronously.
    */
  /* private */ def _getShallowDirectorySizeSync(directory: js.Any): js.Any = js.native
  /* private */ def _onErrorHelper(error: js.Any): js.Any = js.native
  /* private */ def _runICACLS(args: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def _runICACLSSync(args: js.Any): js.Any = js.native
  /**
    * Check for temp telemetry files
    * reads the first file if exist, deletes it and tries to send its load
    */
  /* private */ def _sendFirstFileOnDisk(): js.Any = js.native
  /**
    * Stores the payload as a json file on disk in the temp directory
    */
  /* private */ def _storeToDisk(payload: js.Any): js.Any = js.native
  /**
    * Stores the payload as a json file on disk using sync file operations
    * this is used when storing data before crashes
    */
  /* private */ def _storeToDiskSync(payload: js.Any): js.Any = js.native
  def saveOnCrash(payload: java.lang.String): scala.Unit = js.native
  def send(payload: nodeLib.Buffer): scala.Unit = js.native
  def send(payload: nodeLib.Buffer, callback: js.Function1[/* v */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Enable or disable offline mode
    */
  def setDiskRetryMode(value: scala.Boolean): scala.Unit = js.native
  def setDiskRetryMode(value: scala.Boolean, resendInterval: scala.Double): scala.Unit = js.native
  def setDiskRetryMode(value: scala.Boolean, resendInterval: scala.Double, maxBytesOnDisk: scala.Double): scala.Unit = js.native
}

