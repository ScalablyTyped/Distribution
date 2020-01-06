package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueryLoggingConfigRequest extends js.Object {
  /**
    * The ID of the configuration that you want to delete. 
    */
  var Id: QueryLoggingConfigId = js.native
}

object DeleteQueryLoggingConfigRequest {
  @scala.inline
  def apply(Id: QueryLoggingConfigId): DeleteQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteQueryLoggingConfigRequest]
  }
}

