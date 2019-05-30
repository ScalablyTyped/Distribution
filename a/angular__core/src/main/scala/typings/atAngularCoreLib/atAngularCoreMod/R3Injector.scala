package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3Injector extends js.Object {
  var _destroyed: js.Any = js.native
  var assertNotDestroyed: js.Any = js.native
  /**
    * Flag indicating that this injector was previously destroyed.
    */
  val destroyed: scala.Boolean = js.native
  var hydrate: js.Any = js.native
  var injectableDefInScope: js.Any = js.native
  /**
    * The transitive set of `InjectorType`s which define this injector.
    */
  var injectorDefTypes: js.Any = js.native
  /**
    * Flag indicating this injector provides the APP_ROOT_SCOPE token, and thus counts as the
    * root scope.
    */
  val isRootInjector: js.Any = js.native
  /**
    * Set of values instantiated by this injector which contain `ngOnDestroy` lifecycle hooks.
    */
  var onDestroy: js.Any = js.native
  val parent: Injector = js.native
  /**
    * Add an `InjectorType` or `InjectorDefTypeWithProviders` and all of its transitive providers
    * to this injector.
    */
  var processInjectorType: js.Any = js.native
  /**
    * Process a `SingleProvider` and add it.
    */
  var processProvider: js.Any = js.native
  /**
    * Map of tokens to records which contain the instances of those tokens.
    */
  var records: js.Any = js.native
  val source: java.lang.String | scala.Null = js.native
  /**
    * Destroy the injector and release references to every instance or provider associated with it.
    *
    * Also calls the `OnDestroy` lifecycle hooks of every instance that was created for which a
    * hook was found.
    */
  def destroy(): scala.Unit = js.native
  def get[T](token: InjectionToken[T]): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: js.Any): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: js.Any, flags: InjectFlags): T = js.native
  def get[T](token: Type[T]): T = js.native
  def get[T](token: Type[T], notFoundValue: js.Any): T = js.native
  def get[T](token: Type[T], notFoundValue: js.Any, flags: InjectFlags): T = js.native
}

