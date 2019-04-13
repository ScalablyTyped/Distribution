package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoggerDefinitionRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: __string
}

object DeleteLoggerDefinitionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: __string): DeleteLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId)
  
    __obj.asInstanceOf[DeleteLoggerDefinitionRequest]
  }
}

