package typings.apolloEngineReporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutableSchemaId extends js.Object {
  var executableSchema: String
  var executableSchemaId: String
}

object ExecutableSchemaId {
  @scala.inline
  def apply(executableSchema: String, executableSchemaId: String): ExecutableSchemaId = {
    val __obj = js.Dynamic.literal(executableSchema = executableSchema.asInstanceOf[js.Any], executableSchemaId = executableSchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableSchemaId]
  }
}

