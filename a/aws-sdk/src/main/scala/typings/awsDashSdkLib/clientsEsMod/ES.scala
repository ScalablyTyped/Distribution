package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ES
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ES: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsEsMod.ESNs.ClientConfiguration = js.native
  /**
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
     */
  def addTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
     */
  def addTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
     */
  def addTags(params: awsDashSdkLib.clientsEsMod.ESNs.AddTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
     */
  def addTags(
    params: awsDashSdkLib.clientsEsMod.ESNs.AddTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
     */
  def cancelElasticsearchServiceSoftwareUpdate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
     */
  def cancelElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
     */
  def cancelElasticsearchServiceSoftwareUpdate(params: awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
     */
  def cancelElasticsearchServiceSoftwareUpdate(
    params: awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CancelElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
     */
  def createElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
     */
  def createElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
     */
  def createElasticsearchDomain(params: awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
     */
  def createElasticsearchDomain(
    params: awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.CreateElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
     */
  def deleteElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
     */
  def deleteElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
     */
  def deleteElasticsearchDomain(params: awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
     */
  def deleteElasticsearchDomain(
    params: awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DeleteElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service Domains.
     */
  def deleteElasticsearchServiceRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service Domains.
     */
  def deleteElasticsearchServiceRole(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomain(params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomain(
    params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
     */
  def describeElasticsearchDomainConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
     */
  def describeElasticsearchDomainConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
     */
  def describeElasticsearchDomainConfig(params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
     */
  def describeElasticsearchDomainConfig(
    params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomains(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomains(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomains(params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
     */
  def describeElasticsearchDomains(
    params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
     */
  def describeElasticsearchInstanceTypeLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
     */
  def describeElasticsearchInstanceTypeLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
     */
  def describeElasticsearchInstanceTypeLimits(params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
     */
  def describeElasticsearchInstanceTypeLimits(
    params: awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeElasticsearchInstanceTypeLimitsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists available reserved Elasticsearch instance offerings.
     */
  def describeReservedElasticsearchInstanceOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists available reserved Elasticsearch instance offerings.
     */
  def describeReservedElasticsearchInstanceOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists available reserved Elasticsearch instance offerings.
     */
  def describeReservedElasticsearchInstanceOfferings(params: awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists available reserved Elasticsearch instance offerings.
     */
  def describeReservedElasticsearchInstanceOfferings(
    params: awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstanceOfferingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about reserved Elasticsearch instances for this account.
     */
  def describeReservedElasticsearchInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about reserved Elasticsearch instances for this account.
     */
  def describeReservedElasticsearchInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about reserved Elasticsearch instances for this account.
     */
  def describeReservedElasticsearchInstances(params: awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about reserved Elasticsearch instances for this account.
     */
  def describeReservedElasticsearchInstances(
    params: awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.DescribeReservedElasticsearchInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
     */
  def getCompatibleElasticsearchVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
     */
  def getCompatibleElasticsearchVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
     */
  def getCompatibleElasticsearchVersions(params: awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
     */
  def getCompatibleElasticsearchVersions(
    params: awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetCompatibleElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
     */
  def getUpgradeHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
     */
  def getUpgradeHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
     */
  def getUpgradeHistory(params: awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
     */
  def getUpgradeHistory(
    params: awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
     */
  def getUpgradeStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
     */
  def getUpgradeStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
     */
  def getUpgradeStatus(params: awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
     */
  def getUpgradeStatus(
    params: awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.GetUpgradeStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the name of all Elasticsearch domains owned by the current user's account. 
     */
  def listDomainNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the name of all Elasticsearch domains owned by the current user's account. 
     */
  def listDomainNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.ListDomainNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
     */
  def listElasticsearchInstanceTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
     */
  def listElasticsearchInstanceTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
     */
  def listElasticsearchInstanceTypes(params: awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
     */
  def listElasticsearchInstanceTypes(
    params: awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchInstanceTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all supported Elasticsearch versions
     */
  def listElasticsearchVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all supported Elasticsearch versions
     */
  def listElasticsearchVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all supported Elasticsearch versions
     */
  def listElasticsearchVersions(params: awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all supported Elasticsearch versions
     */
  def listElasticsearchVersions(
    params: awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListElasticsearchVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all tags for the given Elasticsearch domain.
     */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all tags for the given Elasticsearch domain.
     */
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all tags for the given Elasticsearch domain.
     */
  def listTags(params: awsDashSdkLib.clientsEsMod.ESNs.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all tags for the given Elasticsearch domain.
     */
  def listTags(
    params: awsDashSdkLib.clientsEsMod.ESNs.ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved Elasticsearch instances.
     */
  def purchaseReservedElasticsearchInstanceOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved Elasticsearch instances.
     */
  def purchaseReservedElasticsearchInstanceOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved Elasticsearch instances.
     */
  def purchaseReservedElasticsearchInstanceOffering(params: awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved Elasticsearch instances.
     */
  def purchaseReservedElasticsearchInstanceOffering(
    params: awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.PurchaseReservedElasticsearchInstanceOfferingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified set of tags from the specified Elasticsearch domain.
     */
  def removeTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified set of tags from the specified Elasticsearch domain.
     */
  def removeTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified set of tags from the specified Elasticsearch domain.
     */
  def removeTags(params: awsDashSdkLib.clientsEsMod.ESNs.RemoveTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified set of tags from the specified Elasticsearch domain.
     */
  def removeTags(
    params: awsDashSdkLib.clientsEsMod.ESNs.RemoveTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Schedules a service software update for an Amazon ES domain.
     */
  def startElasticsearchServiceSoftwareUpdate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules a service software update for an Amazon ES domain.
     */
  def startElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules a service software update for an Amazon ES domain.
     */
  def startElasticsearchServiceSoftwareUpdate(params: awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules a service software update for an Amazon ES domain.
     */
  def startElasticsearchServiceSoftwareUpdate(
    params: awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.StartElasticsearchServiceSoftwareUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
     */
  def updateElasticsearchDomainConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
     */
  def updateElasticsearchDomainConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
     */
  def updateElasticsearchDomainConfig(params: awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
     */
  def updateElasticsearchDomainConfig(
    params: awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpdateElasticsearchDomainConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
     */
  def upgradeElasticsearchDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
     */
  def upgradeElasticsearchDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
     */
  def upgradeElasticsearchDomain(params: awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
     */
  def upgradeElasticsearchDomain(
    params: awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEsMod.ESNs.UpgradeElasticsearchDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

