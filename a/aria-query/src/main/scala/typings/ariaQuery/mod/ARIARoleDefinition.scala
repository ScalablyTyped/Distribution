package typings.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIARoleDefinition extends js.Object {
  /* Abstract roles may not be used in HTML. */
  var `abstract`: Boolean = js.native
  /* The concepts in related domains that inform behavior mappings. */
  var baseConcepts: js.Array[ARIARoleRelation] = js.native
  /* Child presentational roles strip child nodes of roles and flatten the
    * content to text. */
  var childrenPresentational: Boolean = js.native
  /* aria-* properties and states disallowed on this role. */
  var prohibitedProps: ARIAPropertyMap = js.native
  /* aria-* properties and states allowed on this role. */
  var props: ARIAPropertyMap = js.native
  /* The concepts in related domains that inform behavior mappings. */
  var relatedConcepts: js.Array[ARIARoleRelation] = js.native
  /* aria-* properties and states required on this role. */
  var requiredProps: ARIAPropertyMap = js.native
  /* An array or super class "stacks." Each stack contains a LIFO list of
    * strings correspond to a super class in the inheritance chain of this
    * role. Roles may have more than one inheritance chain, which is why
    * this property is an array of arrays and not a single array. */
  var superClass: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]] = js.native
}

object ARIARoleDefinition {
  @scala.inline
  def apply(
    `abstract`: Boolean,
    baseConcepts: js.Array[ARIARoleRelation],
    childrenPresentational: Boolean,
    prohibitedProps: ARIAPropertyMap,
    props: ARIAPropertyMap,
    relatedConcepts: js.Array[ARIARoleRelation],
    requiredProps: ARIAPropertyMap,
    superClass: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]
  ): ARIARoleDefinition = {
    val __obj = js.Dynamic.literal(baseConcepts = baseConcepts.asInstanceOf[js.Any], childrenPresentational = childrenPresentational.asInstanceOf[js.Any], prohibitedProps = prohibitedProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], relatedConcepts = relatedConcepts.asInstanceOf[js.Any], requiredProps = requiredProps.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleDefinition]
  }
  @scala.inline
  implicit class ARIARoleDefinitionOps[Self <: ARIARoleDefinition] (val x: Self) extends AnyVal {
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
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseConceptsVarargs(value: ARIARoleRelation*): Self = this.set("baseConcepts", js.Array(value :_*))
    @scala.inline
    def setBaseConcepts(value: js.Array[ARIARoleRelation]): Self = this.set("baseConcepts", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenPresentational(value: Boolean): Self = this.set("childrenPresentational", value.asInstanceOf[js.Any])
    @scala.inline
    def setProhibitedProps(value: ARIAPropertyMap): Self = this.set("prohibitedProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: ARIAPropertyMap): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedConceptsVarargs(value: ARIARoleRelation*): Self = this.set("relatedConcepts", js.Array(value :_*))
    @scala.inline
    def setRelatedConcepts(value: js.Array[ARIARoleRelation]): Self = this.set("relatedConcepts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredProps(value: ARIAPropertyMap): Self = this.set("requiredProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperClassVarargs(value: (js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole])*): Self = this.set("superClass", js.Array(value :_*))
    @scala.inline
    def setSuperClass(value: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]): Self = this.set("superClass", value.asInstanceOf[js.Any])
  }
  
}

