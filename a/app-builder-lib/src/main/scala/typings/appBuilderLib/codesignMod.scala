package typings.appBuilderLib

import typings.tempFile.mod.TmpDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codesignMod {
  
  @JSImport("app-builder-lib/out/codeSign/codesign", "downloadCertificate")
  @js.native
  def downloadCertificate(urlOrBase64: String, tmpDir: TmpDir, currentDir: String): js.Promise[String] = js.native
}
