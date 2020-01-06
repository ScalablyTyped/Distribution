package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableClusterInfo extends js.Object {
  /**
    * 
    Specifies the size of the EBS volume and the ID of the associated broker.
    
    */
  var BrokerEBSVolumeInfo: js.UndefOr[__listOfBrokerEBSVolumeInfo] = js.native
  /**
    * 
    Information about the changes in the configuration of the brokers.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ConfigurationInfo] = js.native
  /**
    * 
    Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.EnhancedMonitoring] = js.native
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[__integer] = js.native
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.OpenMonitoring] = js.native
}

object MutableClusterInfo {
  @scala.inline
  def apply(
    BrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo = null,
    ConfigurationInfo: ConfigurationInfo = null,
    EnhancedMonitoring: EnhancedMonitoring = null,
    NumberOfBrokerNodes: Int | Double = null,
    OpenMonitoring: OpenMonitoring = null
  ): MutableClusterInfo = {
    val __obj = js.Dynamic.literal()
    if (BrokerEBSVolumeInfo != null) __obj.updateDynamic("BrokerEBSVolumeInfo")(BrokerEBSVolumeInfo.asInstanceOf[js.Any])
    if (ConfigurationInfo != null) __obj.updateDynamic("ConfigurationInfo")(ConfigurationInfo.asInstanceOf[js.Any])
    if (EnhancedMonitoring != null) __obj.updateDynamic("EnhancedMonitoring")(EnhancedMonitoring.asInstanceOf[js.Any])
    if (NumberOfBrokerNodes != null) __obj.updateDynamic("NumberOfBrokerNodes")(NumberOfBrokerNodes.asInstanceOf[js.Any])
    if (OpenMonitoring != null) __obj.updateDynamic("OpenMonitoring")(OpenMonitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableClusterInfo]
  }
}

