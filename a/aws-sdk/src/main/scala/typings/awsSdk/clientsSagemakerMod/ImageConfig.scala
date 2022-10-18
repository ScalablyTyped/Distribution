package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfig extends StObject {
  
  /**
    * Set this to one of the following values:    Platform - The model image is hosted in Amazon ECR.    Vpc - The model image is hosted in a private Docker registry in your VPC.  
    */
  var RepositoryAccessMode: typings.awsSdk.clientsSagemakerMod.RepositoryAccessMode
  
  /**
    * (Optional) Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a value for this property only if you specified Vpc as the value for the RepositoryAccessMode field, and the private Docker registry where the model image is hosted requires authentication.
    */
  var RepositoryAuthConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RepositoryAuthConfig] = js.undefined
}
object ImageConfig {
  
  inline def apply(RepositoryAccessMode: RepositoryAccessMode): ImageConfig = {
    val __obj = js.Dynamic.literal(RepositoryAccessMode = RepositoryAccessMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfig]
  }
  
  extension [Self <: ImageConfig](x: Self) {
    
    inline def setRepositoryAccessMode(value: RepositoryAccessMode): Self = StObject.set(x, "RepositoryAccessMode", value.asInstanceOf[js.Any])
    
    inline def setRepositoryAuthConfig(value: RepositoryAuthConfig): Self = StObject.set(x, "RepositoryAuthConfig", value.asInstanceOf[js.Any])
    
    inline def setRepositoryAuthConfigUndefined: Self = StObject.set(x, "RepositoryAuthConfig", js.undefined)
  }
}
