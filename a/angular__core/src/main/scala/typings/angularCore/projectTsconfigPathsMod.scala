package typings.angularCore

import typings.angularCore.anon.BuildPaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectTsconfigPathsMod {
  
  @JSImport("@angular/core/schematics/utils/project_tsconfig_paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getProjectTsConfigPaths(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any
  ): BuildPaths = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectTsConfigPaths")(tree.asInstanceOf[js.Any]).asInstanceOf[BuildPaths]
}
