package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryPointsResponse extends StObject {
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The returned recovery point objects.
    */
  var recoveryPoints: js.UndefOr[RecoveryPointList] = js.undefined
}
object ListRecoveryPointsResponse {
  
  inline def apply(): ListRecoveryPointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecoveryPointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecoveryPointsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecoveryPoints(value: RecoveryPointList): Self = StObject.set(x, "recoveryPoints", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointsUndefined: Self = StObject.set(x, "recoveryPoints", js.undefined)
    
    inline def setRecoveryPointsVarargs(value: RecoveryPoint*): Self = StObject.set(x, "recoveryPoints", js.Array(value*))
  }
}
