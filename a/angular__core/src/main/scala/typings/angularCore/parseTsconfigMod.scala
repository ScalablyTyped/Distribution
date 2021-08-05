package typings.angularCore

import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseTsconfigMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/parse_tsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseTsconfigFile(tsconfigPath: String, basePath: String): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTsconfigFile")(tsconfigPath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]
}
