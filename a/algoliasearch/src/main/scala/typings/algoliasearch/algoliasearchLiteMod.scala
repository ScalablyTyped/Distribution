package typings.algoliasearch

import typings.algoliaClientCommon.mod.ClientTransporterOptions
import typings.algoliaClientSearch.mod.FindAnswersOptions
import typings.algoliaClientSearch.mod.MultipleQueriesOptions
import typings.algoliaClientSearch.mod.MultipleQueriesQuery
import typings.algoliaClientSearch.mod.MultipleQueriesResponse
import typings.algoliaClientSearch.mod.SearchOptions
import typings.algoliaClientSearch.mod.SearchResponse
import typings.algoliaTransporter.mod.RequestOptions
import typings.algoliasearch.algoliasearchStrings.apiKey
import typings.algoliasearch.algoliasearchStrings.appId
import typings.algoliasearch.anon.IndexName
import typings.algoliasearch.anon.ReadonlyPromiseArraySearc
import typings.algoliasearch.anon.ReadonlyPromiseFindAnswer
import typings.algoliasearch.anon.ReadonlyPromiseSearchForF
import typings.algoliasearch.anon.WithoutCredentialsSearchC
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algoliasearchLiteMod {
  
  object default {
    
    @scala.inline
    def apply(appId: String, apiKey: String): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    @scala.inline
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    
    @JSImport("algoliasearch/dist/algoliasearch-lite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch/dist/algoliasearch-lite", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  type AlgoliaSearchOptions = Partial[ClientTransporterOptions] & WithoutCredentialsSearchC
  
  trait Credentials extends StObject {
    
    val apiKey: String
    
    val appId: String
  }
  object Credentials {
    
    @scala.inline
    def apply(apiKey: String, appId: String): Credentials = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchClient
    extends StObject
       with typings.algoliaClientSearch.mod.SearchClient {
    
    def initIndex(indexName: String): SearchIndex = js.native
    
    def search[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def search[TObject](queries: js.Array[MultipleQueriesQuery], requestOptions: RequestOptions & MultipleQueriesOptions): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def searchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def searchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
  }
  
  @js.native
  trait SearchIndex
    extends StObject
       with typings.algoliaClientSearch.mod.SearchIndex {
    
    def findAnswers(query: String, queryLanguages: js.Array[String]): ReadonlyPromiseFindAnswer = js.native
    def findAnswers(
      query: String,
      queryLanguages: js.Array[String],
      requestOptions: RequestOptions & FindAnswersOptions
    ): ReadonlyPromiseFindAnswer = js.native
    
    def search[TObject](query: String): js.Promise[SearchResponse[TObject]] = js.native
    def search[TObject](query: String, requestOptions: RequestOptions & SearchOptions): js.Promise[SearchResponse[TObject]] = js.native
    
    def searchForFacetValues(facetName: String, facetQuery: String): ReadonlyPromiseSearchForF = js.native
    def searchForFacetValues(facetName: String, facetQuery: String, requestOptions: RequestOptions & SearchOptions): ReadonlyPromiseSearchForF = js.native
  }
  
  type WithoutCredentials[TClientOptions /* <: Credentials */] = Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch-lite.Credentials */ appId | apiKey
  ]
}
