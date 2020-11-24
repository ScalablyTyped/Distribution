package typings.angularMocks.mod.angularAugmentingMod.mock

import typings.angularMocks.angularMocksStrings.alt
import typings.angularMocks.angularMocksStrings.ctrl
import typings.angularMocks.angularMocksStrings.meta
import typings.angularMocks.angularMocksStrings.shift
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains additional event data used by the `browserTrigger` function when creating an event.
  */
@js.native
trait IBrowserTriggerEventData extends js.Object {
  
  /**
    * [Event.bubbles](https://developer.mozilla.org/docs/Web/API/Event/bubbles).
    * Not applicable to all events.
    */
  var bubbles: js.UndefOr[Boolean] = js.native
  
  /**
    * [Event.cancelable](https://developer.mozilla.org/docs/Web/API/Event/cancelable).
    * Not applicable to all events.
    */
  var cancelable: js.UndefOr[Boolean] = js.native
  
  /**
    * [charCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charcode)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var charcode: js.UndefOr[Double] = js.native
  
  /**
    * [data](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/data) for
    * [CompositionEvents](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent).
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * The elapsedTime for
    * [TransitionEvent](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
    * and [AnimationEvent](https://developer.mozilla.org/docs/Web/API/AnimationEvent).
    */
  var elapsedTime: js.UndefOr[Double] = js.native
  
  /**
    * [keyCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keycode)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var keycode: js.UndefOr[Double] = js.native
  
  /**
    * An array of possible modifier keys (ctrl, alt, shift, meta) for
    * [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent) and
    * keyboard events (keydown, keypress, and keyup).
    */
  var keys: js.UndefOr[js.Array[ctrl | alt | shift | meta]] = js.native
  
  /**
    * The [relatedTarget](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
    * for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent).
    */
  var relatedTarget: js.UndefOr[Node] = js.native
  
  /**
    * [which](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/which)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var which: js.UndefOr[Double] = js.native
  
  /**
    * x-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
    * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * y-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
    * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
    */
  var y: js.UndefOr[Double] = js.native
}
object IBrowserTriggerEventData {
  
  @scala.inline
  def apply(): IBrowserTriggerEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowserTriggerEventData]
  }
  
  @scala.inline
  implicit class IBrowserTriggerEventDataOps[Self <: IBrowserTriggerEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    
    @scala.inline
    def setCharcode(value: Double): Self = this.set("charcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharcode: Self = this.set("charcode", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setElapsedTime(value: Double): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTime: Self = this.set("elapsedTime", js.undefined)
    
    @scala.inline
    def setKeycode(value: Double): Self = this.set("keycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeycode: Self = this.set("keycode", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: (ctrl | alt | shift | meta)*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[ctrl | alt | shift | meta]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setRelatedTarget(value: Node): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedTarget: Self = this.set("relatedTarget", js.undefined)
    
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhich: Self = this.set("which", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
