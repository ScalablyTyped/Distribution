package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ES
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ES: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
    */
  def addTags(params: AddTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    params: AddTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
    */
  def cancelElasticsearchServiceSoftwareUpdate(): awsDashSdkLib.libRequestMod.Request[
    CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
    */
  def cancelElasticsearchServiceSoftwareUpdate(params: CancelElasticsearchServiceSoftwareUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelElasticsearchServiceSoftwareUpdate(
    params: CancelElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  def createElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  def createElasticsearchDomain(params: CreateElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createElasticsearchDomain(
    params: CreateElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
    */
  def deleteElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
    */
  def deleteElasticsearchDomain(params: DeleteElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteElasticsearchDomain(
    params: DeleteElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  def deleteElasticsearchServiceRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteElasticsearchServiceRole(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomain(params: DescribeElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeElasticsearchDomain(
    params: DescribeElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
    */
  def describeElasticsearchDomainConfig(): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeElasticsearchDomainConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
    */
  def describeElasticsearchDomainConfig(params: DescribeElasticsearchDomainConfigRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeElasticsearchDomainConfig(
    params: DescribeElasticsearchDomainConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomains(): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeElasticsearchDomains(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomains(params: DescribeElasticsearchDomainsRequest): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeElasticsearchDomains(
    params: DescribeElasticsearchDomainsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeElasticsearchDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
    */
  def describeElasticsearchInstanceTypeLimits(): awsDashSdkLib.libRequestMod.Request[
    DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeElasticsearchInstanceTypeLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
    */
  def describeElasticsearchInstanceTypeLimits(params: DescribeElasticsearchInstanceTypeLimitsRequest): awsDashSdkLib.libRequestMod.Request[
    DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeElasticsearchInstanceTypeLimits(
    params: DescribeElasticsearchInstanceTypeLimitsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available reserved Elasticsearch instance offerings.
    */
  def describeReservedElasticsearchInstanceOfferings(): awsDashSdkLib.libRequestMod.Request[
    DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedElasticsearchInstanceOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available reserved Elasticsearch instance offerings.
    */
  def describeReservedElasticsearchInstanceOfferings(params: DescribeReservedElasticsearchInstanceOfferingsRequest): awsDashSdkLib.libRequestMod.Request[
    DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedElasticsearchInstanceOfferings(
    params: DescribeReservedElasticsearchInstanceOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about reserved Elasticsearch instances for this account.
    */
  def describeReservedElasticsearchInstances(): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservedElasticsearchInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReservedElasticsearchInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about reserved Elasticsearch instances for this account.
    */
  def describeReservedElasticsearchInstances(params: DescribeReservedElasticsearchInstancesRequest): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservedElasticsearchInstances(
    params: DescribeReservedElasticsearchInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReservedElasticsearchInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReservedElasticsearchInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
    */
  def getCompatibleElasticsearchVersions(): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCompatibleElasticsearchVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCompatibleElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
    */
  def getCompatibleElasticsearchVersions(params: GetCompatibleElasticsearchVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCompatibleElasticsearchVersions(
    params: GetCompatibleElasticsearchVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCompatibleElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCompatibleElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
    */
  def getUpgradeHistory(): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUpgradeHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUpgradeHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
    */
  def getUpgradeHistory(params: GetUpgradeHistoryRequest): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUpgradeHistory(
    params: GetUpgradeHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUpgradeHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUpgradeHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
    */
  def getUpgradeStatus(): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUpgradeStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUpgradeStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
    */
  def getUpgradeStatus(params: GetUpgradeStatusRequest): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUpgradeStatus(
    params: GetUpgradeStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUpgradeStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUpgradeStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the name of all Elasticsearch domains owned by the current user's account. 
    */
  def listDomainNames(): awsDashSdkLib.libRequestMod.Request[ListDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDomainNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDomainNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDomainNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
    */
  def listElasticsearchInstanceTypes(): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listElasticsearchInstanceTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListElasticsearchInstanceTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
    */
  def listElasticsearchInstanceTypes(params: ListElasticsearchInstanceTypesRequest): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listElasticsearchInstanceTypes(
    params: ListElasticsearchInstanceTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListElasticsearchInstanceTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchInstanceTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all supported Elasticsearch versions
    */
  def listElasticsearchVersions(): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listElasticsearchVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all supported Elasticsearch versions
    */
  def listElasticsearchVersions(params: ListElasticsearchVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listElasticsearchVersions(
    params: ListElasticsearchVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListElasticsearchVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all tags for the given Elasticsearch domain.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all tags for the given Elasticsearch domain.
    */
  def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows you to purchase reserved Elasticsearch instances.
    */
  def purchaseReservedElasticsearchInstanceOffering(): awsDashSdkLib.libRequestMod.Request[
    PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedElasticsearchInstanceOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows you to purchase reserved Elasticsearch instances.
    */
  def purchaseReservedElasticsearchInstanceOffering(params: PurchaseReservedElasticsearchInstanceOfferingRequest): awsDashSdkLib.libRequestMod.Request[
    PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedElasticsearchInstanceOffering(
    params: PurchaseReservedElasticsearchInstanceOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified set of tags from the specified Elasticsearch domain.
    */
  def removeTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified set of tags from the specified Elasticsearch domain.
    */
  def removeTags(params: RemoveTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTags(
    params: RemoveTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Schedules a service software update for an Amazon ES domain.
    */
  def startElasticsearchServiceSoftwareUpdate(): awsDashSdkLib.libRequestMod.Request[
    StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Schedules a service software update for an Amazon ES domain.
    */
  def startElasticsearchServiceSoftwareUpdate(params: StartElasticsearchServiceSoftwareUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startElasticsearchServiceSoftwareUpdate(
    params: StartElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
    */
  def updateElasticsearchDomainConfig(): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateElasticsearchDomainConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
    */
  def updateElasticsearchDomainConfig(params: UpdateElasticsearchDomainConfigRequest): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateElasticsearchDomainConfig(
    params: UpdateElasticsearchDomainConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateElasticsearchDomainConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
    */
  def upgradeElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def upgradeElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpgradeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
    */
  def upgradeElasticsearchDomain(params: UpgradeElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def upgradeElasticsearchDomain(
    params: UpgradeElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpgradeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpgradeElasticsearchDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

