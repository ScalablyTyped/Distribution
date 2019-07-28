package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHsmConfigurationMessage extends js.Object {
  /**
    * A text description of the HSM configuration to be created.
    */
  var Description: String
  /**
    * The identifier to be assigned to the new Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: String
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: String
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: String
  /**
    * The password required to access the HSM partition.
    */
  var HsmPartitionPassword: String
  /**
    * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
    */
  var HsmServerPublicCertificate: String
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateHsmConfigurationMessage {
  @scala.inline
  def apply(
    Description: String,
    HsmConfigurationIdentifier: String,
    HsmIpAddress: String,
    HsmPartitionName: String,
    HsmPartitionPassword: String,
    HsmServerPublicCertificate: String,
    Tags: TagList = null
  ): CreateHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(Description = Description, HsmConfigurationIdentifier = HsmConfigurationIdentifier, HsmIpAddress = HsmIpAddress, HsmPartitionName = HsmPartitionName, HsmPartitionPassword = HsmPartitionPassword, HsmServerPublicCertificate = HsmServerPublicCertificate)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateHsmConfigurationMessage]
  }
}

