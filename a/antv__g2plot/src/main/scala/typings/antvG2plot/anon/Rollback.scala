package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rollback extends StObject {
  
  var end: Unit
  
  var processing: Unit
  
  var rollback: Unit
  
  var showEnable: Unit
  
  var start: Unit
}
object Rollback {
  
  inline def apply(end: Unit, processing: Unit, rollback: Unit, showEnable: Unit, start: Unit): Rollback = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], showEnable = showEnable.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rollback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rollback] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Unit): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setProcessing(value: Unit): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setRollback(value: Unit): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
    
    inline def setShowEnable(value: Unit): Self = StObject.set(x, "showEnable", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Unit): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
