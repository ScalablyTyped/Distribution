package typings.angularCore

import typings.std.Set
import typings.typescript.mod.Identifier
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/native-view-encapsulation/util", JSImport.Namespace)
@js.native
object nativeViewEncapsulationUtilMod extends js.Object {
  
  def findNativeEncapsulationNodes(typeChecker: TypeChecker, sourceFile: SourceFile): Set[Identifier] = js.native
}
