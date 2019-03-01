package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionConfiguration extends js.Object {
  var actionConfiguration: Anon_Configuration
  var artifactCredentials: awsDashLambdaLib.awsDashLambdaMod.Credentials
  var continuationToken: js.UndefOr[java.lang.String] = js.undefined
  var encryptionKey: js.UndefOr[awsDashLambdaLib.awsDashLambdaMod.EncryptionKey with Anon_KMS] = js.undefined
  var inputArtifacts: js.Array[awsDashLambdaLib.awsDashLambdaMod.Artifact]
  var outputArtifacts: js.Array[awsDashLambdaLib.awsDashLambdaMod.Artifact]
}

object Anon_ActionConfiguration {
  @scala.inline
  def apply(
    actionConfiguration: Anon_Configuration,
    artifactCredentials: awsDashLambdaLib.awsDashLambdaMod.Credentials,
    inputArtifacts: js.Array[awsDashLambdaLib.awsDashLambdaMod.Artifact],
    outputArtifacts: js.Array[awsDashLambdaLib.awsDashLambdaMod.Artifact],
    continuationToken: java.lang.String = null,
    encryptionKey: awsDashLambdaLib.awsDashLambdaMod.EncryptionKey with Anon_KMS = null
  ): Anon_ActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionConfiguration")(actionConfiguration)
    __obj.updateDynamic("artifactCredentials")(artifactCredentials)
    __obj.updateDynamic("inputArtifacts")(inputArtifacts)
    __obj.updateDynamic("outputArtifacts")(outputArtifacts)
    if (continuationToken != null) __obj.updateDynamic("continuationToken")(continuationToken)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    __obj.asInstanceOf[Anon_ActionConfiguration]
  }
}

