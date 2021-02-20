package typings.angularCore

import typings.std.Map
import typings.std.Set
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerPreserveQueryParamsUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/router-preserve-query-params/util", "findLiteralsToMigrate")
  @js.native
  def findLiteralsToMigrate(sourceFile: SourceFile, typeChecker: TypeChecker): Map[String, Set[ObjectLiteralExpression]] = js.native
  
  @JSImport("@angular/core/schematics/migrations/router-preserve-query-params/util", "migrateLiteral")
  @js.native
  def migrateLiteral(methodName: String, node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}
