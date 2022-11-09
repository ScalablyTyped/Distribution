package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexOutput extends StObject {
  
  /**
    * The ARN of the new local index for the Region. You can reference this ARN in IAM permission policies to authorize the following operations: DeleteIndex | GetIndex | UpdateIndexType | CreateView 
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and timestamp when the index was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the current state of the index. You can check for changes to the state for asynchronous operations by calling the GetIndex operation.  The state can remain in the CREATING or UPDATING state for several hours as Resource Explorer discovers the information about your resources and populates the index. 
    */
  var State: js.UndefOr[IndexState] = js.undefined
}
object CreateIndexOutput {
  
  inline def apply(): CreateIndexOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexOutput]
  }
  
  extension [Self <: CreateIndexOutput](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setState(value: IndexState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
