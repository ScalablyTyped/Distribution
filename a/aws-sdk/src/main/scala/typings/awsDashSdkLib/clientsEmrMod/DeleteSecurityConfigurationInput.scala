package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSecurityConfigurationInput extends js.Object {
  /**
    * The name of the security configuration.
    */
  var Name: XmlString
}

object DeleteSecurityConfigurationInput {
  @scala.inline
  def apply(Name: XmlString): DeleteSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteSecurityConfigurationInput]
  }
}

