package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3InjectableMetadata extends StObject {
  
  var deps: js.UndefOr[js.Array[R3DependencyMetadata]] = js.undefined
  
  var name: String
  
  var providedIn: MaybeForwardRefExpression[Expression]
  
  var `type`: R3Reference
  
  var typeArgumentCount: Double
  
  var useClass: js.UndefOr[MaybeForwardRefExpression[Expression]] = js.undefined
  
  var useExisting: js.UndefOr[MaybeForwardRefExpression[Expression]] = js.undefined
  
  var useFactory: js.UndefOr[Expression] = js.undefined
  
  var useValue: js.UndefOr[MaybeForwardRefExpression[Expression]] = js.undefined
}
object R3InjectableMetadata {
  
  inline def apply(
    name: String,
    providedIn: MaybeForwardRefExpression[Expression],
    `type`: R3Reference,
    typeArgumentCount: Double
  ): R3InjectableMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3InjectableMetadata] (val x: Self) extends AnyVal {
    
    inline def setDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvidedIn(value: MaybeForwardRefExpression[Expression]): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    
    inline def setUseClass(value: MaybeForwardRefExpression[Expression]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    inline def setUseExisting(value: MaybeForwardRefExpression[Expression]): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    inline def setUseFactory(value: Expression): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    inline def setUseValue(value: MaybeForwardRefExpression[Expression]): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
