package typings.awsDashSdk.clientsServicequotasMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuotas extends Service {
  @JSName("config")
  var config_ServiceQuotas: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates the Service Quotas template with your organization so that when new accounts are created in your organization, the template submits increase requests for the specified service quotas. Use the Service Quotas template to request an increase for any adjustable quota value. After you define the Service Quotas template, use this operation to associate, or enable, the template. 
    */
  def associateServiceQuotaTemplate(): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  def associateServiceQuotaTemplate(callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceQuotaTemplateResponse, Unit]): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Associates the Service Quotas template with your organization so that when new accounts are created in your organization, the template submits increase requests for the specified service quotas. Use the Service Quotas template to request an increase for any adjustable quota value. After you define the Service Quotas template, use this operation to associate, or enable, the template. 
    */
  def associateServiceQuotaTemplate(params: AssociateServiceQuotaTemplateRequest): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  def associateServiceQuotaTemplate(
    params: AssociateServiceQuotaTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceQuotaTemplateResponse, Unit]
  ): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Removes a service quota increase request from the Service Quotas template. 
    */
  def deleteServiceQuotaIncreaseRequestFromTemplate(): Request[DeleteServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  def deleteServiceQuotaIncreaseRequestFromTemplate(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteServiceQuotaIncreaseRequestFromTemplateResponse, 
      Unit
    ]
  ): Request[DeleteServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  /**
    * Removes a service quota increase request from the Service Quotas template. 
    */
  def deleteServiceQuotaIncreaseRequestFromTemplate(params: DeleteServiceQuotaIncreaseRequestFromTemplateRequest): Request[DeleteServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  def deleteServiceQuotaIncreaseRequestFromTemplate(
    params: DeleteServiceQuotaIncreaseRequestFromTemplateRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteServiceQuotaIncreaseRequestFromTemplateResponse, 
      Unit
    ]
  ): Request[DeleteServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  /**
    * Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new accounts in your organization. Disabling the quota template does not apply the quota increase requests from the template.   Related operations    To enable the quota template, call AssociateServiceQuotaTemplate.    To delete a specific service quota from the template, use DeleteServiceQuotaIncreaseRequestFromTemplate.  
    */
  def disassociateServiceQuotaTemplate(): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  def disassociateServiceQuotaTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceQuotaTemplateResponse, Unit]
  ): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new accounts in your organization. Disabling the quota template does not apply the quota increase requests from the template.   Related operations    To enable the quota template, call AssociateServiceQuotaTemplate.    To delete a specific service quota from the template, use DeleteServiceQuotaIncreaseRequestFromTemplate.  
    */
  def disassociateServiceQuotaTemplate(params: DisassociateServiceQuotaTemplateRequest): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  def disassociateServiceQuotaTemplate(
    params: DisassociateServiceQuotaTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceQuotaTemplateResponse, Unit]
  ): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if the quotas have been increased.. 
    */
  def getAWSDefaultServiceQuota(): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  def getAWSDefaultServiceQuota(callback: js.Function2[/* err */ AWSError, /* data */ GetAWSDefaultServiceQuotaResponse, Unit]): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  /**
    * Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if the quotas have been increased.. 
    */
  def getAWSDefaultServiceQuota(params: GetAWSDefaultServiceQuotaRequest): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  def getAWSDefaultServiceQuota(
    params: GetAWSDefaultServiceQuotaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAWSDefaultServiceQuotaResponse, Unit]
  ): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  /**
    * Retrieves the ServiceQuotaTemplateAssociationStatus value from the service. Use this action to determine if the Service Quota template is associated, or enabled. 
    */
  def getAssociationForServiceQuotaTemplate(): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  def getAssociationForServiceQuotaTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssociationForServiceQuotaTemplateResponse, Unit]
  ): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Retrieves the ServiceQuotaTemplateAssociationStatus value from the service. Use this action to determine if the Service Quota template is associated, or enabled. 
    */
  def getAssociationForServiceQuotaTemplate(params: GetAssociationForServiceQuotaTemplateRequest): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  def getAssociationForServiceQuotaTemplate(
    params: GetAssociationForServiceQuotaTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssociationForServiceQuotaTemplateResponse, Unit]
  ): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Retrieves the details for a particular increase request. 
    */
  def getRequestedServiceQuotaChange(): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  def getRequestedServiceQuotaChange(
    callback: js.Function2[/* err */ AWSError, /* data */ GetRequestedServiceQuotaChangeResponse, Unit]
  ): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  /**
    * Retrieves the details for a particular increase request. 
    */
  def getRequestedServiceQuotaChange(params: GetRequestedServiceQuotaChangeRequest): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  def getRequestedServiceQuotaChange(
    params: GetRequestedServiceQuotaChangeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRequestedServiceQuotaChangeResponse, Unit]
  ): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  /**
    * Returns the details for the specified service quota. This operation provides a different Value than the GetAWSDefaultServiceQuota operation. This operation returns the applied value for each quota. GetAWSDefaultServiceQuota returns the default AWS value for each quota. 
    */
  def getServiceQuota(): Request[GetServiceQuotaResponse, AWSError] = js.native
  def getServiceQuota(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceQuotaResponse, Unit]): Request[GetServiceQuotaResponse, AWSError] = js.native
  /**
    * Returns the details for the specified service quota. This operation provides a different Value than the GetAWSDefaultServiceQuota operation. This operation returns the applied value for each quota. GetAWSDefaultServiceQuota returns the default AWS value for each quota. 
    */
  def getServiceQuota(params: GetServiceQuotaRequest): Request[GetServiceQuotaResponse, AWSError] = js.native
  def getServiceQuota(
    params: GetServiceQuotaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceQuotaResponse, Unit]
  ): Request[GetServiceQuotaResponse, AWSError] = js.native
  /**
    * Returns the details of the service quota increase request in your template.
    */
  def getServiceQuotaIncreaseRequestFromTemplate(): Request[GetServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  def getServiceQuotaIncreaseRequestFromTemplate(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetServiceQuotaIncreaseRequestFromTemplateResponse, 
      Unit
    ]
  ): Request[GetServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  /**
    * Returns the details of the service quota increase request in your template.
    */
  def getServiceQuotaIncreaseRequestFromTemplate(params: GetServiceQuotaIncreaseRequestFromTemplateRequest): Request[GetServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  def getServiceQuotaIncreaseRequestFromTemplate(
    params: GetServiceQuotaIncreaseRequestFromTemplateRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetServiceQuotaIncreaseRequestFromTemplateResponse, 
      Unit
    ]
  ): Request[GetServiceQuotaIncreaseRequestFromTemplateResponse, AWSError] = js.native
  /**
    * Lists all default service quotas for the specified AWS service or all AWS services. ListAWSDefaultServiceQuotas is similar to ListServiceQuotas except for the Value object. The Value object returned by ListAWSDefaultServiceQuotas is the default value assigned by AWS. This request returns a list of all service quotas for the specified service. The listing of each you'll see the default values are the values that AWS provides for the quotas.   Always check the NextToken response parameter when calling any of the List* operations. These operations can return an unexpected list of results, even when there are more results available. When this happens, the NextToken response parameter contains a value to pass the next call to the same API to request the next part of the list. 
    */
  def listAWSDefaultServiceQuotas(): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  def listAWSDefaultServiceQuotas(callback: js.Function2[/* err */ AWSError, /* data */ ListAWSDefaultServiceQuotasResponse, Unit]): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  /**
    * Lists all default service quotas for the specified AWS service or all AWS services. ListAWSDefaultServiceQuotas is similar to ListServiceQuotas except for the Value object. The Value object returned by ListAWSDefaultServiceQuotas is the default value assigned by AWS. This request returns a list of all service quotas for the specified service. The listing of each you'll see the default values are the values that AWS provides for the quotas.   Always check the NextToken response parameter when calling any of the List* operations. These operations can return an unexpected list of results, even when there are more results available. When this happens, the NextToken response parameter contains a value to pass the next call to the same API to request the next part of the list. 
    */
  def listAWSDefaultServiceQuotas(params: ListAWSDefaultServiceQuotasRequest): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  def listAWSDefaultServiceQuotas(
    params: ListAWSDefaultServiceQuotasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAWSDefaultServiceQuotasResponse, Unit]
  ): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  /**
    * Requests a list of the changes to quotas for a service.
    */
  def listRequestedServiceQuotaChangeHistory(): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  def listRequestedServiceQuotaChangeHistory(
    callback: js.Function2[/* err */ AWSError, /* data */ ListRequestedServiceQuotaChangeHistoryResponse, Unit]
  ): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  /**
    * Requests a list of the changes to quotas for a service.
    */
  def listRequestedServiceQuotaChangeHistory(params: ListRequestedServiceQuotaChangeHistoryRequest): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  def listRequestedServiceQuotaChangeHistory(
    params: ListRequestedServiceQuotaChangeHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRequestedServiceQuotaChangeHistoryResponse, Unit]
  ): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  /**
    * Requests a list of the changes to specific service quotas. This command provides additional granularity over the ListRequestedServiceQuotaChangeHistory command. Once a quota change request has reached CASE_CLOSED, APPROVED, or DENIED, the history has been kept for 90 days.
    */
  def listRequestedServiceQuotaChangeHistoryByQuota(): Request[ListRequestedServiceQuotaChangeHistoryByQuotaResponse, AWSError] = js.native
  def listRequestedServiceQuotaChangeHistoryByQuota(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListRequestedServiceQuotaChangeHistoryByQuotaResponse, 
      Unit
    ]
  ): Request[ListRequestedServiceQuotaChangeHistoryByQuotaResponse, AWSError] = js.native
  /**
    * Requests a list of the changes to specific service quotas. This command provides additional granularity over the ListRequestedServiceQuotaChangeHistory command. Once a quota change request has reached CASE_CLOSED, APPROVED, or DENIED, the history has been kept for 90 days.
    */
  def listRequestedServiceQuotaChangeHistoryByQuota(params: ListRequestedServiceQuotaChangeHistoryByQuotaRequest): Request[ListRequestedServiceQuotaChangeHistoryByQuotaResponse, AWSError] = js.native
  def listRequestedServiceQuotaChangeHistoryByQuota(
    params: ListRequestedServiceQuotaChangeHistoryByQuotaRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListRequestedServiceQuotaChangeHistoryByQuotaResponse, 
      Unit
    ]
  ): Request[ListRequestedServiceQuotaChangeHistoryByQuotaResponse, AWSError] = js.native
  /**
    * Returns a list of the quota increase requests in the template. 
    */
  def listServiceQuotaIncreaseRequestsInTemplate(): Request[ListServiceQuotaIncreaseRequestsInTemplateResponse, AWSError] = js.native
  def listServiceQuotaIncreaseRequestsInTemplate(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListServiceQuotaIncreaseRequestsInTemplateResponse, 
      Unit
    ]
  ): Request[ListServiceQuotaIncreaseRequestsInTemplateResponse, AWSError] = js.native
  /**
    * Returns a list of the quota increase requests in the template. 
    */
  def listServiceQuotaIncreaseRequestsInTemplate(params: ListServiceQuotaIncreaseRequestsInTemplateRequest): Request[ListServiceQuotaIncreaseRequestsInTemplateResponse, AWSError] = js.native
  def listServiceQuotaIncreaseRequestsInTemplate(
    params: ListServiceQuotaIncreaseRequestsInTemplateRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListServiceQuotaIncreaseRequestsInTemplateResponse, 
      Unit
    ]
  ): Request[ListServiceQuotaIncreaseRequestsInTemplateResponse, AWSError] = js.native
  /**
    * Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the specified service. you'll see the default values are the values that AWS provides for the quotas.   Always check the NextToken response parameter when calling any of the List* operations. These operations can return an unexpected list of results, even when there are more results available. When this happens, the NextToken response parameter contains a value to pass the next call to the same API to request the next part of the list. 
    */
  def listServiceQuotas(): Request[ListServiceQuotasResponse, AWSError] = js.native
  def listServiceQuotas(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceQuotasResponse, Unit]): Request[ListServiceQuotasResponse, AWSError] = js.native
  /**
    * Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the specified service. you'll see the default values are the values that AWS provides for the quotas.   Always check the NextToken response parameter when calling any of the List* operations. These operations can return an unexpected list of results, even when there are more results available. When this happens, the NextToken response parameter contains a value to pass the next call to the same API to request the next part of the list. 
    */
  def listServiceQuotas(params: ListServiceQuotasRequest): Request[ListServiceQuotasResponse, AWSError] = js.native
  def listServiceQuotas(
    params: ListServiceQuotasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceQuotasResponse, Unit]
  ): Request[ListServiceQuotasResponse, AWSError] = js.native
  /**
    * Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list the see the list of the service quotas for a specific service, use ListServiceQuotas.
    */
  def listServices(): Request[ListServicesResponse, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list the see the list of the service quotas for a specific service, use ListServiceQuotas.
    */
  def listServices(params: ListServicesRequest): Request[ListServicesResponse, AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]
  ): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the ServiceCode, QuotaCode, AwsRegion, and DesiredValue. Once you add a quota to the template, use ListServiceQuotaIncreaseRequestsInTemplate to see the list of quotas in the template.
    */
  def putServiceQuotaIncreaseRequestIntoTemplate(): Request[PutServiceQuotaIncreaseRequestIntoTemplateResponse, AWSError] = js.native
  def putServiceQuotaIncreaseRequestIntoTemplate(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutServiceQuotaIncreaseRequestIntoTemplateResponse, 
      Unit
    ]
  ): Request[PutServiceQuotaIncreaseRequestIntoTemplateResponse, AWSError] = js.native
  /**
    * Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the ServiceCode, QuotaCode, AwsRegion, and DesiredValue. Once you add a quota to the template, use ListServiceQuotaIncreaseRequestsInTemplate to see the list of quotas in the template.
    */
  def putServiceQuotaIncreaseRequestIntoTemplate(params: PutServiceQuotaIncreaseRequestIntoTemplateRequest): Request[PutServiceQuotaIncreaseRequestIntoTemplateResponse, AWSError] = js.native
  def putServiceQuotaIncreaseRequestIntoTemplate(
    params: PutServiceQuotaIncreaseRequestIntoTemplateRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutServiceQuotaIncreaseRequestIntoTemplateResponse, 
      Unit
    ]
  ): Request[PutServiceQuotaIncreaseRequestIntoTemplateResponse, AWSError] = js.native
  /**
    * Retrieves the details of a service quota increase request. The response to this command provides the details in the RequestedServiceQuotaChange object. 
    */
  def requestServiceQuotaIncrease(): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
  def requestServiceQuotaIncrease(callback: js.Function2[/* err */ AWSError, /* data */ RequestServiceQuotaIncreaseResponse, Unit]): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
  /**
    * Retrieves the details of a service quota increase request. The response to this command provides the details in the RequestedServiceQuotaChange object. 
    */
  def requestServiceQuotaIncrease(params: RequestServiceQuotaIncreaseRequest): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
  def requestServiceQuotaIncrease(
    params: RequestServiceQuotaIncreaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestServiceQuotaIncreaseResponse, Unit]
  ): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
}

