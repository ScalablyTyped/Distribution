package typings.algoliasearch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearch.algoliasearchStrings.alpha
import typings.algoliasearch.algoliasearchStrings.count
import typings.algoliasearch.algoliasearchStrings.ignorePlurals
import typings.algoliasearch.algoliasearchStrings.min
import typings.algoliasearch.algoliasearchStrings.multiWordsSynonym
import typings.algoliasearch.algoliasearchStrings.prefixAll
import typings.algoliasearch.algoliasearchStrings.prefixLast
import typings.algoliasearch.algoliasearchStrings.prefixNone
import typings.algoliasearch.algoliasearchStrings.singleWordSynonym
import typings.algoliasearch.algoliasearchStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSettings extends js.Object {
  /**
    * Enables the advanced query syntax
    * default: false
    */
  var advancedSyntax: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows compression of big integer arrays.
    * default: false
    */
  var allowCompressionOfIntegerArray: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false, disables typo tolerance on numeric tokens (numbers).
    * default: true
    */
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify alternative corrections that you want to consider.
    * default: []
    */
  var altCorrections: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * Specify the list of approximation that should be considered as an exact match in the ranking formula
    * default: ['ignorePlurals', 'singleWordSynonym']
    * 'ignorePlurals': alternative words added by the ignorePlurals feature
    * 'singleWordSynonym': single-word synonym (For example "NY" = "NYC")
    * 'multiWordsSynonym': multiple-words synonym
    */
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.undefined
  /**
    * The name of the attribute used for the Distinct feature
    * default: null
    */
  var attributeForDistinct: js.UndefOr[String] = js.undefined
  /**
    * The list of attributes you want to use for faceting
    * default: null
    */
  var attributesForFaceting: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
    * default: null
    */
  var attributesToHighlight: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of attributes you want index
    * default: *
    */
  var attributesToIndex: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer
    * default: *
    */
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default list of attributes to snippet alongside the number of words to return
    * default: null
    */
  var attributesToSnippet: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of attributes on which to do a decomposition of camel case words.
    */
  var camelCaseAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Lets you specify part of the ranking
    * default: []
    */
  var customRanking: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of attributes on which you want to apply word-splitting ("decompounding") for
    * each of the languages supported (German, Dutch, and Finnish as of 05/2018)
    * default: {de: [], nl: [], fi: []}
    */
  var decompoundedAttributes: js.UndefOr[js.Object] = js.undefined
  /**
    * List of attributes on which you want to disable the computation of exact criteria
    * default: []
    */
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of attributes on which you want to disable prefix matching
    * default: []
    */
  var disablePrefixOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of attributes on which you want to disable typo tolerance
    * default: ""
    */
  var disableTypoToleranceOnAttributes: js.UndefOr[String] = js.undefined
  /**
    * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
    */
  var distinct: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * This parameter control how the exact ranking criterion is computed when the query contains one word
    * default: attribute
    * 'none': no exact on single word query
    * 'word': exact set to 1 if the query word is found in the record
    * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
    */
  var exactOnSingleWordQuery: js.UndefOr[String] = js.undefined
  /**
    * Specify the string that is inserted after the highlighted parts in the query result
    * default: </em>
    */
  var highlightPostTag: js.UndefOr[String] = js.undefined
  /**
    * Specify the string that is inserted before the highlighted parts in the query result
    * default: <em>
    */
  var highlightPreTag: js.UndefOr[String] = js.undefined
  /**
    * Pagination parameter used to select the number of hits per page
    * default: 20
    */
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, plural won't be considered as a typo
    * default: false
    */
  var ignorePlurals: js.UndefOr[Boolean] = js.undefined
  /**
    * Limit the number of facet values returned for each facet
    * default: ""
    */
  var maxValuesPerFacet: js.UndefOr[Double] = js.undefined
  /**
    * Configure the precision of the proximity ranking criterion
    * default: 1
    */
  var minProximity: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of characters needed to accept one typo
    * default: 4
    */
  var minWordSizefor1Typo: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of characters needed to accept two typos.
    * default: 8
    */
  var minWordSizefor2Typos: js.UndefOr[Double] = js.undefined
  /**
    * All numerical attributes are automatically indexed as numerical filters
    * default ''
    */
  var numericAttributesToIndex: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A string that contains the comma separated list of words that should be considered as optional when found in the query
    * default: []
    */
  var optionalWords: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Set the maximum number of hits accessible via pagination.
    * We set the max number of *hits*, not max number of pages.
    * Works with the page and hitsByPage settings to establish the full paging logic.
    * https://www.algolia.com/doc/api-reference/api-parameters/paginationLimitedTo/?language=javascript
    */
  var paginationLimitedTo: js.UndefOr[Double] = js.undefined
  /**
    * This is an advanced use-case to define a token substitutable by a list of words without having the original token searchable
    * default: {}
    */
  var placeholders: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
    * Sets the languages to be used by language-specific settings and functionalities
    * such as ignorePlurals, removeStopWords, and CJK word-detection.
    */
  var queryLanguages: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68 */ js.Any
    ]
  ] = js.undefined
  /**
    * Selects how the query words are interpreted
    * default: 'prefixLast'
    * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
    * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
    * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
    */
  var queryType: js.UndefOr[prefixAll | prefixLast | prefixNone] = js.undefined
  /**
    * Controls the way results are sorted
    * default: ['typo', 'geo', 'words', 'filters', 'proximity', 'attribute', 'exact', 'custom']
    */
  var ranking: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Remove stop words from the query before executing it
    * default: false
    * true|false: enable or disable stop words for all 41 supported languages; or
    * a list of language ISO codes (as a comma-separated string) for which stop words should be enable
    */
  var removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * This option is used to select a strategy in order to avoid having an empty result page
    * default: 'none'
    * 'lastWords' When a query does not return any results, the last word will be added as optional
    * 'firstWords' When a query does not return any results, the first word will be added as optional
    * 'allOptional' When a query does not return any results, a second trial will be made with all words as optional
    * 'none' No specific processing is done when a query does not return any results
    */
  var removeWordsIfNoResults: js.UndefOr[String] = js.undefined
  /**
    * The list of indices on which you want to replicate all write operations
    * default: []
    */
  var replicas: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
    * default: false
    */
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined
  /**
    * List of attributes you want to use for textual search
    * default: []
    */
  var searchableAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specify the separators (punctuation characters) to index.
    * default: ""
    */
  var separatorsToIndex: js.UndefOr[String] = js.undefined
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    * default: …
    */
  var snippetEllipsisText: js.UndefOr[String] = js.undefined
  /**
    * Controls how facet values are sorted.
    */
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.undefined
  /**
    * This option allows you to control the number of typos allowed in the result set
    * default: true
    * 'true' The typo tolerance is enabled and all matching hits are retrieved (default behavior).
    * 'false' The typo tolerance is disabled. All results with typos will be hidden.
    * 'min' Only keep results with the minimum number of typos. For example, if one result matches without typos, then all results with typos will be hidden.
    * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
    */
  var typoTolerance: js.UndefOr[Boolean | min | strict] = js.undefined
  /**
    * The list of attributes that cannot be retrieved at query time
    * default: null
    */
  var unretrievableAttributes: js.UndefOr[js.Array[String]] = js.undefined
}

