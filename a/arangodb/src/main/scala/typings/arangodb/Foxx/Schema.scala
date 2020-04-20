package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var isJoi: Boolean
  def validate[T](value: T): ValidationResult[T]
}

object Schema {
  @scala.inline
  def apply(isJoi: Boolean, validate: js.Any => ValidationResult[js.Any]): Schema = {
    val __obj = js.Dynamic.literal(isJoi = isJoi.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Schema]
  }
}

