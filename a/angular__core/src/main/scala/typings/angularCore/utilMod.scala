package typings.angularCore

import typings.angularCore.anon.RemoveParameter
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/dynamic-queries/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def identifyDynamicQueryNodes(typeChecker: TypeChecker, sourceFile: SourceFile): RemoveParameter = js.native
  def removeOptionsParameter(node: CallExpression): CallExpression = js.native
  def removeStaticFlag(node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}

