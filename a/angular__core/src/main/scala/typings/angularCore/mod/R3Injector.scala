package typings.angularCore.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3Injector extends EnvironmentInjector {
  
  /* private */ var _destroyed: Any = js.native
  
  /**
    * Set of values instantiated by this injector which contain `ngOnDestroy` lifecycle hooks.
    */
  /* private */ var _ngOnDestroyHooks: Any = js.native
  
  /* private */ var _onDestroyHooks: Any = js.native
  
  /* private */ var assertNotDestroyed: Any = js.native
  
  /**
    * Flag indicating that this injector was previously destroyed.
    */
  def destroyed: Boolean = js.native
  
  /* private */ var hydrate: Any = js.native
  
  /* private */ var injectableDefInScope: Any = js.native
  
  /* private */ var injectorDefTypes: Any = js.native
  
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
  
  val parent: Injector = js.native
  
  /**
    * Process a `SingleProvider` and add it.
    */
  /* private */ var processProvider: Any = js.native
  
  /**
    * Map of tokens to records which contain the instances of those tokens.
    * - `null` value implies that we don't have the record. Used by tree-shakable injectors
    * to prevent further searches.
    */
  /* private */ var records: Any = js.native
  
  val scopes: Set[InjectorScope] = js.native
  
  val source: String | Null = js.native
}
