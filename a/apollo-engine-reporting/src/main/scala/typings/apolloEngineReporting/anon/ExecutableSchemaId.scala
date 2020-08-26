package typings.apolloEngineReporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutableSchemaId extends js.Object {
  var executableSchema: String = js.native
  var executableSchemaId: String = js.native
}

object ExecutableSchemaId {
  @scala.inline
  def apply(executableSchema: String, executableSchemaId: String): ExecutableSchemaId = {
    val __obj = js.Dynamic.literal(executableSchema = executableSchema.asInstanceOf[js.Any], executableSchemaId = executableSchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableSchemaId]
  }
  @scala.inline
  implicit class ExecutableSchemaIdOps[Self <: ExecutableSchemaId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecutableSchema(value: String): Self = this.set("executableSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutableSchemaId(value: String): Self = this.set("executableSchemaId", value.asInstanceOf[js.Any])
  }
  
}

