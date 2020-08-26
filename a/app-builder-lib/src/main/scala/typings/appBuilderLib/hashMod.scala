package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.base64
import typings.appBuilderLib.appBuilderLibStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/hash", JSImport.Namespace)
@js.native
object hashMod extends js.Object {
  def hashFile(file: String): js.Promise[String] = js.native
  def hashFile(
    file: String,
    algorithm: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    options: js.Any
  ): js.Promise[String] = js.native
  def hashFile(file: String, algorithm: String): js.Promise[String] = js.native
  def hashFile(file: String, algorithm: String, encoding: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_base64(file: String, algorithm: js.UndefOr[scala.Nothing], encoding: base64): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_base64(file: String, algorithm: js.UndefOr[scala.Nothing], encoding: base64, options: js.Any): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_base64(file: String, algorithm: String, encoding: base64): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_base64(file: String, algorithm: String, encoding: base64, options: js.Any): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_hex(file: String, algorithm: js.UndefOr[scala.Nothing], encoding: hex): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_hex(file: String, algorithm: js.UndefOr[scala.Nothing], encoding: hex, options: js.Any): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_hex(file: String, algorithm: String, encoding: hex): js.Promise[String] = js.native
  @JSName("hashFile")
  def hashFile_hex(file: String, algorithm: String, encoding: hex, options: js.Any): js.Promise[String] = js.native
}

