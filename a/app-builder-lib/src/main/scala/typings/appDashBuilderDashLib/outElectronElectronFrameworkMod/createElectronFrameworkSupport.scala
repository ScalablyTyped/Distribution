package typings.appDashBuilderDashLib.outElectronElectronFrameworkMod

import typings.appDashBuilderDashLib.outConfigurationMod.Configuration
import typings.appDashBuilderDashLib.outFrameworkMod.Framework
import typings.appDashBuilderDashLib.outMod.Packager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/electron/ElectronFramework", "createElectronFrameworkSupport")
@js.native
object createElectronFrameworkSupport extends js.Object {
  def apply(configuration: Configuration, packager: Packager): js.Promise[Framework] = js.native
}

