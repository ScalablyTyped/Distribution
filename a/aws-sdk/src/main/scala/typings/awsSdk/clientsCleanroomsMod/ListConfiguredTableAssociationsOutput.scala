package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfiguredTableAssociationsOutput extends StObject {
  
  /**
    * The retrieved list of configured table associations.
    */
  var configuredTableAssociationSummaries: ConfiguredTableAssociationSummaryList
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListConfiguredTableAssociationsOutput {
  
  inline def apply(configuredTableAssociationSummaries: ConfiguredTableAssociationSummaryList): ListConfiguredTableAssociationsOutput = {
    val __obj = js.Dynamic.literal(configuredTableAssociationSummaries = configuredTableAssociationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfiguredTableAssociationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConfiguredTableAssociationsOutput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableAssociationSummaries(value: ConfiguredTableAssociationSummaryList): Self = StObject.set(x, "configuredTableAssociationSummaries", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableAssociationSummariesVarargs(value: ConfiguredTableAssociationSummary*): Self = StObject.set(x, "configuredTableAssociationSummaries", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
