package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronVersionMod {
  
  @JSImport("app-builder-lib/out/electron/electronVersion", "getElectronPackage")
  @js.native
  def getElectronPackage(projectDir: String): js.Promise[_] = js.native
  
  @JSImport("app-builder-lib/out/electron/electronVersion", "getElectronVersion")
  @js.native
  def getElectronVersion(projectDir: String): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/electron/electronVersion", "getElectronVersion")
  @js.native
  def getElectronVersion(projectDir: String, config: js.UndefOr[scala.Nothing], projectMetadata: MetadataValue): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/electron/electronVersion", "getElectronVersion")
  @js.native
  def getElectronVersion(projectDir: String, config: Configuration): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/electron/electronVersion", "getElectronVersion")
  @js.native
  def getElectronVersion(projectDir: String, config: Configuration, projectMetadata: MetadataValue): js.Promise[String] = js.native
  
  @JSImport("app-builder-lib/out/electron/electronVersion", "getElectronVersionFromInstalled")
  @js.native
  def getElectronVersionFromInstalled(projectDir: String): js.Promise[_] = js.native
  
  type MetadataValue = Lazy[StringDictionary[js.Any] | Null]
}
