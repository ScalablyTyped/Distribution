package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpEndpointBufferingHints extends StObject {
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes). 
    */
  var IntervalInSeconds: js.UndefOr[HttpEndpointBufferingIntervalInSeconds] = js.undefined
  
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.  We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec, the value should be 10 MB or higher. 
    */
  var SizeInMBs: js.UndefOr[HttpEndpointBufferingSizeInMBs] = js.undefined
}
object HttpEndpointBufferingHints {
  
  inline def apply(): HttpEndpointBufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointBufferingHints]
  }
  
  extension [Self <: HttpEndpointBufferingHints](x: Self) {
    
    inline def setIntervalInSeconds(value: HttpEndpointBufferingIntervalInSeconds): Self = StObject.set(x, "IntervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalInSecondsUndefined: Self = StObject.set(x, "IntervalInSeconds", js.undefined)
    
    inline def setSizeInMBs(value: HttpEndpointBufferingSizeInMBs): Self = StObject.set(x, "SizeInMBs", value.asInstanceOf[js.Any])
    
    inline def setSizeInMBsUndefined: Self = StObject.set(x, "SizeInMBs", js.undefined)
  }
}
