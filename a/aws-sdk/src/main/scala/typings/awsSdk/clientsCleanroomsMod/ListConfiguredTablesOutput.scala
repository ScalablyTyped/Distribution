package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfiguredTablesOutput extends StObject {
  
  /**
    * The configured tables listed by the request.
    */
  var configuredTableSummaries: ConfiguredTableSummaryList
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListConfiguredTablesOutput {
  
  inline def apply(configuredTableSummaries: ConfiguredTableSummaryList): ListConfiguredTablesOutput = {
    val __obj = js.Dynamic.literal(configuredTableSummaries = configuredTableSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfiguredTablesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConfiguredTablesOutput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableSummaries(value: ConfiguredTableSummaryList): Self = StObject.set(x, "configuredTableSummaries", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableSummariesVarargs(value: ConfiguredTableSummary*): Self = StObject.set(x, "configuredTableSummaries", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
