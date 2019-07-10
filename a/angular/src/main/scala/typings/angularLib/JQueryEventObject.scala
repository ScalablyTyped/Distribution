package typings
package angularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- angularLib.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode- angularLib.JQueryCustomEventObject because var conflicts: cancelBubble, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, target, which. Inlined detail */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  /** @deprecated */
  var char: java.lang.String = js.native
  /** @deprecated */
  var charCode: scala.Double = js.native
  /**
    * @see {@link https://api.jquery.com/category/events/event-object/}
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent}
    */
  var detail: js.UndefOr[js.Any] = js.native
  var key: java.lang.String = js.native
  /** @deprecated */
  var keyCode: scala.Double = js.native
}

