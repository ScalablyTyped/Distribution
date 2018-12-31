package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var isJoi: scala.Boolean
  def validate[T](value: T): ValidationResult[T]
}

