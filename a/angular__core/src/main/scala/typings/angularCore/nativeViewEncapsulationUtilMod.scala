package typings.angularCore

import typings.std.Set
import typings.typescript.mod.Identifier
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeViewEncapsulationUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/native-view-encapsulation/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findNativeEncapsulationNodes(typeChecker: TypeChecker, sourceFile: SourceFile): Set[Identifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNativeEncapsulationNodes")(typeChecker.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Set[Identifier]]
}
