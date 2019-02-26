package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-iot-device-sdk", "jobs")
@js.native
/**
  * The `jobs` class wraps an instance of the `device` class with additional functionality to
  * handle job execution management through the AWS IoT Jobs platform. Arguments in `deviceOptions`
  * are the same as those in the device class and the `jobs` class supports all of the
  * same events and functions as the `device` class.
  */
class jobs () extends device {
  def this(options: DeviceOptions) = this()
  /**
    * Causes any existing queued job executions for the given thing to be published
    * to the appropriate subscribeToJobs handler. Only needs to be called once per thing.
    *
    * @param thingName - name of the Thing to cancel job execution notifications for
    * @param callback - function (err) callback for when the startJobNotifications operation completes
    */
  def startJobNotifications(thingName: java.lang.String, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): mqttLib.mqttMod.Client = js.native
  /**
    * Subscribes to job execution notifications for the thing named `thingName`. If
    * `operationName` is specified then the callback will only be called when a job
    * ready for execution contains a property called `operation` in its job document with
    * a value matching `operationName`. If `operationName` is omitted then the callback
    * will be called for every job ready for execution that does not match another
    * `subscribeToJobs` subscription.
    *
    * @param thingName - name of the Thing to receive job execution notifications
    * @param operationName - optionally filter job execution notifications to jobs with a value
    *      for the `operation` property that matches `operationName
    * @param callback - function (err, job) callback for when a job execution is ready for processing or an error occurs
    *     - `err` a subscription error or an error that occurs when client is disconnecting
    *     - `job` an object that contains  job execution information and functions for updating job execution status.
    */
  def subscribeToJobs(thingName: java.lang.String, operationName: java.lang.String): scala.Unit = js.native
  def subscribeToJobs(
    thingName: java.lang.String,
    operationName: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* job */ job, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Unsubscribes from job execution notifications for the thing named `thingName` having
    * operations with a value of the given `operationName`. If `operationName` is omitted then
    * the default handler for the thing with the given name is unsubscribed.
    *
    * @param thingName - name of the Thing to cancel job execution notifications for
    * @param operationName - optional name of previously subscribed operation names
    * @param callback - function (err) callback for when the unsubscribe operation completes
    */
  def unsubscribeFromJobs(
    thingName: java.lang.String,
    operationName: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

