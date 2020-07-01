package typings.apolloEngineReporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutableSchema extends js.Object {
  var executableSchema: String
  var executableSchemaId: String
}

object ExecutableSchema {
  @scala.inline
  def apply(executableSchema: String, executableSchemaId: String): ExecutableSchema = {
    val __obj = js.Dynamic.literal(executableSchema = executableSchema.asInstanceOf[js.Any], executableSchemaId = executableSchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableSchema]
  }
}

