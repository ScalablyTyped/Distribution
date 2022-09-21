package typings.awsSdk.applicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportDefinitionsResult extends StObject {
  
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The retrieved reports.
    */
  var reportDefinitions: js.UndefOr[ReportDefinitionList] = js.undefined
}
object ListReportDefinitionsResult {
  
  inline def apply(): ListReportDefinitionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportDefinitionsResult]
  }
  
  extension [Self <: ListReportDefinitionsResult](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReportDefinitions(value: ReportDefinitionList): Self = StObject.set(x, "reportDefinitions", value.asInstanceOf[js.Any])
    
    inline def setReportDefinitionsUndefined: Self = StObject.set(x, "reportDefinitions", js.undefined)
    
    inline def setReportDefinitionsVarargs(value: ReportDefinition*): Self = StObject.set(x, "reportDefinitions", js.Array(value*))
  }
}
