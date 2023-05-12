package typings.angularCore

import typings.angularCore.anon.InitialValue
import typings.angularCore.anon.ToSignalOptionsundefinedr
import typings.angularCore.anon.ToSignalOptionsundefinedrInitialValue
import typings.angularCore.mod.DestroyRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.Signal_
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxjsInteropMod {
  
  @JSImport("@angular/core/rxjs-interop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeUntilDestroyed[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntilDestroyed")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def takeUntilDestroyed[T](destroyRef: DestroyRef): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntilDestroyed")(destroyRef.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def toObservable[T](source: Signal_[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def toObservable[T](source: Signal_[T], options: ToObservableOptions): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  
  inline def toSignal[T](source: Observable_[T]): Signal_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSignal")(source.asInstanceOf[js.Any]).asInstanceOf[Signal_[js.UndefOr[T]]]
  inline def toSignal[T](source: Observable_[T], options: ToSignalOptionsundefinedr): Signal_[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSignal")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Signal_[js.UndefOr[T]]]
  inline def toSignal[T](source: Observable_[T], options: ToSignalOptionsundefinedrInitialValue): Signal_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSignal")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Signal_[T]]
  inline def toSignal[T, U /* <: js.UndefOr[T | Null] */](source: Observable_[T], options: ToSignalOptions[U] & (InitialValue[U, T])): Signal_[T | U] = (^.asInstanceOf[js.Dynamic].applyDynamic("toSignal")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Signal_[T | U]]
  
  trait ToObservableOptions extends StObject {
    
    /**
      * The `Injector` to use when creating the underlying `effect` which watches the signal.
      *
      * If this isn't specified, the current injection context will be used.
      */
    var injector: js.UndefOr[Injector] = js.undefined
  }
  object ToObservableOptions {
    
    inline def apply(): ToObservableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToObservableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToObservableOptions] (val x: Self) extends AnyVal {
      
      inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
      
      inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    }
  }
  
  trait ToSignalOptions[T] extends StObject {
    
    /**
      * Initial value for the signal produced by `toSignal`.
      *
      * This will be the value of the signal until the observable emits its first value.
      */
    var initialValue: js.UndefOr[T] = js.undefined
    
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
  object ToSignalOptions {
    
    inline def apply[T](): ToSignalOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToSignalOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToSignalOptions[?], T] (val x: Self & ToSignalOptions[T]) extends AnyVal {
      
      inline def setInitialValue(value: T): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
      
      inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
      
      inline def setManualCleanup(value: Boolean): Self = StObject.set(x, "manualCleanup", value.asInstanceOf[js.Any])
      
      inline def setManualCleanupUndefined: Self = StObject.set(x, "manualCleanup", js.undefined)
      
      inline def setRequireSync(value: Boolean): Self = StObject.set(x, "requireSync", value.asInstanceOf[js.Any])
      
      inline def setRequireSyncUndefined: Self = StObject.set(x, "requireSync", js.undefined)
    }
  }
}
