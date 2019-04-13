package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueryLoggingConfigRequest extends js.Object {
  /**
    * The ID of the configuration that you want to delete. 
    */
  var Id: QueryLoggingConfigId
}

object DeleteQueryLoggingConfigRequest {
  @scala.inline
  def apply(Id: QueryLoggingConfigId): DeleteQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteQueryLoggingConfigRequest]
  }
}

