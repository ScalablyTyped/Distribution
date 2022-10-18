package typings.appBuilderLib

import typings.tempFile.mod.TmpDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outCodeSignCodesignMod {
  
  @JSImport("app-builder-lib/out/codeSign/codesign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importCertificate(cscLink: String, tmpDir: TmpDir, currentDir: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("importCertificate")(cscLink.asInstanceOf[js.Any], tmpDir.asInstanceOf[js.Any], currentDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
