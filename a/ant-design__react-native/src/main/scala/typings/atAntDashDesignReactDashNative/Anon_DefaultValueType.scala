package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueType extends js.Object {
  var defaultValue: String
  var `type`: String
}

object Anon_DefaultValueType {
  @scala.inline
  def apply(defaultValue: String, `type`: String): Anon_DefaultValueType = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValueType]
  }
}

