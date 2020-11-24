package typings.angularCore

import typings.std.Map
import typings.std.Set
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/navigation-extras-omissions/util", JSImport.Namespace)
@js.native
object navigationExtrasOmissionsUtilMod extends js.Object {
  
  def findLiteralsToMigrate(sourceFile: SourceFile, typeChecker: TypeChecker): Map[String, Set[ObjectLiteralExpression]] = js.native
  
  def migrateLiteral(methodName: String, node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}
