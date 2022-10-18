package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamConfig extends StObject {
  
  /**
    * The signing Amazon Web Services Region for IAM authorization.
    */
  var signingRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The signing service name for IAM authorization.
    */
  var signingServiceName: js.UndefOr[String] = js.undefined
}
object AwsIamConfig {
  
  inline def apply(): AwsIamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamConfig]
  }
  
  extension [Self <: AwsIamConfig](x: Self) {
    
    inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
    
    inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
    
    inline def setSigningServiceName(value: String): Self = StObject.set(x, "signingServiceName", value.asInstanceOf[js.Any])
    
    inline def setSigningServiceNameUndefined: Self = StObject.set(x, "signingServiceName", js.undefined)
  }
}
