package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ec2AmiResource extends js.Object {
  /**
    * The ID of the AMI in Amazon EC2.
    */
  var AmiId: awsDashSdkLib.clientsSnowballMod.AmiId
  /**
    * The ID of the AMI on the supported device.
    */
  var SnowballAmiId: js.UndefOr[String] = js.undefined
}

object Ec2AmiResource {
  @scala.inline
  def apply(AmiId: AmiId, SnowballAmiId: String = null): Ec2AmiResource = {
    val __obj = js.Dynamic.literal(AmiId = AmiId)
    if (SnowballAmiId != null) __obj.updateDynamic("SnowballAmiId")(SnowballAmiId)
    __obj.asInstanceOf[Ec2AmiResource]
  }
}

