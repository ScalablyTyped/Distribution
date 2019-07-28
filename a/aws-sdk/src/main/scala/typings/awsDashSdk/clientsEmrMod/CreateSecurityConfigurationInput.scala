package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityConfigurationInput extends js.Object {
  /**
    * The name of the security configuration.
    */
  var Name: XmlString
  /**
    * The security configuration details in JSON format. For JSON parameters and examples, see Use Security Configurations to Set Up Cluster Security in the Amazon EMR Management Guide.
    */
  var SecurityConfiguration: String
}

object CreateSecurityConfigurationInput {
  @scala.inline
  def apply(Name: XmlString, SecurityConfiguration: String): CreateSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name, SecurityConfiguration = SecurityConfiguration)
  
    __obj.asInstanceOf[CreateSecurityConfigurationInput]
  }
}

