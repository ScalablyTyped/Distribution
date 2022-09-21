package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/util/src/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeSeparators(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSeparators")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def relativePathBetween(from: String, to: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePathBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
