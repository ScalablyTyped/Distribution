package typings
package apolloDashUtilitiesLib.libStoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdValue extends js.Object {
  var generated: scala.Boolean
  var id: java.lang.String
  var `type`: apolloDashUtilitiesLib.apolloDashUtilitiesLibStrings.id
  var typename: js.UndefOr[java.lang.String]
}

object IdValue {
  @scala.inline
  def apply(
    generated: scala.Boolean,
    id: java.lang.String,
    `type`: apolloDashUtilitiesLib.apolloDashUtilitiesLibStrings.id,
    typename: java.lang.String = null
  ): IdValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("generated")(generated)
    __obj.updateDynamic("id")(id)
    if (typename != null) __obj.updateDynamic("typename")(typename)
    __obj.asInstanceOf[IdValue]
  }
}

