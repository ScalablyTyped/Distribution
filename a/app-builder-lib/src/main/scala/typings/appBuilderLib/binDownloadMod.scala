package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/binDownload", JSImport.Namespace)
@js.native
object binDownloadMod extends js.Object {
  def download(url: String, output: String): js.Promise[Unit] = js.native
  def download(url: String, output: String, checksum: String): js.Promise[Unit] = js.native
  def getBin(name: String): js.Promise[String] = js.native
  def getBin(name: String, url: js.UndefOr[scala.Nothing], checksum: String): js.Promise[String] = js.native
  def getBin(name: String, url: String): js.Promise[String] = js.native
  def getBin(name: String, url: String, checksum: String): js.Promise[String] = js.native
  def getBin(name: String, url: Null, checksum: String): js.Promise[String] = js.native
  def getBinFromUrl(name: String, version: String, checksum: String): js.Promise[String] = js.native
}

