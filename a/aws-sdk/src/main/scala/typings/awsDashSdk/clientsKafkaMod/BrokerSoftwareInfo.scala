package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerSoftwareInfo extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration used for the cluster. This field isn't visible in this preview release.
    
    */
  var ConfigurationArn: js.UndefOr[__string] = js.undefined
  /**
    * 
    The revision of the configuration to use. This field isn't visible in this preview release.
    
    */
  var ConfigurationRevision: js.UndefOr[__long] = js.undefined
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: js.UndefOr[__string] = js.undefined
}

object BrokerSoftwareInfo {
  @scala.inline
  def apply(
    ConfigurationArn: __string = null,
    ConfigurationRevision: Int | Double = null,
    KafkaVersion: __string = null
  ): BrokerSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationArn != null) __obj.updateDynamic("ConfigurationArn")(ConfigurationArn)
    if (ConfigurationRevision != null) __obj.updateDynamic("ConfigurationRevision")(ConfigurationRevision.asInstanceOf[js.Any])
    if (KafkaVersion != null) __obj.updateDynamic("KafkaVersion")(KafkaVersion)
    __obj.asInstanceOf[BrokerSoftwareInfo]
  }
}

