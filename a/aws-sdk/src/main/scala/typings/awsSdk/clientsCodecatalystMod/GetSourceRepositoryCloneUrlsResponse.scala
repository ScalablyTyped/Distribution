package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSourceRepositoryCloneUrlsResponse extends StObject {
  
  /**
    * The HTTPS URL to use when cloning the source repository.
    */
  var https: String
}
object GetSourceRepositoryCloneUrlsResponse {
  
  inline def apply(https: String): GetSourceRepositoryCloneUrlsResponse = {
    val __obj = js.Dynamic.literal(https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceRepositoryCloneUrlsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSourceRepositoryCloneUrlsResponse] (val x: Self) extends AnyVal {
    
    inline def setHttps(value: String): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
  }
}
