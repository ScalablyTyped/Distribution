package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudSearch
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudSearch: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.ClientConfiguration = js.native
  /**
     * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
     */
  def buildSuggesters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
     */
  def buildSuggesters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
     */
  def buildSuggesters(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Indexes the search suggestions. For more information, see Configuring Suggesters in the Amazon CloudSearch Developer Guide.
     */
  def buildSuggesters(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.BuildSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def createDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def createDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def createDomain(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new search domain. For more information, see Creating a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def createDomain(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.CreateDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def defineAnalysisScheme(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def defineAnalysisScheme(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def defineAnalysisScheme(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def defineAnalysisScheme(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def defineExpression(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def defineExpression(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def defineExpression(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an Expression for the search domain. Used to create new expressions and modify existing ones. If the expression exists, the new configuration replaces the old one. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def defineExpression(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
     */
  def defineIndexField(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
     */
  def defineIndexField(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
     */
  def defineIndexField(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an IndexField for the search domain. Used to create new fields and modify existing ones. You must specify the name of the domain you are configuring and an index field configuration. The index field configuration specifies a unique name, the index field type, and the options you want to configure for the field. The options you can specify depend on the IndexFieldType. If the field exists, the new configuration replaces the old one. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide. 
     */
  def defineIndexField(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def defineSuggester(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def defineSuggester(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def defineSuggester(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish typing their queries. When you configure a suggester, you must specify the name of the text field you want to search for possible matches and a unique name for the suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def defineSuggester(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DefineSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
     */
  def deleteAnalysisScheme(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
     */
  def deleteAnalysisScheme(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
     */
  def deleteAnalysisScheme(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an analysis scheme. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide. 
     */
  def deleteAnalysisScheme(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteAnalysisSchemeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
     */
  def deleteDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
     */
  def deleteDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
     */
  def deleteDomain(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered. For more information, see Deleting a Search Domain in the Amazon CloudSearch Developer Guide. 
     */
  def deleteDomain(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def deleteExpression(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def deleteExpression(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def deleteExpression(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an Expression from the search domain. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def deleteExpression(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteExpressionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
     */
  def deleteIndexField(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
     */
  def deleteIndexField(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
     */
  def deleteIndexField(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes an IndexField from the search domain. For more information, see Configuring Index Fields in the Amazon CloudSearch Developer Guide.
     */
  def deleteIndexField(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteIndexFieldResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def deleteSuggester(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def deleteSuggester(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def deleteSuggester(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a suggester. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def deleteSuggester(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DeleteSuggesterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def describeAnalysisSchemes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def describeAnalysisSchemes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def describeAnalysisSchemes(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing options for a text field. Can be limited to specific analysis schemes by name. By default, shows all analysis schemes and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Analysis Schemes in the Amazon CloudSearch Developer Guide.
     */
  def describeAnalysisSchemes(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAnalysisSchemesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def describeAvailabilityOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def describeAvailabilityOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def describeAvailabilityOptions(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the availability options configured for a domain. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def describeAvailabilityOptions(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeDomains(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeDomains(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeDomains(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all domains by default. To get the number of searchable documents in a domain, use the console or submit a matchall request to your domain's search endpoint: q=matchall&amp;amp;q.parser=structured&amp;amp;size=0. For more information, see Getting Information about a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeDomains(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeDomainsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def describeExpressions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def describeExpressions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def describeExpressions(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By default, shows all expressions and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Expressions in the Amazon CloudSearch Developer Guide.
     */
  def describeExpressions(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeExpressionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
     */
  def describeIndexFields(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
     */
  def describeIndexFields(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
     */
  def describeIndexFields(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the index fields configured for the search domain. Can be limited to specific fields by name. By default, shows all fields and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Domain Information in the Amazon CloudSearch Developer Guide.
     */
  def describeIndexFields(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeIndexFieldsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
     */
  def describeScalingParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
     */
  def describeScalingParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
     */
  def describeScalingParameters(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search instance type and replication count. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide.
     */
  def describeScalingParameters(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeServiceAccessPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeServiceAccessPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeServiceAccessPolicies(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the access policies that control access to the domain's document and search endpoints. By default, shows the configuration with any pending changes. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Configuring Access for a Search Domain in the Amazon CloudSearch Developer Guide.
     */
  def describeServiceAccessPolicies(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def describeSuggesters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def describeSuggesters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def describeSuggesters(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and includes any pending changes to the configuration. Set the Deployed option to true to show the active configuration and exclude pending changes. For more information, see Getting Search Suggestions in the Amazon CloudSearch Developer Guide.
     */
  def describeSuggesters(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.DescribeSuggestersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
     */
  def indexDocuments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
     */
  def indexDocuments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
     */
  def indexDocuments(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be invoked to activate options whose OptionStatus is RequiresIndexDocuments.
     */
  def indexDocuments(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.IndexDocumentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all search domains owned by an account.
     */
  def listDomainNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.ListDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all search domains owned by an account.
     */
  def listDomainNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.ListDomainNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.ListDomainNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def updateAvailabilityOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def updateAvailabilityOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def updateAvailabilityOptions(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more information, see Configuring Availability Options in the Amazon CloudSearch Developer Guide.
     */
  def updateAvailabilityOptions(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateAvailabilityOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
     */
  def updateScalingParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
     */
  def updateScalingParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
     */
  def updateScalingParameters(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is enabled, these values control the resources used per Availability Zone. For more information, see Configuring Scaling Options in the Amazon CloudSearch Developer Guide. 
     */
  def updateScalingParameters(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateScalingParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
     */
  def updateServiceAccessPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
     */
  def updateServiceAccessPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
     */
  def updateServiceAccessPolicies(params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures the access rules that control access to the domain's document and search endpoints. For more information, see  Configuring Access for an Amazon CloudSearch Domain.
     */
  def updateServiceAccessPolicies(
    params: awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudsearchMod.CloudSearchNs.UpdateServiceAccessPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

