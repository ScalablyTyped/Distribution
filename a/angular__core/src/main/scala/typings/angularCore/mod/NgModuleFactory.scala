package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "NgModuleFactory")
@js.native
abstract class NgModuleFactory[T] () extends js.Object {
  def create(): NgModuleRef[T] = js.native
  def create(parentInjector: Injector): NgModuleRef[T] = js.native
  def moduleType: Type[T] = js.native
}

