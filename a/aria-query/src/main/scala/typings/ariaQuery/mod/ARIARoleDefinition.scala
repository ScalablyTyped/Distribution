package typings.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIARoleDefinition extends js.Object {
  /* Abstract roles may not be used in HTML. */
  var `abstract`: Boolean
  /* The concepts in related domains that inform behavior mappings. */
  var baseConcepts: js.Array[ARIARoleRelation]
  /* Child presentational roles strip child nodes of roles and flatten the
    * content to text. */
  var childrenPresentational: Boolean
  /* aria-* properties and states allowed on this role. */
  var props: ARIAPropertyMap
  /* The concepts in related domains that inform behavior mappings. */
  var relatedConcepts: js.Array[ARIARoleRelation]
  /* aria-* properties and states required on this role. */
  var requiredProps: ARIAPropertyMap
  /* An array or super class "stacks." Each stack contains a LIFO list of
    * strings correspond to a super class in the inheritance chain of this
    * role. Roles may have more than one inheritance chain, which is why
    * this property is an array of arrays and not a single array. */
  var superClass: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]
}

object ARIARoleDefinition {
  @scala.inline
  def apply(
    `abstract`: Boolean,
    baseConcepts: js.Array[ARIARoleRelation],
    childrenPresentational: Boolean,
    props: ARIAPropertyMap,
    relatedConcepts: js.Array[ARIARoleRelation],
    requiredProps: ARIAPropertyMap,
    superClass: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]
  ): ARIARoleDefinition = {
    val __obj = js.Dynamic.literal(baseConcepts = baseConcepts.asInstanceOf[js.Any], childrenPresentational = childrenPresentational.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], relatedConcepts = relatedConcepts.asInstanceOf[js.Any], requiredProps = requiredProps.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleDefinition]
  }
}

