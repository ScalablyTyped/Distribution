package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityConfigurationRequest extends js.Object {
  /**
    * The name of the security configuration to retrieve.
    */
  var Name: NameString = js.native
}

object GetSecurityConfigurationRequest {
  @scala.inline
  def apply(Name: NameString): GetSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSecurityConfigurationRequest]
  }
}

