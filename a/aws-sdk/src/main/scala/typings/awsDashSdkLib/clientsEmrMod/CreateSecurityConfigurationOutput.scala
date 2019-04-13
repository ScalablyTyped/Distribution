package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityConfigurationOutput extends js.Object {
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: _Date
  /**
    * The name of the security configuration.
    */
  var Name: XmlString
}

object CreateSecurityConfigurationOutput {
  @scala.inline
  def apply(CreationDateTime: _Date, Name: XmlString): CreateSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime, Name = Name)
  
    __obj.asInstanceOf[CreateSecurityConfigurationOutput]
  }
}

