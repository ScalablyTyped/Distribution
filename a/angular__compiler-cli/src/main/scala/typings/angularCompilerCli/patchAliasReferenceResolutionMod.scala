package typings.angularCompilerCli

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchAliasReferenceResolutionMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/downlevel_decorators_transform/patch_alias_reference_resolution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAliasImportDeclaration(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAliasImportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
