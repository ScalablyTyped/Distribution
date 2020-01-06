package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTemplateAliasRequest extends js.Object {
  /**
    * The name for the template alias. If you name a specific alias, you delete the version that the alias points to. You can specify the latest version of the template by providing the keyword $LATEST in the AliasName parameter. 
    */
  var AliasName: typings.awsDashSdk.clientsQuicksightMod.AliasName = js.native
  /**
    * The ID of the AWS account that contains the item to delete.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The ID for the template that the specified alias is for.
    */
  var TemplateId: RestrictiveResourceId = js.native
}

object DeleteTemplateAliasRequest {
  @scala.inline
  def apply(AliasName: AliasName, AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): DeleteTemplateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTemplateAliasRequest]
  }
}

