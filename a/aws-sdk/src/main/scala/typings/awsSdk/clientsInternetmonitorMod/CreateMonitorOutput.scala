package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitorOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor.
    */
  var Arn: MonitorArn
  
  /**
    * The status of a monitor.
    */
  var Status: MonitorConfigState
}
object CreateMonitorOutput {
  
  inline def apply(Arn: MonitorArn, Status: MonitorConfigState): CreateMonitorOutput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitorOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMonitorOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: MonitorArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: MonitorConfigState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
