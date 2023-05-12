package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataQualityRulesetsResponse extends StObject {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A paginated list of rulesets for the specified list of Glue tables.
    */
  var Rulesets: js.UndefOr[DataQualityRulesetList] = js.undefined
}
object ListDataQualityRulesetsResponse {
  
  inline def apply(): ListDataQualityRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataQualityRulesetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataQualityRulesetsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRulesets(value: DataQualityRulesetList): Self = StObject.set(x, "Rulesets", value.asInstanceOf[js.Any])
    
    inline def setRulesetsUndefined: Self = StObject.set(x, "Rulesets", js.undefined)
    
    inline def setRulesetsVarargs(value: DataQualityRulesetListDetails*): Self = StObject.set(x, "Rulesets", js.Array(value*))
  }
}
