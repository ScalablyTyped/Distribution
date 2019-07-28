package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterInstanceRequest extends js.Object {
  /**
    * The instance's hostname.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  /**
    * An InstanceIdentity object that contains the instance's identity.
    */
  var InstanceIdentity: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.InstanceIdentity] = js.undefined
  /**
    * The instance's private IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.undefined
  /**
    * The instance's public IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  /**
    * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
    */
  var RsaPublicKey: js.UndefOr[String] = js.undefined
  /**
    * The instances public RSA key fingerprint.
    */
  var RsaPublicKeyFingerprint: js.UndefOr[String] = js.undefined
  /**
    * The ID of the stack that the instance is to be registered with.
    */
  var StackId: String
}

object RegisterInstanceRequest {
  @scala.inline
  def apply(
    StackId: String,
    Hostname: String = null,
    InstanceIdentity: InstanceIdentity = null,
    PrivateIp: String = null,
    PublicIp: String = null,
    RsaPublicKey: String = null,
    RsaPublicKeyFingerprint: String = null
  ): RegisterInstanceRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname)
    if (InstanceIdentity != null) __obj.updateDynamic("InstanceIdentity")(InstanceIdentity)
    if (PrivateIp != null) __obj.updateDynamic("PrivateIp")(PrivateIp)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    if (RsaPublicKey != null) __obj.updateDynamic("RsaPublicKey")(RsaPublicKey)
    if (RsaPublicKeyFingerprint != null) __obj.updateDynamic("RsaPublicKeyFingerprint")(RsaPublicKeyFingerprint)
    __obj.asInstanceOf[RegisterInstanceRequest]
  }
}

