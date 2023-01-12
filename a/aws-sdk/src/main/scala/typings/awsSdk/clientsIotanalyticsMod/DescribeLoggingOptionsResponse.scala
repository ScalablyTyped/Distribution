package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingOptionsResponse extends StObject {
  
  /**
    * The current settings of the IoT Analytics logging options.
    */
  var loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
}
object DescribeLoggingOptionsResponse {
  
  inline def apply(): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
    
    inline def setLoggingOptionsUndefined: Self = StObject.set(x, "loggingOptions", js.undefined)
  }
}
