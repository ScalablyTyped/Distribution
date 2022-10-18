package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Character
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcLineMappingsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/line_mappings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeLineStartsMap(text: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLineStartsMap")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getLineAndCharacterFromPosition(lineStartsMap: js.Array[Double], position: Double): Character = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineAndCharacterFromPosition")(lineStartsMap.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Character]
}