object IndexSettings {
  @scala.inline
  def apply(
    advancedSyntax: js.UndefOr[Boolean] = js.undefined,
    allowCompressionOfIntegerArray: js.UndefOr[Boolean] = js.undefined,
    allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined,
    altCorrections: js.Array[js.Object] = null,
    alternativesAsExact: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym] = null,
    attributeForDistinct: String = null,
    attributesForFaceting: js.Array[String] = null,
    attributesToHighlight: js.Array[String] = null,
    attributesToIndex: js.Array[String] = null,
    attributesToRetrieve: js.Array[String] = null,
    attributesToSnippet: js.Array[String] = null,
    camelCaseAttributes: js.Array[String] = null,
    customRanking: js.Array[String] = null,
    decompoundedAttributes: js.Object = null,
    disableExactOnAttributes: js.Array[String] = null,
    disablePrefixOnAttributes: js.Array[String] = null,
    disableTypoToleranceOnAttributes: String = null,
    distinct: Boolean | Double = null,
    exactOnSingleWordQuery: String = null,
    highlightPostTag: String = null,
    highlightPreTag: String = null,
    hitsPerPage: js.UndefOr[Double] = js.undefined,
    ignorePlurals: js.UndefOr[Boolean] = js.undefined,
    maxValuesPerFacet: js.UndefOr[Double] = js.undefined,
    minProximity: js.UndefOr[Double] = js.undefined,
    minWordSizefor1Typo: js.UndefOr[Double] = js.undefined,
    minWordSizefor2Typos: js.UndefOr[Double] = js.undefined,
    numericAttributesToIndex: js.Array[String] = null,
    optionalWords: js.Array[String] = null,
    paginationLimitedTo: js.UndefOr[Double] = js.undefined,
    placeholders: StringDictionary[js.Array[String]] = null,
    queryLanguages: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68 */ js.Any
    ] = null,
    queryType: prefixAll | prefixLast | prefixNone = null,
    ranking: js.Array[String] = null,
    removeStopWords: Boolean | js.Array[String] = null,
    removeWordsIfNoResults: String = null,
    replicas: js.Array[String] = null,
    restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined,
    searchableAttributes: js.Array[String] = null,
    separatorsToIndex: String = null,
    snippetEllipsisText: String = null,
    sortFacetValuesBy: count | alpha = null,
    typoTolerance: Boolean | min | strict = null,
    unretrievableAttributes: js.Array[String] = null
  ): IndexSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCompressionOfIntegerArray)) __obj.updateDynamic("allowCompressionOfIntegerArray")(allowCompressionOfIntegerArray.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens.get.asInstanceOf[js.Any])
    if (altCorrections != null) __obj.updateDynamic("altCorrections")(altCorrections.asInstanceOf[js.Any])
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact.asInstanceOf[js.Any])
    if (attributeForDistinct != null) __obj.updateDynamic("attributeForDistinct")(attributeForDistinct.asInstanceOf[js.Any])
    if (attributesForFaceting != null) __obj.updateDynamic("attributesForFaceting")(attributesForFaceting.asInstanceOf[js.Any])
    if (attributesToHighlight != null) __obj.updateDynamic("attributesToHighlight")(attributesToHighlight.asInstanceOf[js.Any])
    if (attributesToIndex != null) __obj.updateDynamic("attributesToIndex")(attributesToIndex.asInstanceOf[js.Any])
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve.asInstanceOf[js.Any])
    if (attributesToSnippet != null) __obj.updateDynamic("attributesToSnippet")(attributesToSnippet.asInstanceOf[js.Any])
    if (camelCaseAttributes != null) __obj.updateDynamic("camelCaseAttributes")(camelCaseAttributes.asInstanceOf[js.Any])
    if (customRanking != null) __obj.updateDynamic("customRanking")(customRanking.asInstanceOf[js.Any])
    if (decompoundedAttributes != null) __obj.updateDynamic("decompoundedAttributes")(decompoundedAttributes.asInstanceOf[js.Any])
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes.asInstanceOf[js.Any])
    if (disablePrefixOnAttributes != null) __obj.updateDynamic("disablePrefixOnAttributes")(disablePrefixOnAttributes.asInstanceOf[js.Any])
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes.asInstanceOf[js.Any])
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag.asInstanceOf[js.Any])
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag.asInstanceOf[js.Any])
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePlurals)) __obj.updateDynamic("ignorePlurals")(ignorePlurals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValuesPerFacet)) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minProximity)) __obj.updateDynamic("minProximity")(minProximity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWordSizefor1Typo)) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWordSizefor2Typos)) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.get.asInstanceOf[js.Any])
    if (numericAttributesToIndex != null) __obj.updateDynamic("numericAttributesToIndex")(numericAttributesToIndex.asInstanceOf[js.Any])
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationLimitedTo)) __obj.updateDynamic("paginationLimitedTo")(paginationLimitedTo.get.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (queryLanguages != null) __obj.updateDynamic("queryLanguages")(queryLanguages.asInstanceOf[js.Any])
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (ranking != null) __obj.updateDynamic("ranking")(ranking.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays.get.asInstanceOf[js.Any])
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes.asInstanceOf[js.Any])
    if (separatorsToIndex != null) __obj.updateDynamic("separatorsToIndex")(separatorsToIndex.asInstanceOf[js.Any])
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText.asInstanceOf[js.Any])
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (unretrievableAttributes != null) __obj.updateDynamic("unretrievableAttributes")(unretrievableAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSettings]
  }
}

