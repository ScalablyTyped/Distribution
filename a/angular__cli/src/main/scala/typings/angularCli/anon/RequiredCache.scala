package typings.angularCli.anon

import typings.angularCli.libConfigWorkspaceSchemaMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@angular/cli.@angular/cli/lib/config/workspace-schema.Cache> */
trait RequiredCache extends StObject {
  
  var enabled: Boolean
  
  var environment: Environment
  
  var path: String
}
object RequiredCache {
  
  inline def apply(enabled: Boolean, environment: Environment, path: String): RequiredCache = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredCache]
  }
  
  extension [Self <: RequiredCache](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
