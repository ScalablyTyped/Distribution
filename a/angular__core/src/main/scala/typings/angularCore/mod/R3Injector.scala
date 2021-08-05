package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3Injector extends StObject {
  
  /* private */ var _destroyed: js.Any = js.native
  
  /* private */ var assertNotDestroyed: js.Any = js.native
  
  /**
    * Destroy the injector and release references to every instance or provider associated with it.
    *
    * Also calls the `OnDestroy` lifecycle hooks of every instance that was created for which a
    * hook was found.
    */
  def destroy(): Unit = js.native
  
  /**
    * Flag indicating that this injector was previously destroyed.
    */
  def destroyed: Boolean = js.native
  
  def get[T](token: InjectionToken[T]): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: js.Any): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: js.Any, flags: InjectFlags): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
  def get[T](token: Type[T]): T = js.native
  def get[T](token: Type[T], notFoundValue: js.Any): T = js.native
  def get[T](token: Type[T], notFoundValue: js.Any, flags: InjectFlags): T = js.native
  def get[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
  
  /* private */ var hydrate: js.Any = js.native
  
  /* private */ var injectableDefInScope: js.Any = js.native
  
  /**
    * The transitive set of `InjectorType`s which define this injector.
    */
  /* private */ var injectorDefTypes: js.Any = js.native
  
  /**
    * Set of values instantiated by this injector which contain `ngOnDestroy` lifecycle hooks.
    */
  /* private */ var onDestroy: js.Any = js.native
  
  val parent: Injector = js.native
  
  /**
    * Add an `InjectorType` or `InjectorTypeWithProviders` and all of its transitive providers
    * to this injector.
    *
    * If an `InjectorTypeWithProviders` that declares providers besides the type is specified,
    * the function will return "true" to indicate that the providers of the type definition need
    * to be processed. This allows us to process providers of injector types after all imports of
    * an injector definition are processed. (following View Engine semantics: see FW-1349)
    */
  /* private */ var processInjectorType: js.Any = js.native
  
  /**
    * Process a `SingleProvider` and add it.
    */
  /* private */ var processProvider: js.Any = js.native
  
  /**
    * Map of tokens to records which contain the instances of those tokens.
    * - `null` value implies that we don't have the record. Used by tree-shakable injectors
    * to prevent further searches.
    */
  /* private */ var records: js.Any = js.native
  
  /**
    * Flag indicating this injector provides the APP_ROOT_SCOPE token, and thus counts as the
    * root scope.
    */
  /* private */ val scope: js.Any = js.native
  
  val source: String | Null = js.native
}
