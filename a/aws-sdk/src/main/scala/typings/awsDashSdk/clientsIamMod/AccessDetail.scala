package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessDetail extends js.Object {
  /**
    * The path of the Organizations entity (root, organizational unit, or account) from which an authenticated principal last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations entity attempted to access the service within the reporting period.
    */
  var EntityPath: js.UndefOr[organizationsEntityPathType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated principal most recently attempted to access the service. AWS does not report unauthenticated requests. This field is null if no principals in the reported Organizations entity attempted to access the service within the reporting period.
    */
  var LastAuthenticatedTime: js.UndefOr[dateType] = js.undefined
  /**
    * The Region where the last service access attempt occurred. This field is null if no principals in the reported Organizations entity attempted to access the service within the reporting period.
    */
  var Region: js.UndefOr[stringType] = js.undefined
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: serviceNamespaceType
  /**
    * The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted to access the service in the reporting period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
}

object AccessDetail {
  @scala.inline
  def apply(
    ServiceName: serviceNameType,
    ServiceNamespace: serviceNamespaceType,
    EntityPath: organizationsEntityPathType = null,
    LastAuthenticatedTime: dateType = null,
    Region: stringType = null,
    TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
  ): AccessDetail = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName, ServiceNamespace = ServiceNamespace)
    if (EntityPath != null) __obj.updateDynamic("EntityPath")(EntityPath)
    if (LastAuthenticatedTime != null) __obj.updateDynamic("LastAuthenticatedTime")(LastAuthenticatedTime)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (!js.isUndefined(TotalAuthenticatedEntities)) __obj.updateDynamic("TotalAuthenticatedEntities")(TotalAuthenticatedEntities)
    __obj.asInstanceOf[AccessDetail]
  }
}

