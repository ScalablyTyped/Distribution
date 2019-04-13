package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConfigForUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[SecretArn] = js.undefined
}

object GitConfigForUpdate {
  @scala.inline
  def apply(SecretArn: SecretArn = null): GitConfigForUpdate = {
    val __obj = js.Dynamic.literal()
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn)
    __obj.asInstanceOf[GitConfigForUpdate]
  }
}

