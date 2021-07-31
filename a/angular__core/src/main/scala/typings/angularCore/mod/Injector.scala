package typings.angularCore.mod

import typings.angularCore.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Injector")
@js.native
abstract class Injector () extends StObject {
  
  /**
    * @deprecated from v4.0.0 use Type<T> or InjectionToken<T>
    * @suppress {duplicate}
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: AbstractType[T]): T = js.native
  def get[T](token: AbstractType[T], notFoundValue: T): T = js.native
  def get[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def get[T](token: AbstractType[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
  def get[T](token: InjectionToken[T]): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  def get[T](token: Type[T]): T = js.native
  def get[T](token: Type[T], notFoundValue: T): T = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def get[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
}
/* static members */
object Injector {
  
  @JSImport("@angular/core", "Injector")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "Injector.NULL")
  @js.native
  def NULL: Injector = js.native
  @scala.inline
  def NULL_=(x: Injector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "Injector.THROW_IF_NOT_FOUND")
  @js.native
  def THROW_IF_NOT_FOUND: js.Object = js.native
  @scala.inline
  def THROW_IF_NOT_FOUND_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROW_IF_NOT_FOUND")(x.asInstanceOf[js.Any])
  
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
  @scala.inline
  def create(options: Parent): Injector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Injector]
  /**
    * @deprecated from v5 use the new signature Injector.create(options)
    */
  @scala.inline
  def create(providers: js.Array[StaticProvider]): Injector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(providers.asInstanceOf[js.Any]).asInstanceOf[Injector]
  @scala.inline
  def create(providers: js.Array[StaticProvider], parent: Injector): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Injector]
}
