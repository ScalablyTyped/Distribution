package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequest extends StObject {
  
  /**
    * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the AndAllFilters, NotFilter, and OrAllFilters parameters contain a list of other filters. The AttributeFilter parameter enables you to create a set of filtering rules that a document must satisfy to be included in the query results.
    */
  var AttributeFilter: js.UndefOr[typings.awsSdk.clientsKendraMod.AttributeFilter] = js.undefined
  
  /**
    * Overrides relevance tuning configurations of fields or attributes set at the index level. If you use this API to override the relevance tuning configured at the index level, but there is no relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning. If there is relevance tuning configured at the index level, but you do not use this API to override any relevance tuning in the index, then Amazon Kendra uses the relevance tuning that is configured at the index level. If there is relevance tuning configured for fields at the index level, but you use this API to override only some of these fields, then for the fields you did not override, the importance is set to 1.
    */
  var DocumentRelevanceOverrideConfigurations: js.UndefOr[DocumentRelevanceOverrideConfigurationList] = js.undefined
  
  /**
    * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. This helps your users narrow their search.
    */
  var Facets: js.UndefOr[FacetList] = js.undefined
  
  /**
    * The unique identifier of the index to search. The identifier is returned in the response from the CreateIndex API.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * Query results are returned in pages the size of the PageSize parameter. By default, Amazon Kendra returns the first page of results. Use this parameter to get result pages after the first one.
    */
  var PageNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * Sets the number of results that are returned in each page of results. The default page size is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
    */
  var PageSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * Sets the type of query. Only results for the specified query type are returned.
    */
  var QueryResultTypeFilter: js.UndefOr[QueryResultType] = js.undefined
  
  /**
    * The text to search for.
    */
  var QueryText: js.UndefOr[typings.awsSdk.clientsKendraMod.QueryText] = js.undefined
  
  /**
    * An array of document attributes to include in the response. You can limit the response to include certain document attributes. By default all document attributes are included in the response.
    */
  var RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList] = js.undefined
  
  /**
    * Provides information that determines how the results of the query are sorted. You can set the field that Amazon Kendra should sort the results on, and specify whether the results should be sorted in ascending or descending order. In the case of ties in sorting the results, the results are sorted by relevance. If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra determines for the result.
    */
  var SortingConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SortingConfiguration] = js.undefined
  
  /**
    * Enables suggested spell corrections for queries.
    */
  var SpellCorrectionConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SpellCorrectionConfiguration] = js.undefined
  
  /**
    * The user context token or user and group information.
    */
  var UserContext: js.UndefOr[typings.awsSdk.clientsKendraMod.UserContext] = js.undefined
  
  /**
    * Provides an identifier for a specific user. The VisitorId should be a unique identifier, such as a GUID. Don't use personally identifiable information, such as the user's email address, as the VisitorId.
    */
  var VisitorId: js.UndefOr[typings.awsSdk.clientsKendraMod.VisitorId] = js.undefined
}
object QueryRequest {
  
  inline def apply(IndexId: IndexId): QueryRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributeFilter(value: AttributeFilter): Self = StObject.set(x, "AttributeFilter", value.asInstanceOf[js.Any])
    
    inline def setAttributeFilterUndefined: Self = StObject.set(x, "AttributeFilter", js.undefined)
    
    inline def setDocumentRelevanceOverrideConfigurations(value: DocumentRelevanceOverrideConfigurationList): Self = StObject.set(x, "DocumentRelevanceOverrideConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDocumentRelevanceOverrideConfigurationsUndefined: Self = StObject.set(x, "DocumentRelevanceOverrideConfigurations", js.undefined)
    
    inline def setDocumentRelevanceOverrideConfigurationsVarargs(value: DocumentRelevanceConfiguration*): Self = StObject.set(x, "DocumentRelevanceOverrideConfigurations", js.Array(value*))
    
    inline def setFacets(value: FacetList): Self = StObject.set(x, "Facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "Facets", js.undefined)
    
    inline def setFacetsVarargs(value: Facet*): Self = StObject.set(x, "Facets", js.Array(value*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setPageNumber(value: Integer): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
    
    inline def setPageSize(value: Integer): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setQueryResultTypeFilter(value: QueryResultType): Self = StObject.set(x, "QueryResultTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setQueryResultTypeFilterUndefined: Self = StObject.set(x, "QueryResultTypeFilter", js.undefined)
    
    inline def setQueryText(value: QueryText): Self = StObject.set(x, "QueryText", value.asInstanceOf[js.Any])
    
    inline def setQueryTextUndefined: Self = StObject.set(x, "QueryText", js.undefined)
    
    inline def setRequestedDocumentAttributes(value: DocumentAttributeKeyList): Self = StObject.set(x, "RequestedDocumentAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestedDocumentAttributesUndefined: Self = StObject.set(x, "RequestedDocumentAttributes", js.undefined)
    
    inline def setRequestedDocumentAttributesVarargs(value: DocumentAttributeKey*): Self = StObject.set(x, "RequestedDocumentAttributes", js.Array(value*))
    
    inline def setSortingConfiguration(value: SortingConfiguration): Self = StObject.set(x, "SortingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortingConfigurationUndefined: Self = StObject.set(x, "SortingConfiguration", js.undefined)
    
    inline def setSpellCorrectionConfiguration(value: SpellCorrectionConfiguration): Self = StObject.set(x, "SpellCorrectionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSpellCorrectionConfigurationUndefined: Self = StObject.set(x, "SpellCorrectionConfiguration", js.undefined)
    
    inline def setUserContext(value: UserContext): Self = StObject.set(x, "UserContext", value.asInstanceOf[js.Any])
    
    inline def setUserContextUndefined: Self = StObject.set(x, "UserContext", js.undefined)
    
    inline def setVisitorId(value: VisitorId): Self = StObject.set(x, "VisitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "VisitorId", js.undefined)
  }
}
