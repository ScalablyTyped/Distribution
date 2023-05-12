package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRefreshScheduleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the refresh schedule.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The refresh schedule.
    */
  var RefreshSchedule: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RefreshSchedule] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeRefreshScheduleResponse {
  
  inline def apply(): DescribeRefreshScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRefreshScheduleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRefreshScheduleResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setRefreshSchedule(value: RefreshSchedule): Self = StObject.set(x, "RefreshSchedule", value.asInstanceOf[js.Any])
    
    inline def setRefreshScheduleUndefined: Self = StObject.set(x, "RefreshSchedule", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
