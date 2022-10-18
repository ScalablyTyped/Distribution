package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionsRequest extends StObject {
  
  /**
    * The name of the distribution for which to return information. When omitted, the response includes all of your distributions in the Amazon Web Services Region where the request is made.
    */
  var distributionName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetDistributions request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetDistributionsRequest {
  
  inline def apply(): GetDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionsRequest]
  }
  
  extension [Self <: GetDistributionsRequest](x: Self) {
    
    inline def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    inline def setDistributionNameUndefined: Self = StObject.set(x, "distributionName", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
