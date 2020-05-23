package typings.angularCore

import typings.angularCore.anon.Identifier
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/typescript/find_base_classes", JSImport.Namespace)
@js.native
object findBaseClassesMod extends js.Object {
  def findBaseClassDeclarations(node: ClassDeclaration, typeChecker: TypeChecker): js.Array[Identifier] = js.native
}

