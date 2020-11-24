package typings.angularCore.r3SymbolsMod

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵɵInjectableDef[T] extends js.Object {
  
  /**
    * Factory method to execute to create an instance of the injectable.
    */
  def factory(): T = js.native
  def factory(t: Type[_]): T = js.native
  
  /**
    * Specifies that the given type belongs to a particular injector:
    * - `InjectorType` such as `NgModule`,
    * - `'root'` the root injector
    * - `'any'` all injectors.
    * - `null`, does not belong to any injector. Must be explicitly listed in the injector
    *   `providers`.
    */
  var providedIn: InjectorType[_] | root | platform | any | Null = js.native
  
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
}
