package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledType extends js.Object {
  var disabled: scala.Boolean
  var `type`: java.lang.String
}

object Anon_DisabledType {
  @scala.inline
  def apply(disabled: scala.Boolean, `type`: java.lang.String): Anon_DisabledType = {
    val __obj = js.Dynamic.literal(disabled = disabled)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DisabledType]
  }
}

