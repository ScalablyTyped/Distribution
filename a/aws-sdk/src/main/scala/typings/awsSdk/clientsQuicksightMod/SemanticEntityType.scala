package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticEntityType extends StObject {
  
  /**
    * The semantic entity sub type name.
    */
  var SubTypeName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The semantic entity type name.
    */
  var TypeName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The semantic entity type parameters.
    */
  var TypeParameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TypeParameters] = js.undefined
}
object SemanticEntityType {
  
  inline def apply(): SemanticEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticEntityType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticEntityType] (val x: Self) extends AnyVal {
    
    inline def setSubTypeName(value: LimitedString): Self = StObject.set(x, "SubTypeName", value.asInstanceOf[js.Any])
    
    inline def setSubTypeNameUndefined: Self = StObject.set(x, "SubTypeName", js.undefined)
    
    inline def setTypeName(value: LimitedString): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeParameters(value: TypeParameters): Self = StObject.set(x, "TypeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "TypeParameters", js.undefined)
  }
}
