package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfiguration extends js.Object {
  /**
    * If this field is specified, this access point will only allow connections from the specified VPC ID.
    */
  var VpcId: typings.awsDashSdk.clientsS3controlMod.VpcId = js.native
}

object VpcConfiguration {
  @scala.inline
  def apply(VpcId: VpcId): VpcConfiguration = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcConfiguration]
  }
}

