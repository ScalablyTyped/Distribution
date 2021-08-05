package typings.ariaQuery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARIARoleDefinition extends StObject {
  
  /* Abstract roles may not be used in HTML. */
  var `abstract`: Boolean
  
  /* The concepts in related domains that inform behavior mappings. */
  var baseConcepts: js.Array[ARIARoleRelation]
  
  /* Child presentational roles strip child nodes of roles and flatten the
    * content to text. */
  var childrenPresentational: Boolean
  
  /* aria-* properties and states disallowed on this role. */
  var prohibitedProps: ARIAPropertyMap
  
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
  
  inline def apply(
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
  
  extension [Self <: ARIARoleDefinition](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setBaseConcepts(value: js.Array[ARIARoleRelation]): Self = StObject.set(x, "baseConcepts", value.asInstanceOf[js.Any])
    
    inline def setBaseConceptsVarargs(value: ARIARoleRelation*): Self = StObject.set(x, "baseConcepts", js.Array(value :_*))
    
    inline def setChildrenPresentational(value: Boolean): Self = StObject.set(x, "childrenPresentational", value.asInstanceOf[js.Any])
    
    inline def setProhibitedProps(value: ARIAPropertyMap): Self = StObject.set(x, "prohibitedProps", value.asInstanceOf[js.Any])
    
    inline def setProps(value: ARIAPropertyMap): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRelatedConcepts(value: js.Array[ARIARoleRelation]): Self = StObject.set(x, "relatedConcepts", value.asInstanceOf[js.Any])
    
    inline def setRelatedConceptsVarargs(value: ARIARoleRelation*): Self = StObject.set(x, "relatedConcepts", js.Array(value :_*))
    
    inline def setRequiredProps(value: ARIAPropertyMap): Self = StObject.set(x, "requiredProps", value.asInstanceOf[js.Any])
    
    inline def setSuperClass(value: js.Array[js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole]]): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    inline def setSuperClassVarargs(value: (js.Array[ARIAAbstractRole | ARIARole | ARIADPubRole])*): Self = StObject.set(x, "superClass", js.Array(value :_*))
  }
}
