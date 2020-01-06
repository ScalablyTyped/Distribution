package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolDescriptionType extends js.Object {
  /**
    * The date the user pool description was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * The ID in a user pool description.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.native
  /**
    * The AWS Lambda configuration information in a user pool description.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  /**
    * The date the user pool description was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The name in a user pool description.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.native
  /**
    * The user pool status in a user pool description.
    */
  var Status: js.UndefOr[StatusType] = js.native
}

object UserPoolDescriptionType {
  @scala.inline
  def apply(
    CreationDate: DateType = null,
    Id: UserPoolIdType = null,
    LambdaConfig: LambdaConfigType = null,
    LastModifiedDate: DateType = null,
    Name: UserPoolNameType = null,
    Status: StatusType = null
  ): UserPoolDescriptionType = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDescriptionType]
  }
}

