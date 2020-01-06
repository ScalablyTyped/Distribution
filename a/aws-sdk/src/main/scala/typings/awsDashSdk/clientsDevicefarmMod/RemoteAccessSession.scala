package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteAccessSession extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the remote access session.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The billing method of the remote access session. Possible values include METERED or UNMETERED. For more information about metered devices, see AWS Device Farm terminology.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  /**
    * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * The date and time the remote access session was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * The device (phone or tablet) used in the remote access session.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * The number of minutes a device is used in a remote access session (including setup and teardown minutes).
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  /**
    * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var deviceUdid: js.UndefOr[String] = js.native
  /**
    * The endpoint for the remote access sesssion.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var hostAddress: js.UndefOr[HostAddress] = js.native
  /**
    * The ARN of the instance.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The interaction mode of the remote access session. Valid values are:   INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You cannot run XCUITest framework-based tests in this mode.   NO_VIDEO: You are connected to the device, but cannot interact with it or view the screen. This mode has the fastest test execution speed. You can run XCUITest framework-based tests in this mode.   VIDEO_ONLY: You can view the screen, but cannot touch or rotate it. You can run XCUITest framework-based tests and watch the screen in this mode.  
    */
  var interactionMode: js.UndefOr[InteractionMode] = js.native
  /**
    * A message about the remote access session.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The name of the remote access session.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * This flag is set to true if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The ARN for the app to be recorded in the remote access session.
    */
  var remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * This flag is set to true if remote recording is enabled for the remote access session.
    */
  var remoteRecordEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The result of the remote access session. Can be any of the following:   PENDING.   PASSED.   WARNED.   FAILED.   SKIPPED.   ERRORED.   STOPPED.  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  /**
    * The date and time the remote access session was started.
    */
  var started: js.UndefOr[DateTime] = js.native
  /**
    * The status of the remote access session. Can be any of the following:   PENDING.   PENDING_CONCURRENCY.   PENDING_DEVICE.   PROCESSING.   SCHEDULING.   PREPARING.   RUNNING.   COMPLETED.   STOPPING.  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  /**
    * The date and time the remote access session was stopped.
    */
  var stopped: js.UndefOr[DateTime] = js.native
}

object RemoteAccessSession {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    billingMethod: BillingMethod = null,
    clientId: ClientId = null,
    created: DateTime = null,
    device: Device = null,
    deviceMinutes: DeviceMinutes = null,
    deviceUdid: String = null,
    endpoint: String = null,
    hostAddress: HostAddress = null,
    instanceArn: AmazonResourceName = null,
    interactionMode: InteractionMode = null,
    message: Message = null,
    name: Name = null,
    remoteDebugEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    remoteRecordAppArn: AmazonResourceName = null,
    remoteRecordEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    result: ExecutionResult = null,
    skipAppResign: js.UndefOr[scala.Boolean] = js.undefined,
    started: DateTime = null,
    status: ExecutionStatus = null,
    stopped: DateTime = null
  ): RemoteAccessSession = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (deviceMinutes != null) __obj.updateDynamic("deviceMinutes")(deviceMinutes.asInstanceOf[js.Any])
    if (deviceUdid != null) __obj.updateDynamic("deviceUdid")(deviceUdid.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (hostAddress != null) __obj.updateDynamic("hostAddress")(hostAddress.asInstanceOf[js.Any])
    if (instanceArn != null) __obj.updateDynamic("instanceArn")(instanceArn.asInstanceOf[js.Any])
    if (interactionMode != null) __obj.updateDynamic("interactionMode")(interactionMode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteDebugEnabled)) __obj.updateDynamic("remoteDebugEnabled")(remoteDebugEnabled.asInstanceOf[js.Any])
    if (remoteRecordAppArn != null) __obj.updateDynamic("remoteRecordAppArn")(remoteRecordAppArn.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteRecordEnabled)) __obj.updateDynamic("remoteRecordEnabled")(remoteRecordEnabled.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteAccessSession]
  }
}

