package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSettings extends js.Object {
  /**
    * Enables the advanced query syntax
    * default: false
    */
  var advancedSyntax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows compression of big integer arrays.
    * default: false
    */
  var allowCompressionOfIntegerArray: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to false, disables typo tolerance on numeric tokens (numbers).
    * default: true
    */
  var allowTyposOnNumericTokens: js.UndefOr[scala.Boolean] = js.undefined
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
  var alternativesAsExact: js.UndefOr[
    js.Array[
      algoliasearchLib.algoliasearchLibStrings.ignorePlurals | algoliasearchLib.algoliasearchLibStrings.singleWordSynonym | algoliasearchLib.algoliasearchLibStrings.multiWordsSynonym
    ]
  ] = js.undefined
  /**
    * The name of the attribute used for the Distinct feature
    * default: null
    */
  var attributeForDistinct: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of attributes you want to use for faceting
    * default: null
    */
  var attributesForFaceting: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
    * default: null
    */
  var attributesToHighlight: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The list of attributes you want index
    * default: *
    */
  var attributesToIndex: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer
    * default: *
    */
  var attributesToRetrieve: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default list of attributes to snippet alongside the number of words to return
    * default: null
    */
  var attributesToSnippet: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * List of attributes on which to do a decomposition of camel case words.
    */
  var camelCaseAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Lets you specify part of the ranking
    * default: []
    */
  var customRanking: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * List of attributes on which you want to apply word-splitting ("decompounding") for
    * each of the languages supported (German, Dutch, and Finnish as of 05/2018)
    * default: {de: [], nl: [], fi: []}
    */
  var decompoundedAttributes: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in std.Partial<'nl' | 'de' | 'fi'> ]: std.Array<string>}
    */ algoliasearchLib.algoliasearchLibStrings.IndexSettings with js.Any
  ] = js.undefined
  /**
    * List of attributes on which you want to disable the computation of exact criteria
    * default: []
    */
  var disableExactOnAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * List of attributes on which you want to disable prefix matching
    * default: []
    */
  var disablePrefixOnAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * List of attributes on which you want to disable typo tolerance
    * default: ""
    */
  var disableTypoToleranceOnAttributes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
    */
  var distinct: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * This parameter control how the exact ranking criterion is computed when the query contains one word
    * default: attribute
    * 'none': no exact on single word query
    * 'word': exact set to 1 if the query word is found in the record
    * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
    */
  var exactOnSingleWordQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the string that is inserted after the highlighted parts in the query result
    * default: </em>
    */
  var highlightPostTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the string that is inserted before the highlighted parts in the query result
    * default: <em>
    */
  var highlightPreTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pagination parameter used to select the number of hits per page
    * default: 20
    */
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set to true, plural won't be considered as a typo
    * default: false
    */
  var ignorePlurals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Limit the number of facet values returned for each facet
    * default: ""
    */
  var maxValuesPerFacet: js.UndefOr[scala.Double] = js.undefined
  /**
    * Configure the precision of the proximity ranking criterion
    * default: 1
    */
  var minProximity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of characters needed to accept one typo
    * default: 4
    */
  var minWordSizefor1Typo: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of characters needed to accept two typos.
    * default: 8
    */
  var minWordSizefor2Typos: js.UndefOr[scala.Double] = js.undefined
  /**
    * All numerical attributes are automatically indexed as numerical filters
    * default ''
    */
  var numericAttributesToIndex: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A string that contains the comma separated list of words that should be considered as optional when found in the query
    * default: []
    */
  var optionalWords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * This is an advanced use-case to define a token substitutable by a list of words without having the original token searchable
    * default: {}
    */
  var placeholders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
    * Sets the languages to be used by language-specific settings and functionalities
    * such as ignorePlurals, removeStopWords, and CJK word-detection.
    */
  var queryLanguages: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 68 */ js.Any
    ]
  ] = js.undefined
  /**
    * Selects how the query words are interpreted
    * default: 'prefixLast'
    * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
    * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
    * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
    */
  var queryType: js.UndefOr[
    algoliasearchLib.algoliasearchLibStrings.prefixAll | algoliasearchLib.algoliasearchLibStrings.prefixLast | algoliasearchLib.algoliasearchLibStrings.prefixNone
  ] = js.undefined
  /**
    * Controls the way results are sorted
    * default: ['typo', 'geo', 'words', 'filters', 'proximity', 'attribute', 'exact', 'custom']
    */
  var ranking: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Remove stop words from the query before executing it
    * default: false
    * true|false: enable or disable stop words for all 41 supported languages; or
    * a list of language ISO codes (as a comma-separated string) for which stop words should be enable
    */
  var removeStopWords: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * This option is used to select a strategy in order to avoid having an empty result page
    * default: 'none'
    * 'lastWords' When a query does not return any results, the last word will be added as optional
    * 'firstWords' When a query does not return any results, the first word will be added as optional
    * 'allOptional' When a query does not return any results, a second trial will be made with all words as optional
    * 'none' No specific processing is done when a query does not return any results
    */
  var removeWordsIfNoResults: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of indices on which you want to replicate all write operations
    * default: []
    */
  var replicas: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
    * default: false
    */
  var restrictHighlightAndSnippetArrays: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of attributes you want to use for textual search
    * default: []
    */
  var searchableAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specify the separators (punctuation characters) to index.
    * default: ""
    */
  var separatorsToIndex: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    * default: …
    */
  var snippetEllipsisText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls how facet values are sorted.
    */
  var sortFacetValuesBy: js.UndefOr[
    algoliasearchLib.algoliasearchLibStrings.count | algoliasearchLib.algoliasearchLibStrings.alpha
  ] = js.undefined
  /**
    * This option allows you to control the number of typos allowed in the result set
    * default: true
    * 'true' The typo tolerance is enabled and all matching hits are retrieved (default behavior).
    * 'false' The typo tolerance is disabled. All results with typos will be hidden.
    * 'min' Only keep results with the minimum number of typos. For example, if one result matches without typos, then all results with typos will be hidden.
    * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
    */
  var typoTolerance: js.UndefOr[
    scala.Boolean | algoliasearchLib.algoliasearchLibStrings.min | algoliasearchLib.algoliasearchLibStrings.strict
  ] = js.undefined
  /**
    * The list of attributes that cannot be retrieved at query time
    * default: null
    */
  var unretrievableAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IndexSettings {
  @scala.inline
  def apply(
    advancedSyntax: js.UndefOr[scala.Boolean] = js.undefined,
    allowCompressionOfIntegerArray: js.UndefOr[scala.Boolean] = js.undefined,
    allowTyposOnNumericTokens: js.UndefOr[scala.Boolean] = js.undefined,
    altCorrections: js.Array[js.Object] = null,
    alternativesAsExact: js.Array[
      algoliasearchLib.algoliasearchLibStrings.ignorePlurals | algoliasearchLib.algoliasearchLibStrings.singleWordSynonym | algoliasearchLib.algoliasearchLibStrings.multiWordsSynonym
    ] = null,
    attributeForDistinct: java.lang.String = null,
    attributesForFaceting: js.Array[java.lang.String] = null,
    attributesToHighlight: js.Array[java.lang.String] = null,
    attributesToIndex: js.Array[java.lang.String] = null,
    attributesToRetrieve: js.Array[java.lang.String] = null,
    attributesToSnippet: js.Array[java.lang.String] = null,
    camelCaseAttributes: js.Array[java.lang.String] = null,
    customRanking: js.Array[java.lang.String] = null,
    decompoundedAttributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in std.Partial<'nl' | 'de' | 'fi'> ]: std.Array<string>}
    */ algoliasearchLib.algoliasearchLibStrings.IndexSettings with js.Any = null,
    disableExactOnAttributes: js.Array[java.lang.String] = null,
    disablePrefixOnAttributes: js.Array[java.lang.String] = null,
    disableTypoToleranceOnAttributes: java.lang.String = null,
    distinct: scala.Boolean | scala.Double = null,
    exactOnSingleWordQuery: java.lang.String = null,
    highlightPostTag: java.lang.String = null,
    highlightPreTag: java.lang.String = null,
    hitsPerPage: scala.Int | scala.Double = null,
    ignorePlurals: js.UndefOr[scala.Boolean] = js.undefined,
    maxValuesPerFacet: scala.Int | scala.Double = null,
    minProximity: scala.Int | scala.Double = null,
    minWordSizefor1Typo: scala.Int | scala.Double = null,
    minWordSizefor2Typos: scala.Int | scala.Double = null,
    numericAttributesToIndex: js.Array[java.lang.String] = null,
    optionalWords: js.Array[java.lang.String] = null,
    placeholders: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    queryLanguages: js.Array[
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 68 */ js.Any
    ] = null,
    queryType: algoliasearchLib.algoliasearchLibStrings.prefixAll | algoliasearchLib.algoliasearchLibStrings.prefixLast | algoliasearchLib.algoliasearchLibStrings.prefixNone = null,
    ranking: js.Array[java.lang.String] = null,
    removeStopWords: scala.Boolean | js.Array[java.lang.String] = null,
    removeWordsIfNoResults: java.lang.String = null,
    replicas: js.Array[java.lang.String] = null,
    restrictHighlightAndSnippetArrays: js.UndefOr[scala.Boolean] = js.undefined,
    searchableAttributes: js.Array[java.lang.String] = null,
    separatorsToIndex: java.lang.String = null,
    snippetEllipsisText: java.lang.String = null,
    sortFacetValuesBy: algoliasearchLib.algoliasearchLibStrings.count | algoliasearchLib.algoliasearchLibStrings.alpha = null,
    typoTolerance: scala.Boolean | algoliasearchLib.algoliasearchLibStrings.min | algoliasearchLib.algoliasearchLibStrings.strict = null,
    unretrievableAttributes: js.Array[java.lang.String] = null
  ): IndexSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax)
    if (!js.isUndefined(allowCompressionOfIntegerArray)) __obj.updateDynamic("allowCompressionOfIntegerArray")(allowCompressionOfIntegerArray)
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens)
    if (altCorrections != null) __obj.updateDynamic("altCorrections")(altCorrections)
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact)
    if (attributeForDistinct != null) __obj.updateDynamic("attributeForDistinct")(attributeForDistinct)
    if (attributesForFaceting != null) __obj.updateDynamic("attributesForFaceting")(attributesForFaceting)
    if (attributesToHighlight != null) __obj.updateDynamic("attributesToHighlight")(attributesToHighlight)
    if (attributesToIndex != null) __obj.updateDynamic("attributesToIndex")(attributesToIndex)
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve)
    if (attributesToSnippet != null) __obj.updateDynamic("attributesToSnippet")(attributesToSnippet)
    if (camelCaseAttributes != null) __obj.updateDynamic("camelCaseAttributes")(camelCaseAttributes)
    if (customRanking != null) __obj.updateDynamic("customRanking")(customRanking)
    if (decompoundedAttributes != null) __obj.updateDynamic("decompoundedAttributes")(decompoundedAttributes)
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes)
    if (disablePrefixOnAttributes != null) __obj.updateDynamic("disablePrefixOnAttributes")(disablePrefixOnAttributes)
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes)
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery)
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag)
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag)
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePlurals)) __obj.updateDynamic("ignorePlurals")(ignorePlurals)
    if (maxValuesPerFacet != null) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.asInstanceOf[js.Any])
    if (minProximity != null) __obj.updateDynamic("minProximity")(minProximity.asInstanceOf[js.Any])
    if (minWordSizefor1Typo != null) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.asInstanceOf[js.Any])
    if (minWordSizefor2Typos != null) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.asInstanceOf[js.Any])
    if (numericAttributesToIndex != null) __obj.updateDynamic("numericAttributesToIndex")(numericAttributesToIndex)
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords)
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders)
    if (queryLanguages != null) __obj.updateDynamic("queryLanguages")(queryLanguages)
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (ranking != null) __obj.updateDynamic("ranking")(ranking)
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults)
    if (replicas != null) __obj.updateDynamic("replicas")(replicas)
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays)
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes)
    if (separatorsToIndex != null) __obj.updateDynamic("separatorsToIndex")(separatorsToIndex)
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText)
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (unretrievableAttributes != null) __obj.updateDynamic("unretrievableAttributes")(unretrievableAttributes)
    __obj.asInstanceOf[IndexSettings]
  }
}

