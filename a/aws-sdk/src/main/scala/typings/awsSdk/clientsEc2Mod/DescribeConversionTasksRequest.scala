package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConversionTasksRequest extends StObject {
  
  /**
    * The conversion task IDs.
    */
  var ConversionTaskIds: js.UndefOr[ConversionIdStringList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DescribeConversionTasksRequest {
  
  inline def apply(): DescribeConversionTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConversionTasksRequest]
  }
  
  extension [Self <: DescribeConversionTasksRequest](x: Self) {
    
    inline def setConversionTaskIds(value: ConversionIdStringList): Self = StObject.set(x, "ConversionTaskIds", value.asInstanceOf[js.Any])
    
    inline def setConversionTaskIdsUndefined: Self = StObject.set(x, "ConversionTaskIds", js.undefined)
    
    inline def setConversionTaskIdsVarargs(value: ConversionTaskId*): Self = StObject.set(x, "ConversionTaskIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
