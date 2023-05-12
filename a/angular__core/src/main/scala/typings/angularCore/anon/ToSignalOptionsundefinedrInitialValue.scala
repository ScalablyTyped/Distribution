package typings.angularCore.anon

import typings.angularCore.mod.Injector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core/rxjs-interop.ToSignalOptions<undefined> & {  requireSync :true} */
trait ToSignalOptionsundefinedrInitialValue extends StObject {
  
  /**
    * Initial value for the signal produced by `toSignal`.
    *
    * This will be the value of the signal until the observable emits its first value.
    */
  var initialValue: scala.Unit
  
  /**
    * `Injector` which will provide the `DestroyRef` used to clean up the Observable subscription.
    *
    * If this is not provided, a `DestroyRef` will be retrieved from the current injection context,
    * unless manual cleanup is requested.
    */
  var injector: js.UndefOr[Injector] = js.undefined
  
  /**
    * Whether the subscription should be automatically cleaned up (via `DestroyRef`) when
    * `toObservable`'s creation context is destroyed.
    *
    * If manual cleanup is enabled, then `DestroyRef` is not used, and the subscription will persist
    * until the `Observable` itself completes.
    */
  var manualCleanup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to require that the observable emits synchronously when `toSignal` subscribes.
    *
    * If this is `true`, `toSignal` will assert that the observable produces a value immediately upon
    * subscription. Setting this option removes the need to either deal with `undefined` in the
    * signal type or provide an `initialValue`, at the cost of a runtime error if this requirement is
    * not met.
    */
  var requireSync: js.UndefOr[Boolean] = js.undefined
}
object ToSignalOptionsundefinedrInitialValue {
  
  inline def apply(initialValue: scala.Unit): ToSignalOptionsundefinedrInitialValue = {
    val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToSignalOptionsundefinedrInitialValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToSignalOptionsundefinedrInitialValue] (val x: Self) extends AnyVal {
    
    inline def setInitialValue(value: scala.Unit): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    
    inline def setManualCleanup(value: Boolean): Self = StObject.set(x, "manualCleanup", value.asInstanceOf[js.Any])
    
    inline def setManualCleanupUndefined: Self = StObject.set(x, "manualCleanup", js.undefined)
    
    inline def setRequireSync(value: Boolean): Self = StObject.set(x, "requireSync", value.asInstanceOf[js.Any])
    
    inline def setRequireSyncUndefined: Self = StObject.set(x, "requireSync", js.undefined)
  }
}
