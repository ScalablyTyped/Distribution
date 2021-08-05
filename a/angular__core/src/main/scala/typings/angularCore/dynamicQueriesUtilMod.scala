package typings.angularCore

import typings.angularCore.anon.RemoveParameter
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicQueriesUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/dynamic-queries/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def identifyDynamicQueryNodes(typeChecker: TypeChecker, sourceFile: SourceFile): RemoveParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("identifyDynamicQueryNodes")(typeChecker.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[RemoveParameter]
  
  inline def removeOptionsParameter(node: CallExpression): CallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOptionsParameter")(node.asInstanceOf[js.Any]).asInstanceOf[CallExpression]
  
  inline def removeStaticFlag(node: ObjectLiteralExpression): ObjectLiteralExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStaticFlag")(node.asInstanceOf[js.Any]).asInstanceOf[ObjectLiteralExpression]
}
