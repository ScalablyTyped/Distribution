package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareInjectorMetadata
  extends StObject
     with R3PartialDeclaration {
  
  /**
    * The list of imports into the injector.
    */
  var imports: js.UndefOr[js.Array[Expression]] = js.undefined
  
  /**
    * The list of providers provided by the injector.
    */
  var providers: js.UndefOr[Expression] = js.undefined
}
object R3DeclareInjectorMetadata {
  
  inline def apply(minVersion: String, ngImport: Expression, `type`: Expression, version: String): R3DeclareInjectorMetadata = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareInjectorMetadata]
  }
  
  extension [Self <: R3DeclareInjectorMetadata](x: Self) {
    
    inline def setImports(value: js.Array[Expression]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Expression*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
  }
}
