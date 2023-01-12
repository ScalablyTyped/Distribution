package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDistributionRequest extends StObject {
  
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsSdk.clientsCloudfrontMod.DistributionConfig
}
object CreateDistributionRequest {
  
  inline def apply(DistributionConfig: DistributionConfig): CreateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDistributionRequest] (val x: Self) extends AnyVal {
    
    inline def setDistributionConfig(value: DistributionConfig): Self = StObject.set(x, "DistributionConfig", value.asInstanceOf[js.Any])
  }
}
