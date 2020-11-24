package typings.appBuilderLib.windowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "getCertInfo")
@js.native
object getCertInfo extends js.Object {
  
  def apply(file: String, password: String): js.Promise[CertificateInfo] = js.native
}
