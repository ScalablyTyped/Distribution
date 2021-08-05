package typings.angularCore

import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeLinkResolutionUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/relative-link-resolution/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isExtraOptions(typeChecker: TypeChecker, node: Node): /* is typescript.typescript.TypeReferenceNode */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isExtraOptions")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[/* is typescript.typescript.TypeReferenceNode */ Boolean]
  
  inline def isRouterModuleForRoot(typeChecker: TypeChecker, node: Node): /* is typescript.typescript.CallExpression */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRouterModuleForRoot")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[/* is typescript.typescript.CallExpression */ Boolean]
}
