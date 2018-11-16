package typings
package algoliasearchLib.liteMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Response extends js.Object {
  /**
       * The cursor is only set when browsing the index.
       * https://www.algolia.com/doc/api-reference/api-methods/browse/
       */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var facets: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[scala.Double]]
  ] = js.undefined
  var facets_stats: js.UndefOr[ScalablyTyped.runtime.StringDictionary[algoliasearchLib.Anon_Max]] = js.undefined
  /**
       * Contains all the hits matching the query
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var hits: js.Array[_]
  /**
       * Number of hits per pages
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var hitsPerPage: scala.Double
  /**
       * The index name is only set when searching multiple indices.
       * https://www.algolia.com/doc/api-reference/api-methods/multiple-queries/?language=javascript#response
       */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Number of total hits matching the query
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var nbHits: scala.Double
  /**
       * Number of pages
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var nbPages: scala.Double
  /**
       * Current page
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var page: scala.Double
  /**
       * GET parameters used to perform the search
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var params: java.lang.String
  /**
       * Engine processing time (excluding network transfer)
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var processingTimeMS: scala.Double
  /**
       * Query used to perform the search
       * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
       */
  var query: java.lang.String
}

