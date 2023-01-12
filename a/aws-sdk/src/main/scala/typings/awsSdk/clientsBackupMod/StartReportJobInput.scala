package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReportJobInput extends StObject {
  
  /**
    * A customer-chosen string that you can use to distinguish between otherwise identical calls to StartReportJobInput. Retrying a successful request with the same idempotency token results in a success message with no action taken.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * The unique name of a report plan.
    */
  var ReportPlanName: typings.awsSdk.clientsBackupMod.ReportPlanName
}
object StartReportJobInput {
  
  inline def apply(ReportPlanName: ReportPlanName): StartReportJobInput = {
    val __obj = js.Dynamic.literal(ReportPlanName = ReportPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReportJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReportJobInput] (val x: Self) extends AnyVal {
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
  }
}
