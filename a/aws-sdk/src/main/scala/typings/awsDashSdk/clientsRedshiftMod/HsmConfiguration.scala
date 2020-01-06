package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmConfiguration extends js.Object {
  /**
    * A text description of the HSM configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.native
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: js.UndefOr[String] = js.native
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: js.UndefOr[String] = js.native
  /**
    * The list of tags for the HSM configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object HsmConfiguration {
  @scala.inline
  def apply(
    Description: String = null,
    HsmConfigurationIdentifier: String = null,
    HsmIpAddress: String = null,
    HsmPartitionName: String = null,
    Tags: TagList = null
  ): HsmConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HsmConfigurationIdentifier != null) __obj.updateDynamic("HsmConfigurationIdentifier")(HsmConfigurationIdentifier.asInstanceOf[js.Any])
    if (HsmIpAddress != null) __obj.updateDynamic("HsmIpAddress")(HsmIpAddress.asInstanceOf[js.Any])
    if (HsmPartitionName != null) __obj.updateDynamic("HsmPartitionName")(HsmPartitionName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HsmConfiguration]
  }
}

