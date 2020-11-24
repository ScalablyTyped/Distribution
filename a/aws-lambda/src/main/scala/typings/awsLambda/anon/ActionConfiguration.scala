package typings.awsLambda.anon

import typings.awsLambda.codepipelineMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionConfiguration extends js.Object {
  
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
  implicit class ActionConfigurationOps[Self <: ActionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionConfiguration(value: Configuration): Self = this.set("actionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactCredentials(value: Credentials): Self = this.set("artifactCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactsVarargs(value: typings.awsLambda.codepipelineMod.Artifact*): Self = this.set("inputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setInputArtifacts(value: js.Array[typings.awsLambda.codepipelineMod.Artifact]): Self = this.set("inputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactsVarargs(value: typings.awsLambda.codepipelineMod.Artifact*): Self = this.set("outputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifacts(value: js.Array[typings.awsLambda.codepipelineMod.Artifact]): Self = this.set("outputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationToken(value: String): Self = this.set("continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("continuationToken", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: EncryptionKeytypeKMS): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
  }
}
