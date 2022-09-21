package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.Greaterthansign1
import typings.ariaQuery.ariaQueryStrings.unset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARIARoleRelationConceptAttribute extends StObject {
  
  // These constraints are drawn from the mapping between ARIA and HTML:
  // https://www.w3.org/TR/html-aria
  var constraints: js.UndefOr[js.Array[unset | Greaterthansign1]] = js.undefined
  
  var name: String
  
  var value: js.UndefOr[String | Double] = js.undefined
}
object ARIARoleRelationConceptAttribute {
  
  inline def apply(name: String): ARIARoleRelationConceptAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIARoleRelationConceptAttribute]
  }
  
  extension [Self <: ARIARoleRelationConceptAttribute](x: Self) {
    
    inline def setConstraints(value: js.Array[unset | Greaterthansign1]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setConstraintsVarargs(value: (unset | Greaterthansign1)*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
