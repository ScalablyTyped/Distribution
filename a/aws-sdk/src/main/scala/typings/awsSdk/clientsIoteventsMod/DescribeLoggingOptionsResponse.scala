package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingOptionsResponse extends StObject {
  
  /**
    * The current settings of the AWS IoT Events logging options.
    */
  var loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
}
object DescribeLoggingOptionsResponse {
  
  inline def apply(): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
  
  extension [Self <: DescribeLoggingOptionsResponse](x: Self) {
    
    inline def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
    
    inline def setLoggingOptionsUndefined: Self = StObject.set(x, "loggingOptions", js.undefined)
  }
}
