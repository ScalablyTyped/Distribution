package typings.appBuilderLib

import typings.tempFile.mod.TmpDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codesignMod {
  
  @JSImport("app-builder-lib/out/codeSign/codesign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def downloadCertificate(urlOrBase64: String, tmpDir: TmpDir, currentDir: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadCertificate")(urlOrBase64.asInstanceOf[js.Any], tmpDir.asInstanceOf[js.Any], currentDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
