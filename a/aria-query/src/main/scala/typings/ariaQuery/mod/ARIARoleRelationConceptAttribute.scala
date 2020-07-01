package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.Greaterthansign1
import typings.ariaQuery.ariaQueryStrings.unset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIARoleRelationConceptAttribute extends js.Object {
  // These constraints are drawn from the mapping between ARIA and HTML:
  // https://www.w3.org/TR/html-aria
  var constraints: js.UndefOr[js.Array[unset | Greaterthansign1]] = js.undefined
  var name: String
  var value: js.UndefOr[String | Double] = js.undefined
}

object ARIARoleRelationConceptAttribute {
  @scala.inline
  def apply(
    name: String,
    constraints: js.Array[unset | Greaterthansign1] = null,
    value: String | Double = null
  ): ARIARoleRelationConceptAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConceptAttribute]
  }
}

