package typings.angularCore.mod

import typings.angularCore.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Injector")
@js.native
abstract class Injector () extends js.Object {
  /**
    * @deprecated from v4.0.0 use Type<T> or InjectionToken<T>
    * @suppress {duplicate}
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: AbstractType[T]): T = js.native
  def get[T](token: AbstractType[T], notFoundValue: T): T = js.native
  def get[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def get[T](token: AbstractType[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
  def get[T](token: InjectionToken[T]): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  def get[T](token: Type[T]): T = js.native
  def get[T](token: Type[T], notFoundValue: T): T = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def get[T](token: Type[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
}

/* static members */
@JSImport("@angular/core", "Injector")
@js.native
object Injector extends js.Object {
  var NULL: Injector = js.native
  /**
    * Creates a new injector instance that provides one or more dependencies,
    * according to a given type or types of `StaticProvider`.
    *
    * @param options An object with the following properties:
    * * `providers`: An array of providers of the [StaticProvider type](api/core/StaticProvider).
    * * `parent`: (optional) A parent injector.
    * * `name`: (optional) A developer-defined identifying name for the new injector.
    *
    * @returns The new injector instance.
    *
    */
  def create(options: Name): Injector = js.native
  /**
    * @deprecated from v5 use the new signature Injector.create(options)
    */
  def create(providers: js.Array[StaticProvider]): Injector = js.native
  def create(providers: js.Array[StaticProvider], parent: Injector): Injector = js.native
}

