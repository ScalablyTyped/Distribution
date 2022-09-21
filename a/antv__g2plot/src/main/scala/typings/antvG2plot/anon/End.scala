package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: js.Array[Trigger]
  
  var processing: js.Array[Trigger]
  
  var rollback: js.Array[ActionTrigger]
  
  var showEnable: js.Array[Action | IsEnable]
  
  var start: js.Array[Arg]
}
object End {
  
  inline def apply(
    end: js.Array[Trigger],
    processing: js.Array[Trigger],
    rollback: js.Array[ActionTrigger],
    showEnable: js.Array[Action | IsEnable],
    start: js.Array[Arg]
  ): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], showEnable = showEnable.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: js.Array[Trigger]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndVarargs(value: Trigger*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setProcessing(value: js.Array[Trigger]): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingVarargs(value: Trigger*): Self = StObject.set(x, "processing", js.Array(value*))
    
    inline def setRollback(value: js.Array[ActionTrigger]): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
    
    inline def setRollbackVarargs(value: ActionTrigger*): Self = StObject.set(x, "rollback", js.Array(value*))
    
    inline def setShowEnable(value: js.Array[Action | IsEnable]): Self = StObject.set(x, "showEnable", value.asInstanceOf[js.Any])
    
    inline def setShowEnableVarargs(value: (Action | IsEnable)*): Self = StObject.set(x, "showEnable", js.Array(value*))
    
    inline def setStart(value: js.Array[Arg]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: Arg*): Self = StObject.set(x, "start", js.Array(value*))
  }
}
