package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.Greaterthansign1
import typings.ariaQuery.ariaQueryStrings.unset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIARoleRelationConceptAttribute extends js.Object {
  // These constraints are drawn from the mapping between ARIA and HTML:
  // https://www.w3.org/TR/html-aria
  var constraints: js.UndefOr[js.Array[unset | Greaterthansign1]] = js.native
  var name: String = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object ARIARoleRelationConceptAttribute {
  @scala.inline
  def apply(name: String): ARIARoleRelationConceptAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConceptAttribute]
  }
  @scala.inline
  implicit class ARIARoleRelationConceptAttributeOps[Self <: ARIARoleRelationConceptAttribute] (val x: Self) extends AnyVal {
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
    def setConstraintsVarargs(value: (unset | Greaterthansign1)*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[unset | Greaterthansign1]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

