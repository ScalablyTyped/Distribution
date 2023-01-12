package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetReportsInput extends StObject {
  
  /**
    *  An array of ARNs that identify the Report objects to return. 
    */
  var reportArns: ReportArns
}
object BatchGetReportsInput {
  
  inline def apply(reportArns: ReportArns): BatchGetReportsInput = {
    val __obj = js.Dynamic.literal(reportArns = reportArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetReportsInput] (val x: Self) extends AnyVal {
    
    inline def setReportArns(value: ReportArns): Self = StObject.set(x, "reportArns", value.asInstanceOf[js.Any])
    
    inline def setReportArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportArns", js.Array(value*))
  }
}
