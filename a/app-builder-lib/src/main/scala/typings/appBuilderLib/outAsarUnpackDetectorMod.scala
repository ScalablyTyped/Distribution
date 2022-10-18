package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAsarUnpackDetectorMod {
  
  @JSImport("app-builder-lib/out/asar/unpackDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLibOrExe(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLibOrExe")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
