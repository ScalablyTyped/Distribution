package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationSetRequest extends js.Object {
  /**
    * A data structure that contains the name of the configuration set.
    */
  var ConfigurationSet: awsDashSdkLib.clientsSesMod.ConfigurationSet
}

object CreateConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSet: ConfigurationSet): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSet = ConfigurationSet)
  
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
}

