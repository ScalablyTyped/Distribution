package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "SystemJsNgModuleLoaderConfig")
@js.native
abstract class SystemJsNgModuleLoaderConfig () extends js.Object {
  /**
    * Prefix to add when computing the name of the factory module for a given module name.
    */
  var factoryPathPrefix: String = js.native
  /**
    * Suffix to add when computing the name of the factory module for a given module name.
    */
  var factoryPathSuffix: String = js.native
}

