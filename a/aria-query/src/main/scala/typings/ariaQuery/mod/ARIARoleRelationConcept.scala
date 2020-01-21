package typings.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIARoleRelationConcept extends js.Object {
  var attributes: js.UndefOr[js.Array[ARIARoleRelationConceptAttribute]] = js.undefined
  var name: String
}

object ARIARoleRelationConcept {
  @scala.inline
  def apply(name: String, attributes: js.Array[ARIARoleRelationConceptAttribute] = null): ARIARoleRelationConcept = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConcept]
  }
}

