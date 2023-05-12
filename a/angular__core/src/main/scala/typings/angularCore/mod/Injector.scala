package typings.angularCore.mod

import typings.angularCore.anon.InjectOptionsoptionalfals
import typings.angularCore.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "Injector")
@js.native
open class Injector () extends StObject {
  
  /**
    * @deprecated from v4.0.0 use ProviderToken<T>
    * @suppress {duplicate}
    */
  def get(token: Any): Any = js.native
  def get(token: Any, notFoundValue: Any): Any = js.native
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  def get[T](token: ProviderToken[T]): T = js.native
  def get[T](token: ProviderToken[T], notFoundValue: T): T = js.native
  def get[T](token: ProviderToken[T], notFoundValue: T, options: InjectFlags): T = js.native
  def get[T](token: ProviderToken[T], notFoundValue: T, options: InjectOptions): T = js.native
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  def get[T](token: ProviderToken[T], notFoundValue: Null, options: InjectOptions): T | Null = js.native
  /**
    * Internal note on the `options?: InjectOptions|InjectFlags` override of the `get`
    * method: consider dropping the `InjectFlags` part in one of the major versions.
    * It can **not** be done in minor/patch, since it's breaking for custom injectors
    * that only implement the old `InjectorFlags` interface.
    */
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  def get[T](token: ProviderToken[T], notFoundValue: Unit, options: InjectOptionsoptionalfals): T = js.native
  def get[T](token: ProviderToken[T], notFoundValue: Unit, options: InjectFlags): T = js.native
  def get[T](token: ProviderToken[T], notFoundValue: Unit, options: InjectOptions): T | Null = js.native
  @JSName("get")
  def get_T_T[T](token: ProviderToken[T], notFoundValue: Unit, options: InjectOptions): T = js.native
}
/* static members */
object Injector {
  
  @JSImport("@angular/core", "Injector")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "Injector.NULL")
  @js.native
  def NULL: Injector = js.native
  inline def NULL_=(x: Injector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "Injector.THROW_IF_NOT_FOUND")
  @js.native
  def THROW_IF_NOT_FOUND: js.Object = js.native
  inline def THROW_IF_NOT_FOUND_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROW_IF_NOT_FOUND")(x.asInstanceOf[js.Any])
  
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
  inline def create(options: Name): Injector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Injector]
  /**
    * @deprecated from v5 use the new signature Injector.create(options)
    */
  inline def create(providers: js.Array[StaticProvider]): Injector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(providers.asInstanceOf[js.Any]).asInstanceOf[Injector]
  inline def create(providers: js.Array[StaticProvider], parent: Injector): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Injector]
  
  /** @nocollapse */
  @JSImport("@angular/core", "Injector.\u0275prov")
  @js.native
  def ɵprov: Any = js.native
  inline def ɵprov_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
