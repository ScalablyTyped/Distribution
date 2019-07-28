package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSecurityProfileRequest extends js.Object {
  /**
    * The name of the security profile whose information you want to get.
    */
  var securityProfileName: SecurityProfileName
}

object DescribeSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): DescribeSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName)
  
    __obj.asInstanceOf[DescribeSecurityProfileRequest]
  }
}

