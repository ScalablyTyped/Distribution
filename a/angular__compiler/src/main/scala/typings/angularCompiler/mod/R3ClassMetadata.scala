package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3ClassMetadata extends StObject {
  
  /**
    * An expression representing the Angular decorators applied to constructor parameters, or `null`
    * if there is no constructor.
    */
  var ctorParameters: Expression | Null
  
  /**
    * An expression representing the Angular decorators that were applied on the class.
    */
  var decorators: Expression
  
  /**
    * An expression representing the Angular decorators that were applied on the properties of the
    * class, or `null` if no properties have decorators.
    */
  var propDecorators: Expression | Null
  
  /**
    * The class type for which the metadata is captured.
    */
  var `type`: Expression
}
object R3ClassMetadata {
  
  inline def apply(decorators: Expression, `type`: Expression): R3ClassMetadata = {
    val __obj = js.Dynamic.literal(decorators = decorators.asInstanceOf[js.Any], ctorParameters = null, propDecorators = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ClassMetadata]
  }
  
  extension [Self <: R3ClassMetadata](x: Self) {
    
    inline def setCtorParameters(value: Expression): Self = StObject.set(x, "ctorParameters", value.asInstanceOf[js.Any])
    
    inline def setCtorParametersNull: Self = StObject.set(x, "ctorParameters", null)
    
    inline def setDecorators(value: Expression): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setPropDecorators(value: Expression): Self = StObject.set(x, "propDecorators", value.asInstanceOf[js.Any])
    
    inline def setPropDecoratorsNull: Self = StObject.set(x, "propDecorators", null)
    
    inline def setType(value: Expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
