package typings.apolloDashUtilities.libStoreUtilsMod

import typings.apolloDashUtilities.apolloDashUtilitiesStrings.id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdValue extends _StoreValue {
  var generated: Boolean
  var id: String
  var `type`: id
  var typename: js.UndefOr[String] = js.undefined
}

object IdValue {
  @scala.inline
  def apply(generated: Boolean, id: String, `type`: id, typename: String = null): IdValue = {
    val __obj = js.Dynamic.literal(generated = generated, id = id)
    __obj.updateDynamic("type")(`type`)
    if (typename != null) __obj.updateDynamic("typename")(typename)
    __obj.asInstanceOf[IdValue]
  }
}

