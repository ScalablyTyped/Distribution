package typings.angularCore

import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.Node
import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptSymbolMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/symbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValueSymbolOfDeclaration(node: Node, typeChecker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueSymbolOfDeclaration")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def hasOneOfTypes(typeChecker: TypeChecker, node: Node, types: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOneOfTypes")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNullableType(typeChecker: TypeChecker, node: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNullableType")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isReferenceToImport(typeChecker: TypeChecker, node: Node, importSpecifier: ImportSpecifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferenceToImport")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], importSpecifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
