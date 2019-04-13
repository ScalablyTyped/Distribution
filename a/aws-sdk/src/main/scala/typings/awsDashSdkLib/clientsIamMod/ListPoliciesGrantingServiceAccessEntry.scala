package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesGrantingServiceAccessEntry extends js.Object {
  /**
    * The PoliciesGrantingServiceAccess object that contains details about the policy.
    */
  var Policies: js.UndefOr[policyGrantingServiceAccessListType] = js.undefined
  /**
    * The namespace of the service that was accessed. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: js.UndefOr[serviceNamespaceType] = js.undefined
}

object ListPoliciesGrantingServiceAccessEntry {
  @scala.inline
  def apply(
    Policies: policyGrantingServiceAccessListType = null,
    ServiceNamespace: serviceNamespaceType = null
  ): ListPoliciesGrantingServiceAccessEntry = {
    val __obj = js.Dynamic.literal()
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    if (ServiceNamespace != null) __obj.updateDynamic("ServiceNamespace")(ServiceNamespace)
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessEntry]
  }
}

