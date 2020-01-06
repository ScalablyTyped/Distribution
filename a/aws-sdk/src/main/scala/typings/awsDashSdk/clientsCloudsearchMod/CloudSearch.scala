package typings.awsDashSdk.clientsCloudsearchMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudSearch extends Service {
  @JSName("config")
  var config_CloudSearch: ConfigBase with ClientConfiguration = js.native
  /**
    * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
    */
  def buildSuggesters(): Request[BuildSuggestersResponse, AWSError] = js.native
  def buildSuggesters(callback: js.Function2[/* err */ AWSError, /* data */ BuildSuggestersResponse, Unit]): Request[BuildSuggestersResponse, AWSError] = js.native
  /**
    * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
    */
  def buildSuggesters(params: BuildSuggestersRequest): Request[BuildSuggestersResponse, AWSError] = js.native
  def buildSuggesters(
    params: BuildSuggestersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BuildSuggestersResponse, Unit]
  ): Request[BuildSuggestersResponse, AWSError] = js.native
  /**
    * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def defineAnalysisScheme(): Request[DefineAnalysisSchemeResponse, AWSError] = js.native
  def defineAnalysisScheme(callback: js.Function2[/* err */ AWSError, /* data */ DefineAnalysisSchemeResponse, Unit]): Request[DefineAnalysisSchemeResponse, AWSError] = js.native
  /**
    * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def defineAnalysisScheme(params: DefineAnalysisSchemeRequest): Request[DefineAnalysisSchemeResponse, AWSError] = js.native
  def defineAnalysisScheme(
    params: DefineAnalysisSchemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DefineAnalysisSchemeResponse, Unit]
  ): Request[DefineAnalysisSchemeResponse, AWSError] = js.native
  /**
    * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def defineExpression(): Request[DefineExpressionResponse, AWSError] = js.native
  def defineExpression(callback: js.Function2[/* err */ AWSError, /* data */ DefineExpressionResponse, Unit]): Request[DefineExpressionResponse, AWSError] = js.native
  /**
    * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def defineExpression(params: DefineExpressionRequest): Request[DefineExpressionResponse, AWSError] = js.native
  def defineExpression(
    params: DefineExpressionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DefineExpressionResponse, Unit]
  ): Request[DefineExpressionResponse, AWSError] = js.native
  /**
    * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
    */
  def defineIndexField(): Request[DefineIndexFieldResponse, AWSError] = js.native
  def defineIndexField(callback: js.Function2[/* err */ AWSError, /* data */ DefineIndexFieldResponse, Unit]): Request[DefineIndexFieldResponse, AWSError] = js.native
  /**
    * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
    */
  def defineIndexField(params: DefineIndexFieldRequest): Request[DefineIndexFieldResponse, AWSError] = js.native
  def defineIndexField(
    params: DefineIndexFieldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DefineIndexFieldResponse, Unit]
  ): Request[DefineIndexFieldResponse, AWSError] = js.native
  /**
    * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def defineSuggester(): Request[DefineSuggesterResponse, AWSError] = js.native
  def defineSuggester(callback: js.Function2[/* err */ AWSError, /* data */ DefineSuggesterResponse, Unit]): Request[DefineSuggesterResponse, AWSError] = js.native
  /**
    * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def defineSuggester(params: DefineSuggesterRequest): Request[DefineSuggesterResponse, AWSError] = js.native
  def defineSuggester(
    params: DefineSuggesterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DefineSuggesterResponse, Unit]
  ): Request[DefineSuggesterResponse, AWSError] = js.native
  /**
    * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
    */
  def deleteAnalysisScheme(): Request[DeleteAnalysisSchemeResponse, AWSError] = js.native
  def deleteAnalysisScheme(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnalysisSchemeResponse, Unit]): Request[DeleteAnalysisSchemeResponse, AWSError] = js.native
  /**
    * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
    */
  def deleteAnalysisScheme(params: DeleteAnalysisSchemeRequest): Request[DeleteAnalysisSchemeResponse, AWSError] = js.native
  def deleteAnalysisScheme(
    params: DeleteAnalysisSchemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnalysisSchemeResponse, Unit]
  ): Request[DeleteAnalysisSchemeResponse, AWSError] = js.native
  /**
    * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
    */
  def deleteDomain(): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]): Request[DeleteDomainResponse, AWSError] = js.native
  /**
    * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
    */
  def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]
  ): Request[DeleteDomainResponse, AWSError] = js.native
  /**
    * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def deleteExpression(): Request[DeleteExpressionResponse, AWSError] = js.native
  def deleteExpression(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExpressionResponse, Unit]): Request[DeleteExpressionResponse, AWSError] = js.native
  /**
    * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def deleteExpression(params: DeleteExpressionRequest): Request[DeleteExpressionResponse, AWSError] = js.native
  def deleteExpression(
    params: DeleteExpressionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExpressionResponse, Unit]
  ): Request[DeleteExpressionResponse, AWSError] = js.native
  /**
    * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
    */
  def deleteIndexField(): Request[DeleteIndexFieldResponse, AWSError] = js.native
  def deleteIndexField(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIndexFieldResponse, Unit]): Request[DeleteIndexFieldResponse, AWSError] = js.native
  /**
    * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
    */
  def deleteIndexField(params: DeleteIndexFieldRequest): Request[DeleteIndexFieldResponse, AWSError] = js.native
  def deleteIndexField(
    params: DeleteIndexFieldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIndexFieldResponse, Unit]
  ): Request[DeleteIndexFieldResponse, AWSError] = js.native
  /**
    * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def deleteSuggester(): Request[DeleteSuggesterResponse, AWSError] = js.native
  def deleteSuggester(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSuggesterResponse, Unit]): Request[DeleteSuggesterResponse, AWSError] = js.native
  /**
    * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def deleteSuggester(params: DeleteSuggesterRequest): Request[DeleteSuggesterResponse, AWSError] = js.native
  def deleteSuggester(
    params: DeleteSuggesterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSuggesterResponse, Unit]
  ): Request[DeleteSuggesterResponse, AWSError] = js.native
  /**
    * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def describeAnalysisSchemes(): Request[DescribeAnalysisSchemesResponse, AWSError] = js.native
  def describeAnalysisSchemes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisSchemesResponse, Unit]): Request[DescribeAnalysisSchemesResponse, AWSError] = js.native
  /**
    * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def describeAnalysisSchemes(params: DescribeAnalysisSchemesRequest): Request[DescribeAnalysisSchemesResponse, AWSError] = js.native
  def describeAnalysisSchemes(
    params: DescribeAnalysisSchemesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisSchemesResponse, Unit]
  ): Request[DescribeAnalysisSchemesResponse, AWSError] = js.native
  /**
    * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def describeAvailabilityOptions(): Request[DescribeAvailabilityOptionsResponse, AWSError] = js.native
  def describeAvailabilityOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAvailabilityOptionsResponse, Unit]): Request[DescribeAvailabilityOptionsResponse, AWSError] = js.native
  /**
    * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def describeAvailabilityOptions(params: DescribeAvailabilityOptionsRequest): Request[DescribeAvailabilityOptionsResponse, AWSError] = js.native
  def describeAvailabilityOptions(
    params: DescribeAvailabilityOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAvailabilityOptionsResponse, Unit]
  ): Request[DescribeAvailabilityOptionsResponse, AWSError] = js.native
  /**
    * Returns the domain's endpoint options, specifically whether all requests to the domain must arrive over HTTPS. For more information, see Configuring Domain Endpoint Options in the Amazon CloudSearch Developer Guide.
    */
  def describeDomainEndpointOptions(): Request[DescribeDomainEndpointOptionsResponse, AWSError] = js.native
  def describeDomainEndpointOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainEndpointOptionsResponse, Unit]): Request[DescribeDomainEndpointOptionsResponse, AWSError] = js.native
  /**
    * Returns the domain's endpoint options, specifically whether all requests to the domain must arrive over HTTPS. For more information, see Configuring Domain Endpoint Options in the Amazon CloudSearch Developer Guide.
    */
  def describeDomainEndpointOptions(params: DescribeDomainEndpointOptionsRequest): Request[DescribeDomainEndpointOptionsResponse, AWSError] = js.native
  def describeDomainEndpointOptions(
    params: DescribeDomainEndpointOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainEndpointOptionsResponse, Unit]
  ): Request[DescribeDomainEndpointOptionsResponse, AWSError] = js.native
  /**
    * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeDomains(): Request[DescribeDomainsResponse, AWSError] = js.native
  def describeDomains(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainsResponse, Unit]): Request[DescribeDomainsResponse, AWSError] = js.native
  /**
    * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeDomains(params: DescribeDomainsRequest): Request[DescribeDomainsResponse, AWSError] = js.native
  def describeDomains(
    params: DescribeDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainsResponse, Unit]
  ): Request[DescribeDomainsResponse, AWSError] = js.native
  /**
    * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def describeExpressions(): Request[DescribeExpressionsResponse, AWSError] = js.native
  def describeExpressions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExpressionsResponse, Unit]): Request[DescribeExpressionsResponse, AWSError] = js.native
  /**
    * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def describeExpressions(params: DescribeExpressionsRequest): Request[DescribeExpressionsResponse, AWSError] = js.native
  def describeExpressions(
    params: DescribeExpressionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExpressionsResponse, Unit]
  ): Request[DescribeExpressionsResponse, AWSError] = js.native
  /**
    * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
    */
  def describeIndexFields(): Request[DescribeIndexFieldsResponse, AWSError] = js.native
  def describeIndexFields(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexFieldsResponse, Unit]): Request[DescribeIndexFieldsResponse, AWSError] = js.native
  /**
    * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
    */
  def describeIndexFields(params: DescribeIndexFieldsRequest): Request[DescribeIndexFieldsResponse, AWSError] = js.native
  def describeIndexFields(
    params: DescribeIndexFieldsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexFieldsResponse, Unit]
  ): Request[DescribeIndexFieldsResponse, AWSError] = js.native
  /**
    * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
    */
  def describeScalingParameters(): Request[DescribeScalingParametersResponse, AWSError] = js.native
  def describeScalingParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingParametersResponse, Unit]): Request[DescribeScalingParametersResponse, AWSError] = js.native
  /**
    * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
    */
  def describeScalingParameters(params: DescribeScalingParametersRequest): Request[DescribeScalingParametersResponse, AWSError] = js.native
  def describeScalingParameters(
    params: DescribeScalingParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingParametersResponse, Unit]
  ): Request[DescribeScalingParametersResponse, AWSError] = js.native
  /**
    * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeServiceAccessPolicies(): Request[DescribeServiceAccessPoliciesResponse, AWSError] = js.native
  def describeServiceAccessPolicies(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceAccessPoliciesResponse, Unit]): Request[DescribeServiceAccessPoliciesResponse, AWSError] = js.native
  /**
    * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeServiceAccessPolicies(params: DescribeServiceAccessPoliciesRequest): Request[DescribeServiceAccessPoliciesResponse, AWSError] = js.native
  def describeServiceAccessPolicies(
    params: DescribeServiceAccessPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceAccessPoliciesResponse, Unit]
  ): Request[DescribeServiceAccessPoliciesResponse, AWSError] = js.native
  /**
    * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def describeSuggesters(): Request[DescribeSuggestersResponse, AWSError] = js.native
  def describeSuggesters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSuggestersResponse, Unit]): Request[DescribeSuggestersResponse, AWSError] = js.native
  /**
    * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def describeSuggesters(params: DescribeSuggestersRequest): Request[DescribeSuggestersResponse, AWSError] = js.native
  def describeSuggesters(
    params: DescribeSuggestersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSuggestersResponse, Unit]
  ): Request[DescribeSuggestersResponse, AWSError] = js.native
  /**
    * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
    */
  def indexDocuments(): Request[IndexDocumentsResponse, AWSError] = js.native
  def indexDocuments(callback: js.Function2[/* err */ AWSError, /* data */ IndexDocumentsResponse, Unit]): Request[IndexDocumentsResponse, AWSError] = js.native
  /**
    * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
    */
  def indexDocuments(params: IndexDocumentsRequest): Request[IndexDocumentsResponse, AWSError] = js.native
  def indexDocuments(
    params: IndexDocumentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IndexDocumentsResponse, Unit]
  ): Request[IndexDocumentsResponse, AWSError] = js.native
  /**
    * Lists all search domains owned by an account.
    */
  def listDomainNames(): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]): Request[ListDomainNamesResponse, AWSError] = js.native
  /**
    * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def updateAvailabilityOptions(): Request[UpdateAvailabilityOptionsResponse, AWSError] = js.native
  def updateAvailabilityOptions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAvailabilityOptionsResponse, Unit]): Request[UpdateAvailabilityOptionsResponse, AWSError] = js.native
  /**
    * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def updateAvailabilityOptions(params: UpdateAvailabilityOptionsRequest): Request[UpdateAvailabilityOptionsResponse, AWSError] = js.native
  def updateAvailabilityOptions(
    params: UpdateAvailabilityOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAvailabilityOptionsResponse, Unit]
  ): Request[UpdateAvailabilityOptionsResponse, AWSError] = js.native
  /**
    * Updates the domain's endpoint options, specifically whether all requests to the domain must arrive over HTTPS. For more information, see Configuring Domain Endpoint Options in the Amazon CloudSearch Developer Guide.
    */
  def updateDomainEndpointOptions(): Request[UpdateDomainEndpointOptionsResponse, AWSError] = js.native
  def updateDomainEndpointOptions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainEndpointOptionsResponse, Unit]): Request[UpdateDomainEndpointOptionsResponse, AWSError] = js.native
  /**
    * Updates the domain's endpoint options, specifically whether all requests to the domain must arrive over HTTPS. For more information, see Configuring Domain Endpoint Options in the Amazon CloudSearch Developer Guide.
    */
  def updateDomainEndpointOptions(params: UpdateDomainEndpointOptionsRequest): Request[UpdateDomainEndpointOptionsResponse, AWSError] = js.native
  def updateDomainEndpointOptions(
    params: UpdateDomainEndpointOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainEndpointOptionsResponse, Unit]
  ): Request[UpdateDomainEndpointOptionsResponse, AWSError] = js.native
  /**
    * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
    */
  def updateScalingParameters(): Request[UpdateScalingParametersResponse, AWSError] = js.native
  def updateScalingParameters(callback: js.Function2[/* err */ AWSError, /* data */ UpdateScalingParametersResponse, Unit]): Request[UpdateScalingParametersResponse, AWSError] = js.native
  /**
    * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
    */
  def updateScalingParameters(params: UpdateScalingParametersRequest): Request[UpdateScalingParametersResponse, AWSError] = js.native
  def updateScalingParameters(
    params: UpdateScalingParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateScalingParametersResponse, Unit]
  ): Request[UpdateScalingParametersResponse, AWSError] = js.native
  /**
    * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
    */
  def updateServiceAccessPolicies(): Request[UpdateServiceAccessPoliciesResponse, AWSError] = js.native
  def updateServiceAccessPolicies(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceAccessPoliciesResponse, Unit]): Request[UpdateServiceAccessPoliciesResponse, AWSError] = js.native
  /**
    * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
    */
  def updateServiceAccessPolicies(params: UpdateServiceAccessPoliciesRequest): Request[UpdateServiceAccessPoliciesResponse, AWSError] = js.native
  def updateServiceAccessPolicies(
    params: UpdateServiceAccessPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceAccessPoliciesResponse, Unit]
  ): Request[UpdateServiceAccessPoliciesResponse, AWSError] = js.native
}

