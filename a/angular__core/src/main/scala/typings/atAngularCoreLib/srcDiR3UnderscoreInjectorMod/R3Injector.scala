package typings
package atAngularCoreLib.srcDiR3UnderscoreInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/r3_injector", "R3Injector")
@js.native
class R3Injector protected () extends js.Object {
  def this(`def`: atAngularCoreLib.srcDiDefsMod.InjectorType[_], additionalProviders: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider], parent: atAngularCoreLib.srcDiInjectorMod.Injector) = this()
  def this(`def`: atAngularCoreLib.srcDiDefsMod.InjectorType[_], additionalProviders: scala.Null, parent: atAngularCoreLib.srcDiInjectorMod.Injector) = this()
  var assertNotDestroyed: js.Any = js.native
  /**
    * Flag indicating that this injector was previously destroyed.
    */
  var destroyed: js.Any = js.native
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
  val parent: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
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
  /**
    * Destroy the injector and release references to every instance or provider associated with it.
    *
    * Also calls the `OnDestroy` lifecycle hooks of every instance that was created for which a
    * hook was found.
    */
  def destroy(): scala.Unit = js.native
  def get[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  def get[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T], notFoundValue: js.Any): T = js.native
  def get[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    notFoundValue: js.Any,
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
  def get[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def get[T](token: atAngularCoreLib.srcTypeMod.Type[T], notFoundValue: js.Any): T = js.native
  def get[T](
    token: atAngularCoreLib.srcTypeMod.Type[T],
    notFoundValue: js.Any,
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T = js.native
}

