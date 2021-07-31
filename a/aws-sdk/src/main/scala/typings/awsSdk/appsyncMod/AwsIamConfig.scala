package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamConfig extends StObject {
  
  /**
    * The signing region for AWS IAM authorization.
    */
  var signingRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The signing service name for AWS IAM authorization.
    */
  var signingServiceName: js.UndefOr[String] = js.undefined
}
object AwsIamConfig {
  
  @scala.inline
  def apply(): AwsIamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamConfig]
  }
  
  @scala.inline
  implicit class AwsIamConfigMutableBuilder[Self <: AwsIamConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
    
    @scala.inline
    def setSigningServiceName(value: String): Self = StObject.set(x, "signingServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningServiceNameUndefined: Self = StObject.set(x, "signingServiceName", js.undefined)
  }
}
