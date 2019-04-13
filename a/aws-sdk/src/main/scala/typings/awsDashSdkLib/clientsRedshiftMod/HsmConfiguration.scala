package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HsmConfiguration extends js.Object {
  /**
    * A text description of the HSM configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The name of the Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: js.UndefOr[String] = js.undefined
  /**
    * The list of tags for the HSM configuration.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
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
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HsmConfigurationIdentifier != null) __obj.updateDynamic("HsmConfigurationIdentifier")(HsmConfigurationIdentifier)
    if (HsmIpAddress != null) __obj.updateDynamic("HsmIpAddress")(HsmIpAddress)
    if (HsmPartitionName != null) __obj.updateDynamic("HsmPartitionName")(HsmPartitionName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[HsmConfiguration]
  }
}

