package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudSearch
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudSearch: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
    */
  def buildSuggesters(): awsDashSdkLib.libRequestMod.Request[BuildSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def buildSuggesters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BuildSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BuildSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
    */
  def buildSuggesters(params: BuildSuggestersRequest): awsDashSdkLib.libRequestMod.Request[BuildSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def buildSuggesters(
    params: BuildSuggestersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BuildSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BuildSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def createDomain(): awsDashSdkLib.libRequestMod.Request[CreateDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def createDomain(params: CreateDomainRequest): awsDashSdkLib.libRequestMod.Request[CreateDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def defineAnalysisScheme(): awsDashSdkLib.libRequestMod.Request[DefineAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineAnalysisScheme(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def defineAnalysisScheme(params: DefineAnalysisSchemeRequest): awsDashSdkLib.libRequestMod.Request[DefineAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineAnalysisScheme(
    params: DefineAnalysisSchemeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def defineExpression(): awsDashSdkLib.libRequestMod.Request[DefineExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineExpression(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def defineExpression(params: DefineExpressionRequest): awsDashSdkLib.libRequestMod.Request[DefineExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineExpression(
    params: DefineExpressionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
    */
  def defineIndexField(): awsDashSdkLib.libRequestMod.Request[DefineIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineIndexField(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
    */
  def defineIndexField(params: DefineIndexFieldRequest): awsDashSdkLib.libRequestMod.Request[DefineIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineIndexField(
    params: DefineIndexFieldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def defineSuggester(): awsDashSdkLib.libRequestMod.Request[DefineSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineSuggester(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def defineSuggester(params: DefineSuggesterRequest): awsDashSdkLib.libRequestMod.Request[DefineSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def defineSuggester(
    params: DefineSuggesterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DefineSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DefineSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
    */
  def deleteAnalysisScheme(): awsDashSdkLib.libRequestMod.Request[DeleteAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAnalysisScheme(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
    */
  def deleteAnalysisScheme(params: DeleteAnalysisSchemeRequest): awsDashSdkLib.libRequestMod.Request[DeleteAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAnalysisScheme(
    params: DeleteAnalysisSchemeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAnalysisSchemeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
    */
  def deleteDomain(): awsDashSdkLib.libRequestMod.Request[DeleteDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
    */
  def deleteDomain(params: DeleteDomainRequest): awsDashSdkLib.libRequestMod.Request[DeleteDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def deleteExpression(): awsDashSdkLib.libRequestMod.Request[DeleteExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteExpression(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def deleteExpression(params: DeleteExpressionRequest): awsDashSdkLib.libRequestMod.Request[DeleteExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteExpression(
    params: DeleteExpressionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteExpressionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
    */
  def deleteIndexField(): awsDashSdkLib.libRequestMod.Request[DeleteIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIndexField(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
    */
  def deleteIndexField(params: DeleteIndexFieldRequest): awsDashSdkLib.libRequestMod.Request[DeleteIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIndexField(
    params: DeleteIndexFieldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteIndexFieldResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def deleteSuggester(): awsDashSdkLib.libRequestMod.Request[DeleteSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSuggester(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def deleteSuggester(params: DeleteSuggesterRequest): awsDashSdkLib.libRequestMod.Request[DeleteSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSuggester(
    params: DeleteSuggesterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSuggesterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def describeAnalysisSchemes(): awsDashSdkLib.libRequestMod.Request[DescribeAnalysisSchemesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAnalysisSchemes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAnalysisSchemesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAnalysisSchemesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
    */
  def describeAnalysisSchemes(params: DescribeAnalysisSchemesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAnalysisSchemesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAnalysisSchemes(
    params: DescribeAnalysisSchemesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAnalysisSchemesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAnalysisSchemesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def describeAvailabilityOptions(): awsDashSdkLib.libRequestMod.Request[DescribeAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAvailabilityOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def describeAvailabilityOptions(params: DescribeAvailabilityOptionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAvailabilityOptions(
    params: DescribeAvailabilityOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeDomains(): awsDashSdkLib.libRequestMod.Request[DescribeDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDomains(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeDomains(params: DescribeDomainsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDomains(
    params: DescribeDomainsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDomainsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def describeExpressions(): awsDashSdkLib.libRequestMod.Request[DescribeExpressionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeExpressions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeExpressionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeExpressionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
    */
  def describeExpressions(params: DescribeExpressionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeExpressionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeExpressions(
    params: DescribeExpressionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeExpressionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeExpressionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
    */
  def describeIndexFields(): awsDashSdkLib.libRequestMod.Request[DescribeIndexFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIndexFields(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIndexFieldsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIndexFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
    */
  def describeIndexFields(params: DescribeIndexFieldsRequest): awsDashSdkLib.libRequestMod.Request[DescribeIndexFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIndexFields(
    params: DescribeIndexFieldsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIndexFieldsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIndexFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
    */
  def describeScalingParameters(): awsDashSdkLib.libRequestMod.Request[DescribeScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
    */
  def describeScalingParameters(params: DescribeScalingParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingParameters(
    params: DescribeScalingParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeServiceAccessPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeServiceAccessPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
    */
  def describeServiceAccessPolicies(params: DescribeServiceAccessPoliciesRequest): awsDashSdkLib.libRequestMod.Request[DescribeServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeServiceAccessPolicies(
    params: DescribeServiceAccessPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def describeSuggesters(): awsDashSdkLib.libRequestMod.Request[DescribeSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSuggesters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
    */
  def describeSuggesters(params: DescribeSuggestersRequest): awsDashSdkLib.libRequestMod.Request[DescribeSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSuggesters(
    params: DescribeSuggestersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSuggestersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
    */
  def indexDocuments(): awsDashSdkLib.libRequestMod.Request[IndexDocumentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def indexDocuments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IndexDocumentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IndexDocumentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
    */
  def indexDocuments(params: IndexDocumentsRequest): awsDashSdkLib.libRequestMod.Request[IndexDocumentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def indexDocuments(
    params: IndexDocumentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IndexDocumentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IndexDocumentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all search domains owned by an account.
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
    * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def updateAvailabilityOptions(): awsDashSdkLib.libRequestMod.Request[UpdateAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAvailabilityOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
    */
  def updateAvailabilityOptions(params: UpdateAvailabilityOptionsRequest): awsDashSdkLib.libRequestMod.Request[UpdateAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAvailabilityOptions(
    params: UpdateAvailabilityOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAvailabilityOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
    */
  def updateScalingParameters(): awsDashSdkLib.libRequestMod.Request[UpdateScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateScalingParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
    */
  def updateScalingParameters(params: UpdateScalingParametersRequest): awsDashSdkLib.libRequestMod.Request[UpdateScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateScalingParameters(
    params: UpdateScalingParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateScalingParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
    */
  def updateServiceAccessPolicies(): awsDashSdkLib.libRequestMod.Request[UpdateServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceAccessPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
    */
  def updateServiceAccessPolicies(params: UpdateServiceAccessPoliciesRequest): awsDashSdkLib.libRequestMod.Request[UpdateServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceAccessPolicies(
    params: UpdateServiceAccessPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceAccessPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

