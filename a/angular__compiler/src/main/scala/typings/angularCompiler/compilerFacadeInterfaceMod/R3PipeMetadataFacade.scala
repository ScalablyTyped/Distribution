package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3PipeMetadataFacade extends StObject {
  
  var deps: js.Array[R3DependencyMetadataFacade] | Null
  
  var name: String
  
  var pipeName: String
  
  var pure: Boolean
  
  var `type`: js.Any
  
  var typeArgumentCount: Double
}
object R3PipeMetadataFacade {
  
  inline def apply(name: String, pipeName: String, pure: Boolean, `type`: js.Any, typeArgumentCount: Double): R3PipeMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pipeName = pipeName.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PipeMetadataFacade]
  }
  
  extension [Self <: R3PipeMetadataFacade](x: Self) {
    
    inline def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsNull: Self = StObject.set(x, "deps", null)
    
    inline def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPipeName(value: String): Self = StObject.set(x, "pipeName", value.asInstanceOf[js.Any])
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
  }
}
