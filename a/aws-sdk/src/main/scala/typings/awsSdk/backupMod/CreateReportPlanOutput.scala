package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReportPlanOutput extends StObject {
  
  /**
    * The date and time a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ReportPlanArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique name of the report plan.
    */
  var ReportPlanName: js.UndefOr[typings.awsSdk.backupMod.ReportPlanName] = js.undefined
}
object CreateReportPlanOutput {
  
  inline def apply(): CreateReportPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReportPlanOutput]
  }
  
  extension [Self <: CreateReportPlanOutput](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setReportPlanArn(value: ARN): Self = StObject.set(x, "ReportPlanArn", value.asInstanceOf[js.Any])
    
    inline def setReportPlanArnUndefined: Self = StObject.set(x, "ReportPlanArn", js.undefined)
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
    
    inline def setReportPlanNameUndefined: Self = StObject.set(x, "ReportPlanName", js.undefined)
  }
}
