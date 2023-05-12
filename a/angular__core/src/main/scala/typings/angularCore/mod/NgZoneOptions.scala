package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgZoneOptions extends StObject {
  
  /**
    * Optionally specify coalescing event change detections or not.
    * Consider the following case.
    *
    * ```
    * <div (click)="doSomething()">
    *   <button (click)="doSomethingElse()"></button>
    * </div>
    * ```
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
  var eventCoalescing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optionally specify if `NgZone#run()` method invocations should be coalesced
    * into a single change detection.
    *
    * Consider the following case.
    * ```
    * for (let i = 0; i < 10; i ++) {
    *   ngZone.run(() => {
    *     // do something
    *   });
    * }
    * ```
    *
    * This case triggers the change detection multiple times.
    * With ngZoneRunCoalescing options, all change detections in an event loop trigger only once.
    * In addition, the change detection executes in requestAnimation.
    *
    */
  var runCoalescing: js.UndefOr[Boolean] = js.undefined
}
object NgZoneOptions {
  
  inline def apply(): NgZoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NgZoneOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgZoneOptions] (val x: Self) extends AnyVal {
    
    inline def setEventCoalescing(value: Boolean): Self = StObject.set(x, "eventCoalescing", value.asInstanceOf[js.Any])
    
    inline def setEventCoalescingUndefined: Self = StObject.set(x, "eventCoalescing", js.undefined)
    
    inline def setRunCoalescing(value: Boolean): Self = StObject.set(x, "runCoalescing", value.asInstanceOf[js.Any])
    
    inline def setRunCoalescingUndefined: Self = StObject.set(x, "runCoalescing", js.undefined)
  }
}
