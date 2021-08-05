package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.allOptional
import typings.algoliaClientSearch.algoliaClientSearchStrings.alpha
import typings.algoliaClientSearch.algoliaClientSearchStrings.attribute
import typings.algoliaClientSearch.algoliaClientSearchStrings.count
import typings.algoliaClientSearch.algoliaClientSearchStrings.exactPhrase
import typings.algoliaClientSearch.algoliaClientSearchStrings.excludeWords
import typings.algoliaClientSearch.algoliaClientSearchStrings.firstWords
import typings.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals
import typings.algoliaClientSearch.algoliaClientSearchStrings.lastWords
import typings.algoliaClientSearch.algoliaClientSearchStrings.multiWordsSynonym
import typings.algoliaClientSearch.algoliaClientSearchStrings.none
import typings.algoliaClientSearch.algoliaClientSearchStrings.prefixAll
import typings.algoliaClientSearch.algoliaClientSearchStrings.prefixLast
import typings.algoliaClientSearch.algoliaClientSearchStrings.prefixNone
import typings.algoliaClientSearch.algoliaClientSearchStrings.singleWordSynonym
import typings.algoliaClientSearch.algoliaClientSearchStrings.word
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /**
    * Enables the advanced query syntax.
    */
  val advancedSyntax: js.UndefOr[Boolean] = js.undefined
  
  /**
    * AdvancedSyntaxFeatures can be exactPhrase or excludeWords
    */
  val advancedSyntaxFeatures: js.UndefOr[js.Array[exactPhrase | excludeWords]] = js.undefined
  
  /**
    * Enables compression of large integer arrays.
    */
  val allowCompressionOfIntegerArray: js.UndefOr[Boolean] = js.undefined
  
  /**
    * hether to allow typos on numbers (“numeric tokens”) in the query string.
    */
  val allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of alternatives that should be considered an exact match by the exact ranking criterion.
    */
  val alternativesAsExact: js.UndefOr[
    js.Array[
      typings.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals | singleWordSynonym | multiWordsSynonym
    ]
  ] = js.undefined
  
  /**
    * Allows proximity to impact which searchable attribute is matched in the attribute ranking stage.
    */
  val attributeCriteriaComputedByMinProximity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the de-duplication attribute to be used with the distinct feature.
    */
  val attributeForDistinct: js.UndefOr[String] = js.undefined
  
  /**
    * The complete list of attributes that will be used for faceting.
    */
  val attributesForFaceting: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of attributes to highlight.
    */
  val attributesToHighlight: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @deprecated Use `searchableAttributes` instead.
    */
  val attributesToIndex: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Gives control over which attributes to retrieve and which not to retrieve.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of attributes to snippet, with an optional maximum number of words to snippet.
    */
  val attributesToSnippet: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of attributes on which to do a decomposition of camel case words.
    */
  val camelCaseAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Overrides Algolia's default normalization.
    */
  val customNormalization: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
  
  /**
    * Specifies the custom ranking criterion.
    */
  val customRanking: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specify on which attributes in your index Algolia should apply word-splitting (“decompounding”)
    */
  val decompoundedAttributes: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  /**
    * List of attributes on which you want to disable the exact ranking criterion.
    */
  val disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of attributes on which you want to disable prefix matching.
    */
  val disablePrefixOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of attributes on which you want to disable typo tolerance.
    */
  val disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of words on which you want to disable typo tolerance.
    */
  val disableTypoToleranceOnWords: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Enables de-duplication or grouping of results.
    */
  val distinct: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * Enable personalization for queries by default
    */
  val enablePersonalization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether rules should be globally enabled.
    */
  val enableRules: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls how the exact ranking criterion is computed when the query contains only one word.
    */
  val exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.undefined
  
  /**
    * The HTML string to insert after the highlighted parts in all highlight and snippet results.
    */
  val highlightPostTag: js.UndefOr[String] = js.undefined
  
  /**
    * The HTML string to insert before the highlighted parts in all highlight and snippet results.
    */
  val highlightPreTag: js.UndefOr[String] = js.undefined
  
  /**
    * Set the number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Treats singular, plurals, and other forms of declensions as matching terms.
    */
  val ignorePlurals: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  
  /**
    * A list of language ISO code.
    */
  val indexLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Characters that should not be automatically normalized by the search engine.
    */
  val keepDiacriticsOnCharacters: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of facet hits to return during a search for facet values.
    */
  val maxFacetHits: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of facet values to return for each facet during a regular search.
    */
  val maxValuesPerFacet: js.UndefOr[Double] = js.undefined
  
  /**
    * Precision of the proximity ranking criterion.
    */
  val minProximity: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 1 typo.
    */
  val minWordSizefor1Typo: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 2 typos.
    */
  val minWordSizefor2Typos: js.UndefOr[Double] = js.undefined
  
  /**
    * List of numeric attributes that can be used as numerical filters.
    */
  val numericAttributesForFiltering: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of words that should be considered as optional when found in the query.
    */
  val optionalWords: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Set the maximum number of hits accessible via pagination.
    */
  val paginationLimitedTo: js.UndefOr[Double] = js.undefined
  
  /**
    * The primary parameter is automatically added to a replica's settings when the replica is created and cannot be modified.
    *
    * Can not be setted.
    */
  val primary: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the languages to be used by language-specific settings and functionalities such as ignorePlurals, removeStopWords, and CJK word-detection.
    */
  val queryLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Controls if and how query words are interpreted as prefixes.
    */
  val queryType: js.UndefOr[prefixLast | prefixAll | prefixNone] = js.undefined
  
  /**
    * Controls the way results are sorted.
    */
  val ranking: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Removes stop (common) words from the query before executing it.
    */
  val removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
    * Selects a strategy to remove words from the query when it doesn’t match any hits.
    */
  val removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.undefined
  
  /**
    * Whether to highlight and snippet the original word that matches the synonym or the synonym itself.
    */
  val replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Creates replicas, exact copies of an index.
    */
  val replicas: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Choose which fields the response will contain. Applies to search and browse queries.
    */
  val responseFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Restrict highlighting and snippeting to items that matched the query.
    */
  val restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The complete list of attributes that will be used for searching.
    */
  val searchableAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Control which separators are indexed.
    */
  val separatorsToIndex: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use `replicas` instead.
    */
  val slaves: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    */
  val snippetEllipsisText: js.UndefOr[String] = js.undefined
  
  /**
    * Controls how facet values are sorted.
    */
  val sortFacetValuesBy: js.UndefOr[count | alpha] = js.undefined
  
  /**
    * Controls whether typo tolerance is enabled and how it is applied.
    */
  val typoTolerance: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * List of attributes that cannot be retrieved at query time.
    */
  val unretrievableAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Custom userData that could be added to the Settings.
    */
  val userData: js.UndefOr[js.Any] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setAdvancedSyntax(value: Boolean): Self = StObject.set(x, "advancedSyntax", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSyntaxFeatures(value: js.Array[exactPhrase | excludeWords]): Self = StObject.set(x, "advancedSyntaxFeatures", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSyntaxFeaturesUndefined: Self = StObject.set(x, "advancedSyntaxFeatures", js.undefined)
    
    inline def setAdvancedSyntaxFeaturesVarargs(value: (exactPhrase | excludeWords)*): Self = StObject.set(x, "advancedSyntaxFeatures", js.Array(value :_*))
    
    inline def setAdvancedSyntaxUndefined: Self = StObject.set(x, "advancedSyntax", js.undefined)
    
    inline def setAllowCompressionOfIntegerArray(value: Boolean): Self = StObject.set(x, "allowCompressionOfIntegerArray", value.asInstanceOf[js.Any])
    
    inline def setAllowCompressionOfIntegerArrayUndefined: Self = StObject.set(x, "allowCompressionOfIntegerArray", js.undefined)
    
    inline def setAllowTyposOnNumericTokens(value: Boolean): Self = StObject.set(x, "allowTyposOnNumericTokens", value.asInstanceOf[js.Any])
    
    inline def setAllowTyposOnNumericTokensUndefined: Self = StObject.set(x, "allowTyposOnNumericTokens", js.undefined)
    
    inline def setAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = StObject.set(x, "alternativesAsExact", value.asInstanceOf[js.Any])
    
    inline def setAlternativesAsExactUndefined: Self = StObject.set(x, "alternativesAsExact", js.undefined)
    
    inline def setAlternativesAsExactVarargs(value: (ignorePlurals | singleWordSynonym | multiWordsSynonym)*): Self = StObject.set(x, "alternativesAsExact", js.Array(value :_*))
    
    inline def setAttributeCriteriaComputedByMinProximity(value: Boolean): Self = StObject.set(x, "attributeCriteriaComputedByMinProximity", value.asInstanceOf[js.Any])
    
    inline def setAttributeCriteriaComputedByMinProximityUndefined: Self = StObject.set(x, "attributeCriteriaComputedByMinProximity", js.undefined)
    
    inline def setAttributeForDistinct(value: String): Self = StObject.set(x, "attributeForDistinct", value.asInstanceOf[js.Any])
    
    inline def setAttributeForDistinctUndefined: Self = StObject.set(x, "attributeForDistinct", js.undefined)
    
    inline def setAttributesForFaceting(value: js.Array[String]): Self = StObject.set(x, "attributesForFaceting", value.asInstanceOf[js.Any])
    
    inline def setAttributesForFacetingUndefined: Self = StObject.set(x, "attributesForFaceting", js.undefined)
    
    inline def setAttributesForFacetingVarargs(value: String*): Self = StObject.set(x, "attributesForFaceting", js.Array(value :_*))
    
    inline def setAttributesToHighlight(value: js.Array[String]): Self = StObject.set(x, "attributesToHighlight", value.asInstanceOf[js.Any])
    
    inline def setAttributesToHighlightUndefined: Self = StObject.set(x, "attributesToHighlight", js.undefined)
    
    inline def setAttributesToHighlightVarargs(value: String*): Self = StObject.set(x, "attributesToHighlight", js.Array(value :_*))
    
    inline def setAttributesToIndex(value: js.Array[String]): Self = StObject.set(x, "attributesToIndex", value.asInstanceOf[js.Any])
    
    inline def setAttributesToIndexUndefined: Self = StObject.set(x, "attributesToIndex", js.undefined)
    
    inline def setAttributesToIndexVarargs(value: String*): Self = StObject.set(x, "attributesToIndex", js.Array(value :_*))
    
    inline def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    inline def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    inline def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value :_*))
    
    inline def setAttributesToSnippet(value: js.Array[String]): Self = StObject.set(x, "attributesToSnippet", value.asInstanceOf[js.Any])
    
    inline def setAttributesToSnippetUndefined: Self = StObject.set(x, "attributesToSnippet", js.undefined)
    
    inline def setAttributesToSnippetVarargs(value: String*): Self = StObject.set(x, "attributesToSnippet", js.Array(value :_*))
    
    inline def setCamelCaseAttributes(value: js.Array[String]): Self = StObject.set(x, "camelCaseAttributes", value.asInstanceOf[js.Any])
    
    inline def setCamelCaseAttributesUndefined: Self = StObject.set(x, "camelCaseAttributes", js.undefined)
    
    inline def setCamelCaseAttributesVarargs(value: String*): Self = StObject.set(x, "camelCaseAttributes", js.Array(value :_*))
    
    inline def setCustomNormalization(value: Record[String, Record[String, String]]): Self = StObject.set(x, "customNormalization", value.asInstanceOf[js.Any])
    
    inline def setCustomNormalizationUndefined: Self = StObject.set(x, "customNormalization", js.undefined)
    
    inline def setCustomRanking(value: js.Array[String]): Self = StObject.set(x, "customRanking", value.asInstanceOf[js.Any])
    
    inline def setCustomRankingUndefined: Self = StObject.set(x, "customRanking", js.undefined)
    
    inline def setCustomRankingVarargs(value: String*): Self = StObject.set(x, "customRanking", js.Array(value :_*))
    
    inline def setDecompoundedAttributes(value: Record[String, js.Array[String]]): Self = StObject.set(x, "decompoundedAttributes", value.asInstanceOf[js.Any])
    
    inline def setDecompoundedAttributesUndefined: Self = StObject.set(x, "decompoundedAttributes", js.undefined)
    
    inline def setDisableExactOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableExactOnAttributes", value.asInstanceOf[js.Any])
    
    inline def setDisableExactOnAttributesUndefined: Self = StObject.set(x, "disableExactOnAttributes", js.undefined)
    
    inline def setDisableExactOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableExactOnAttributes", js.Array(value :_*))
    
    inline def setDisablePrefixOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disablePrefixOnAttributes", value.asInstanceOf[js.Any])
    
    inline def setDisablePrefixOnAttributesUndefined: Self = StObject.set(x, "disablePrefixOnAttributes", js.undefined)
    
    inline def setDisablePrefixOnAttributesVarargs(value: String*): Self = StObject.set(x, "disablePrefixOnAttributes", js.Array(value :_*))
    
    inline def setDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableTypoToleranceOnAttributes", value.asInstanceOf[js.Any])
    
    inline def setDisableTypoToleranceOnAttributesUndefined: Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.undefined)
    
    inline def setDisableTypoToleranceOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.Array(value :_*))
    
    inline def setDisableTypoToleranceOnWords(value: js.Array[String]): Self = StObject.set(x, "disableTypoToleranceOnWords", value.asInstanceOf[js.Any])
    
    inline def setDisableTypoToleranceOnWordsUndefined: Self = StObject.set(x, "disableTypoToleranceOnWords", js.undefined)
    
    inline def setDisableTypoToleranceOnWordsVarargs(value: String*): Self = StObject.set(x, "disableTypoToleranceOnWords", js.Array(value :_*))
    
    inline def setDistinct(value: Boolean | Double): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    inline def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    inline def setEnablePersonalization(value: Boolean): Self = StObject.set(x, "enablePersonalization", value.asInstanceOf[js.Any])
    
    inline def setEnablePersonalizationUndefined: Self = StObject.set(x, "enablePersonalization", js.undefined)
    
    inline def setEnableRules(value: Boolean): Self = StObject.set(x, "enableRules", value.asInstanceOf[js.Any])
    
    inline def setEnableRulesUndefined: Self = StObject.set(x, "enableRules", js.undefined)
    
    inline def setExactOnSingleWordQuery(value: attribute | none | word): Self = StObject.set(x, "exactOnSingleWordQuery", value.asInstanceOf[js.Any])
    
    inline def setExactOnSingleWordQueryUndefined: Self = StObject.set(x, "exactOnSingleWordQuery", js.undefined)
    
    inline def setHighlightPostTag(value: String): Self = StObject.set(x, "highlightPostTag", value.asInstanceOf[js.Any])
    
    inline def setHighlightPostTagUndefined: Self = StObject.set(x, "highlightPostTag", js.undefined)
    
    inline def setHighlightPreTag(value: String): Self = StObject.set(x, "highlightPreTag", value.asInstanceOf[js.Any])
    
    inline def setHighlightPreTagUndefined: Self = StObject.set(x, "highlightPreTag", js.undefined)
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    inline def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    inline def setIgnorePlurals(value: js.Array[String] | Boolean): Self = StObject.set(x, "ignorePlurals", value.asInstanceOf[js.Any])
    
    inline def setIgnorePluralsUndefined: Self = StObject.set(x, "ignorePlurals", js.undefined)
    
    inline def setIgnorePluralsVarargs(value: String*): Self = StObject.set(x, "ignorePlurals", js.Array(value :_*))
    
    inline def setIndexLanguages(value: js.Array[String]): Self = StObject.set(x, "indexLanguages", value.asInstanceOf[js.Any])
    
    inline def setIndexLanguagesUndefined: Self = StObject.set(x, "indexLanguages", js.undefined)
    
    inline def setIndexLanguagesVarargs(value: String*): Self = StObject.set(x, "indexLanguages", js.Array(value :_*))
    
    inline def setKeepDiacriticsOnCharacters(value: String): Self = StObject.set(x, "keepDiacriticsOnCharacters", value.asInstanceOf[js.Any])
    
    inline def setKeepDiacriticsOnCharactersUndefined: Self = StObject.set(x, "keepDiacriticsOnCharacters", js.undefined)
    
    inline def setMaxFacetHits(value: Double): Self = StObject.set(x, "maxFacetHits", value.asInstanceOf[js.Any])
    
    inline def setMaxFacetHitsUndefined: Self = StObject.set(x, "maxFacetHits", js.undefined)
    
    inline def setMaxValuesPerFacet(value: Double): Self = StObject.set(x, "maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    inline def setMaxValuesPerFacetUndefined: Self = StObject.set(x, "maxValuesPerFacet", js.undefined)
    
    inline def setMinProximity(value: Double): Self = StObject.set(x, "minProximity", value.asInstanceOf[js.Any])
    
    inline def setMinProximityUndefined: Self = StObject.set(x, "minProximity", js.undefined)
    
    inline def setMinWordSizefor1Typo(value: Double): Self = StObject.set(x, "minWordSizefor1Typo", value.asInstanceOf[js.Any])
    
    inline def setMinWordSizefor1TypoUndefined: Self = StObject.set(x, "minWordSizefor1Typo", js.undefined)
    
    inline def setMinWordSizefor2Typos(value: Double): Self = StObject.set(x, "minWordSizefor2Typos", value.asInstanceOf[js.Any])
    
    inline def setMinWordSizefor2TyposUndefined: Self = StObject.set(x, "minWordSizefor2Typos", js.undefined)
    
    inline def setNumericAttributesForFiltering(value: js.Array[String]): Self = StObject.set(x, "numericAttributesForFiltering", value.asInstanceOf[js.Any])
    
    inline def setNumericAttributesForFilteringUndefined: Self = StObject.set(x, "numericAttributesForFiltering", js.undefined)
    
    inline def setNumericAttributesForFilteringVarargs(value: String*): Self = StObject.set(x, "numericAttributesForFiltering", js.Array(value :_*))
    
    inline def setOptionalWords(value: js.Array[String]): Self = StObject.set(x, "optionalWords", value.asInstanceOf[js.Any])
    
    inline def setOptionalWordsUndefined: Self = StObject.set(x, "optionalWords", js.undefined)
    
    inline def setOptionalWordsVarargs(value: String*): Self = StObject.set(x, "optionalWords", js.Array(value :_*))
    
    inline def setPaginationLimitedTo(value: Double): Self = StObject.set(x, "paginationLimitedTo", value.asInstanceOf[js.Any])
    
    inline def setPaginationLimitedToUndefined: Self = StObject.set(x, "paginationLimitedTo", js.undefined)
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setQueryLanguages(value: js.Array[String]): Self = StObject.set(x, "queryLanguages", value.asInstanceOf[js.Any])
    
    inline def setQueryLanguagesUndefined: Self = StObject.set(x, "queryLanguages", js.undefined)
    
    inline def setQueryLanguagesVarargs(value: String*): Self = StObject.set(x, "queryLanguages", js.Array(value :_*))
    
    inline def setQueryType(value: prefixLast | prefixAll | prefixNone): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    inline def setRanking(value: js.Array[String]): Self = StObject.set(x, "ranking", value.asInstanceOf[js.Any])
    
    inline def setRankingUndefined: Self = StObject.set(x, "ranking", js.undefined)
    
    inline def setRankingVarargs(value: String*): Self = StObject.set(x, "ranking", js.Array(value :_*))
    
    inline def setRemoveStopWords(value: Boolean | js.Array[String]): Self = StObject.set(x, "removeStopWords", value.asInstanceOf[js.Any])
    
    inline def setRemoveStopWordsUndefined: Self = StObject.set(x, "removeStopWords", js.undefined)
    
    inline def setRemoveStopWordsVarargs(value: String*): Self = StObject.set(x, "removeStopWords", js.Array(value :_*))
    
    inline def setRemoveWordsIfNoResults(value: none | lastWords | firstWords | allOptional): Self = StObject.set(x, "removeWordsIfNoResults", value.asInstanceOf[js.Any])
    
    inline def setRemoveWordsIfNoResultsUndefined: Self = StObject.set(x, "removeWordsIfNoResults", js.undefined)
    
    inline def setReplaceSynonymsInHighlight(value: Boolean): Self = StObject.set(x, "replaceSynonymsInHighlight", value.asInstanceOf[js.Any])
    
    inline def setReplaceSynonymsInHighlightUndefined: Self = StObject.set(x, "replaceSynonymsInHighlight", js.undefined)
    
    inline def setReplicas(value: js.Array[String]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: String*): Self = StObject.set(x, "replicas", js.Array(value :_*))
    
    inline def setResponseFields(value: js.Array[String]): Self = StObject.set(x, "responseFields", value.asInstanceOf[js.Any])
    
    inline def setResponseFieldsUndefined: Self = StObject.set(x, "responseFields", js.undefined)
    
    inline def setResponseFieldsVarargs(value: String*): Self = StObject.set(x, "responseFields", js.Array(value :_*))
    
    inline def setRestrictHighlightAndSnippetArrays(value: Boolean): Self = StObject.set(x, "restrictHighlightAndSnippetArrays", value.asInstanceOf[js.Any])
    
    inline def setRestrictHighlightAndSnippetArraysUndefined: Self = StObject.set(x, "restrictHighlightAndSnippetArrays", js.undefined)
    
    inline def setSearchableAttributes(value: js.Array[String]): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    inline def setSearchableAttributesUndefined: Self = StObject.set(x, "searchableAttributes", js.undefined)
    
    inline def setSearchableAttributesVarargs(value: String*): Self = StObject.set(x, "searchableAttributes", js.Array(value :_*))
    
    inline def setSeparatorsToIndex(value: String): Self = StObject.set(x, "separatorsToIndex", value.asInstanceOf[js.Any])
    
    inline def setSeparatorsToIndexUndefined: Self = StObject.set(x, "separatorsToIndex", js.undefined)
    
    inline def setSlaves(value: js.Array[String]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    inline def setSlavesUndefined: Self = StObject.set(x, "slaves", js.undefined)
    
    inline def setSlavesVarargs(value: String*): Self = StObject.set(x, "slaves", js.Array(value :_*))
    
    inline def setSnippetEllipsisText(value: String): Self = StObject.set(x, "snippetEllipsisText", value.asInstanceOf[js.Any])
    
    inline def setSnippetEllipsisTextUndefined: Self = StObject.set(x, "snippetEllipsisText", js.undefined)
    
    inline def setSortFacetValuesBy(value: count | alpha): Self = StObject.set(x, "sortFacetValuesBy", value.asInstanceOf[js.Any])
    
    inline def setSortFacetValuesByUndefined: Self = StObject.set(x, "sortFacetValuesBy", js.undefined)
    
    inline def setTypoTolerance(value: String | Boolean): Self = StObject.set(x, "typoTolerance", value.asInstanceOf[js.Any])
    
    inline def setTypoToleranceUndefined: Self = StObject.set(x, "typoTolerance", js.undefined)
    
    inline def setUnretrievableAttributes(value: js.Array[String]): Self = StObject.set(x, "unretrievableAttributes", value.asInstanceOf[js.Any])
    
    inline def setUnretrievableAttributesUndefined: Self = StObject.set(x, "unretrievableAttributes", js.undefined)
    
    inline def setUnretrievableAttributesVarargs(value: String*): Self = StObject.set(x, "unretrievableAttributes", js.Array(value :_*))
    
    inline def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
