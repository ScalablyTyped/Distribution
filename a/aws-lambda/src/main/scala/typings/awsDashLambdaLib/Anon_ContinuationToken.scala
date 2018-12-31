package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContinuationToken extends js.Object {
  var actionConfiguration: Anon_Configuration
  var artifactCredentials: awsDashLambdaLib.awsDashLambdaMod.Credentials
  var continuationToken: js.UndefOr[java.lang.String] = js.undefined
  var encryptionKey: js.UndefOr[awsDashLambdaLib.awsDashLambdaMod.EncryptionKey with Anon_Type] = js.undefined
  var inputArtifacts: js.Array[awsDashLambdaLib.awsDashLambdaMod.Artifact]
  var outputArtifacts: js.Array[awsDashLambdaLib.awsDashLambdaMod.Artifact]
}

