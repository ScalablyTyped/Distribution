package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityConfigurationRequest extends js.Object {
  /**
    * The encryption configuration for the new security configuration.
    */
  var EncryptionConfiguration: awsDashSdkLib.clientsGlueMod.EncryptionConfiguration
  /**
    * The name for the new security configuration.
    */
  var Name: NameString
}

object CreateSecurityConfigurationRequest {
  @scala.inline
  def apply(EncryptionConfiguration: EncryptionConfiguration, Name: NameString): CreateSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(EncryptionConfiguration = EncryptionConfiguration, Name = Name)
  
    __obj.asInstanceOf[CreateSecurityConfigurationRequest]
  }
}

