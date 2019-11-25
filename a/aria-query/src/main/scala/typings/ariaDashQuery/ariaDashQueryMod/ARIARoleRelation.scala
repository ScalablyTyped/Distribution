package typings.ariaDashQuery.ariaDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIARoleRelation extends js.Object {
  var concept: js.UndefOr[ARIARoleRelationConcept] = js.undefined
  var module: js.UndefOr[String] = js.undefined
}

object ARIARoleRelation {
  @scala.inline
  def apply(concept: ARIARoleRelationConcept = null, module: String = null): ARIARoleRelation = {
    val __obj = js.Dynamic.literal()
    if (concept != null) __obj.updateDynamic("concept")(concept.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelation]
  }
}

