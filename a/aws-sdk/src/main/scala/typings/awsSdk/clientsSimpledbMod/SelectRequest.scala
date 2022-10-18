package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectRequest extends StObject {
  
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string informing Amazon SimpleDB where to start the next list of ItemNames.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The expression used to query the domain.
    */
  var SelectExpression: String
}
object SelectRequest {
  
  inline def apply(SelectExpression: String): SelectRequest = {
    val __obj = js.Dynamic.literal(SelectExpression = SelectExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRequest]
  }
  
  extension [Self <: SelectRequest](x: Self) {
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSelectExpression(value: String): Self = StObject.set(x, "SelectExpression", value.asInstanceOf[js.Any])
  }
}
