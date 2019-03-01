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
  def apply(isJoi: scala.Boolean, validate: js.Function1[js.Any, ValidationResult[js.Any]]): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isJoi")(isJoi)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Schema]
  }
}

