package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronVersionMod {
  
  @JSImport("app-builder-lib/out/electron/electronVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getElectronPackage(projectDir: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElectronPackage")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getElectronVersion(projectDir: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElectronVersion")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getElectronVersion(projectDir: String, config: Unit, projectMetadata: MetadataValue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElectronVersion")(projectDir.asInstanceOf[js.Any], config.asInstanceOf[js.Any], projectMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getElectronVersion(projectDir: String, config: Configuration): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElectronVersion")(projectDir.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getElectronVersion(projectDir: String, config: Configuration, projectMetadata: MetadataValue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElectronVersion")(projectDir.asInstanceOf[js.Any], config.asInstanceOf[js.Any], projectMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getElectronVersionFromInstalled(projectDir: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElectronVersionFromInstalled")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  type MetadataValue = Lazy[StringDictionary[Any] | Null]
}
