package typings.angularCore.collectorMod

import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/module-with-providers/collector", "Collector")
@js.native
class Collector protected () extends js.Object {
  def this(typeChecker: TypeChecker) = this()
  var _visitNgModuleClass: js.Any = js.native
  var resolvedModules: js.Array[ResolvedNgModule] = js.native
  var resolvedNonGenerics: js.Array[TypeReferenceNode] = js.native
  var typeChecker: TypeChecker = js.native
  var visitClassDeclaration: js.Any = js.native
  def visitNode(node: Node): Unit = js.native
}

