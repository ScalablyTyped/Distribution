package typings.angularCore

import typings.angularCore.anon.RemoveParameter
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicQueriesUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/dynamic-queries/util", "identifyDynamicQueryNodes")
  @js.native
  def identifyDynamicQueryNodes(typeChecker: TypeChecker, sourceFile: SourceFile): RemoveParameter = js.native
  
  @JSImport("@angular/core/schematics/migrations/dynamic-queries/util", "removeOptionsParameter")
  @js.native
  def removeOptionsParameter(node: CallExpression): CallExpression = js.native
  
  @JSImport("@angular/core/schematics/migrations/dynamic-queries/util", "removeStaticFlag")
  @js.native
  def removeStaticFlag(node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}
