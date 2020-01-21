package typings.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/macCodeSign", "findIdentity")
@js.native
object findIdentity extends js.Object {
  def apply(certType: CertType): js.Promise[Identity | Null] = js.native
  def apply(certType: CertType, qualifier: String): js.Promise[Identity | Null] = js.native
  def apply(certType: CertType, qualifier: String, keychain: String): js.Promise[Identity | Null] = js.native
  def apply(certType: CertType, qualifier: Null, keychain: String): js.Promise[Identity | Null] = js.native
}

