package typings.angularMocks.mod.angularAugmentingMod.mock

import typings.angularMocks.angularMocksStrings.alt
import typings.angularMocks.angularMocksStrings.ctrl
import typings.angularMocks.angularMocksStrings.meta
import typings.angularMocks.angularMocksStrings.shift
import typings.std.Node
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
  var bubbles: js.UndefOr[Boolean] = js.undefined
  /**
    * [Event.cancelable](https://developer.mozilla.org/docs/Web/API/Event/cancelable).
    * Not applicable to all events.
    */
  var cancelable: js.UndefOr[Boolean] = js.undefined
  /**
    * [charCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charcode)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var charcode: js.UndefOr[Double] = js.undefined
  /**
    * [data](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/data) for
    * [CompositionEvents](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent).
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * The elapsedTime for
    * [TransitionEvent](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
    * and [AnimationEvent](https://developer.mozilla.org/docs/Web/API/AnimationEvent).
    */
  var elapsedTime: js.UndefOr[Double] = js.undefined
  /**
    * [keyCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keycode)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var keycode: js.UndefOr[Double] = js.undefined
  /**
    * An array of possible modifier keys (ctrl, alt, shift, meta) for
    * [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent) and
    * keyboard events (keydown, keypress, and keyup).
    */
  var keys: js.UndefOr[js.Array[ctrl | alt | shift | meta]] = js.undefined
  /**
    * The [relatedTarget](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
    * for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent).
    */
  var relatedTarget: js.UndefOr[Node] = js.undefined
  /**
    * [which](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/which)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var which: js.UndefOr[Double] = js.undefined
  /**
    * x-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
    * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * y-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
    * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
    */
  var y: js.UndefOr[Double] = js.undefined
}

object IBrowserTriggerEventData {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    charcode: js.UndefOr[Double] = js.undefined,
    data: String = null,
    elapsedTime: js.UndefOr[Double] = js.undefined,
    keycode: js.UndefOr[Double] = js.undefined,
    keys: js.Array[ctrl | alt | shift | meta] = null,
    relatedTarget: Node = null,
    which: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): IBrowserTriggerEventData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charcode)) __obj.updateDynamic("charcode")(charcode.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsedTime)) __obj.updateDynamic("elapsedTime")(elapsedTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keycode)) __obj.updateDynamic("keycode")(keycode.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowserTriggerEventData]
  }
}

