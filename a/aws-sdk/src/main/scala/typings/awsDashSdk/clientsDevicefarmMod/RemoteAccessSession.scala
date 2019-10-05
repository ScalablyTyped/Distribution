package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteAccessSession extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the remote access session.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The billing method of the remote access session. Possible values include METERED or UNMETERED. For more information about metered devices, see AWS Device Farm terminology."
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  /**
    * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for the remote access session.  Remote debugging is no longer supported. 
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  /**
    * The date and time the remote access session was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  /**
    * The device (phone or tablet) used in the remote access session.
    */
  var device: js.UndefOr[Device] = js.undefined
  /**
    * The number of minutes a device is used in a remote access session (including setup and teardown minutes).
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined
  /**
    * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote access session.  Remote debugging is no longer supported. 
    */
  var deviceUdid: js.UndefOr[String] = js.undefined
  /**
    * The endpoint for the remote access sesssion.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging is enabled for the remote access session.  Remote debugging is no longer supported. 
    */
  var hostAddress: js.UndefOr[HostAddress] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the instance.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The interaction mode of the remote access session. Valid values are:   INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You cannot run XCUITest framework-based tests in this mode.   NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the fastest test execution speed. You can run XCUITest framework-based tests in this mode.   VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You can run XCUITest framework-based tests and watch the screen in this mode.  
    */
  var interactionMode: js.UndefOr[InteractionMode] = js.undefined
  /**
    * A message about the remote access session.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * The name of the remote access session.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * This flag is set to true if remote debugging is enabled for the remote access session.  Remote debugging is no longer supported. 
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
    */
  var remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * This flag is set to true if remote recording is enabled for the remote access session.
    */
  var remoteRecordEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The result of the remote access session. Can be any of the following:   PENDING: A pending condition.   PASSED: A passing condition.   WARNED: A warning condition.   FAILED: A failed condition.   SKIPPED: A skipped condition.   ERRORED: An error condition.   STOPPED: A stopped condition.  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  /**
    * When set to true, for private devices, Device Farm will not sign your app again. For public devices, Device Farm always signs your apps again and this parameter has no effect. For more information about how Device Farm re-signs your app(s), see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.undefined
  /**
    * The date and time the remote access session was started.
    */
  var started: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of the remote access session. Can be any of the following:   PENDING: A pending status.   PENDING_CONCURRENCY: A pending concurrency status.   PENDING_DEVICE: A pending device status.   PROCESSING: A processing status.   SCHEDULING: A scheduling status.   PREPARING: A preparing status.   RUNNING: A running status.   COMPLETED: A completed status.   STOPPING: A stopping status.  
    */
  var status: js.UndefOr[ExecutionStatus] = js.undefined
  /**
    * The date and time the remote access session was stopped.
    */
  var stopped: js.UndefOr[DateTime] = js.undefined
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
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (created != null) __obj.updateDynamic("created")(created)
    if (device != null) __obj.updateDynamic("device")(device)
    if (deviceMinutes != null) __obj.updateDynamic("deviceMinutes")(deviceMinutes)
    if (deviceUdid != null) __obj.updateDynamic("deviceUdid")(deviceUdid)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (hostAddress != null) __obj.updateDynamic("hostAddress")(hostAddress)
    if (instanceArn != null) __obj.updateDynamic("instanceArn")(instanceArn)
    if (interactionMode != null) __obj.updateDynamic("interactionMode")(interactionMode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(remoteDebugEnabled)) __obj.updateDynamic("remoteDebugEnabled")(remoteDebugEnabled)
    if (remoteRecordAppArn != null) __obj.updateDynamic("remoteRecordAppArn")(remoteRecordAppArn)
    if (!js.isUndefined(remoteRecordEnabled)) __obj.updateDynamic("remoteRecordEnabled")(remoteRecordEnabled)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign)
    if (started != null) __obj.updateDynamic("started")(started)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stopped != null) __obj.updateDynamic("stopped")(stopped)
    __obj.asInstanceOf[RemoteAccessSession]
  }
}

