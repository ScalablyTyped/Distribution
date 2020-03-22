package typings.angularCore

import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/dynamic-queries/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def identifyDynamicQueryNodes(typeChecker: TypeChecker, sourceFile: SourceFile): AnonRemoveParameter = js.native
  def removeOptionsParameter(node: CallExpression): CallExpression = js.native
  def removeStaticFlag(node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}

