package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.R3Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@angular/compiler.@angular/compiler.R3InjectorMetadata, 'imports'> */
trait OmitR3InjectorMetadataimp extends StObject {
  
  var name: String
  
  var providers: js.UndefOr[Expression | Null] = js.undefined
  
  var `type`: R3Reference
}
object OmitR3InjectorMetadataimp {
  
  inline def apply(name: String, `type`: R3Reference): OmitR3InjectorMetadataimp = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitR3InjectorMetadataimp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitR3InjectorMetadataimp] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersNull: Self = StObject.set(x, "providers", null)
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
