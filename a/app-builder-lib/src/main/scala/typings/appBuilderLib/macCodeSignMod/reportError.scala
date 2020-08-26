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
    qualifier: js.UndefOr[scala.Nothing],
    keychainFile: js.UndefOr[scala.Nothing],
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: js.UndefOr[scala.Nothing],
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: js.UndefOr[scala.Nothing],
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: String,
    keychainFile: js.UndefOr[scala.Nothing],
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: String,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: String,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Null,
    keychainFile: js.UndefOr[scala.Nothing],
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Null,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
  def apply(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Null,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = js.native
}

