package typings
package atAngularCoreLib.srcLinkerCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/compiler", "ModuleWithComponentFactories")
@js.native
class ModuleWithComponentFactories[T] protected () extends js.Object {
  def this(ngModuleFactory: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[T], componentFactories: js.Array[atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_]]) = this()
  var componentFactories: js.Array[atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_]] = js.native
  var ngModuleFactory: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[T] = js.native
}

