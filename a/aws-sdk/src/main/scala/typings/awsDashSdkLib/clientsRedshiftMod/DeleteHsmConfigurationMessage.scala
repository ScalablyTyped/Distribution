package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHsmConfigurationMessage extends js.Object {
  /**
    * The identifier of the Amazon Redshift HSM configuration to be deleted.
    */
  var HsmConfigurationIdentifier: String
}

object DeleteHsmConfigurationMessage {
  @scala.inline
  def apply(HsmConfigurationIdentifier: String): DeleteHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(HsmConfigurationIdentifier = HsmConfigurationIdentifier)
  
    __obj.asInstanceOf[DeleteHsmConfigurationMessage]
  }
}

