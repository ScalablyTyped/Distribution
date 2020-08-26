package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  var forClient: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  var fromClient: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  var schema: Schema = js.native
}

object Model {
  @scala.inline
  def apply(schema: Schema): Model = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setSchema(value: Schema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setForClient(value: /* value */ js.Any => _): Self = this.set("forClient", js.Any.fromFunction1(value))
    @scala.inline
    def deleteForClient: Self = this.set("forClient", js.undefined)
    @scala.inline
    def setFromClient(value: /* value */ js.Any => _): Self = this.set("fromClient", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFromClient: Self = this.set("fromClient", js.undefined)
  }
  
}

