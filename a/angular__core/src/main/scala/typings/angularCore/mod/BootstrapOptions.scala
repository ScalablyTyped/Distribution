package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.noop
import typings.angularCore.angularCoreStrings.zoneDotjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides additional options to the bootstraping process.
  *
  *
  */
trait BootstrapOptions extends StObject {
  
  /**
    * Optionally specify which `NgZone` should be used.
    *
    * - Provide your own `NgZone` instance.
    * - `zone.js` - Use default `NgZone` which requires `Zone.js`.
    * - `noop` - Use `NoopNgZone` which does nothing.
    */
  var ngZone: js.UndefOr[NgZone | zoneDotjs | noop] = js.undefined
  
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
    * triggered. We can colesce such kind of events to only trigger
    * change detection only once.
    *
    * By default, this option will be false. So the events will not be
    * coalesced and the change detection will be triggered multiple times.
    * And if this option be set to true, the change detection will be
    * triggered async by scheduling a animation frame. So in the case above,
    * the change detection will only be triggered once.
    */
  var ngZoneEventCoalescing: js.UndefOr[Boolean] = js.undefined
}
object BootstrapOptions {
  
  @scala.inline
  def apply(): BootstrapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapOptions]
  }
  
  @scala.inline
  implicit class BootstrapOptionsMutableBuilder[Self <: BootstrapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgZone(value: NgZone | zoneDotjs | noop): Self = StObject.set(x, "ngZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgZoneEventCoalescing(value: Boolean): Self = StObject.set(x, "ngZoneEventCoalescing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgZoneEventCoalescingUndefined: Self = StObject.set(x, "ngZoneEventCoalescing", js.undefined)
    
    @scala.inline
    def setNgZoneUndefined: Self = StObject.set(x, "ngZone", js.undefined)
  }
}
