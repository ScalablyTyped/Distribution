package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareInjectableMetadata
  extends StObject
     with R3PartialDeclaration {
  
  /**
    * An array of dependencies to support instantiating this injectable via `useClass` or
    * `useFactory`.
    */
  var deps: js.UndefOr[js.Array[R3DeclareDependencyMetadata]] = js.undefined
  
  /**
    * If provided, specifies that the declared injectable belongs to a particular injector:
    * - `InjectorType` such as `NgModule`,
    * - `'root'` the root injector
    * - `'any'` all injectors.
    * If not provided, then it does not belong to any injector. Must be explicitly listed in the
    * providers of an injector.
    */
  var providedIn: js.UndefOr[Expression] = js.undefined
  
  /**
    * If provided, an expression that evaluates to a class to use when creating an instance of this
    * injectable.
    */
  var useClass: js.UndefOr[Expression] = js.undefined
  
  /**
    * If provided, an expression that evaluates to a token of another injectable that this injectable
    * aliases.
    */
  var useExisting: js.UndefOr[Expression] = js.undefined
  
  /**
    * If provided, an expression that evaluates to a function to use when creating an instance of
    * this injectable.
    */
  var useFactory: js.UndefOr[Expression] = js.undefined
  
  /**
    * If provided, an expression that evaluates to the value of the instance of this injectable.
    */
  var useValue: js.UndefOr[Expression] = js.undefined
}
object R3DeclareInjectableMetadata {
  
  inline def apply(minVersion: String, ngImport: Expression, `type`: Expression, version: String): R3DeclareInjectableMetadata = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareInjectableMetadata]
  }
  
  extension [Self <: R3DeclareInjectableMetadata](x: Self) {
    
    inline def setDeps(value: js.Array[R3DeclareDependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: R3DeclareDependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setProvidedIn(value: Expression): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    inline def setUseClass(value: Expression): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    inline def setUseExisting(value: Expression): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    inline def setUseFactory(value: Expression): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    inline def setUseValue(value: Expression): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
