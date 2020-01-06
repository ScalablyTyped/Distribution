package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoggerDefinitionRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: __string = js.native
}

object DeleteLoggerDefinitionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: __string): DeleteLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLoggerDefinitionRequest]
  }
}

