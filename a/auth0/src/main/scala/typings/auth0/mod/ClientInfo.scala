package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientInfo extends StObject {
  
  var dependencies: js.Array[js.Any]
  
  var environment: js.Array[Environment]
  
  var name: String
  
  var version: String
}
object ClientInfo {
  
  inline def apply(dependencies: js.Array[js.Any], environment: js.Array[Environment], name: String, version: String): ClientInfo = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
  
  extension [Self <: ClientInfo](x: Self) {
    
    inline def setDependencies(value: js.Array[js.Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: js.Any*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    inline def setEnvironment(value: js.Array[Environment]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVarargs(value: Environment*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
