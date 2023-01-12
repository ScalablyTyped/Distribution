package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareClassMetadata
  extends StObject
     with R3PartialDeclaration {
  
  /**
    * Optionally specifies the constructor parameters, their types and the Angular decorators of each
    * parameter. This property is omitted if the class does not have a constructor.
    */
  var ctorParameters: js.UndefOr[Expression] = js.undefined
  
  /**
    * The Angular decorators of the class.
    */
  var decorators: Expression
  
  /**
    * Optionally specifies the Angular decorators applied to the class properties. This property is
    * omitted if no properties have any decorators.
    */
  var propDecorators: js.UndefOr[Expression] = js.undefined
}
object R3DeclareClassMetadata {
  
  inline def apply(
    decorators: Expression,
    minVersion: String,
    ngImport: Expression,
    `type`: Expression,
    version: String
  ): R3DeclareClassMetadata = {
    val __obj = js.Dynamic.literal(decorators = decorators.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareClassMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareClassMetadata] (val x: Self) extends AnyVal {
    
    inline def setCtorParameters(value: Expression): Self = StObject.set(x, "ctorParameters", value.asInstanceOf[js.Any])
    
    inline def setCtorParametersUndefined: Self = StObject.set(x, "ctorParameters", js.undefined)
    
    inline def setDecorators(value: Expression): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setPropDecorators(value: Expression): Self = StObject.set(x, "propDecorators", value.asInstanceOf[js.Any])
    
    inline def setPropDecoratorsUndefined: Self = StObject.set(x, "propDecorators", js.undefined)
  }
}
