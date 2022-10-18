package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledAuditRequest extends StObject {
  
  /**
    * The name of the scheduled audit whose information you want to get.
    */
  var scheduledAuditName: ScheduledAuditName
}
object DescribeScheduledAuditRequest {
  
  inline def apply(scheduledAuditName: ScheduledAuditName): DescribeScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledAuditRequest]
  }
  
  extension [Self <: DescribeScheduledAuditRequest](x: Self) {
    
    inline def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
  }
}
