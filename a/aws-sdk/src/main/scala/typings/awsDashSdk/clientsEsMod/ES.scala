package typings.awsDashSdk.clientsEsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ES extends Service {
  @JSName("config")
  var config_ES: ConfigBase with ClientConfiguration = js.native
  /**
    * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
    */
  def addTags(): Request[js.Object, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
    */
  def addTags(params: AddTagsRequest): Request[js.Object, AWSError] = js.native
  def addTags(params: AddTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
    */
  def cancelElasticsearchServiceSoftwareUpdate(): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
      Unit
    ]
  ): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
    */
  def cancelElasticsearchServiceSoftwareUpdate(params: CancelElasticsearchServiceSoftwareUpdateRequest): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelElasticsearchServiceSoftwareUpdate(
    params: CancelElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
      Unit
    ]
  ): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  def createElasticsearchDomain(): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  def createElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateElasticsearchDomainResponse, Unit]): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  def createElasticsearchDomain(params: CreateElasticsearchDomainRequest): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  def createElasticsearchDomain(
    params: CreateElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateElasticsearchDomainResponse, Unit]
  ): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
    */
  def deleteElasticsearchDomain(): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  def deleteElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteElasticsearchDomainResponse, Unit]): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
    */
  def deleteElasticsearchDomain(params: DeleteElasticsearchDomainRequest): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  def deleteElasticsearchDomain(
    params: DeleteElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteElasticsearchDomainResponse, Unit]
  ): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  def deleteElasticsearchServiceRole(): Request[js.Object, AWSError] = js.native
  def deleteElasticsearchServiceRole(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomain(): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  def describeElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainResponse, Unit]): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomain(params: DescribeElasticsearchDomainRequest): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  def describeElasticsearchDomain(
    params: DescribeElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainResponse, Unit]
  ): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
    */
  def describeElasticsearchDomainConfig(): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  def describeElasticsearchDomainConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainConfigResponse, Unit]
  ): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  /**
    * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
    */
  def describeElasticsearchDomainConfig(params: DescribeElasticsearchDomainConfigRequest): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  def describeElasticsearchDomainConfig(
    params: DescribeElasticsearchDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainConfigResponse, Unit]
  ): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomains(): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  def describeElasticsearchDomains(callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainsResponse, Unit]): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomains(params: DescribeElasticsearchDomainsRequest): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  def describeElasticsearchDomains(
    params: DescribeElasticsearchDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainsResponse, Unit]
  ): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  /**
    *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
    */
  def describeElasticsearchInstanceTypeLimits(): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  def describeElasticsearchInstanceTypeLimits(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, Unit]
  ): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  /**
    *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
    */
  def describeElasticsearchInstanceTypeLimits(params: DescribeElasticsearchInstanceTypeLimitsRequest): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  def describeElasticsearchInstanceTypeLimits(
    params: DescribeElasticsearchInstanceTypeLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, Unit]
  ): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  /**
    * Lists available reserved Elasticsearch instance offerings.
    */
  def describeReservedElasticsearchInstanceOfferings(): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedElasticsearchInstanceOfferings(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
      Unit
    ]
  ): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  /**
    * Lists available reserved Elasticsearch instance offerings.
    */
  def describeReservedElasticsearchInstanceOfferings(params: DescribeReservedElasticsearchInstanceOfferingsRequest): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedElasticsearchInstanceOfferings(
    params: DescribeReservedElasticsearchInstanceOfferingsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
      Unit
    ]
  ): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  /**
    * Returns information about reserved Elasticsearch instances for this account.
    */
  def describeReservedElasticsearchInstances(): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  def describeReservedElasticsearchInstances(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedElasticsearchInstancesResponse, Unit]
  ): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  /**
    * Returns information about reserved Elasticsearch instances for this account.
    */
  def describeReservedElasticsearchInstances(params: DescribeReservedElasticsearchInstancesRequest): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  def describeReservedElasticsearchInstances(
    params: DescribeReservedElasticsearchInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedElasticsearchInstancesResponse, Unit]
  ): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  /**
    *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
    */
  def getCompatibleElasticsearchVersions(): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  def getCompatibleElasticsearchVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleElasticsearchVersionsResponse, Unit]
  ): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  /**
    *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
    */
  def getCompatibleElasticsearchVersions(params: GetCompatibleElasticsearchVersionsRequest): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  def getCompatibleElasticsearchVersions(
    params: GetCompatibleElasticsearchVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleElasticsearchVersionsResponse, Unit]
  ): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  /**
    * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
    */
  def getUpgradeHistory(): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  /**
    * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
    */
  def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(
    params: GetUpgradeHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]
  ): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
    */
  def getUpgradeStatus(): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]): Request[GetUpgradeStatusResponse, AWSError] = js.native
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
    */
  def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(
    params: GetUpgradeStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]
  ): Request[GetUpgradeStatusResponse, AWSError] = js.native
  /**
    * Returns the name of all Elasticsearch domains owned by the current user's account. 
    */
  def listDomainNames(): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]): Request[ListDomainNamesResponse, AWSError] = js.native
  /**
    * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
    */
  def listElasticsearchInstanceTypes(): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  def listElasticsearchInstanceTypes(
    callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchInstanceTypesResponse, Unit]
  ): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  /**
    * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
    */
  def listElasticsearchInstanceTypes(params: ListElasticsearchInstanceTypesRequest): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  def listElasticsearchInstanceTypes(
    params: ListElasticsearchInstanceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchInstanceTypesResponse, Unit]
  ): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  /**
    * List all supported Elasticsearch versions
    */
  def listElasticsearchVersions(): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  def listElasticsearchVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchVersionsResponse, Unit]): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  /**
    * List all supported Elasticsearch versions
    */
  def listElasticsearchVersions(params: ListElasticsearchVersionsRequest): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  def listElasticsearchVersions(
    params: ListElasticsearchVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchVersionsResponse, Unit]
  ): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  /**
    * Returns all tags for the given Elasticsearch domain.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Returns all tags for the given Elasticsearch domain.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Allows you to purchase reserved Elasticsearch instances.
    */
  def purchaseReservedElasticsearchInstanceOffering(): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedElasticsearchInstanceOffering(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
      Unit
    ]
  ): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  /**
    * Allows you to purchase reserved Elasticsearch instances.
    */
  def purchaseReservedElasticsearchInstanceOffering(params: PurchaseReservedElasticsearchInstanceOfferingRequest): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedElasticsearchInstanceOffering(
    params: PurchaseReservedElasticsearchInstanceOfferingRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
      Unit
    ]
  ): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  /**
    * Removes the specified set of tags from the specified Elasticsearch domain.
    */
  def removeTags(): Request[js.Object, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified set of tags from the specified Elasticsearch domain.
    */
  def removeTags(params: RemoveTagsRequest): Request[js.Object, AWSError] = js.native
  def removeTags(params: RemoveTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Schedules a service software update for an Amazon ES domain.
    */
  def startElasticsearchServiceSoftwareUpdate(): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def startElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[/* err */ AWSError, /* data */ StartElasticsearchServiceSoftwareUpdateResponse, Unit]
  ): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Schedules a service software update for an Amazon ES domain.
    */
  def startElasticsearchServiceSoftwareUpdate(params: StartElasticsearchServiceSoftwareUpdateRequest): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def startElasticsearchServiceSoftwareUpdate(
    params: StartElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartElasticsearchServiceSoftwareUpdateResponse, Unit]
  ): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
    */
  def updateElasticsearchDomainConfig(): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  def updateElasticsearchDomainConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateElasticsearchDomainConfigResponse, Unit]
  ): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  /**
    * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
    */
  def updateElasticsearchDomainConfig(params: UpdateElasticsearchDomainConfigRequest): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  def updateElasticsearchDomainConfig(
    params: UpdateElasticsearchDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateElasticsearchDomainConfigResponse, Unit]
  ): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  /**
    * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
    */
  def upgradeElasticsearchDomain(): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
  def upgradeElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpgradeElasticsearchDomainResponse, Unit]): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
    */
  def upgradeElasticsearchDomain(params: UpgradeElasticsearchDomainRequest): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
  def upgradeElasticsearchDomain(
    params: UpgradeElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpgradeElasticsearchDomainResponse, Unit]
  ): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
}

