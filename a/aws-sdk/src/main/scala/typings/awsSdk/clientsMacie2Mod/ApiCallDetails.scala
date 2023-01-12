package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiCallDetails extends StObject {
  
  /**
    * The name of the operation that was invoked most recently and produced the finding.
    */
  var api: js.UndefOr[string] = js.undefined
  
  /**
    * The URL of the Amazon Web Service that provides the operation, for example: s3.amazonaws.com.
    */
  var apiServiceName: js.UndefOr[string] = js.undefined
  
  /**
    * The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced the finding.
    */
  var firstSeen: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was invoked and produced the finding.
    */
  var lastSeen: js.UndefOr[js.Date] = js.undefined
}
object ApiCallDetails {
  
  inline def apply(): ApiCallDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCallDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiCallDetails] (val x: Self) extends AnyVal {
    
    inline def setApi(value: string): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiServiceName(value: string): Self = StObject.set(x, "apiServiceName", value.asInstanceOf[js.Any])
    
    inline def setApiServiceNameUndefined: Self = StObject.set(x, "apiServiceName", js.undefined)
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setFirstSeen(value: js.Date): Self = StObject.set(x, "firstSeen", value.asInstanceOf[js.Any])
    
    inline def setFirstSeenUndefined: Self = StObject.set(x, "firstSeen", js.undefined)
    
    inline def setLastSeen(value: js.Date): Self = StObject.set(x, "lastSeen", value.asInstanceOf[js.Any])
    
    inline def setLastSeenUndefined: Self = StObject.set(x, "lastSeen", js.undefined)
  }
}
