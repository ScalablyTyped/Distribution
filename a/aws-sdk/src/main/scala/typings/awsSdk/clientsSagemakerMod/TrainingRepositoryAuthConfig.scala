package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingRepositoryAuthConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function used to give SageMaker access credentials to your private Docker registry.
    */
  var TrainingRepositoryCredentialsProviderArn: typings.awsSdk.clientsSagemakerMod.TrainingRepositoryCredentialsProviderArn
}
object TrainingRepositoryAuthConfig {
  
  inline def apply(TrainingRepositoryCredentialsProviderArn: TrainingRepositoryCredentialsProviderArn): TrainingRepositoryAuthConfig = {
    val __obj = js.Dynamic.literal(TrainingRepositoryCredentialsProviderArn = TrainingRepositoryCredentialsProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingRepositoryAuthConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingRepositoryAuthConfig] (val x: Self) extends AnyVal {
    
    inline def setTrainingRepositoryCredentialsProviderArn(value: TrainingRepositoryCredentialsProviderArn): Self = StObject.set(x, "TrainingRepositoryCredentialsProviderArn", value.asInstanceOf[js.Any])
  }
}
