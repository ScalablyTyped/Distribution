package typings.awsSdk.clientsServicequotasMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceQuotas extends Service {
  
  /**
    * Associates your quota request template with your organization. When a new account is created in your organization, the quota increase requests in the template are automatically applied to the account. You can add a quota increase request for any adjustable quota to your template.
    */
  def associateServiceQuotaTemplate(): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  def associateServiceQuotaTemplate(callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceQuotaTemplateResponse, Unit]): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Associates your quota request template with your organization. When a new account is created in your organization, the quota increase requests in the template are automatically applied to the account. You can add a quota increase request for any adjustable quota to your template.
    */
  def associateServiceQuotaTemplate(params: AssociateServiceQuotaTemplateRequest): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  def associateServiceQuotaTemplate(
    params: AssociateServiceQuotaTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceQuotaTemplateResponse, Unit]
  ): Request[AssociateServiceQuotaTemplateResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ServiceQuotas: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes the quota increase request for the specified quota from your quota request template.
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
    * Deletes the quota increase request for the specified quota from your quota request template.
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
    * Disables your quota request template. After a template is disabled, the quota increase requests in the template are not applied to new accounts in your organization. Disabling a quota request template does not apply its quota increase requests.
    */
  def disassociateServiceQuotaTemplate(): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  def disassociateServiceQuotaTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceQuotaTemplateResponse, Unit]
  ): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Disables your quota request template. After a template is disabled, the quota increase requests in the template are not applied to new accounts in your organization. Disabling a quota request template does not apply its quota increase requests.
    */
  def disassociateServiceQuotaTemplate(params: DisassociateServiceQuotaTemplateRequest): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  def disassociateServiceQuotaTemplate(
    params: DisassociateServiceQuotaTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceQuotaTemplateResponse, Unit]
  ): Request[DisassociateServiceQuotaTemplateResponse, AWSError] = js.native
  
  /**
    * Retrieves the default value for the specified quota. The default value does not reflect any quota increases.
    */
  def getAWSDefaultServiceQuota(): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  def getAWSDefaultServiceQuota(callback: js.Function2[/* err */ AWSError, /* data */ GetAWSDefaultServiceQuotaResponse, Unit]): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  /**
    * Retrieves the default value for the specified quota. The default value does not reflect any quota increases.
    */
  def getAWSDefaultServiceQuota(params: GetAWSDefaultServiceQuotaRequest): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  def getAWSDefaultServiceQuota(
    params: GetAWSDefaultServiceQuotaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAWSDefaultServiceQuotaResponse, Unit]
  ): Request[GetAWSDefaultServiceQuotaResponse, AWSError] = js.native
  
  /**
    * Retrieves the status of the association for the quota request template.
    */
  def getAssociationForServiceQuotaTemplate(): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  def getAssociationForServiceQuotaTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssociationForServiceQuotaTemplateResponse, Unit]
  ): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  /**
    * Retrieves the status of the association for the quota request template.
    */
  def getAssociationForServiceQuotaTemplate(params: GetAssociationForServiceQuotaTemplateRequest): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  def getAssociationForServiceQuotaTemplate(
    params: GetAssociationForServiceQuotaTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssociationForServiceQuotaTemplateResponse, Unit]
  ): Request[GetAssociationForServiceQuotaTemplateResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified quota increase request.
    */
  def getRequestedServiceQuotaChange(): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  def getRequestedServiceQuotaChange(
    callback: js.Function2[/* err */ AWSError, /* data */ GetRequestedServiceQuotaChangeResponse, Unit]
  ): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  /**
    * Retrieves information about the specified quota increase request.
    */
  def getRequestedServiceQuotaChange(params: GetRequestedServiceQuotaChangeRequest): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  def getRequestedServiceQuotaChange(
    params: GetRequestedServiceQuotaChangeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRequestedServiceQuotaChangeResponse, Unit]
  ): Request[GetRequestedServiceQuotaChangeResponse, AWSError] = js.native
  
  /**
    * Retrieves the applied quota value for the specified quota. For some quotas, only the default values are available. If the applied quota value is not available for a quota, the quota is not retrieved.
    */
  def getServiceQuota(): Request[GetServiceQuotaResponse, AWSError] = js.native
  def getServiceQuota(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceQuotaResponse, Unit]): Request[GetServiceQuotaResponse, AWSError] = js.native
  /**
    * Retrieves the applied quota value for the specified quota. For some quotas, only the default values are available. If the applied quota value is not available for a quota, the quota is not retrieved.
    */
  def getServiceQuota(params: GetServiceQuotaRequest): Request[GetServiceQuotaResponse, AWSError] = js.native
  def getServiceQuota(
    params: GetServiceQuotaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceQuotaResponse, Unit]
  ): Request[GetServiceQuotaResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the specified quota increase request in your quota request template.
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
    * Retrieves information about the specified quota increase request in your quota request template.
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
    * Lists the default values for the quotas for the specified AWS service. A default value does not reflect any quota increases.
    */
  def listAWSDefaultServiceQuotas(): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  def listAWSDefaultServiceQuotas(callback: js.Function2[/* err */ AWSError, /* data */ ListAWSDefaultServiceQuotasResponse, Unit]): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  /**
    * Lists the default values for the quotas for the specified AWS service. A default value does not reflect any quota increases.
    */
  def listAWSDefaultServiceQuotas(params: ListAWSDefaultServiceQuotasRequest): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  def listAWSDefaultServiceQuotas(
    params: ListAWSDefaultServiceQuotasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAWSDefaultServiceQuotasResponse, Unit]
  ): Request[ListAWSDefaultServiceQuotasResponse, AWSError] = js.native
  
  /**
    * Retrieves the quota increase requests for the specified service.
    */
  def listRequestedServiceQuotaChangeHistory(): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  def listRequestedServiceQuotaChangeHistory(
    callback: js.Function2[/* err */ AWSError, /* data */ ListRequestedServiceQuotaChangeHistoryResponse, Unit]
  ): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  /**
    * Retrieves the quota increase requests for the specified service.
    */
  def listRequestedServiceQuotaChangeHistory(params: ListRequestedServiceQuotaChangeHistoryRequest): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  def listRequestedServiceQuotaChangeHistory(
    params: ListRequestedServiceQuotaChangeHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRequestedServiceQuotaChangeHistoryResponse, Unit]
  ): Request[ListRequestedServiceQuotaChangeHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves the quota increase requests for the specified quota.
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
    * Retrieves the quota increase requests for the specified quota.
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
    * Lists the quota increase requests in the specified quota request template.
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
    * Lists the quota increase requests in the specified quota request template.
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
    * Lists the applied quota values for the specified AWS service. For some quotas, only the default values are available. If the applied quota value is not available for a quota, the quota is not retrieved.
    */
  def listServiceQuotas(): Request[ListServiceQuotasResponse, AWSError] = js.native
  def listServiceQuotas(callback: js.Function2[/* err */ AWSError, /* data */ ListServiceQuotasResponse, Unit]): Request[ListServiceQuotasResponse, AWSError] = js.native
  /**
    * Lists the applied quota values for the specified AWS service. For some quotas, only the default values are available. If the applied quota value is not available for a quota, the quota is not retrieved.
    */
  def listServiceQuotas(params: ListServiceQuotasRequest): Request[ListServiceQuotasResponse, AWSError] = js.native
  def listServiceQuotas(
    params: ListServiceQuotasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServiceQuotasResponse, Unit]
  ): Request[ListServiceQuotasResponse, AWSError] = js.native
  
  /**
    * Lists the names and codes for the services integrated with Service Quotas.
    */
  def listServices(): Request[ListServicesResponse, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Lists the names and codes for the services integrated with Service Quotas.
    */
  def listServices(params: ListServicesRequest): Request[ListServicesResponse, AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]
  ): Request[ListServicesResponse, AWSError] = js.native
  
  /**
    * Returns a list of the tags assigned to the specified applied quota.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified applied quota.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds a quota increase request to your quota request template.
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
    * Adds a quota increase request to your quota request template.
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
    * Submits a quota increase request for the specified quota.
    */
  def requestServiceQuotaIncrease(): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
  def requestServiceQuotaIncrease(callback: js.Function2[/* err */ AWSError, /* data */ RequestServiceQuotaIncreaseResponse, Unit]): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
  /**
    * Submits a quota increase request for the specified quota.
    */
  def requestServiceQuotaIncrease(params: RequestServiceQuotaIncreaseRequest): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
  def requestServiceQuotaIncrease(
    params: RequestServiceQuotaIncreaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestServiceQuotaIncreaseResponse, Unit]
  ): Request[RequestServiceQuotaIncreaseResponse, AWSError] = js.native
  
  /**
    * Adds tags to the specified applied quota. You can include one or more tags to add to the quota.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to the specified applied quota. You can include one or more tags to add to the quota.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from the specified applied quota. You can specify one or more tags to remove.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from the specified applied quota. You can specify one or more tags to remove.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
