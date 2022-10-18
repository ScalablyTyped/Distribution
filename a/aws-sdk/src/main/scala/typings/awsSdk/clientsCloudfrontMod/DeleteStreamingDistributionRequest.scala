package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStreamingDistributionRequest extends StObject {
  
  /**
    * The distribution ID. 
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when you disabled the streaming distribution. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteStreamingDistributionRequest {
  
  inline def apply(Id: String): DeleteStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamingDistributionRequest]
  }
  
  extension [Self <: DeleteStreamingDistributionRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
