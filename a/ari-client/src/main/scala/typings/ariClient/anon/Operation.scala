package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  var operation: String
  
  var playbackId: String
}
object Operation {
  
  inline def apply(operation: String, playbackId: String): Operation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPlaybackId(value: String): Self = StObject.set(x, "playbackId", value.asInstanceOf[js.Any])
  }
}
