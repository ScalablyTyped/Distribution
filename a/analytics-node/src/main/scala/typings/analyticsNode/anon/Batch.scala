package typings.analyticsNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Batch extends StObject {
  
  var batch: Any
  
  var sentAt: String
  
  var timestamp: String
}
object Batch {
  
  inline def apply(batch: Any, sentAt: String, timestamp: String): Batch = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
    
    inline def setBatch(value: Any): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setSentAt(value: String): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
