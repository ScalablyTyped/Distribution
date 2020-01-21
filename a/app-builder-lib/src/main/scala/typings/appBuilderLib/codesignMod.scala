package typings.appBuilderLib

import typings.tempFile.mod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/codesign", JSImport.Namespace)
@js.native
object codesignMod extends js.Object {
  def downloadCertificate(urlOrBase64: String, tmpDir: TmpDir, currentDir: String): js.Promise[String] = js.native
}

