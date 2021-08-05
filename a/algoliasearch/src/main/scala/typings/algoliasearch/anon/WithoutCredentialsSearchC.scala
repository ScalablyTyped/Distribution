package typings.algoliasearch.anon

import typings.algoliaClientCommon.mod.AuthModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.WithoutCredentials<@algolia/client-search.@algolia/client-search.SearchClientOptions> */
trait WithoutCredentialsSearchC extends StObject {
  
  var authMode: js.UndefOr[AuthModeType] = js.undefined
}
object WithoutCredentialsSearchC {
  
  inline def apply(): WithoutCredentialsSearchC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithoutCredentialsSearchC]
  }
  
  extension [Self <: WithoutCredentialsSearchC](x: Self) {
    
    inline def setAuthMode(value: AuthModeType): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
  }
}
