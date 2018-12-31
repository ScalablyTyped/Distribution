package typings
package atAngularCoreLib.srcDiInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/injector", "Injector")
@js.native
abstract class Injector () extends js.Object {
  /**
    * @deprecated from v4.0.0 use Type<T> or InjectionToken<T>
    * @suppress {duplicate}
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  def get[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T], notFoundValue: T): T = js.native
  def get[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    notFoundValue: T,
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  def get[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def get[T](token: atAngularCoreLib.srcTypeMod.Type[T], notFoundValue: T): T = js.native
  def get[T](
    token: atAngularCoreLib.srcTypeMod.Type[T],
    notFoundValue: T,
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
}

@JSImport("@angular/core/src/di/injector", "Injector")
@js.native
object Injector extends js.Object {
  var NULL: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  var THROW_IF_NOT_FOUND: js.Object = js.native
  /** @nocollapse */
  var ngInjectableDef: scala.Nothing = js.native
  def create(options: atAngularCoreLib.Anon_Name): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  /**
    * @deprecated from v5 use the new signature Injector.create(options)
    */
  def create(providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def create(
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider],
    parent: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
}

