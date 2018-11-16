package typings
package angularDashMocksLib.angularDashMocksMod.angularMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains additional event data used by the `browserTrigger` function when creating an event.
     */

trait IBrowserTriggerEventData extends js.Object {
  /**
         * [Event.bubbles](https://developer.mozilla.org/docs/Web/API/Event/bubbles).
         * Not applicable to all events.
         */
  var bubbles: js.UndefOr[scala.Boolean] = js.undefined
  /**
         * [Event.cancelable](https://developer.mozilla.org/docs/Web/API/Event/cancelable).
         * Not applicable to all events.
         */
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  /**
         * [charCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charcode)
         * for keyboard events (keydown, keypress, and keyup).
         */
  var charcode: js.UndefOr[scala.Double] = js.undefined
  /**
         * [data](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/data) for
         * [CompositionEvents](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent).
         */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
         * The elapsedTime for
         * [TransitionEvent](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
         * and [AnimationEvent](https://developer.mozilla.org/docs/Web/API/AnimationEvent).
         */
  var elapsedTime: js.UndefOr[scala.Double] = js.undefined
  /**
         * [keyCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keycode)
         * for keyboard events (keydown, keypress, and keyup).
         */
  var keycode: js.UndefOr[scala.Double] = js.undefined
  /**
         * An array of possible modifier keys (ctrl, alt, shift, meta) for
         * [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent) and
         * keyboard events (keydown, keypress, and keyup).
         */
  var keys: js.UndefOr[
    js.Array[
      angularDashMocksLib.angularDashMocksLibStrings.ctrl | angularDashMocksLib.angularDashMocksLibStrings.alt | angularDashMocksLib.angularDashMocksLibStrings.shift | angularDashMocksLib.angularDashMocksLibStrings.meta
    ]
  ] = js.undefined
  /**
         * The [relatedTarget](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
         * for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent).
         */
  var relatedTarget: js.UndefOr[stdLib.Node] = js.undefined
  /**
         * [which](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/which)
         * for keyboard events (keydown, keypress, and keyup).
         */
  var which: js.UndefOr[scala.Double] = js.undefined
  /**
         * x-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
         * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
         */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
         * y-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
         * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
         */
  var y: js.UndefOr[scala.Double] = js.undefined
}

