package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerEBSVolumeInfo extends js.Object {
  /**
    * 
    The ID of the broker to update.
    
    */
  var KafkaBrokerNodeId: __string
  /**
    * 
    Size of the EBS volume to update.
    
    */
  var VolumeSizeGB: __integer
}

object BrokerEBSVolumeInfo {
  @scala.inline
  def apply(KafkaBrokerNodeId: __string, VolumeSizeGB: __integer): BrokerEBSVolumeInfo = {
    val __obj = js.Dynamic.literal(KafkaBrokerNodeId = KafkaBrokerNodeId, VolumeSizeGB = VolumeSizeGB)
  
    __obj.asInstanceOf[BrokerEBSVolumeInfo]
  }
}

