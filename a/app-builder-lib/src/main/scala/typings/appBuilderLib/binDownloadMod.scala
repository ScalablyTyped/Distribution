package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binDownloadMod {
  
  @JSImport("app-builder-lib/out/binDownload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def download(url: String, output: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def download(url: String, output: String, checksum: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(url.asInstanceOf[js.Any], output.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getBin(name: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getBin(name: String, url: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBin")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getBin(name: String, url: String, checksum: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBin")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getBin(name: String, url: Null, checksum: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBin")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getBin(name: String, url: Unit, checksum: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBin")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getBinFromUrl(name: String, version: String, checksum: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinFromUrl")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
