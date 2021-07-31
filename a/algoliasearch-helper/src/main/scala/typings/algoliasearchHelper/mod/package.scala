package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The algoliasearchHelper module is the function that will let its
  * contains everything needed to use the Algoliasearch
  * Helper. It is a also a function that instantiate the helper.
  * To use the helper, you also need the Algolia JS client v3.
  * @param client an AlgoliaSearch client
  * @param index the name of the index to query
  * @param opts
  */
@scala.inline
def apply(client: typings.algoliasearchHelper.mod.SearchClient, index: java.lang.String): typings.algoliasearchHelper.mod.AlgoliaSearchHelper = (typings.algoliasearchHelper.mod.^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.algoliasearchHelper.mod.AlgoliaSearchHelper]
@scala.inline
def apply(
  client: typings.algoliasearchHelper.mod.SearchClient,
  index: java.lang.String,
  opts: typings.algoliasearchHelper.mod.PlainSearchParameters
): typings.algoliasearchHelper.mod.AlgoliaSearchHelper = (typings.algoliasearchHelper.mod.^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.algoliasearchHelper.mod.AlgoliaSearchHelper]

@scala.inline
def version: java.lang.String = typings.algoliasearchHelper.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

type Client = typings.algoliasearch.algoliasearchMod.SearchClient

type SearchOptions = typings.algoliaClientSearch.mod.SearchOptions

type SearchResponse[T] = typings.std.Response | typings.algoliaClientSearch.mod.SearchResponse[T]
