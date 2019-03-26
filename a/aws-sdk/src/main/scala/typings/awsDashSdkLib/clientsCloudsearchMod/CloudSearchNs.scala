package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudsearch", "CloudSearch")
@js.native
object CloudSearchNs extends js.Object {
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }
  
  trait AnalysisOptions extends js.Object {
    /**
      * The level of algorithmic stemming to perform: none, minimal, light, or full. The available levels vary depending on the language. For more information, see Language Specific Text Processing Settings in the Amazon CloudSearch Developer Guide 
      */
    var AlgorithmicStemming: js.UndefOr[AlgorithmicStemming] = js.undefined
    /**
      * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton. The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is only valid for Japanese language fields.
      */
    var JapaneseTokenizationDictionary: js.UndefOr[String] = js.undefined
    /**
      * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example, {"term1": "stem1", "term2": "stem2", "term3": "stem3"}. The stemming dictionary is applied in addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
      */
    var StemmingDictionary: js.UndefOr[String] = js.undefined
    /**
      * A JSON array of terms to ignore during indexing and searching. For example, ["a", "an", "the", "of"]. The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions are not supported. 
      */
    var Stopwords: js.UndefOr[String] = js.undefined
    /**
      * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each sub-array is a group of terms where each term in the group is considered a synonym of every other term in the group. The aliases value is an object that contains a collection of string:value pairs where the string specifies a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of the specified term, but the term is not considered a synonym of the alias. For more information about specifying synonyms, see Synonyms in the Amazon CloudSearch Developer Guide.
      */
    var Synonyms: js.UndefOr[String] = js.undefined
  }
  
  trait AnalysisScheme extends js.Object {
    var AnalysisOptions: js.UndefOr[AnalysisOptions] = js.undefined
    var AnalysisSchemeLanguage: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.AnalysisSchemeLanguage
    var AnalysisSchemeName: StandardName
  }
  
  trait AnalysisSchemeStatus extends js.Object {
    var Options: AnalysisScheme
    var Status: OptionStatus
  }
  
  trait AvailabilityOptionsStatus extends js.Object {
    /**
      * The availability options configured for the domain.
      */
    var Options: MultiAZ
    var Status: OptionStatus
  }
  
  trait BuildSuggestersRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait BuildSuggestersResponse extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateDomainRequest extends js.Object {
    /**
      * A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen (-). Domain names must start with a letter or number and be at least 3 and no more than 28 characters long.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait CreateDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus] = js.undefined
  }
  
  trait DateArrayOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[FieldValue] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of source fields to map to the field. 
      */
    var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
  }
  
  trait DateOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[FieldValue] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the field can be used to sort the search results.
      */
    var SortEnabled: js.UndefOr[Boolean] = js.undefined
    var SourceField: js.UndefOr[FieldName] = js.undefined
  }
  
  trait DefineAnalysisSchemeRequest extends js.Object {
    var AnalysisScheme: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.AnalysisScheme
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait DefineAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }
  
  trait DefineExpressionRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    var Expression: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.Expression
  }
  
  trait DefineExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }
  
  trait DefineIndexFieldRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * The index field and field options you want to configure. 
      */
    var IndexField: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexField
  }
  
  trait DefineIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }
  
  trait DefineSuggesterRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    var Suggester: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.Suggester
  }
  
  trait DefineSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }
  
  trait DeleteAnalysisSchemeRequest extends js.Object {
    /**
      * The name of the analysis scheme you want to delete.
      */
    var AnalysisSchemeName: StandardName
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait DeleteAnalysisSchemeResponse extends js.Object {
    /**
      * The status of the analysis scheme being deleted.
      */
    var AnalysisScheme: AnalysisSchemeStatus
  }
  
  trait DeleteDomainRequest extends js.Object {
    /**
      * The name of the domain you want to permanently delete.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait DeleteDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus] = js.undefined
  }
  
  trait DeleteExpressionRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * The name of the Expression to delete.
      */
    var ExpressionName: StandardName
  }
  
  trait DeleteExpressionResponse extends js.Object {
    /**
      * The status of the expression being deleted.
      */
    var Expression: ExpressionStatus
  }
  
  trait DeleteIndexFieldRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * The name of the index field your want to remove from the domain's indexing options.
      */
    var IndexFieldName: DynamicFieldName
  }
  
  trait DeleteIndexFieldResponse extends js.Object {
    /**
      * The status of the index field being deleted.
      */
    var IndexField: IndexFieldStatus
  }
  
  trait DeleteSuggesterRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * Specifies the name of the suggester you want to delete.
      */
    var SuggesterName: StandardName
  }
  
  trait DeleteSuggesterResponse extends js.Object {
    /**
      * The status of the suggester being deleted.
      */
    var Suggester: SuggesterStatus
  }
  
  trait DescribeAnalysisSchemesRequest extends js.Object {
    /**
      * The analysis schemes you want to describe.
      */
    var AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.undefined
    /**
      * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
      */
    var Deployed: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain you want to describe.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait DescribeAnalysisSchemesResponse extends js.Object {
    /**
      * The analysis scheme descriptions.
      */
    var AnalysisSchemes: AnalysisSchemeStatusList
  }
  
  trait DescribeAvailabilityOptionsRequest extends js.Object {
    /**
      * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
      */
    var Deployed: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain you want to describe.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait DescribeAvailabilityOptionsResponse extends js.Object {
    /**
      * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain. 
      */
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
  }
  
  trait DescribeDomainsRequest extends js.Object {
    /**
      * The names of the domains you want to include in the response.
      */
    var DomainNames: js.UndefOr[DomainNameList] = js.undefined
  }
  
  trait DescribeDomainsResponse extends js.Object {
    var DomainStatusList: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainStatusList
  }
  
  trait DescribeExpressionsRequest extends js.Object {
    /**
      * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
      */
    var Deployed: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain you want to describe.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * Limits the DescribeExpressions response to the specified expressions. If not specified, all expressions are shown.
      */
    var ExpressionNames: js.UndefOr[StandardNameList] = js.undefined
  }
  
  trait DescribeExpressionsResponse extends js.Object {
    /**
      * The expressions configured for the domain.
      */
    var Expressions: ExpressionStatusList
  }
  
  trait DescribeIndexFieldsRequest extends js.Object {
    /**
      * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
      */
    var Deployed: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain you want to describe.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * A list of the index fields you want to describe. If not specified, information is returned for all configured index fields.
      */
    var FieldNames: js.UndefOr[DynamicFieldNameList] = js.undefined
  }
  
  trait DescribeIndexFieldsResponse extends js.Object {
    /**
      * The index fields configured for the domain.
      */
    var IndexFields: IndexFieldStatusList
  }
  
  trait DescribeScalingParametersRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait DescribeScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }
  
  trait DescribeServiceAccessPoliciesRequest extends js.Object {
    /**
      * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
      */
    var Deployed: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain you want to describe.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait DescribeServiceAccessPoliciesResponse extends js.Object {
    /**
      * The access rules configured for the domain specified in the request.
      */
    var AccessPolicies: AccessPoliciesStatus
  }
  
  trait DescribeSuggestersRequest extends js.Object {
    /**
      * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
      */
    var Deployed: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain you want to describe.
      */
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * The suggesters you want to describe.
      */
    var SuggesterNames: js.UndefOr[StandardNameList] = js.undefined
  }
  
  trait DescribeSuggestersResponse extends js.Object {
    /**
      * The suggesters configured for the domain specified in the request.
      */
    var Suggesters: SuggesterStatusList
  }
  
  trait DocumentSuggesterOptions extends js.Object {
    /**
      * The level of fuzziness allowed when suggesting matches for a string: none, low, or high. With none, the specified string is treated as an exact prefix. With low, suggestions must differ from the specified string by no more than one character. With high, suggestions can differ by up to two characters. The default is none. 
      */
    var FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching] = js.undefined
    /**
      * An expression that computes a score for each suggestion to control how they are sorted. The scores are rounded to the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is not computed for suggestions, so sort expressions cannot reference the _score value. To sort suggestions using a numeric field or existing expression, simply specify the name of the field or expression. If no expression is configured for the suggester, the suggestions are sorted with the closest matches listed first.
      */
    var SortExpression: js.UndefOr[String] = js.undefined
    /**
      * The name of the index field you want to use for suggestions. 
      */
    var SourceField: FieldName
  }
  
  trait DomainNameMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[APIVersion]
  
  trait DomainStatus extends js.Object {
    var ARN: js.UndefOr[ARN] = js.undefined
    /**
      * True if the search domain is created. It can take several minutes to initialize a domain when CreateDomain is called. Newly created search domains are returned from DescribeDomains with a false value for Created until domain creation is complete.
      */
    var Created: js.UndefOr[Boolean] = js.undefined
    /**
      * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain when DeleteDomain is called. Newly deleted search domains are returned from DescribeDomains with a true value for IsDeleted for several minutes until resource cleanup is complete.
      */
    var Deleted: js.UndefOr[Boolean] = js.undefined
    /**
      * The service endpoint for updating documents in a search domain.
      */
    var DocService: js.UndefOr[ServiceEndpoint] = js.undefined
    var DomainId: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainId
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    var Limits: js.UndefOr[Limits] = js.undefined
    /**
      * True if processing is being done to activate the current domain configuration.
      */
    var Processing: js.UndefOr[Boolean] = js.undefined
    /**
      * True if IndexDocuments needs to be called to activate the current domain configuration.
      */
    var RequiresIndexDocuments: Boolean
    /**
      * The number of search instances that are available to process search requests.
      */
    var SearchInstanceCount: js.UndefOr[InstanceCount] = js.undefined
    /**
      * The instance type that is being used to process search requests.
      */
    var SearchInstanceType: js.UndefOr[SearchInstanceType] = js.undefined
    /**
      * The number of partitions across which the search index is spread.
      */
    var SearchPartitionCount: js.UndefOr[PartitionCount] = js.undefined
    /**
      * The service endpoint for requesting search results from a search domain.
      */
    var SearchService: js.UndefOr[ServiceEndpoint] = js.undefined
  }
  
  trait DoubleArrayOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[Double] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of source fields to map to the field. 
      */
    var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
  }
  
  trait DoubleOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document. This can be important if you are using the field in an expression and that field is not present in every document.
      */
    var DefaultValue: js.UndefOr[Double] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the field can be used to sort the search results.
      */
    var SortEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the source field to map to the field. 
      */
    var SourceField: js.UndefOr[FieldName] = js.undefined
  }
  
  trait Expression extends js.Object {
    var ExpressionName: StandardName
    var ExpressionValue: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.ExpressionValue
  }
  
  trait ExpressionStatus extends js.Object {
    /**
      * The expression that is evaluated for sorting while processing a search request.
      */
    var Options: Expression
    var Status: OptionStatus
  }
  
  trait IndexDocumentsRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait IndexDocumentsResponse extends js.Object {
    /**
      * The names of the fields that are currently being indexed.
      */
    var FieldNames: js.UndefOr[FieldNameList] = js.undefined
  }
  
  trait IndexField extends js.Object {
    var DateArrayOptions: js.UndefOr[DateArrayOptions] = js.undefined
    var DateOptions: js.UndefOr[DateOptions] = js.undefined
    var DoubleArrayOptions: js.UndefOr[DoubleArrayOptions] = js.undefined
    var DoubleOptions: js.UndefOr[DoubleOptions] = js.undefined
    /**
      * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's indexing options.  Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.  The name score is reserved and cannot be used as a field name. To reference a document's ID, you can use the name _id. 
      */
    var IndexFieldName: DynamicFieldName
    var IndexFieldType: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexFieldType
    var IntArrayOptions: js.UndefOr[IntArrayOptions] = js.undefined
    var IntOptions: js.UndefOr[IntOptions] = js.undefined
    var LatLonOptions: js.UndefOr[LatLonOptions] = js.undefined
    var LiteralArrayOptions: js.UndefOr[LiteralArrayOptions] = js.undefined
    var LiteralOptions: js.UndefOr[LiteralOptions] = js.undefined
    var TextArrayOptions: js.UndefOr[TextArrayOptions] = js.undefined
    var TextOptions: js.UndefOr[TextOptions] = js.undefined
  }
  
  trait IndexFieldStatus extends js.Object {
    var Options: IndexField
    var Status: OptionStatus
  }
  
  trait IntArrayOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[Long] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of source fields to map to the field. 
      */
    var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
  }
  
  trait IntOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document. This can be important if you are using the field in an expression and that field is not present in every document.
      */
    var DefaultValue: js.UndefOr[Long] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the field can be used to sort the search results.
      */
    var SortEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the source field to map to the field. 
      */
    var SourceField: js.UndefOr[FieldName] = js.undefined
  }
  
  trait LatLonOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[FieldValue] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the field can be used to sort the search results.
      */
    var SortEnabled: js.UndefOr[Boolean] = js.undefined
    var SourceField: js.UndefOr[FieldName] = js.undefined
  }
  
  trait Limits extends js.Object {
    var MaximumPartitionCount: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.MaximumPartitionCount
    var MaximumReplicationCount: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.MaximumReplicationCount
  }
  
  trait ListDomainNamesResponse extends js.Object {
    /**
      * The names of the search domains owned by an account.
      */
    var DomainNames: js.UndefOr[DomainNameMap] = js.undefined
  }
  
  trait LiteralArrayOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[FieldValue] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of source fields to map to the field. 
      */
    var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
  }
  
  trait LiteralOptions extends js.Object {
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[FieldValue] = js.undefined
    /**
      * Whether facet information can be returned for the field.
      */
    var FacetEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field are searchable.
      */
    var SearchEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the field can be used to sort the search results.
      */
    var SortEnabled: js.UndefOr[Boolean] = js.undefined
    var SourceField: js.UndefOr[FieldName] = js.undefined
  }
  
  trait OptionStatus extends js.Object {
    /**
      * A timestamp for when this option was created.
      */
    var CreationDate: UpdateTimestamp
    /**
      * Indicates that the option will be deleted once processing is complete.
      */
    var PendingDeletion: js.UndefOr[Boolean] = js.undefined
    /**
      * The state of processing a change to an option. Possible values:   RequiresIndexDocuments: the option's latest value will not be deployed until IndexDocuments has been called and indexing is complete.  Processing: the option's latest value is in the process of being activated.   Active: the option's latest value is completely deployed.  FailedToValidate: the option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents. 
      */
    var State: OptionState
    /**
      * A timestamp for when this option was last updated.
      */
    var UpdateDate: UpdateTimestamp
    /**
      * A unique integer that indicates when this option was last updated.
      */
    var UpdateVersion: js.UndefOr[UIntValue] = js.undefined
  }
  
  trait ScalingParameters extends js.Object {
    /**
      * The instance type that you want to preconfigure for your domain. For example, search.m1.small.
      */
    var DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.undefined
    /**
      * The number of partitions you want to preconfigure for your domain. Only valid when you select m2.2xlarge as the desired instance type.
      */
    var DesiredPartitionCount: js.UndefOr[UIntValue] = js.undefined
    /**
      * The number of replicas you want to preconfigure for each index partition.
      */
    var DesiredReplicationCount: js.UndefOr[UIntValue] = js.undefined
  }
  
  trait ScalingParametersStatus extends js.Object {
    var Options: ScalingParameters
    var Status: OptionStatus
  }
  
  trait ServiceEndpoint extends js.Object {
    var Endpoint: js.UndefOr[ServiceUrl] = js.undefined
  }
  
  trait Suggester extends js.Object {
    var DocumentSuggesterOptions: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DocumentSuggesterOptions
    var SuggesterName: StandardName
  }
  
  trait SuggesterStatus extends js.Object {
    var Options: Suggester
    var Status: OptionStatus
  }
  
  trait TextArrayOptions extends js.Object {
    /**
      * The name of an analysis scheme for a text-array field.
      */
    var AnalysisScheme: js.UndefOr[Word] = js.undefined
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[FieldValue] = js.undefined
    /**
      * Whether highlights can be returned for the field.
      */
    var HighlightEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of source fields to map to the field. 
      */
    var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
  }
  
  trait TextOptions extends js.Object {
    /**
      * The name of an analysis scheme for a text field.
      */
    var AnalysisScheme: js.UndefOr[Word] = js.undefined
    /**
      * A value to use for the field if the field isn't specified for a document.
      */
    var DefaultValue: js.UndefOr[FieldValue] = js.undefined
    /**
      * Whether highlights can be returned for the field.
      */
    var HighlightEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the contents of the field can be returned in the search results.
      */
    var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the field can be used to sort the search results.
      */
    var SortEnabled: js.UndefOr[Boolean] = js.undefined
    var SourceField: js.UndefOr[FieldName] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UpdateAvailabilityOptionsRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    /**
      * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true. Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting the Multi-AZ option to false. 
      */
    var MultiAZ: Boolean
  }
  
  trait UpdateAvailabilityOptionsResponse extends js.Object {
    /**
      * The newly-configured availability options. Indicates whether Multi-AZ is enabled for the domain. 
      */
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
  }
  
  trait UpdateScalingParametersRequest extends js.Object {
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
    var ScalingParameters: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.ScalingParameters
  }
  
  trait UpdateScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }
  
  trait UpdateServiceAccessPoliciesRequest extends js.Object {
    /**
      * The access rules you want to configure. These rules replace any existing rules. 
      */
    var AccessPolicies: PolicyDocument
    var DomainName: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DomainName
  }
  
  trait UpdateServiceAccessPoliciesResponse extends js.Object {
    /**
      * The access rules configured for the domain.
      */
    var AccessPolicies: AccessPoliciesStatus
  }
  
  trait _AlgorithmicStemming extends js.Object
  
  trait _AnalysisSchemeLanguage extends js.Object
  
  trait _IndexFieldType extends js.Object
  
  trait _OptionState extends js.Object
  
  trait _PartitionInstanceType extends js.Object
  
  trait _SuggesterFuzzyMatching extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type APIVersion = java.lang.String
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.minimal
    - awsDashSdkLib.awsDashSdkLibStrings.light
    - awsDashSdkLib.awsDashSdkLibStrings.full
    - java.lang.String
  */
  type AlgorithmicStemming = _AlgorithmicStemming | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ar
    - awsDashSdkLib.awsDashSdkLibStrings.bg
    - awsDashSdkLib.awsDashSdkLibStrings.ca
    - awsDashSdkLib.awsDashSdkLibStrings.cs
    - awsDashSdkLib.awsDashSdkLibStrings.da
    - awsDashSdkLib.awsDashSdkLibStrings.de
    - awsDashSdkLib.awsDashSdkLibStrings.el
    - awsDashSdkLib.awsDashSdkLibStrings.en
    - awsDashSdkLib.awsDashSdkLibStrings.es
    - awsDashSdkLib.awsDashSdkLibStrings.eu
    - awsDashSdkLib.awsDashSdkLibStrings.fa
    - awsDashSdkLib.awsDashSdkLibStrings.fi
    - awsDashSdkLib.awsDashSdkLibStrings.fr
    - awsDashSdkLib.awsDashSdkLibStrings.ga
    - awsDashSdkLib.awsDashSdkLibStrings.gl
    - awsDashSdkLib.awsDashSdkLibStrings.he
    - awsDashSdkLib.awsDashSdkLibStrings.hi
    - awsDashSdkLib.awsDashSdkLibStrings.hu
    - awsDashSdkLib.awsDashSdkLibStrings.hy
    - awsDashSdkLib.awsDashSdkLibStrings.id
    - awsDashSdkLib.awsDashSdkLibStrings.it
    - awsDashSdkLib.awsDashSdkLibStrings.ja
    - awsDashSdkLib.awsDashSdkLibStrings.ko
    - awsDashSdkLib.awsDashSdkLibStrings.lv
    - awsDashSdkLib.awsDashSdkLibStrings.mul
    - awsDashSdkLib.awsDashSdkLibStrings.nl
    - awsDashSdkLib.awsDashSdkLibStrings.no
    - awsDashSdkLib.awsDashSdkLibStrings.pt
    - awsDashSdkLib.awsDashSdkLibStrings.ro
    - awsDashSdkLib.awsDashSdkLibStrings.ru
    - awsDashSdkLib.awsDashSdkLibStrings.sv
    - awsDashSdkLib.awsDashSdkLibStrings.th
    - awsDashSdkLib.awsDashSdkLibStrings.tr
    - awsDashSdkLib.awsDashSdkLibStrings.`zh-Hans`
    - awsDashSdkLib.awsDashSdkLibStrings.`zh-Hant`
    - java.lang.String
  */
  type AnalysisSchemeLanguage = _AnalysisSchemeLanguage | java.lang.String
  type AnalysisSchemeStatusList = js.Array[AnalysisSchemeStatus]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DomainId = java.lang.String
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type DomainStatusList = js.Array[DomainStatus]
  type Double = scala.Double
  type DynamicFieldName = java.lang.String
  type DynamicFieldNameList = js.Array[DynamicFieldName]
  type ExpressionStatusList = js.Array[ExpressionStatus]
  type ExpressionValue = java.lang.String
  type FieldName = java.lang.String
  type FieldNameCommaList = java.lang.String
  type FieldNameList = js.Array[FieldName]
  type FieldValue = java.lang.String
  type IndexFieldStatusList = js.Array[IndexFieldStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.int
    - awsDashSdkLib.awsDashSdkLibStrings.double
    - awsDashSdkLib.awsDashSdkLibStrings.literal
    - awsDashSdkLib.awsDashSdkLibStrings.text
    - awsDashSdkLib.awsDashSdkLibStrings.date
    - awsDashSdkLib.awsDashSdkLibStrings.latlon
    - awsDashSdkLib.awsDashSdkLibStrings.`int-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`double-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`literal-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`text-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`date-array`
    - java.lang.String
  */
  type IndexFieldType = _IndexFieldType | java.lang.String
  type InstanceCount = scala.Double
  type Long = scala.Double
  type MaximumPartitionCount = scala.Double
  type MaximumReplicationCount = scala.Double
  type MultiAZ = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RequiresIndexDocuments
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.FailedToValidate
    - java.lang.String
  */
  type OptionState = _OptionState | java.lang.String
  type PartitionCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm1DOTsmall
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm1DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOT2xlarge
    - java.lang.String
  */
  type PartitionInstanceType = _PartitionInstanceType | java.lang.String
  type PolicyDocument = java.lang.String
  type SearchInstanceType = java.lang.String
  type ServiceUrl = java.lang.String
  type StandardName = java.lang.String
  type StandardNameList = js.Array[StandardName]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.low
    - awsDashSdkLib.awsDashSdkLibStrings.high
    - java.lang.String
  */
  type SuggesterFuzzyMatching = _SuggesterFuzzyMatching | java.lang.String
  type SuggesterStatusList = js.Array[SuggesterStatus]
  type UIntValue = scala.Double
  type UpdateTimestamp = stdLib.Date
  type Word = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2011-02-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-01-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

