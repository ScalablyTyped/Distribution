package typings.angularCompilerCli

import typings.std.Set
import typings.typescript.mod.Declaration
import typings.typescript.mod.Node
import typings.typescript.mod.TransformationContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcPatchAliasReferenceResolutionMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/patch_alias_reference_resolution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAliasImportDeclaration(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAliasImportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadIsReferencedAliasDeclarationPatch(context: TransformationContext): Set[Declaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadIsReferencedAliasDeclarationPatch")(context.asInstanceOf[js.Any]).asInstanceOf[Set[Declaration]]
}
