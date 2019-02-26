package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait job extends js.Object {
  /**
    * The JSON document describing details of the job to be executed eg.
    * {
    *   "operation": "install",
    *   "otherProperty": "value",
    *   ...
    * }
    */
  var document: jobDocument = js.native
  /** Object that contains job execution information and functions for updating job execution status. */
  /** Returns the job id. */
  var id: java.lang.String = js.native
  /**
    * Returns the job operation from the job document. Eg. 'install', 'reboot', etc.
    */
  var operation: java.lang.String = js.native
  /**
    * Returns the current job status according to AWS Orchestra.
    */
  var status: jobStatus = js.native
  /**
    * Update the status of the job execution to be FAILED for the thing associated with the job.
    *
    * @param statusDetails - optional document describing the status details of the in progress job e.g.
    * @param callback - function(err) optional callback for when the operation completes, err is null if no error occurred
    */
  def failed(): scala.Unit = js.native
  def failed(statusDetails: statusDetails): scala.Unit = js.native
  def failed(statusDetails: statusDetails, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Update the status of the job execution to be IN_PROGRESS for the thing associated with the job.
    *
    * @param statusDetails - optional document describing the status details of the in progress job
    * @param callback - function(err) optional callback for when the operation completes, err is null if no error occurred
    */
  def inProgress(): scala.Unit = js.native
  def inProgress(statusDetails: statusDetails): scala.Unit = js.native
  def inProgress(statusDetails: statusDetails, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Update the status of the job execution to be SUCCESS for the thing associated with the job.
    *
    * @param statusDetails - optional document describing the status details of the in progress job e.g.
    * @param callback - function(err) optional callback for when the operation completes, err is null if no error occurred
    */
  def succeeded(): scala.Unit = js.native
  def succeeded(statusDetails: statusDetails): scala.Unit = js.native
  def succeeded(statusDetails: statusDetails, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

