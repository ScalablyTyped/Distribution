package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Processing extends StObject {
  
  var end: js.Array[ActionIsEnable | IsEnableTrigger]
  
  var processing: js.Array[ActionTrigger]
  
  var rollback: js.Array[ActionTrigger]
  
  var showEnable: js.Array[Action | IsEnable]
  
  var start: js.Array[ActionArg | ArgIsEnable]
}
object Processing {
  
  inline def apply(
    end: js.Array[ActionIsEnable | IsEnableTrigger],
    processing: js.Array[ActionTrigger],
    rollback: js.Array[ActionTrigger],
    showEnable: js.Array[Action | IsEnable],
    start: js.Array[ActionArg | ArgIsEnable]
  ): Processing = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], showEnable = showEnable.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Processing] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: js.Array[ActionIsEnable | IsEnableTrigger]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndVarargs(value: (ActionIsEnable | IsEnableTrigger)*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setProcessing(value: js.Array[ActionTrigger]): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingVarargs(value: ActionTrigger*): Self = StObject.set(x, "processing", js.Array(value*))
    
    inline def setRollback(value: js.Array[ActionTrigger]): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
    
    inline def setRollbackVarargs(value: ActionTrigger*): Self = StObject.set(x, "rollback", js.Array(value*))
    
    inline def setShowEnable(value: js.Array[Action | IsEnable]): Self = StObject.set(x, "showEnable", value.asInstanceOf[js.Any])
    
    inline def setShowEnableVarargs(value: (Action | IsEnable)*): Self = StObject.set(x, "showEnable", js.Array(value*))
    
    inline def setStart(value: js.Array[ActionArg | ArgIsEnable]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: (ActionArg | ArgIsEnable)*): Self = StObject.set(x, "start", js.Array(value*))
  }
}
