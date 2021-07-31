package typings.appBuilderLib

import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageDependenciesMod {
  
  @JSImport("app-builder-lib/out/util/packageDependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createLazyProductionDeps(projectDir: String): Lazy[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLazyProductionDeps")(projectDir.asInstanceOf[js.Any]).asInstanceOf[Lazy[js.Array[js.Any]]]
  @scala.inline
  def createLazyProductionDeps(projectDir: String, excludedDependencies: js.Array[String]): Lazy[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLazyProductionDeps")(projectDir.asInstanceOf[js.Any], excludedDependencies.asInstanceOf[js.Any])).asInstanceOf[Lazy[js.Array[js.Any]]]
  
  trait NodeModuleDirInfo extends StObject {
    
    val deps: js.Array[NodeModuleInfo]
    
    val dir: String
  }
  object NodeModuleDirInfo {
    
    @scala.inline
    def apply(deps: js.Array[NodeModuleInfo], dir: String): NodeModuleDirInfo = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeModuleDirInfo]
    }
    
    @scala.inline
    implicit class NodeModuleDirInfoMutableBuilder[Self <: NodeModuleDirInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[NodeModuleInfo]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsVarargs(value: NodeModuleInfo*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeModuleInfo extends StObject {
    
    val name: String
  }
  object NodeModuleInfo {
    
    @scala.inline
    def apply(name: String): NodeModuleInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeModuleInfo]
    }
    
    @scala.inline
    implicit class NodeModuleInfoMutableBuilder[Self <: NodeModuleInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
