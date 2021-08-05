package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerChangedEvent extends StObject {
  
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: Boolean
  
  /** Boolean indicating whether the marker now has a tail. */
  var hasTail: Boolean
  
  /** Boolean indicating whether the marker is now valid. */
  var isValid: Boolean
  
  /** Point representing the new head position. */
  var newHeadPosition: Point
  
  /**
    *  -DEPRECATED- Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object
  
  /** Point representing the new tail position. */
  var newTailPosition: Point
  
  /** Point representing the former head position. */
  var oldHeadPosition: Point
  
  /**
    *  -DEPRECATED- Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object
  
  /** Point representing the former tail position. */
  var oldTailPosition: Point
  
  /**
    *  Boolean indicating whether this change was caused by a textual
    *  change to the buffer or whether the marker was manipulated directly
    *  via its public API.
    */
  var textChanged: Boolean
  
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: Boolean
}
object MarkerChangedEvent {
  
  inline def apply(
    hadTail: Boolean,
    hasTail: Boolean,
    isValid: Boolean,
    newHeadPosition: Point,
    newProperties: js.Object,
    newTailPosition: Point,
    oldHeadPosition: Point,
    oldProperties: js.Object,
    oldTailPosition: Point,
    textChanged: Boolean,
    wasValid: Boolean
  ): MarkerChangedEvent = {
    val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadPosition = newHeadPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailPosition = newTailPosition.asInstanceOf[js.Any], oldHeadPosition = oldHeadPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailPosition = oldTailPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerChangedEvent]
  }
  
  extension [Self <: MarkerChangedEvent](x: Self) {
    
    inline def setHadTail(value: Boolean): Self = StObject.set(x, "hadTail", value.asInstanceOf[js.Any])
    
    inline def setHasTail(value: Boolean): Self = StObject.set(x, "hasTail", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setNewHeadPosition(value: Point): Self = StObject.set(x, "newHeadPosition", value.asInstanceOf[js.Any])
    
    inline def setNewProperties(value: js.Object): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
    
    inline def setNewTailPosition(value: Point): Self = StObject.set(x, "newTailPosition", value.asInstanceOf[js.Any])
    
    inline def setOldHeadPosition(value: Point): Self = StObject.set(x, "oldHeadPosition", value.asInstanceOf[js.Any])
    
    inline def setOldProperties(value: js.Object): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
    
    inline def setOldTailPosition(value: Point): Self = StObject.set(x, "oldTailPosition", value.asInstanceOf[js.Any])
    
    inline def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    
    inline def setWasValid(value: Boolean): Self = StObject.set(x, "wasValid", value.asInstanceOf[js.Any])
  }
}
