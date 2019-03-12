package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var isJoi: scala.Boolean
  def validate[T](value: T): ValidationResult[T]
}

object Schema {
  @scala.inline
  def apply(isJoi: scala.Boolean, validate: js.Any => ValidationResult[js.Any]): Schema = {
    val __obj = js.Dynamic.literal(isJoi = isJoi, validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[Schema]
  }
}

