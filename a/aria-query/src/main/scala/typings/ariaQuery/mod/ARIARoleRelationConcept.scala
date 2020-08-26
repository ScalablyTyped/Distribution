package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.`descendant of table`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of details element with the open attribute defined`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of document`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of olComma ul or menu`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIARoleRelationConcept extends js.Object {
  var attributes: js.UndefOr[js.Array[ARIARoleRelationConceptAttribute]] = js.native
  // These constraints are drawn from the mapping between ARIA and HTML:
  // https://www.w3.org/TR/html-aria
  var constraints: js.UndefOr[
    js.Array[
      (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`)
    ]
  ] = js.native
  var name: String = js.native
}

object ARIARoleRelationConcept {
  @scala.inline
  def apply(name: String): ARIARoleRelationConcept = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConcept]
  }
  @scala.inline
  implicit class ARIARoleRelationConceptOps[Self <: ARIARoleRelationConcept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: ARIARoleRelationConceptAttribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[ARIARoleRelationConceptAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setConstraintsVarargs(
      value: ((`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`))*
    ): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(
      value: js.Array[
          (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (`direct descendant of details element with the open attribute defined`) | (`descendant of table`)
        ]
    ): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
  }
  
}

