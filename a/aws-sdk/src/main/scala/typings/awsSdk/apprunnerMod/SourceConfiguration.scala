package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConfiguration extends StObject {
  
  /**
    * Describes the resources that are needed to authenticate access to some source repositories.
    */
  var AuthenticationConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.AuthenticationConfiguration] = js.undefined
  
  /**
    * If true, continuous integration from the source repository is enabled for the App Runner service. Each repository change (including any source code commit or new image version) starts a deployment. Default: App Runner sets to false for a source image that uses an ECR Public repository or an ECR repository that's in an Amazon Web Services account other than the one that the service is in. App Runner sets to true in all other cases (which currently include a source code repository or a source image using a same-account ECR repository).
    */
  var AutoDeploymentsEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The description of a source code repository. You must provide either this member or ImageRepository (but not both).
    */
  var CodeRepository: js.UndefOr[typings.awsSdk.apprunnerMod.CodeRepository] = js.undefined
  
  /**
    * The description of a source image repository. You must provide either this member or CodeRepository (but not both).
    */
  var ImageRepository: js.UndefOr[typings.awsSdk.apprunnerMod.ImageRepository] = js.undefined
}
object SourceConfiguration {
  
  inline def apply(): SourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfiguration]
  }
  
  extension [Self <: SourceConfiguration](x: Self) {
    
    inline def setAuthenticationConfiguration(value: AuthenticationConfiguration): Self = StObject.set(x, "AuthenticationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationConfigurationUndefined: Self = StObject.set(x, "AuthenticationConfiguration", js.undefined)
    
    inline def setAutoDeploymentsEnabled(value: NullableBoolean): Self = StObject.set(x, "AutoDeploymentsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoDeploymentsEnabledUndefined: Self = StObject.set(x, "AutoDeploymentsEnabled", js.undefined)
    
    inline def setCodeRepository(value: CodeRepository): Self = StObject.set(x, "CodeRepository", value.asInstanceOf[js.Any])
    
    inline def setCodeRepositoryUndefined: Self = StObject.set(x, "CodeRepository", js.undefined)
    
    inline def setImageRepository(value: ImageRepository): Self = StObject.set(x, "ImageRepository", value.asInstanceOf[js.Any])
    
    inline def setImageRepositoryUndefined: Self = StObject.set(x, "ImageRepository", js.undefined)
  }
}
