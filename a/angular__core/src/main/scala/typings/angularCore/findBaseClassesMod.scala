package typings.angularCore

import typings.angularCore.anon.Identifier
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findBaseClassesMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/find_base_classes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findBaseClassDeclarations(node: ClassDeclaration, typeChecker: TypeChecker): js.Array[Identifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("findBaseClassDeclarations")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[js.Array[Identifier]]
}
