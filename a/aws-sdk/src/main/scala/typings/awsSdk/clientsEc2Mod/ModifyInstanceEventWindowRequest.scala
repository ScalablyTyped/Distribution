package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceEventWindowRequest extends StObject {
  
  /**
    * The cron expression of the event window, for example, * 0-4,20-23 * * 1,5. Constraints:   Only hour and day of the week values are supported.   For day of the week values, you can specify either integers 0 through 6, or alternative single values SUN through SAT.   The minute, month, and year must be specified by *.   The hour value must be one or a multiple range, for example, 0-4 or 0-4,20-23.   Each hour range must be &gt;= 2 hours, for example, 0-2 or 20-23.   The event window must be &gt;= 4 hours. The combined total time ranges in the event window must be &gt;= 4 hours.   For more information about cron expressions, see cron on the Wikipedia website.
    */
  var CronExpression: js.UndefOr[InstanceEventWindowCronExpression] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the event window.
    */
  var InstanceEventWindowId: typings.awsSdk.clientsEc2Mod.InstanceEventWindowId
  
  /**
    * The name of the event window.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The time ranges of the event window.
    */
  var TimeRanges: js.UndefOr[InstanceEventWindowTimeRangeRequestSet] = js.undefined
}
object ModifyInstanceEventWindowRequest {
  
  inline def apply(InstanceEventWindowId: InstanceEventWindowId): ModifyInstanceEventWindowRequest = {
    val __obj = js.Dynamic.literal(InstanceEventWindowId = InstanceEventWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceEventWindowRequest]
  }
  
  extension [Self <: ModifyInstanceEventWindowRequest](x: Self) {
    
    inline def setCronExpression(value: InstanceEventWindowCronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceEventWindowId(value: InstanceEventWindowId): Self = StObject.set(x, "InstanceEventWindowId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTimeRanges(value: InstanceEventWindowTimeRangeRequestSet): Self = StObject.set(x, "TimeRanges", value.asInstanceOf[js.Any])
    
    inline def setTimeRangesUndefined: Self = StObject.set(x, "TimeRanges", js.undefined)
    
    inline def setTimeRangesVarargs(value: InstanceEventWindowTimeRangeRequest*): Self = StObject.set(x, "TimeRanges", js.Array(value*))
  }
}
