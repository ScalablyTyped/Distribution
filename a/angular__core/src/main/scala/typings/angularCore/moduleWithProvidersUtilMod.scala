package typings.angularCore

import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleWithProvidersUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/module-with-providers/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModuleWithProvidersType(`type`: String): TypeReferenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleWithProvidersType")(`type`.asInstanceOf[js.Any]).asInstanceOf[TypeReferenceNode]
  inline def createModuleWithProvidersType(`type`: String, node: TypeReferenceNode): TypeReferenceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleWithProvidersType")(`type`.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[TypeReferenceNode]
  
  inline def isModuleWithProvidersNotGeneric(typeChecker: TypeChecker, node: Node): /* is typescript.typescript.TypeReferenceNode */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModuleWithProvidersNotGeneric")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[/* is typescript.typescript.TypeReferenceNode */ Boolean]
}
