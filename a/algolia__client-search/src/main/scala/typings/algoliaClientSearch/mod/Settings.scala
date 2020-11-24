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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
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
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvancedSyntax(value: Boolean): Self = this.set("advancedSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedSyntax: Self = this.set("advancedSyntax", js.undefined)
    
    @scala.inline
    def setAdvancedSyntaxFeaturesVarargs(value: (exactPhrase | excludeWords)*): Self = this.set("advancedSyntaxFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAdvancedSyntaxFeatures(value: js.Array[exactPhrase | excludeWords]): Self = this.set("advancedSyntaxFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedSyntaxFeatures: Self = this.set("advancedSyntaxFeatures", js.undefined)
    
    @scala.inline
    def setAllowCompressionOfIntegerArray(value: Boolean): Self = this.set("allowCompressionOfIntegerArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCompressionOfIntegerArray: Self = this.set("allowCompressionOfIntegerArray", js.undefined)
    
    @scala.inline
    def setAllowTyposOnNumericTokens(value: Boolean): Self = this.set("allowTyposOnNumericTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTyposOnNumericTokens: Self = this.set("allowTyposOnNumericTokens", js.undefined)
    
    @scala.inline
    def setAlternativesAsExactVarargs(value: (ignorePlurals | singleWordSynonym | multiWordsSynonym)*): Self = this.set("alternativesAsExact", js.Array(value :_*))
    
    @scala.inline
    def setAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = this.set("alternativesAsExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativesAsExact: Self = this.set("alternativesAsExact", js.undefined)
    
    @scala.inline
    def setAttributeCriteriaComputedByMinProximity(value: Boolean): Self = this.set("attributeCriteriaComputedByMinProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeCriteriaComputedByMinProximity: Self = this.set("attributeCriteriaComputedByMinProximity", js.undefined)
    
    @scala.inline
    def setAttributeForDistinct(value: String): Self = this.set("attributeForDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeForDistinct: Self = this.set("attributeForDistinct", js.undefined)
    
    @scala.inline
    def setAttributesForFacetingVarargs(value: String*): Self = this.set("attributesForFaceting", js.Array(value :_*))
    
    @scala.inline
    def setAttributesForFaceting(value: js.Array[String]): Self = this.set("attributesForFaceting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesForFaceting: Self = this.set("attributesForFaceting", js.undefined)
    
    @scala.inline
    def setAttributesToHighlightVarargs(value: String*): Self = this.set("attributesToHighlight", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToHighlight(value: js.Array[String]): Self = this.set("attributesToHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToHighlight: Self = this.set("attributesToHighlight", js.undefined)
    
    @scala.inline
    def setAttributesToIndexVarargs(value: String*): Self = this.set("attributesToIndex", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToIndex(value: js.Array[String]): Self = this.set("attributesToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToIndex: Self = this.set("attributesToIndex", js.undefined)
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = this.set("attributesToRetrieve", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = this.set("attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToRetrieve: Self = this.set("attributesToRetrieve", js.undefined)
    
    @scala.inline
    def setAttributesToSnippetVarargs(value: String*): Self = this.set("attributesToSnippet", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToSnippet(value: js.Array[String]): Self = this.set("attributesToSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToSnippet: Self = this.set("attributesToSnippet", js.undefined)
    
    @scala.inline
    def setCamelCaseAttributesVarargs(value: String*): Self = this.set("camelCaseAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCamelCaseAttributes(value: js.Array[String]): Self = this.set("camelCaseAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamelCaseAttributes: Self = this.set("camelCaseAttributes", js.undefined)
    
    @scala.inline
    def setCustomNormalization(value: Record[String, Record[String, String]]): Self = this.set("customNormalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomNormalization: Self = this.set("customNormalization", js.undefined)
    
    @scala.inline
    def setCustomRankingVarargs(value: String*): Self = this.set("customRanking", js.Array(value :_*))
    
    @scala.inline
    def setCustomRanking(value: js.Array[String]): Self = this.set("customRanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRanking: Self = this.set("customRanking", js.undefined)
    
    @scala.inline
    def setDecompoundedAttributes(value: Record[String, js.Array[String]]): Self = this.set("decompoundedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecompoundedAttributes: Self = this.set("decompoundedAttributes", js.undefined)
    
    @scala.inline
    def setDisableExactOnAttributesVarargs(value: String*): Self = this.set("disableExactOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisableExactOnAttributes(value: js.Array[String]): Self = this.set("disableExactOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExactOnAttributes: Self = this.set("disableExactOnAttributes", js.undefined)
    
    @scala.inline
    def setDisablePrefixOnAttributesVarargs(value: String*): Self = this.set("disablePrefixOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisablePrefixOnAttributes(value: js.Array[String]): Self = this.set("disablePrefixOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePrefixOnAttributes: Self = this.set("disablePrefixOnAttributes", js.undefined)
    
    @scala.inline
    def setDisableTypoToleranceOnAttributesVarargs(value: String*): Self = this.set("disableTypoToleranceOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = this.set("disableTypoToleranceOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTypoToleranceOnAttributes: Self = this.set("disableTypoToleranceOnAttributes", js.undefined)
    
    @scala.inline
    def setDisableTypoToleranceOnWordsVarargs(value: String*): Self = this.set("disableTypoToleranceOnWords", js.Array(value :_*))
    
    @scala.inline
    def setDisableTypoToleranceOnWords(value: js.Array[String]): Self = this.set("disableTypoToleranceOnWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTypoToleranceOnWords: Self = this.set("disableTypoToleranceOnWords", js.undefined)
    
    @scala.inline
    def setDistinct(value: Boolean | Double): Self = this.set("distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinct: Self = this.set("distinct", js.undefined)
    
    @scala.inline
    def setEnablePersonalization(value: Boolean): Self = this.set("enablePersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersonalization: Self = this.set("enablePersonalization", js.undefined)
    
    @scala.inline
    def setEnableRules(value: Boolean): Self = this.set("enableRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRules: Self = this.set("enableRules", js.undefined)
    
    @scala.inline
    def setExactOnSingleWordQuery(value: attribute | none | word): Self = this.set("exactOnSingleWordQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactOnSingleWordQuery: Self = this.set("exactOnSingleWordQuery", js.undefined)
    
    @scala.inline
    def setHighlightPostTag(value: String): Self = this.set("highlightPostTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightPostTag: Self = this.set("highlightPostTag", js.undefined)
    
    @scala.inline
    def setHighlightPreTag(value: String): Self = this.set("highlightPreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightPreTag: Self = this.set("highlightPreTag", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    
    @scala.inline
    def setIgnorePluralsVarargs(value: String*): Self = this.set("ignorePlurals", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePlurals(value: js.Array[String] | Boolean): Self = this.set("ignorePlurals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePlurals: Self = this.set("ignorePlurals", js.undefined)
    
    @scala.inline
    def setIndexLanguagesVarargs(value: String*): Self = this.set("indexLanguages", js.Array(value :_*))
    
    @scala.inline
    def setIndexLanguages(value: js.Array[String]): Self = this.set("indexLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLanguages: Self = this.set("indexLanguages", js.undefined)
    
    @scala.inline
    def setKeepDiacriticsOnCharacters(value: String): Self = this.set("keepDiacriticsOnCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepDiacriticsOnCharacters: Self = this.set("keepDiacriticsOnCharacters", js.undefined)
    
    @scala.inline
    def setMaxFacetHits(value: Double): Self = this.set("maxFacetHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFacetHits: Self = this.set("maxFacetHits", js.undefined)
    
    @scala.inline
    def setMaxValuesPerFacet(value: Double): Self = this.set("maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValuesPerFacet: Self = this.set("maxValuesPerFacet", js.undefined)
    
    @scala.inline
    def setMinProximity(value: Double): Self = this.set("minProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProximity: Self = this.set("minProximity", js.undefined)
    
    @scala.inline
    def setMinWordSizefor1Typo(value: Double): Self = this.set("minWordSizefor1Typo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWordSizefor1Typo: Self = this.set("minWordSizefor1Typo", js.undefined)
    
    @scala.inline
    def setMinWordSizefor2Typos(value: Double): Self = this.set("minWordSizefor2Typos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWordSizefor2Typos: Self = this.set("minWordSizefor2Typos", js.undefined)
    
    @scala.inline
    def setNumericAttributesForFilteringVarargs(value: String*): Self = this.set("numericAttributesForFiltering", js.Array(value :_*))
    
    @scala.inline
    def setNumericAttributesForFiltering(value: js.Array[String]): Self = this.set("numericAttributesForFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericAttributesForFiltering: Self = this.set("numericAttributesForFiltering", js.undefined)
    
    @scala.inline
    def setOptionalWordsVarargs(value: String*): Self = this.set("optionalWords", js.Array(value :_*))
    
    @scala.inline
    def setOptionalWords(value: js.Array[String]): Self = this.set("optionalWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalWords: Self = this.set("optionalWords", js.undefined)
    
    @scala.inline
    def setPaginationLimitedTo(value: Double): Self = this.set("paginationLimitedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationLimitedTo: Self = this.set("paginationLimitedTo", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setQueryLanguagesVarargs(value: String*): Self = this.set("queryLanguages", js.Array(value :_*))
    
    @scala.inline
    def setQueryLanguages(value: js.Array[String]): Self = this.set("queryLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryLanguages: Self = this.set("queryLanguages", js.undefined)
    
    @scala.inline
    def setQueryType(value: prefixLast | prefixAll | prefixNone): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryType: Self = this.set("queryType", js.undefined)
    
    @scala.inline
    def setRankingVarargs(value: String*): Self = this.set("ranking", js.Array(value :_*))
    
    @scala.inline
    def setRanking(value: js.Array[String]): Self = this.set("ranking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanking: Self = this.set("ranking", js.undefined)
    
    @scala.inline
    def setRemoveStopWordsVarargs(value: String*): Self = this.set("removeStopWords", js.Array(value :_*))
    
    @scala.inline
    def setRemoveStopWords(value: Boolean | js.Array[String]): Self = this.set("removeStopWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveStopWords: Self = this.set("removeStopWords", js.undefined)
    
    @scala.inline
    def setRemoveWordsIfNoResults(value: none | lastWords | firstWords | allOptional): Self = this.set("removeWordsIfNoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveWordsIfNoResults: Self = this.set("removeWordsIfNoResults", js.undefined)
    
    @scala.inline
    def setReplaceSynonymsInHighlight(value: Boolean): Self = this.set("replaceSynonymsInHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceSynonymsInHighlight: Self = this.set("replaceSynonymsInHighlight", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: String*): Self = this.set("replicas", js.Array(value :_*))
    
    @scala.inline
    def setReplicas(value: js.Array[String]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    
    @scala.inline
    def setResponseFieldsVarargs(value: String*): Self = this.set("responseFields", js.Array(value :_*))
    
    @scala.inline
    def setResponseFields(value: js.Array[String]): Self = this.set("responseFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseFields: Self = this.set("responseFields", js.undefined)
    
    @scala.inline
    def setRestrictHighlightAndSnippetArrays(value: Boolean): Self = this.set("restrictHighlightAndSnippetArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictHighlightAndSnippetArrays: Self = this.set("restrictHighlightAndSnippetArrays", js.undefined)
    
    @scala.inline
    def setSearchableAttributesVarargs(value: String*): Self = this.set("searchableAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSearchableAttributes(value: js.Array[String]): Self = this.set("searchableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchableAttributes: Self = this.set("searchableAttributes", js.undefined)
    
    @scala.inline
    def setSeparatorsToIndex(value: String): Self = this.set("separatorsToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparatorsToIndex: Self = this.set("separatorsToIndex", js.undefined)
    
    @scala.inline
    def setSlavesVarargs(value: String*): Self = this.set("slaves", js.Array(value :_*))
    
    @scala.inline
    def setSlaves(value: js.Array[String]): Self = this.set("slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlaves: Self = this.set("slaves", js.undefined)
    
    @scala.inline
    def setSnippetEllipsisText(value: String): Self = this.set("snippetEllipsisText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippetEllipsisText: Self = this.set("snippetEllipsisText", js.undefined)
    
    @scala.inline
    def setSortFacetValuesBy(value: count | alpha): Self = this.set("sortFacetValuesBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortFacetValuesBy: Self = this.set("sortFacetValuesBy", js.undefined)
    
    @scala.inline
    def setTypoTolerance(value: String | Boolean): Self = this.set("typoTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypoTolerance: Self = this.set("typoTolerance", js.undefined)
    
    @scala.inline
    def setUnretrievableAttributesVarargs(value: String*): Self = this.set("unretrievableAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUnretrievableAttributes(value: js.Array[String]): Self = this.set("unretrievableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnretrievableAttributes: Self = this.set("unretrievableAttributes", js.undefined)
    
    @scala.inline
    def setUserData(value: js.Any): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
}
