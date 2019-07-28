package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.Artifact
import typings.awsDashLambda.awsDashLambdaMod.Credentials
import typings.awsDashLambda.awsDashLambdaMod.EncryptionKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionConfiguration extends js.Object {
  var actionConfiguration: Anon_Configuration
  var artifactCredentials: Credentials
  var continuationToken: js.UndefOr[String] = js.undefined
  var encryptionKey: js.UndefOr[EncryptionKey with Anon_KMS] = js.undefined
  var inputArtifacts: js.Array[Artifact]
  var outputArtifacts: js.Array[Artifact]
}

object Anon_ActionConfiguration {
  @scala.inline
  def apply(
    actionConfiguration: Anon_Configuration,
    artifactCredentials: Credentials,
    inputArtifacts: js.Array[Artifact],
    outputArtifacts: js.Array[Artifact],
    continuationToken: String = null,
    encryptionKey: EncryptionKey with Anon_KMS = null
  ): Anon_ActionConfiguration = {
    val __obj = js.Dynamic.literal(actionConfiguration = actionConfiguration, artifactCredentials = artifactCredentials, inputArtifacts = inputArtifacts, outputArtifacts = outputArtifacts)
    if (continuationToken != null) __obj.updateDynamic("continuationToken")(continuationToken)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    __obj.asInstanceOf[Anon_ActionConfiguration]
  }
}

