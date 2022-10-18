package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamResponse extends StObject {
  
  /**
    * Information about the stream.
    */
  var streamInfo: js.UndefOr[StreamInfo] = js.undefined
}
object DescribeStreamResponse {
  
  inline def apply(): DescribeStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamResponse]
  }
  
  extension [Self <: DescribeStreamResponse](x: Self) {
    
    inline def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    inline def setStreamInfoUndefined: Self = StObject.set(x, "streamInfo", js.undefined)
  }
}
