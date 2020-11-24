package typings.appBuilderLib.electronFrameworkMod

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.frameworkMod.Framework
import typings.appBuilderLib.mod.Packager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/electron/ElectronFramework", "createElectronFrameworkSupport")
@js.native
object createElectronFrameworkSupport extends js.Object {
  
  def apply(configuration: Configuration, packager: Packager): js.Promise[Framework] = js.native
}
