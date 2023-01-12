package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetReportGroupsOutput extends StObject {
  
  /**
    *  The array of report groups returned by BatchGetReportGroups. 
    */
  var reportGroups: js.UndefOr[ReportGroups] = js.undefined
  
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a ReportGroup. 
    */
  var reportGroupsNotFound: js.UndefOr[ReportGroupArns] = js.undefined
}
object BatchGetReportGroupsOutput {
  
  inline def apply(): BatchGetReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportGroupsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetReportGroupsOutput] (val x: Self) extends AnyVal {
    
    inline def setReportGroups(value: ReportGroups): Self = StObject.set(x, "reportGroups", value.asInstanceOf[js.Any])
    
    inline def setReportGroupsNotFound(value: ReportGroupArns): Self = StObject.set(x, "reportGroupsNotFound", value.asInstanceOf[js.Any])
    
    inline def setReportGroupsNotFoundUndefined: Self = StObject.set(x, "reportGroupsNotFound", js.undefined)
    
    inline def setReportGroupsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportGroupsNotFound", js.Array(value*))
    
    inline def setReportGroupsUndefined: Self = StObject.set(x, "reportGroups", js.undefined)
    
    inline def setReportGroupsVarargs(value: ReportGroup*): Self = StObject.set(x, "reportGroups", js.Array(value*))
  }
}
