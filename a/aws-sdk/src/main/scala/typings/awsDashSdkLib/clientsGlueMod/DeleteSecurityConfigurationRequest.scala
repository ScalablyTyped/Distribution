package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSecurityConfigurationRequest extends js.Object {
  /**
    * The name of the security configuration to delete.
    */
  var Name: NameString
}

object DeleteSecurityConfigurationRequest {
  @scala.inline
  def apply(Name: NameString): DeleteSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteSecurityConfigurationRequest]
  }
}

