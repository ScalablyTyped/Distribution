package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingOptionsResponse extends StObject {
  
  /**
    * The current logging options.
    */
  var loggingOptions: LoggingOptions
}
object DescribeLoggingOptionsResponse {
  
  inline def apply(loggingOptions: LoggingOptions): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
  }
}
