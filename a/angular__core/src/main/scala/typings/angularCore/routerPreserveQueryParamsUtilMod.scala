package typings.angularCore

import typings.std.Map
import typings.std.Set
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerPreserveQueryParamsUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/router-preserve-query-params/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findLiteralsToMigrate(sourceFile: SourceFile, typeChecker: TypeChecker): Map[String, Set[ObjectLiteralExpression]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findLiteralsToMigrate")(sourceFile.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[Map[String, Set[ObjectLiteralExpression]]]
  
  inline def migrateLiteral(methodName: String, node: ObjectLiteralExpression): ObjectLiteralExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("migrateLiteral")(methodName.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[ObjectLiteralExpression]
}
