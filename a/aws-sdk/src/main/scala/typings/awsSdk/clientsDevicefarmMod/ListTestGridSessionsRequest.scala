package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestGridSessionsRequest extends StObject {
  
  /**
    * Return only sessions created after this time.
    */
  var creationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Return only sessions created before this time.
    */
  var creationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Return only sessions that ended after this time.
    */
  var endTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Return only sessions that ended before this time.
    */
  var endTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Return only this many results at a time.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.undefined
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * ARN of a TestGridProject.
    */
  var projectArn: DeviceFarmArn
  
  /**
    * Return only sessions in this state.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.undefined
}
object ListTestGridSessionsRequest {
  
  inline def apply(projectArn: DeviceFarmArn): ListTestGridSessionsRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTestGridSessionsRequest] (val x: Self) extends AnyVal {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "creationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "creationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "creationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "creationTimeBefore", js.undefined)
    
    inline def setEndTimeAfter(value: js.Date): Self = StObject.set(x, "endTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setEndTimeAfterUndefined: Self = StObject.set(x, "endTimeAfter", js.undefined)
    
    inline def setEndTimeBefore(value: js.Date): Self = StObject.set(x, "endTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setEndTimeBeforeUndefined: Self = StObject.set(x, "endTimeBefore", js.undefined)
    
    inline def setMaxResult(value: MaxPageSize): Self = StObject.set(x, "maxResult", value.asInstanceOf[js.Any])
    
    inline def setMaxResultUndefined: Self = StObject.set(x, "maxResult", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TestGridSessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
