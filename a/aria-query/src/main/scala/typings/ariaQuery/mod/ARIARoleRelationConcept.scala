package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.`descendant of table`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of document`
import typings.ariaQuery.ariaQueryStrings.`direct descendant of olComma ul or menu`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARIARoleRelationConcept extends StObject {
  
  var attributes: js.UndefOr[js.Array[ARIARoleRelationConceptAttribute]] = js.undefined
  
  // These constraints are drawn from the mapping between ARIA and HTML:
  // https://www.w3.org/TR/html-aria
  var constraints: js.UndefOr[
    js.Array[
      (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (/* direct descendant of details element with the open attribute defined */ String) | (`descendant of table`)
    ]
  ] = js.undefined
  
  var name: String
}
object ARIARoleRelationConcept {
  
  inline def apply(name: String): ARIARoleRelationConcept = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConcept]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARIARoleRelationConcept] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[ARIARoleRelationConceptAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: ARIARoleRelationConceptAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setConstraints(
      value: js.Array[
          (`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (/* direct descendant of details element with the open attribute defined */ String) | (`descendant of table`)
        ]
    ): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setConstraintsVarargs(
      value: ((`direct descendant of document`) | (`direct descendant of olComma ul or menu`) | (/* direct descendant of details element with the open attribute defined */ String) | (`descendant of table`))*
    ): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
