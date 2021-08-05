package typings.awsLambda.anon

import typings.awsLambda.codepipelineMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionConfiguration extends StObject {
  
  var actionConfiguration: Configuration
  
  var artifactCredentials: Credentials
  
  var continuationToken: js.UndefOr[String] = js.undefined
  
  var encryptionKey: js.UndefOr[EncryptionKeytypeKMS] = js.undefined
  
  var inputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact]
  
  var outputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact]
}
object ActionConfiguration {
  
  inline def apply(
    actionConfiguration: Configuration,
    artifactCredentials: Credentials,
    inputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact],
    outputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact]
  ): ActionConfiguration = {
    val __obj = js.Dynamic.literal(actionConfiguration = actionConfiguration.asInstanceOf[js.Any], artifactCredentials = artifactCredentials.asInstanceOf[js.Any], inputArtifacts = inputArtifacts.asInstanceOf[js.Any], outputArtifacts = outputArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfiguration]
  }
  
  extension [Self <: ActionConfiguration](x: Self) {
    
    inline def setActionConfiguration(value: Configuration): Self = StObject.set(x, "actionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setArtifactCredentials(value: Credentials): Self = StObject.set(x, "artifactCredentials", value.asInstanceOf[js.Any])
    
    inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    inline def setEncryptionKey(value: EncryptionKeytypeKMS): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setInputArtifacts(value: js.Array[typings.awsLambda.codepipelineMod.Artifact]): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsVarargs(value: typings.awsLambda.codepipelineMod.Artifact*): Self = StObject.set(x, "inputArtifacts", js.Array(value :_*))
    
    inline def setOutputArtifacts(value: js.Array[typings.awsLambda.codepipelineMod.Artifact]): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsVarargs(value: typings.awsLambda.codepipelineMod.Artifact*): Self = StObject.set(x, "outputArtifacts", js.Array(value :_*))
  }
}
