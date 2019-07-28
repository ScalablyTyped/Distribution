package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutableClusterInfo extends js.Object {
  /**
    * 
    Specifies the size of the EBS volume and the ID of the associated broker.
    
    */
  var BrokerEBSVolumeInfo: js.UndefOr[__listOfBrokerEBSVolumeInfo] = js.undefined
  /**
    * 
    Information about the changes in the configuration of the brokers.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ConfigurationInfo] = js.undefined
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined
}

object MutableClusterInfo {
  @scala.inline
  def apply(
    BrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo = null,
    ConfigurationInfo: ConfigurationInfo = null,
    NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined
  ): MutableClusterInfo = {
    val __obj = js.Dynamic.literal()
    if (BrokerEBSVolumeInfo != null) __obj.updateDynamic("BrokerEBSVolumeInfo")(BrokerEBSVolumeInfo)
    if (ConfigurationInfo != null) __obj.updateDynamic("ConfigurationInfo")(ConfigurationInfo)
    if (!js.isUndefined(NumberOfBrokerNodes)) __obj.updateDynamic("NumberOfBrokerNodes")(NumberOfBrokerNodes)
    __obj.asInstanceOf[MutableClusterInfo]
  }
}

