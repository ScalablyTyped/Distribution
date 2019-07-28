package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSecretVersionIdsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the secret.  Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret don't automatically get access to the new secret because the ARNs are different. 
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  /**
    * If present in the response, this value indicates that there's more output available than what's included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[NextTokenType] = js.undefined
  /**
    * The list of the currently available versions of the specified secret.
    */
  var Versions: js.UndefOr[SecretVersionsListType] = js.undefined
}

object ListSecretVersionIdsResponse {
  @scala.inline
  def apply(
    ARN: SecretARNType = null,
    Name: SecretNameType = null,
    NextToken: NextTokenType = null,
    Versions: SecretVersionsListType = null
  ): ListSecretVersionIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Versions != null) __obj.updateDynamic("Versions")(Versions)
    __obj.asInstanceOf[ListSecretVersionIdsResponse]
  }
}

