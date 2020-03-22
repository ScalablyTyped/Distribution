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
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
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
  @scala.inline
  def apply(
    advancedSyntax: js.UndefOr[Boolean] = js.undefined,
    advancedSyntaxFeatures: js.Array[exactPhrase | excludeWords] = null,
    allowCompressionOfIntegerArray: js.UndefOr[Boolean] = js.undefined,
    allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined,
    alternativesAsExact: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym] = null,
    attributeCriteriaComputedByMinProximity: js.UndefOr[Boolean] = js.undefined,
    attributeForDistinct: String = null,
    attributesForFaceting: js.Array[String] = null,
    attributesToHighlight: js.Array[String] = null,
    attributesToIndex: js.Array[String] = null,
    attributesToRetrieve: js.Array[String] = null,
    attributesToSnippet: js.Array[String] = null,
    camelCaseAttributes: js.Array[String] = null,
    customNormalization: Record[String, Record[String, String]] = null,
    customRanking: js.Array[String] = null,
    decompoundedAttributes: Record[String, js.Array[String]] = null,
    disableExactOnAttributes: js.Array[String] = null,
    disablePrefixOnAttributes: js.Array[String] = null,
    disableTypoToleranceOnAttributes: js.Array[String] = null,
    disableTypoToleranceOnWords: js.Array[String] = null,
    distinct: Boolean | Double = null,
    enableRules: js.UndefOr[Boolean] = js.undefined,
    exactOnSingleWordQuery: attribute | none | word = null,
    highlightPostTag: String = null,
    highlightPreTag: String = null,
    hitsPerPage: Int | Double = null,
    ignorePlurals: js.Array[String] | Boolean = null,
    indexLanguages: js.Array[String] = null,
    keepDiacriticsOnCharacters: String = null,
    maxFacetHits: Int | Double = null,
    maxValuesPerFacet: Int | Double = null,
    minProximity: Int | Double = null,
    minWordSizefor1Typo: Int | Double = null,
    minWordSizefor2Typos: Int | Double = null,
    numericAttributesForFiltering: js.Array[String] = null,
    optionalWords: js.Array[String] = null,
    paginationLimitedTo: Int | Double = null,
    primary: String = null,
    queryLanguages: js.Array[String] = null,
    queryType: prefixLast | prefixAll | prefixNone = null,
    ranking: js.Array[String] = null,
    removeStopWords: Boolean | js.Array[String] = null,
    removeWordsIfNoResults: none | lastWords | firstWords | allOptional = null,
    replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined,
    replicas: js.Array[String] = null,
    responseFields: js.Array[String] = null,
    restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined,
    searchableAttributes: js.Array[String] = null,
    separatorsToIndex: String = null,
    slaves: js.Array[String] = null,
    snippetEllipsisText: String = null,
    sortFacetValuesBy: count | alpha = null,
    typoTolerance: String | Boolean = null,
    unretrievableAttributes: js.Array[String] = null,
    userData: js.Any = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax.asInstanceOf[js.Any])
    if (advancedSyntaxFeatures != null) __obj.updateDynamic("advancedSyntaxFeatures")(advancedSyntaxFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCompressionOfIntegerArray)) __obj.updateDynamic("allowCompressionOfIntegerArray")(allowCompressionOfIntegerArray.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens.asInstanceOf[js.Any])
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact.asInstanceOf[js.Any])
    if (!js.isUndefined(attributeCriteriaComputedByMinProximity)) __obj.updateDynamic("attributeCriteriaComputedByMinProximity")(attributeCriteriaComputedByMinProximity.asInstanceOf[js.Any])
    if (attributeForDistinct != null) __obj.updateDynamic("attributeForDistinct")(attributeForDistinct.asInstanceOf[js.Any])
    if (attributesForFaceting != null) __obj.updateDynamic("attributesForFaceting")(attributesForFaceting.asInstanceOf[js.Any])
    if (attributesToHighlight != null) __obj.updateDynamic("attributesToHighlight")(attributesToHighlight.asInstanceOf[js.Any])
    if (attributesToIndex != null) __obj.updateDynamic("attributesToIndex")(attributesToIndex.asInstanceOf[js.Any])
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve.asInstanceOf[js.Any])
    if (attributesToSnippet != null) __obj.updateDynamic("attributesToSnippet")(attributesToSnippet.asInstanceOf[js.Any])
    if (camelCaseAttributes != null) __obj.updateDynamic("camelCaseAttributes")(camelCaseAttributes.asInstanceOf[js.Any])
    if (customNormalization != null) __obj.updateDynamic("customNormalization")(customNormalization.asInstanceOf[js.Any])
    if (customRanking != null) __obj.updateDynamic("customRanking")(customRanking.asInstanceOf[js.Any])
    if (decompoundedAttributes != null) __obj.updateDynamic("decompoundedAttributes")(decompoundedAttributes.asInstanceOf[js.Any])
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes.asInstanceOf[js.Any])
    if (disablePrefixOnAttributes != null) __obj.updateDynamic("disablePrefixOnAttributes")(disablePrefixOnAttributes.asInstanceOf[js.Any])
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes.asInstanceOf[js.Any])
    if (disableTypoToleranceOnWords != null) __obj.updateDynamic("disableTypoToleranceOnWords")(disableTypoToleranceOnWords.asInstanceOf[js.Any])
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRules)) __obj.updateDynamic("enableRules")(enableRules.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag.asInstanceOf[js.Any])
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (ignorePlurals != null) __obj.updateDynamic("ignorePlurals")(ignorePlurals.asInstanceOf[js.Any])
    if (indexLanguages != null) __obj.updateDynamic("indexLanguages")(indexLanguages.asInstanceOf[js.Any])
    if (keepDiacriticsOnCharacters != null) __obj.updateDynamic("keepDiacriticsOnCharacters")(keepDiacriticsOnCharacters.asInstanceOf[js.Any])
    if (maxFacetHits != null) __obj.updateDynamic("maxFacetHits")(maxFacetHits.asInstanceOf[js.Any])
    if (maxValuesPerFacet != null) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.asInstanceOf[js.Any])
    if (minProximity != null) __obj.updateDynamic("minProximity")(minProximity.asInstanceOf[js.Any])
    if (minWordSizefor1Typo != null) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.asInstanceOf[js.Any])
    if (minWordSizefor2Typos != null) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.asInstanceOf[js.Any])
    if (numericAttributesForFiltering != null) __obj.updateDynamic("numericAttributesForFiltering")(numericAttributesForFiltering.asInstanceOf[js.Any])
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords.asInstanceOf[js.Any])
    if (paginationLimitedTo != null) __obj.updateDynamic("paginationLimitedTo")(paginationLimitedTo.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (queryLanguages != null) __obj.updateDynamic("queryLanguages")(queryLanguages.asInstanceOf[js.Any])
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (ranking != null) __obj.updateDynamic("ranking")(ranking.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSynonymsInHighlight)) __obj.updateDynamic("replaceSynonymsInHighlight")(replaceSynonymsInHighlight.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (responseFields != null) __obj.updateDynamic("responseFields")(responseFields.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays.asInstanceOf[js.Any])
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes.asInstanceOf[js.Any])
    if (separatorsToIndex != null) __obj.updateDynamic("separatorsToIndex")(separatorsToIndex.asInstanceOf[js.Any])
    if (slaves != null) __obj.updateDynamic("slaves")(slaves.asInstanceOf[js.Any])
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText.asInstanceOf[js.Any])
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (unretrievableAttributes != null) __obj.updateDynamic("unretrievableAttributes")(unretrievableAttributes.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

