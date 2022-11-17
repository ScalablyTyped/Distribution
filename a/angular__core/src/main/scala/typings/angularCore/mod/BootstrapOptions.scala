package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapOptions extends StObject {
  
  /**
    * Optionally specify which `NgZone` should be used.
    *
    * - Provide your own `NgZone` instance.
    * - `zone.js` - Use default `NgZone` which requires `Zone.js`.
    * - `noop` - Use `NoopNgZone` which does nothing.
    */
  var ngZone: js.UndefOr[NgZone | "zone.js" | "noop"] = js.undefined
  
  /**
    * Optionally specify coalescing event change detections or not.
    * Consider the following case.
    *
    * <div (click)="doSomething()">
    *   <button (click)="doSomethingElse()"></button>
    * </div>
    *
    * When button is clicked, because of the event bubbling, both
    * event handlers will be called and 2 change detections will be
    * triggered. We can coalesce such kind of events to only trigger
    * change detection only once.
    *
    * By default, this option will be false. So the events will not be
    * coalesced and the change detection will be triggered multiple times.
    * And if this option be set to true, the change detection will be
    * triggered async by scheduling a animation frame. So in the case above,
    * the change detection will only be triggered once.
    */
  var ngZoneEventCoalescing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optionally specify if `NgZone#run()` method invocations should be coalesced
    * into a single change detection.
    *
    * Consider the following case.
    *
    * for (let i = 0; i < 10; i ++) {
    *   ngZone.run(() => {
    *     // do something
    *   });
    * }
    *
    * This case triggers the change detection multiple times.
    * With ngZoneRunCoalescing options, all change detections in an event loop trigger only once.
    * In addition, the change detection executes in requestAnimation.
    *
    */
  var ngZoneRunCoalescing: js.UndefOr[Boolean] = js.undefined
}
object BootstrapOptions {
  
  inline def apply(): BootstrapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapOptions]
  }
  
  extension [Self <: BootstrapOptions](x: Self) {
    
    inline def setNgZone(value: NgZone | "zone.js" | "noop"): Self = StObject.set(x, "ngZone", value.asInstanceOf[js.Any])
    
    inline def setNgZoneEventCoalescing(value: Boolean): Self = StObject.set(x, "ngZoneEventCoalescing", value.asInstanceOf[js.Any])
    
    inline def setNgZoneEventCoalescingUndefined: Self = StObject.set(x, "ngZoneEventCoalescing", js.undefined)
    
    inline def setNgZoneRunCoalescing(value: Boolean): Self = StObject.set(x, "ngZoneRunCoalescing", value.asInstanceOf[js.Any])
    
    inline def setNgZoneRunCoalescingUndefined: Self = StObject.set(x, "ngZoneRunCoalescing", js.undefined)
    
    inline def setNgZoneUndefined: Self = StObject.set(x, "ngZone", js.undefined)
  }
}
