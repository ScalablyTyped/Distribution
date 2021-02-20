package typings.algoliasearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.OptionalCredentials<@algolia/client-recommendation.@algolia/client-recommendation.RecommendationClientOptions> */
@js.native
trait OptionalCredentialsRecomm extends StObject {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var appId: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[String] = js.native
}
object OptionalCredentialsRecomm {
  
  @scala.inline
  def apply(): OptionalCredentialsRecomm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalCredentialsRecomm]
  }
  
  @scala.inline
  implicit class OptionalCredentialsRecommMutableBuilder[Self <: OptionalCredentialsRecomm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
