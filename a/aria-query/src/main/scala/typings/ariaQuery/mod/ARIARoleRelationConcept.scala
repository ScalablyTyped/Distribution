package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.`descendant of table`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of details element with the open attribute defined`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of document`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of olComma ul or menu`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIARoleRelationConcept extends js.Object {
  var attributes: js.UndefOr[js.Array[ARIARoleRelationConceptAttribute]] = js.undefined
  // These constraints are drawn from the mapping between ARIA and HTML:
  // https://www.w3.org/TR/html-aria
  var constraints: js.UndefOr[
    js.Array[
      (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`)
    ]
  ] = js.undefined
  var name: String
}

object ARIARoleRelationConcept {
  @scala.inline
  def apply(
    name: String,
    attributes: js.Array[ARIARoleRelationConceptAttribute] = null,
    constraints: js.Array[
      (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`)
    ] = null
  ): ARIARoleRelationConcept = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConcept]
  }
}

