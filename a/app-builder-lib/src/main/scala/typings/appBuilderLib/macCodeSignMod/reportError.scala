package typings.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/macCodeSign", "reportError")
@js.native
object reportError extends js.Object {
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: js.UndefOr[Null | String],
    keychainFile: js.UndefOr[Null | String],
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
}

