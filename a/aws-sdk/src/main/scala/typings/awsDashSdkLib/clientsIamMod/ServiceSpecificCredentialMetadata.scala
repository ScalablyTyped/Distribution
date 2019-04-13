package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceSpecificCredentialMetadata extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when the service-specific credential were created.
    */
  var CreateDate: dateType
  /**
    * The name of the service associated with the service-specific credential.
    */
  var ServiceName: serviceName
  /**
    * The unique identifier for the service-specific credential.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId
  /**
    * The generated user name for the service-specific credential.
    */
  var ServiceUserName: serviceUserName
  /**
    * The status of the service-specific credential. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType
  /**
    * The name of the IAM user associated with the service-specific credential.
    */
  var UserName: userNameType
}

object ServiceSpecificCredentialMetadata {
  @scala.inline
  def apply(
    CreateDate: dateType,
    ServiceName: serviceName,
    ServiceSpecificCredentialId: serviceSpecificCredentialId,
    ServiceUserName: serviceUserName,
    Status: statusType,
    UserName: userNameType
  ): ServiceSpecificCredentialMetadata = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate, ServiceName = ServiceName, ServiceSpecificCredentialId = ServiceSpecificCredentialId, ServiceUserName = ServiceUserName, Status = Status.asInstanceOf[js.Any], UserName = UserName)
  
    __obj.asInstanceOf[ServiceSpecificCredentialMetadata]
  }
}

