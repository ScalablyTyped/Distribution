package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEffectOptions extends StObject {
  
  /**
    * Whether the `effect` should allow writing to signals.
    *
    * Using effects to synchronize data by writing to signals can lead to confusing and potentially
    * incorrect behavior, and should be enabled only when necessary.
    */
  var allowSignalWrites: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The `Injector` in which to create the effect.
    *
    * If this is not provided, the current injection context will be used instead (via `inject`).
    */
  var injector: js.UndefOr[Injector] = js.undefined
  
  /**
    * Whether the `effect` should require manual cleanup.
    *
    * If this is `false` (the default) the effect will automatically register itself to be cleaned up
    * with the current `DestroyRef`.
    */
  var manualCleanup: js.UndefOr[Boolean] = js.undefined
}
object CreateEffectOptions {
  
  inline def apply(): CreateEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEffectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEffectOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowSignalWrites(value: Boolean): Self = StObject.set(x, "allowSignalWrites", value.asInstanceOf[js.Any])
    
    inline def setAllowSignalWritesUndefined: Self = StObject.set(x, "allowSignalWrites", js.undefined)
    
    inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    
    inline def setManualCleanup(value: Boolean): Self = StObject.set(x, "manualCleanup", value.asInstanceOf[js.Any])
    
    inline def setManualCleanupUndefined: Self = StObject.set(x, "manualCleanup", js.undefined)
  }
}
