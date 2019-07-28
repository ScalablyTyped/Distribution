package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolDescriptionType extends js.Object {
  /**
    * The date the user pool description was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The ID in a user pool description.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.undefined
  /**
    * The AWS Lambda configuration information in a user pool description.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  /**
    * The date the user pool description was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The name in a user pool description.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.undefined
  /**
    * The user pool status in a user pool description.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
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
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDescriptionType]
  }
}

