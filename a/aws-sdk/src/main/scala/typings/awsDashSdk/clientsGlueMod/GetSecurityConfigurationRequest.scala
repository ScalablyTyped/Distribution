package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityConfigurationRequest extends js.Object {
  /**
    * The name of the security configuration to retrieve.
    */
  var Name: NameString
}

object GetSecurityConfigurationRequest {
  @scala.inline
  def apply(Name: NameString): GetSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetSecurityConfigurationRequest]
  }
}

