package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShardCountOutput extends StObject {
  
  /**
    * The current number of shards.
    */
  var CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamName] = js.undefined
  
  /**
    * The updated number of shards.
    */
  var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
}
object UpdateShardCountOutput {
  
  inline def apply(): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
  
  extension [Self <: UpdateShardCountOutput](x: Self) {
    
    inline def setCurrentShardCount(value: PositiveIntegerObject): Self = StObject.set(x, "CurrentShardCount", value.asInstanceOf[js.Any])
    
    inline def setCurrentShardCountUndefined: Self = StObject.set(x, "CurrentShardCount", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    inline def setTargetShardCount(value: PositiveIntegerObject): Self = StObject.set(x, "TargetShardCount", value.asInstanceOf[js.Any])
    
    inline def setTargetShardCountUndefined: Self = StObject.set(x, "TargetShardCount", js.undefined)
  }
}
