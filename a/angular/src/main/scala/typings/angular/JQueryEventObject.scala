package typings.angular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.angular.BaseJQueryEventObject because Already inherited
- typings.angular.JQueryInputEventObject because var conflicts: cancelBubble, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, target, which. Inlined altKey, ctrlKey, shiftKey
- typings.angular.JQueryKeyEventObject because var conflicts: cancelBubble, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, target, which. Inlined char, charCode, key, keyCode
- typings.angular.JQueryMouseEventObject because var conflicts: cancelBubble, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, target, which. Inlined button, clientX, clientY, offsetX, offsetY, screenX, screenY */ @js.native
trait JQueryEventObject
  extends StObject
     with JQueryCustomEventObject {
  
  var altKey: Boolean = js.native
  
  var button: Double = js.native
  
  /** @deprecated */
  var char: String = js.native
  
  /** @deprecated */
  var charCode: Double = js.native
  
  var clientX: Double = js.native
  
  var clientY: Double = js.native
  
  var ctrlKey: Boolean = js.native
  
  var key: String = js.native
  
  /** @deprecated */
  var keyCode: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var screenX: Double = js.native
  
  var screenY: Double = js.native
  
  var shiftKey: Boolean = js.native
}
