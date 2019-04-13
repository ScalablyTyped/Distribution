package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceLastAccessed extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticated: js.UndefOr[dateType] = js.undefined
  /**
    * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticatedEntity: js.UndefOr[arnType] = js.undefined
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: serviceNamespaceType
  /**
    * The total number of authenticated entities that have attempted to access the service. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
}

object ServiceLastAccessed {
  @scala.inline
  def apply(
    ServiceName: serviceNameType,
    ServiceNamespace: serviceNamespaceType,
    LastAuthenticated: dateType = null,
    LastAuthenticatedEntity: arnType = null,
    TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
  ): ServiceLastAccessed = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName, ServiceNamespace = ServiceNamespace)
    if (LastAuthenticated != null) __obj.updateDynamic("LastAuthenticated")(LastAuthenticated)
    if (LastAuthenticatedEntity != null) __obj.updateDynamic("LastAuthenticatedEntity")(LastAuthenticatedEntity)
    if (!js.isUndefined(TotalAuthenticatedEntities)) __obj.updateDynamic("TotalAuthenticatedEntities")(TotalAuthenticatedEntities)
    __obj.asInstanceOf[ServiceLastAccessed]
  }
}

