package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationPlaybackId extends StObject {
  
  var operation: String
  
  var playbackId: String
}
object OperationPlaybackId {
  
  inline def apply(operation: String, playbackId: String): OperationPlaybackId = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationPlaybackId]
  }
  
  extension [Self <: OperationPlaybackId](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPlaybackId(value: String): Self = StObject.set(x, "playbackId", value.asInstanceOf[js.Any])
  }
}
