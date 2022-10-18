package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingDistributionConfigRequest extends StObject {
  
  /**
    * The streaming distribution's ID.
    */
  var Id: String
}
object GetStreamingDistributionConfigRequest {
  
  inline def apply(Id: String): GetStreamingDistributionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingDistributionConfigRequest]
  }
  
  extension [Self <: GetStreamingDistributionConfigRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
