package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConfigForUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SecretArn] = js.native
}

object GitConfigForUpdate {
  @scala.inline
  def apply(SecretArn: SecretArn = null): GitConfigForUpdate = {
    val __obj = js.Dynamic.literal()
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConfigForUpdate]
  }
}

