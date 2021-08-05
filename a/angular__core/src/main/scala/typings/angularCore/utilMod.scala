package typings.angularCore

import typings.typescript.mod.PropertyAccessExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@angular/core/schematics/migrations/abstract-control-parent/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findParentAccesses(typeChecker: TypeChecker, sourceFile: SourceFile): js.Array[PropertyAccessExpression] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParentAccesses")(typeChecker.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertyAccessExpression]]
}
