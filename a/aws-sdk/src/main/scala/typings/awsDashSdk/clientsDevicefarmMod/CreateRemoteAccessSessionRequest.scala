package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRemoteAccessSessionRequest extends js.Object {
  /**
    * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the same clientId value in each call to CreateRemoteAccessSession. This is required only if remoteDebugEnabled is set to true.  Remote debugging is no longer supported. 
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  /**
    * The configuration information for the remote access session request.
    */
  var configuration: js.UndefOr[CreateRemoteAccessSessionConfiguration] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
    */
  var deviceArn: AmazonResourceName
  /**
    * The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access session.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The interaction mode of the remote access session. Valid values are:   INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You cannot run XCUITest framework-based tests in this mode.   NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the fastest test execution speed. You can run XCUITest framework-based tests in this mode.   VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You can run XCUITest framework-based tests and watch the screen in this mode.  
    */
  var interactionMode: js.UndefOr[InteractionMode] = js.undefined
  /**
    * The name of the remote access session that you wish to create.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
    */
  var projectArn: AmazonResourceName
  /**
    * Set to true if you want to access devices remotely for debugging in your remote access session.  Remote debugging is no longer supported. 
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
    */
  var remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * Set to true to enable remote recording for the remote access session.
    */
  var remoteRecordEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to true, for private devices, Device Farm will not sign your app again. For public devices, Device Farm always signs your apps again and this parameter has no effect. For more information about how Device Farm re-signs your app(s), see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[Boolean] = js.undefined
  /**
    *  Ignored. The public key of the ssh key pair you want to use for connecting to remote devices in your remote debugging session. This is only required if remoteDebugEnabled is set to true.  Remote debugging is no longer supported. 
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
}

object CreateRemoteAccessSessionRequest {
  @scala.inline
  def apply(
    deviceArn: AmazonResourceName,
    projectArn: AmazonResourceName,
    clientId: ClientId = null,
    configuration: CreateRemoteAccessSessionConfiguration = null,
    instanceArn: AmazonResourceName = null,
    interactionMode: InteractionMode = null,
    name: Name = null,
    remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
    remoteRecordAppArn: AmazonResourceName = null,
    remoteRecordEnabled: js.UndefOr[Boolean] = js.undefined,
    skipAppResign: js.UndefOr[Boolean] = js.undefined,
    sshPublicKey: SshPublicKey = null
  ): CreateRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(deviceArn = deviceArn, projectArn = projectArn)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (instanceArn != null) __obj.updateDynamic("instanceArn")(instanceArn)
    if (interactionMode != null) __obj.updateDynamic("interactionMode")(interactionMode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(remoteDebugEnabled)) __obj.updateDynamic("remoteDebugEnabled")(remoteDebugEnabled)
    if (remoteRecordAppArn != null) __obj.updateDynamic("remoteRecordAppArn")(remoteRecordAppArn)
    if (!js.isUndefined(remoteRecordEnabled)) __obj.updateDynamic("remoteRecordEnabled")(remoteRecordEnabled)
    if (!js.isUndefined(skipAppResign)) __obj.updateDynamic("skipAppResign")(skipAppResign)
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey)
    __obj.asInstanceOf[CreateRemoteAccessSessionRequest]
  }
}

