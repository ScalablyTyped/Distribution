package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansCoverageResponse extends StObject {
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
  
  /**
    * The amount of spend that your Savings Plans covered.
    */
  var SavingsPlansCoverages: typings.awsSdk.clientsCostexplorerMod.SavingsPlansCoverages
}
object GetSavingsPlansCoverageResponse {
  
  inline def apply(SavingsPlansCoverages: SavingsPlansCoverages): GetSavingsPlansCoverageResponse = {
    val __obj = js.Dynamic.literal(SavingsPlansCoverages = SavingsPlansCoverages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansCoverageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSavingsPlansCoverageResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSavingsPlansCoverages(value: SavingsPlansCoverages): Self = StObject.set(x, "SavingsPlansCoverages", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansCoveragesVarargs(value: SavingsPlansCoverage*): Self = StObject.set(x, "SavingsPlansCoverages", js.Array(value*))
  }
}
