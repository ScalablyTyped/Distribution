package typings.awsLambda.anon

import typings.awsLambda.codepipelineMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionConfiguration extends js.Object {
  var actionConfiguration: Configuration
  var artifactCredentials: Credentials
  var continuationToken: js.UndefOr[String] = js.undefined
  var encryptionKey: js.UndefOr[EncryptionKeytypeKMS] = js.undefined
  var inputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact]
  var outputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact]
}

object ActionConfiguration {
  @scala.inline
  def apply(
    actionConfiguration: Configuration,
    artifactCredentials: Credentials,
    inputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact],
    outputArtifacts: js.Array[typings.awsLambda.codepipelineMod.Artifact],
    continuationToken: String = null,
    encryptionKey: EncryptionKeytypeKMS = null
  ): ActionConfiguration = {
    val __obj = js.Dynamic.literal(actionConfiguration = actionConfiguration.asInstanceOf[js.Any], artifactCredentials = artifactCredentials.asInstanceOf[js.Any], inputArtifacts = inputArtifacts.asInstanceOf[js.Any], outputArtifacts = outputArtifacts.asInstanceOf[js.Any])
    if (continuationToken != null) __obj.updateDynamic("continuationToken")(continuationToken.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfiguration]
  }
}

