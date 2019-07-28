package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAccessDetails extends js.Object {
  /**
    * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey-cert.pub.
    */
  var certKey: js.UndefOr[String] = js.undefined
  /**
    * For SSH access, the date on which the temporary keys expire.
    */
  var expiresAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * Describes the public SSH host keys or the RDP certificate.
    */
  var hostKeys: js.UndefOr[HostKeysList] = js.undefined
  /**
    * The name of this Amazon Lightsail instance.
    */
  var instanceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The public IP address of the Amazon Lightsail instance.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you create an instance using any key pair other than the default (LightsailDefaultKeyPair), password will always be an empty string. If you change the Administrator password on the instance, Lightsail will continue to return the original password value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only needed if password is empty and the instance is not new (and therefore the password is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
    */
  var passwordData: js.UndefOr[PasswordData] = js.undefined
  /**
    * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey).
    */
  var privateKey: js.UndefOr[String] = js.undefined
  /**
    * The protocol for these Amazon Lightsail instance access details.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined
  /**
    * The user name to use when logging in to the Amazon Lightsail instance.
    */
  var username: js.UndefOr[String] = js.undefined
}

object InstanceAccessDetails {
  @scala.inline
  def apply(
    certKey: String = null,
    expiresAt: IsoDate = null,
    hostKeys: HostKeysList = null,
    instanceName: ResourceName = null,
    ipAddress: IpAddress = null,
    password: String = null,
    passwordData: PasswordData = null,
    privateKey: String = null,
    protocol: InstanceAccessProtocol = null,
    username: String = null
  ): InstanceAccessDetails = {
    val __obj = js.Dynamic.literal()
    if (certKey != null) __obj.updateDynamic("certKey")(certKey)
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (hostKeys != null) __obj.updateDynamic("hostKeys")(hostKeys)
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (password != null) __obj.updateDynamic("password")(password)
    if (passwordData != null) __obj.updateDynamic("passwordData")(passwordData)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[InstanceAccessDetails]
  }
}

