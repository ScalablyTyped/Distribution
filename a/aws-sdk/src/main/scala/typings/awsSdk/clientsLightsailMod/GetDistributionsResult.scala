package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionsResult extends StObject {
  
  /**
    * An array of objects that describe your distributions.
    */
  var distributions: js.UndefOr[DistributionList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDistributions request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetDistributionsResult {
  
  inline def apply(): GetDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDistributionsResult] (val x: Self) extends AnyVal {
    
    inline def setDistributions(value: DistributionList): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: LightsailDistribution*): Self = StObject.set(x, "distributions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
