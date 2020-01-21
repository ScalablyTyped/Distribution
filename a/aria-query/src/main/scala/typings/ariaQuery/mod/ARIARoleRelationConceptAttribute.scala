package typings.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIARoleRelationConceptAttribute extends js.Object {
  var name: String
  var value: js.UndefOr[String] = js.undefined
}

object ARIARoleRelationConceptAttribute {
  @scala.inline
  def apply(name: String, value: String = null): ARIARoleRelationConceptAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConceptAttribute]
  }
}

