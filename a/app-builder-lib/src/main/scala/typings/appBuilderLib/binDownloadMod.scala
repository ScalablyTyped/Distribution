package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binDownloadMod {
  
  @JSImport("app-builder-lib/out/binDownload", "download")
  @js.native
  def download(url: String, output: String): js.Promise[Unit] = js.native
  @JSImport("app-builder-lib/out/binDownload", "download")
  @js.native
  def download(url: String, output: String, checksum: String): js.Promise[Unit] = js.native
  
  @JSImport("app-builder-lib/out/binDownload", "getBin")
  @js.native
  def getBin(name: String): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/binDownload", "getBin")
  @js.native
  def getBin(name: String, url: js.UndefOr[scala.Nothing], checksum: String): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/binDownload", "getBin")
  @js.native
  def getBin(name: String, url: String): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/binDownload", "getBin")
  @js.native
  def getBin(name: String, url: String, checksum: String): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/binDownload", "getBin")
  @js.native
  def getBin(name: String, url: Null, checksum: String): js.Promise[String] = js.native
  
  @JSImport("app-builder-lib/out/binDownload", "getBinFromUrl")
  @js.native
  def getBinFromUrl(name: String, version: String, checksum: String): js.Promise[String] = js.native
}
