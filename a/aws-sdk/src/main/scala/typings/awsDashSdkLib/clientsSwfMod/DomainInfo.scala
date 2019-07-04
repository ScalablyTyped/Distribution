package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainInfo extends js.Object {
  /**
    * The ARN of the domain.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The description of the domain provided through RegisterDomain.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the domain. This name is unique within the account.
    */
  var name: DomainName
  /**
    * The status of the domain:    REGISTERED – The domain is properly registered and available. You can use this domain for registering types and creating new workflow executions.     DEPRECATED – The domain was deprecated using DeprecateDomain, but is still in use. You should not create new workflow executions in this domain.   
    */
  var status: RegistrationStatus
}

object DomainInfo {
  @scala.inline
  def apply(name: DomainName, status: RegistrationStatus, arn: Arn = null, description: Description = null): DomainInfo = {
    val __obj = js.Dynamic.literal(name = name, status = status.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[DomainInfo]
  }
}

