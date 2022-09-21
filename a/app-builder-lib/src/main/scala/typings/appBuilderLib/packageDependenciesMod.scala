package typings.appBuilderLib

import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageDependenciesMod {
  
  @JSImport("app-builder-lib/out/util/packageDependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLazyProductionDeps(projectDir: String): Lazy[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLazyProductionDeps")(projectDir.asInstanceOf[js.Any]).asInstanceOf[Lazy[js.Array[Any]]]
  inline def createLazyProductionDeps(projectDir: String, excludedDependencies: js.Array[String]): Lazy[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLazyProductionDeps")(projectDir.asInstanceOf[js.Any], excludedDependencies.asInstanceOf[js.Any])).asInstanceOf[Lazy[js.Array[Any]]]
  
  trait NodeModuleDirInfo extends StObject {
    
    val deps: js.Array[NodeModuleInfo]
    
    val dir: String
  }
  object NodeModuleDirInfo {
    
    inline def apply(deps: js.Array[NodeModuleInfo], dir: String): NodeModuleDirInfo = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeModuleDirInfo]
    }
    
    extension [Self <: NodeModuleDirInfo](x: Self) {
      
      inline def setDeps(value: js.Array[NodeModuleInfo]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsVarargs(value: NodeModuleInfo*): Self = StObject.set(x, "deps", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeModuleInfo extends StObject {
    
    val name: String
  }
  object NodeModuleInfo {
    
    inline def apply(name: String): NodeModuleInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeModuleInfo]
    }
    
    extension [Self <: NodeModuleInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
