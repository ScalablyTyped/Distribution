package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSetRefreshPropertiesResponse extends StObject {
  
  /**
    * The dataset refresh properties.
    */
  var DataSetRefreshProperties: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataSetRefreshProperties] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeDataSetRefreshPropertiesResponse {
  
  inline def apply(): DescribeDataSetRefreshPropertiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSetRefreshPropertiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDataSetRefreshPropertiesResponse] (val x: Self) extends AnyVal {
    
    inline def setDataSetRefreshProperties(value: DataSetRefreshProperties): Self = StObject.set(x, "DataSetRefreshProperties", value.asInstanceOf[js.Any])
    
    inline def setDataSetRefreshPropertiesUndefined: Self = StObject.set(x, "DataSetRefreshProperties", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
