package typings.angularCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesProjectMod {
  
  @JSImport("@angular/cli/src/utilities/project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findWorkspaceFile(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceFile")().asInstanceOf[String | Null]
  inline def findWorkspaceFile(currentDirectory: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWorkspaceFile")(currentDirectory.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
