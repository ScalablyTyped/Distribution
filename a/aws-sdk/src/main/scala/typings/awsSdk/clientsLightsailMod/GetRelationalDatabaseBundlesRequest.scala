package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseBundlesRequest extends StObject {
  
  /**
    * A Boolean value that indicates whether to include inactive (unavailable) bundles in the response of your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetRelationalDatabaseBundles request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetRelationalDatabaseBundlesRequest {
  
  inline def apply(): GetRelationalDatabaseBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseBundlesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRelationalDatabaseBundlesRequest] (val x: Self) extends AnyVal {
    
    inline def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    inline def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
