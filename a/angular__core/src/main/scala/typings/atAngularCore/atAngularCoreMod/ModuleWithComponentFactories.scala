package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ModuleWithComponentFactories")
@js.native
class ModuleWithComponentFactories[T] protected () extends js.Object {
  def this(ngModuleFactory: NgModuleFactory[T], componentFactories: js.Array[ComponentFactory[_]]) = this()
  var componentFactories: js.Array[ComponentFactory[_]] = js.native
  var ngModuleFactory: NgModuleFactory[T] = js.native
}

