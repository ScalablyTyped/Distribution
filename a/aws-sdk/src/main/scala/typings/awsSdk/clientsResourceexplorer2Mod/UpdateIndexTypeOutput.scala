package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIndexTypeOutput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the index that you updated.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and timestamp when the index was last updated.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the state of the request to update the index. This operation is asynchronous. Call the GetIndex operation to check for changes.
    */
  var State: js.UndefOr[IndexState] = js.undefined
  
  /**
    * Specifies the type of the specified index after the operation completes.
    */
  var Type: js.UndefOr[IndexType] = js.undefined
}
object UpdateIndexTypeOutput {
  
  inline def apply(): UpdateIndexTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIndexTypeOutput]
  }
  
  extension [Self <: UpdateIndexTypeOutput](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setState(value: IndexState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: IndexType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
