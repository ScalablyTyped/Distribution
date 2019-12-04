package typings.appDashBuilderDashLib

import typings.tempDashFile.tempDashFileMod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/codesign", JSImport.Namespace)
@js.native
object outCodeSignCodesignMod extends js.Object {
  def downloadCertificate(urlOrBase64: String, tmpDir: TmpDir, currentDir: String): js.Promise[String] = js.native
}

