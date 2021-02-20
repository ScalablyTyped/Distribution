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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  /**
    * Enables the advanced query syntax.
    */
  val advancedSyntax: js.UndefOr[Boolean] = js.native
  
  /**
    * AdvancedSyntaxFeatures can be exactPhrase or excludeWords
    */
  val advancedSyntaxFeatures: js.UndefOr[js.Array[exactPhrase | excludeWords]] = js.native
  
  /**
    * Enables compression of large integer arrays.
    */
  val allowCompressionOfIntegerArray: js.UndefOr[Boolean] = js.native
  
  /**
    * hether to allow typos on numbers (“numeric tokens”) in the query string.
    */
  val allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.native
  
  /**
    * List of alternatives that should be considered an exact match by the exact ranking criterion.
    */
  val alternativesAsExact: js.UndefOr[
    js.Array[
      typings.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals | singleWordSynonym | multiWordsSynonym
    ]
  ] = js.native
  
  /**
    * Allows proximity to impact which searchable attribute is matched in the attribute ranking stage.
    */
  val attributeCriteriaComputedByMinProximity: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the de-duplication attribute to be used with the distinct feature.
    */
  val attributeForDistinct: js.UndefOr[String] = js.native
  
  /**
    * The complete list of attributes that will be used for faceting.
    */
  val attributesForFaceting: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes to highlight.
    */
  val attributesToHighlight: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @deprecated Use `searchableAttributes` instead.
    */
  val attributesToIndex: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Gives control over which attributes to retrieve and which not to retrieve.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes to snippet, with an optional maximum number of words to snippet.
    */
  val attributesToSnippet: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes on which to do a decomposition of camel case words.
    */
  val camelCaseAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Overrides Algolia's default normalization.
    */
  val customNormalization: js.UndefOr[Record[String, Record[String, String]]] = js.native
  
  /**
    * Specifies the custom ranking criterion.
    */
  val customRanking: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specify on which attributes in your index Algolia should apply word-splitting (“decompounding”)
    */
  val decompoundedAttributes: js.UndefOr[Record[String, js.Array[String]]] = js.native
  
  /**
    * List of attributes on which you want to disable the exact ranking criterion.
    */
  val disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes on which you want to disable prefix matching.
    */
  val disablePrefixOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes on which you want to disable typo tolerance.
    */
  val disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of words on which you want to disable typo tolerance.
    */
  val disableTypoToleranceOnWords: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Enables de-duplication or grouping of results.
    */
  val distinct: js.UndefOr[Boolean | Double] = js.native
  
  /**
    * Enable personalization for queries by default
    */
  val enablePersonalization: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether rules should be globally enabled.
    */
  val enableRules: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls how the exact ranking criterion is computed when the query contains only one word.
    */
  val exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.native
  
  /**
    * The HTML string to insert after the highlighted parts in all highlight and snippet results.
    */
  val highlightPostTag: js.UndefOr[String] = js.native
  
  /**
    * The HTML string to insert before the highlighted parts in all highlight and snippet results.
    */
  val highlightPreTag: js.UndefOr[String] = js.native
  
  /**
    * Set the number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Treats singular, plurals, and other forms of declensions as matching terms.
    */
  val ignorePlurals: js.UndefOr[js.Array[String] | Boolean] = js.native
  
  /**
    * A list of language ISO code.
    */
  val indexLanguages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Characters that should not be automatically normalized by the search engine.
    */
  val keepDiacriticsOnCharacters: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of facet hits to return during a search for facet values.
    */
  val maxFacetHits: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of facet values to return for each facet during a regular search.
    */
  val maxValuesPerFacet: js.UndefOr[Double] = js.native
  
  /**
    * Precision of the proximity ranking criterion.
    */
  val minProximity: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 1 typo.
    */
  val minWordSizefor1Typo: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 2 typos.
    */
  val minWordSizefor2Typos: js.UndefOr[Double] = js.native
  
  /**
    * List of numeric attributes that can be used as numerical filters.
    */
  val numericAttributesForFiltering: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of words that should be considered as optional when found in the query.
    */
  val optionalWords: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Set the maximum number of hits accessible via pagination.
    */
  val paginationLimitedTo: js.UndefOr[Double] = js.native
  
  /**
    * The primary parameter is automatically added to a replica's settings when the replica is created and cannot be modified.
    *
    * Can not be setted.
    */
  val primary: js.UndefOr[String] = js.native
  
  /**
    * Sets the languages to be used by language-specific settings and functionalities such as ignorePlurals, removeStopWords, and CJK word-detection.
    */
  val queryLanguages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Controls if and how query words are interpreted as prefixes.
    */
  val queryType: js.UndefOr[prefixLast | prefixAll | prefixNone] = js.native
  
  /**
    * Controls the way results are sorted.
    */
  val ranking: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Removes stop (common) words from the query before executing it.
    */
  val removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Selects a strategy to remove words from the query when it doesn’t match any hits.
    */
  val removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.native
  
  /**
    * Whether to highlight and snippet the original word that matches the synonym or the synonym itself.
    */
  val replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.native
  
  /**
    * Creates replicas, exact copies of an index.
    */
  val replicas: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Choose which fields the response will contain. Applies to search and browse queries.
    */
  val responseFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Restrict highlighting and snippeting to items that matched the query.
    */
  val restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.native
  
  /**
    * The complete list of attributes that will be used for searching.
    */
  val searchableAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Control which separators are indexed.
    */
  val separatorsToIndex: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Use `replicas` instead.
    */
  val slaves: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    */
  val snippetEllipsisText: js.UndefOr[String] = js.native
  
  /**
    * Controls how facet values are sorted.
    */
  val sortFacetValuesBy: js.UndefOr[count | alpha] = js.native
  
  /**
    * Controls whether typo tolerance is enabled and how it is applied.
    */
  val typoTolerance: js.UndefOr[String | Boolean] = js.native
  
  /**
    * List of attributes that cannot be retrieved at query time.
    */
  val unretrievableAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Custom userData that could be added to the Settings.
    */
  val userData: js.UndefOr[js.Any] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedSyntax(value: Boolean): Self = StObject.set(x, "advancedSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedSyntaxFeatures(value: js.Array[exactPhrase | excludeWords]): Self = StObject.set(x, "advancedSyntaxFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedSyntaxFeaturesUndefined: Self = StObject.set(x, "advancedSyntaxFeatures", js.undefined)
    
    @scala.inline
    def setAdvancedSyntaxFeaturesVarargs(value: (exactPhrase | excludeWords)*): Self = StObject.set(x, "advancedSyntaxFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAdvancedSyntaxUndefined: Self = StObject.set(x, "advancedSyntax", js.undefined)
    
    @scala.inline
    def setAllowCompressionOfIntegerArray(value: Boolean): Self = StObject.set(x, "allowCompressionOfIntegerArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCompressionOfIntegerArrayUndefined: Self = StObject.set(x, "allowCompressionOfIntegerArray", js.undefined)
    
    @scala.inline
    def setAllowTyposOnNumericTokens(value: Boolean): Self = StObject.set(x, "allowTyposOnNumericTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTyposOnNumericTokensUndefined: Self = StObject.set(x, "allowTyposOnNumericTokens", js.undefined)
    
    @scala.inline
    def setAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = StObject.set(x, "alternativesAsExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesAsExactUndefined: Self = StObject.set(x, "alternativesAsExact", js.undefined)
    
    @scala.inline
    def setAlternativesAsExactVarargs(value: (ignorePlurals | singleWordSynonym | multiWordsSynonym)*): Self = StObject.set(x, "alternativesAsExact", js.Array(value :_*))
    
    @scala.inline
    def setAttributeCriteriaComputedByMinProximity(value: Boolean): Self = StObject.set(x, "attributeCriteriaComputedByMinProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeCriteriaComputedByMinProximityUndefined: Self = StObject.set(x, "attributeCriteriaComputedByMinProximity", js.undefined)
    
    @scala.inline
    def setAttributeForDistinct(value: String): Self = StObject.set(x, "attributeForDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeForDistinctUndefined: Self = StObject.set(x, "attributeForDistinct", js.undefined)
    
    @scala.inline
    def setAttributesForFaceting(value: js.Array[String]): Self = StObject.set(x, "attributesForFaceting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesForFacetingUndefined: Self = StObject.set(x, "attributesForFaceting", js.undefined)
    
    @scala.inline
    def setAttributesForFacetingVarargs(value: String*): Self = StObject.set(x, "attributesForFaceting", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToHighlight(value: js.Array[String]): Self = StObject.set(x, "attributesToHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToHighlightUndefined: Self = StObject.set(x, "attributesToHighlight", js.undefined)
    
    @scala.inline
    def setAttributesToHighlightVarargs(value: String*): Self = StObject.set(x, "attributesToHighlight", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToIndex(value: js.Array[String]): Self = StObject.set(x, "attributesToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToIndexUndefined: Self = StObject.set(x, "attributesToIndex", js.undefined)
    
    @scala.inline
    def setAttributesToIndexVarargs(value: String*): Self = StObject.set(x, "attributesToIndex", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToSnippet(value: js.Array[String]): Self = StObject.set(x, "attributesToSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToSnippetUndefined: Self = StObject.set(x, "attributesToSnippet", js.undefined)
    
    @scala.inline
    def setAttributesToSnippetVarargs(value: String*): Self = StObject.set(x, "attributesToSnippet", js.Array(value :_*))
    
    @scala.inline
    def setCamelCaseAttributes(value: js.Array[String]): Self = StObject.set(x, "camelCaseAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamelCaseAttributesUndefined: Self = StObject.set(x, "camelCaseAttributes", js.undefined)
    
    @scala.inline
    def setCamelCaseAttributesVarargs(value: String*): Self = StObject.set(x, "camelCaseAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCustomNormalization(value: Record[String, Record[String, String]]): Self = StObject.set(x, "customNormalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomNormalizationUndefined: Self = StObject.set(x, "customNormalization", js.undefined)
    
    @scala.inline
    def setCustomRanking(value: js.Array[String]): Self = StObject.set(x, "customRanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRankingUndefined: Self = StObject.set(x, "customRanking", js.undefined)
    
    @scala.inline
    def setCustomRankingVarargs(value: String*): Self = StObject.set(x, "customRanking", js.Array(value :_*))
    
    @scala.inline
    def setDecompoundedAttributes(value: Record[String, js.Array[String]]): Self = StObject.set(x, "decompoundedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompoundedAttributesUndefined: Self = StObject.set(x, "decompoundedAttributes", js.undefined)
    
    @scala.inline
    def setDisableExactOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableExactOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExactOnAttributesUndefined: Self = StObject.set(x, "disableExactOnAttributes", js.undefined)
    
    @scala.inline
    def setDisableExactOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableExactOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisablePrefixOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disablePrefixOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePrefixOnAttributesUndefined: Self = StObject.set(x, "disablePrefixOnAttributes", js.undefined)
    
    @scala.inline
    def setDisablePrefixOnAttributesVarargs(value: String*): Self = StObject.set(x, "disablePrefixOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableTypoToleranceOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTypoToleranceOnAttributesUndefined: Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.undefined)
    
    @scala.inline
    def setDisableTypoToleranceOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisableTypoToleranceOnWords(value: js.Array[String]): Self = StObject.set(x, "disableTypoToleranceOnWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTypoToleranceOnWordsUndefined: Self = StObject.set(x, "disableTypoToleranceOnWords", js.undefined)
    
    @scala.inline
    def setDisableTypoToleranceOnWordsVarargs(value: String*): Self = StObject.set(x, "disableTypoToleranceOnWords", js.Array(value :_*))
    
    @scala.inline
    def setDistinct(value: Boolean | Double): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    @scala.inline
    def setEnablePersonalization(value: Boolean): Self = StObject.set(x, "enablePersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePersonalizationUndefined: Self = StObject.set(x, "enablePersonalization", js.undefined)
    
    @scala.inline
    def setEnableRules(value: Boolean): Self = StObject.set(x, "enableRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRulesUndefined: Self = StObject.set(x, "enableRules", js.undefined)
    
    @scala.inline
    def setExactOnSingleWordQuery(value: attribute | none | word): Self = StObject.set(x, "exactOnSingleWordQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactOnSingleWordQueryUndefined: Self = StObject.set(x, "exactOnSingleWordQuery", js.undefined)
    
    @scala.inline
    def setHighlightPostTag(value: String): Self = StObject.set(x, "highlightPostTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightPostTagUndefined: Self = StObject.set(x, "highlightPostTag", js.undefined)
    
    @scala.inline
    def setHighlightPreTag(value: String): Self = StObject.set(x, "highlightPreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightPreTagUndefined: Self = StObject.set(x, "highlightPreTag", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    @scala.inline
    def setIgnorePlurals(value: js.Array[String] | Boolean): Self = StObject.set(x, "ignorePlurals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePluralsUndefined: Self = StObject.set(x, "ignorePlurals", js.undefined)
    
    @scala.inline
    def setIgnorePluralsVarargs(value: String*): Self = StObject.set(x, "ignorePlurals", js.Array(value :_*))
    
    @scala.inline
    def setIndexLanguages(value: js.Array[String]): Self = StObject.set(x, "indexLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexLanguagesUndefined: Self = StObject.set(x, "indexLanguages", js.undefined)
    
    @scala.inline
    def setIndexLanguagesVarargs(value: String*): Self = StObject.set(x, "indexLanguages", js.Array(value :_*))
    
    @scala.inline
    def setKeepDiacriticsOnCharacters(value: String): Self = StObject.set(x, "keepDiacriticsOnCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepDiacriticsOnCharactersUndefined: Self = StObject.set(x, "keepDiacriticsOnCharacters", js.undefined)
    
    @scala.inline
    def setMaxFacetHits(value: Double): Self = StObject.set(x, "maxFacetHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFacetHitsUndefined: Self = StObject.set(x, "maxFacetHits", js.undefined)
    
    @scala.inline
    def setMaxValuesPerFacet(value: Double): Self = StObject.set(x, "maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValuesPerFacetUndefined: Self = StObject.set(x, "maxValuesPerFacet", js.undefined)
    
    @scala.inline
    def setMinProximity(value: Double): Self = StObject.set(x, "minProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProximityUndefined: Self = StObject.set(x, "minProximity", js.undefined)
    
    @scala.inline
    def setMinWordSizefor1Typo(value: Double): Self = StObject.set(x, "minWordSizefor1Typo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWordSizefor1TypoUndefined: Self = StObject.set(x, "minWordSizefor1Typo", js.undefined)
    
    @scala.inline
    def setMinWordSizefor2Typos(value: Double): Self = StObject.set(x, "minWordSizefor2Typos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWordSizefor2TyposUndefined: Self = StObject.set(x, "minWordSizefor2Typos", js.undefined)
    
    @scala.inline
    def setNumericAttributesForFiltering(value: js.Array[String]): Self = StObject.set(x, "numericAttributesForFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericAttributesForFilteringUndefined: Self = StObject.set(x, "numericAttributesForFiltering", js.undefined)
    
    @scala.inline
    def setNumericAttributesForFilteringVarargs(value: String*): Self = StObject.set(x, "numericAttributesForFiltering", js.Array(value :_*))
    
    @scala.inline
    def setOptionalWords(value: js.Array[String]): Self = StObject.set(x, "optionalWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalWordsUndefined: Self = StObject.set(x, "optionalWords", js.undefined)
    
    @scala.inline
    def setOptionalWordsVarargs(value: String*): Self = StObject.set(x, "optionalWords", js.Array(value :_*))
    
    @scala.inline
    def setPaginationLimitedTo(value: Double): Self = StObject.set(x, "paginationLimitedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationLimitedToUndefined: Self = StObject.set(x, "paginationLimitedTo", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setQueryLanguages(value: js.Array[String]): Self = StObject.set(x, "queryLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryLanguagesUndefined: Self = StObject.set(x, "queryLanguages", js.undefined)
    
    @scala.inline
    def setQueryLanguagesVarargs(value: String*): Self = StObject.set(x, "queryLanguages", js.Array(value :_*))
    
    @scala.inline
    def setQueryType(value: prefixLast | prefixAll | prefixNone): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    @scala.inline
    def setRanking(value: js.Array[String]): Self = StObject.set(x, "ranking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankingUndefined: Self = StObject.set(x, "ranking", js.undefined)
    
    @scala.inline
    def setRankingVarargs(value: String*): Self = StObject.set(x, "ranking", js.Array(value :_*))
    
    @scala.inline
    def setRemoveStopWords(value: Boolean | js.Array[String]): Self = StObject.set(x, "removeStopWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStopWordsUndefined: Self = StObject.set(x, "removeStopWords", js.undefined)
    
    @scala.inline
    def setRemoveStopWordsVarargs(value: String*): Self = StObject.set(x, "removeStopWords", js.Array(value :_*))
    
    @scala.inline
    def setRemoveWordsIfNoResults(value: none | lastWords | firstWords | allOptional): Self = StObject.set(x, "removeWordsIfNoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWordsIfNoResultsUndefined: Self = StObject.set(x, "removeWordsIfNoResults", js.undefined)
    
    @scala.inline
    def setReplaceSynonymsInHighlight(value: Boolean): Self = StObject.set(x, "replaceSynonymsInHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceSynonymsInHighlightUndefined: Self = StObject.set(x, "replaceSynonymsInHighlight", js.undefined)
    
    @scala.inline
    def setReplicas(value: js.Array[String]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: String*): Self = StObject.set(x, "replicas", js.Array(value :_*))
    
    @scala.inline
    def setResponseFields(value: js.Array[String]): Self = StObject.set(x, "responseFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseFieldsUndefined: Self = StObject.set(x, "responseFields", js.undefined)
    
    @scala.inline
    def setResponseFieldsVarargs(value: String*): Self = StObject.set(x, "responseFields", js.Array(value :_*))
    
    @scala.inline
    def setRestrictHighlightAndSnippetArrays(value: Boolean): Self = StObject.set(x, "restrictHighlightAndSnippetArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictHighlightAndSnippetArraysUndefined: Self = StObject.set(x, "restrictHighlightAndSnippetArrays", js.undefined)
    
    @scala.inline
    def setSearchableAttributes(value: js.Array[String]): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableAttributesUndefined: Self = StObject.set(x, "searchableAttributes", js.undefined)
    
    @scala.inline
    def setSearchableAttributesVarargs(value: String*): Self = StObject.set(x, "searchableAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSeparatorsToIndex(value: String): Self = StObject.set(x, "separatorsToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorsToIndexUndefined: Self = StObject.set(x, "separatorsToIndex", js.undefined)
    
    @scala.inline
    def setSlaves(value: js.Array[String]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesUndefined: Self = StObject.set(x, "slaves", js.undefined)
    
    @scala.inline
    def setSlavesVarargs(value: String*): Self = StObject.set(x, "slaves", js.Array(value :_*))
    
    @scala.inline
    def setSnippetEllipsisText(value: String): Self = StObject.set(x, "snippetEllipsisText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetEllipsisTextUndefined: Self = StObject.set(x, "snippetEllipsisText", js.undefined)
    
    @scala.inline
    def setSortFacetValuesBy(value: count | alpha): Self = StObject.set(x, "sortFacetValuesBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFacetValuesByUndefined: Self = StObject.set(x, "sortFacetValuesBy", js.undefined)
    
    @scala.inline
    def setTypoTolerance(value: String | Boolean): Self = StObject.set(x, "typoTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypoToleranceUndefined: Self = StObject.set(x, "typoTolerance", js.undefined)
    
    @scala.inline
    def setUnretrievableAttributes(value: js.Array[String]): Self = StObject.set(x, "unretrievableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnretrievableAttributesUndefined: Self = StObject.set(x, "unretrievableAttributes", js.undefined)
    
    @scala.inline
    def setUnretrievableAttributesVarargs(value: String*): Self = StObject.set(x, "unretrievableAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
