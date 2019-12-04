package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @publicApi
  */
@js.native
trait NgModuleFactory_2[T] extends js.Object {
  val moduleType: Type[T] = js.native
  def create(): NgModuleRef[T] = js.native
  def create(parentInjector: Injector): NgModuleRef[T] = js.native
}

