package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import typings.atAngularCore.atAngularCoreStrings.any
import typings.atAngularCore.atAngularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵɵInjectableDef[T] extends js.Object {
  /**
    * Specifies that the given type belongs to a particular injector:
    * - `InjectorType` such as `NgModule`,
    * - `'root'` the root injector
    * - `'any'` all injectors.
    * - `null`, does not belong to any injector. Must be explicitly listed in the injector
    *   `providers`.
    */
  var providedIn: InjectorType[_] | root | any | Null = js.native
  /**
    * The token to which this definition belongs.
    *
    * Note that this may not be the same as the type that the `factory` will create.
    */
  var token: js.Any = js.native
  /**
    * In a case of no explicit injector, a location where the instance of the injectable is stored.
    */
  var value: js.UndefOr[T] = js.native
  /**
    * Factory method to execute to create an instance of the injectable.
    */
  def factory(): T = js.native
  def factory(t: Type[_]): T = js.native
}

