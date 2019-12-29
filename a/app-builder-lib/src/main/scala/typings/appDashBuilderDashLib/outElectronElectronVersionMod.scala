package typings.appDashBuilderDashLib

import org.scalablytyped.runtime.StringDictionary
import typings.appDashBuilderDashLib.outConfigurationMod.Configuration
import typings.lazyDashVal.lazyDashValMod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/electron/electronVersion", JSImport.Namespace)
@js.native
object outElectronElectronVersionMod extends js.Object {
  def getElectronVersion(projectDir: String): js.Promise[String] = js.native
  def getElectronVersion(projectDir: String, config: Configuration): js.Promise[String] = js.native
  def getElectronVersion(projectDir: String, config: Configuration, projectMetadata: MetadataValue): js.Promise[String] = js.native
  def getElectronVersionFromInstalled(projectDir: String): js.Promise[_] = js.native
  type MetadataValue = Lazy[StringDictionary[js.Any] | Null]
}

