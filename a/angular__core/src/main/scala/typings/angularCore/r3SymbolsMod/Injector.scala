package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concrete injectors implement this interface. Injectors are configured
  * with [providers](guide/glossary#provider) that associate
  * dependencies of various types with [injection tokens](guide/glossary#di-token).
  *
  * @see ["DI Providers"](guide/dependency-injection-providers).
  * @see `StaticProvider`
  *
  * @usageNotes
  *
  *  The following example creates a service injector instance.
  *
  * {@example core/di/ts/provider_spec.ts region='ConstructorProvider'}
  *
  * ### Usage example
  *
  * {@example core/di/ts/injector_spec.ts region='Injector'}
  *
  * `Injector` returns itself when given `Injector` as a token:
  *
  * {@example core/di/ts/injector_spec.ts region='injectInjector'}
  *
  * @publicApi
  */
@js.native
trait Injector extends js.Object {
  
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
