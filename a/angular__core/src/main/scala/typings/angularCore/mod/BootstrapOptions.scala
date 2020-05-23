package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.noop
import typings.angularCore.angularCoreStrings.zoneDotjs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides additional options to the bootstraping process.
  *
  *
  */
trait BootstrapOptions extends js.Object {
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
    * the change detection will only be trigged once.
    */
  var ngZoneEventCoalescing: js.UndefOr[Boolean] = js.undefined
}

object BootstrapOptions {
  @scala.inline
  def apply(
    ngZone: NgZone | zoneDotjs | noop = null,
    ngZoneEventCoalescing: js.UndefOr[Boolean] = js.undefined
  ): BootstrapOptions = {
    val __obj = js.Dynamic.literal()
    if (ngZone != null) __obj.updateDynamic("ngZone")(ngZone.asInstanceOf[js.Any])
    if (!js.isUndefined(ngZoneEventCoalescing)) __obj.updateDynamic("ngZoneEventCoalescing")(ngZoneEventCoalescing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapOptions]
  }
}

