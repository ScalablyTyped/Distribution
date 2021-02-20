package typings.awsLambda.anon

import typings.awsLambda.codepipelineMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionConfiguration extends StObject {
  
  var actionConfiguration: Configuration = js.native
  
  var artifactCredentials: Credentials = js.native
  
  var continuationToken: js.UndefOr[String] = js.native
  
  var encryptionKey: js.UndefOr[EncryptionKeytypeKMS] = js.native
  
  var inputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact] = js.native
  
  var outputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact] = js.native
}
object ActionConfiguration {
  
  @scala.inline
  def apply(
    actionConfiguration: Configuration,
    artifactCredentials: Credentials,
    inputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact],
    outputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact]
  ): ActionConfiguration = {
    val __obj = js.Dynamic.literal(actionConfiguration = actionConfiguration.asInstanceOf[js.Any], artifactCredentials = artifactCredentials.asInstanceOf[js.Any], inputArtifacts = inputArtifacts.asInstanceOf[js.Any], outputArtifacts = outputArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfiguration]
  }
  
  @scala.inline
  implicit class ActionConfigurationMutableBuilder[Self <: ActionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionConfiguration(value: Configuration): Self = StObject.set(x, "actionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactCredentials(value: Credentials): Self = StObject.set(x, "artifactCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKeytypeKMS): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setInputArtifacts(value: js.Array[typings.awsLambda.codepipelineMod.Artifact]): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactsVarargs(value: typings.awsLambda.codepipelineMod.Artifact*): Self = StObject.set(x, "inputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifacts(value: js.Array[typings.awsLambda.codepipelineMod.Artifact]): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactsVarargs(value: typings.awsLambda.codepipelineMod.Artifact*): Self = StObject.set(x, "outputArtifacts", js.Array(value :_*))
  }
}
