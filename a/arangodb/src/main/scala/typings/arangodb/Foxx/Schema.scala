package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  var isJoi: Boolean = js.native
  def validate[T](value: T): ValidationResult[T] = js.native
}

object Schema {
  @scala.inline
  def apply(isJoi: Boolean, validate: js.Any => ValidationResult[js.Any]): Schema = {
    val __obj = js.Dynamic.literal(isJoi = isJoi.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
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
    def setIsJoi(value: Boolean): Self = this.set("isJoi", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: js.Any => ValidationResult[js.Any]): Self = this.set("validate", js.Any.fromFunction1(value))
  }
  
}

