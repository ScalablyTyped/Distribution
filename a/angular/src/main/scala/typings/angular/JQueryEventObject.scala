package typings.angular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.angular.BaseJQueryEventObject because Already inherited
- typings.std.Event because Already inherited
- typings.angular.JQueryInputEventObject because Already inherited
- typings.angular.BaseJQueryEventObject because Already inherited
- typings.angular.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode
- typings.angular.JQueryCustomEventObject because var conflicts: cancelBubble, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, target, which. Inlined detail */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  
  /** @deprecated */
  var char: String = js.native
  
  /** @deprecated */
  var charCode: Double = js.native
  
  /**
    * @see {@link https://api.jquery.com/category/events/event-object/}
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent}
    */
  var detail: js.UndefOr[js.Any] = js.native
  
  var key: String = js.native
  
  /** @deprecated */
  var keyCode: Double = js.native
}
