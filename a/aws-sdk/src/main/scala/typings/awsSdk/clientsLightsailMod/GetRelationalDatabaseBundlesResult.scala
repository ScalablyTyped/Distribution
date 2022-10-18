package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseBundlesResult extends StObject {
  
  /**
    * An object describing the result of your get relational database bundles request.
    */
  var bundles: js.UndefOr[RelationalDatabaseBundleList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseBundles request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetRelationalDatabaseBundlesResult {
  
  inline def apply(): GetRelationalDatabaseBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseBundlesResult]
  }
  
  extension [Self <: GetRelationalDatabaseBundlesResult](x: Self) {
    
    inline def setBundles(value: RelationalDatabaseBundleList): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: RelationalDatabaseBundle*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
