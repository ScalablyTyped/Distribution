package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMonitorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource to describe.
    */
  var MonitorArn: Arn
}
object DescribeMonitorRequest {
  
  inline def apply(MonitorArn: Arn): DescribeMonitorRequest = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMonitorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMonitorRequest] (val x: Self) extends AnyVal {
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
