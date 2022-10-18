package typings.algoliasearchHelper

import typings.algoliasearchHelper.anon.Typeofalgoliasearch
import typings.algoliasearchHelper.anon.V3
import typings.algoliasearchHelper.anon.V3Any
import typings.algoliasearchHelper.anon.V3ResponseappliedRelevancyS
import typings.algoliasearchHelper.anon.V3V4
import typings.algoliasearchHelper.anon.V3V4V5
import typings.algoliasearchHelper.anon.V4
import typings.algoliasearchHelper.anon.V4MultipleQueriesResponse
import typings.algoliasearchHelper.anon.V4SearchOptions
import typings.algoliasearchHelper.anon.V4SnippetResult
import typings.algoliasearchHelper.anon.V4V5
import typings.algoliasearchHelper.anon.V5
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAlgoliasearchMod {
  
  // turns any to unknown, so it can be used as a conditional
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    any extends T ? true : false extends true ? unknown : T
    }}}
    */
  @js.native
  trait AnyToUnknown[T] extends StObject
  
  type ClientFullV5 = AnyToUnknown[
    // @ts-ignore
  ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlgoliaSearch.algoliasearch */ Any
    ]
  ]
  
  type ClientLiteV5 = AnyToUnknown[
    // @ts-ignore
  ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlgoliaSearchLite.liteClient */ Any
    ]
  ]
  
  type ClientSearchV5 = AnyToUnknown[
    // @ts-ignore
  ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ClientSearch.searchClient */ Any
    ]
  ]
  
  // @ts-ignore
  type ClientV34 = ReturnType[Typeofalgoliasearch]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientLiteV5 extends algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchClientShape ? algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientLiteV5 : algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientSearchV5 extends algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchClientShape ? algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientSearchV5 : algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientFullV5 extends algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchClientShape ? algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientFullV5 : unknown
    }}}
    */
  @js.native
  trait ClientV5 extends StObject
  
  type DefaultSearchClient = PickForClient[V3]
  
  type FindAnswersOptions = PickForClient[V4]
  
  type FindAnswersResponse[T] = PickForClient[V5[T]]
  
  type HighlightResult[T] = PickForClient[V3V4[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientV5 extends algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchClientShape ? T['v5'] : // @ts-ignore
  algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientV3_4 extends algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchClientV4Shape ? T['v4'] : T['v3']
    }}}
    */
  @js.native
  trait PickForClient[T /* <: V4V5 */] extends StObject
  
  type RankingInfo = PickForClient[V3V4V5]
  
  trait SearchClient extends StObject {
    
    var addAlgoliaAgent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['addAlgoliaAgent'] */ js.Any
      ] = js.undefined
    
    var initIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient extends {  initIndex :unknown} ? algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['initIndex'] : never */ js.Any
      ] = js.undefined
    
    var search: /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['search'] */ js.Any
    
    var searchForFacetValues: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient extends {  searchForFacetValues :unknown} ? algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['searchForFacetValues'] : never */ js.Any
      ] = js.undefined
  }
  object SearchClient {
    
    inline def apply(
      search: /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['search'] */ js.Any
    ): SearchClient = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchClient]
    }
    
    extension [Self <: SearchClient](x: Self) {
      
      inline def setAddAlgoliaAgent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['addAlgoliaAgent'] */ js.Any
      ): Self = StObject.set(x, "addAlgoliaAgent", value.asInstanceOf[js.Any])
      
      inline def setAddAlgoliaAgentUndefined: Self = StObject.set(x, "addAlgoliaAgent", js.undefined)
      
      inline def setInitIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient extends {  initIndex :unknown} ? algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['initIndex'] : never */ js.Any
      ): Self = StObject.set(x, "initIndex", value.asInstanceOf[js.Any])
      
      inline def setInitIndexUndefined: Self = StObject.set(x, "initIndex", js.undefined)
      
      inline def setSearch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['search'] */ js.Any
      ): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchForFacetValues(
        value: /* import warning: importer.ImportType#apply Failed type conversion: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient extends {  searchForFacetValues :unknown} ? algoliasearch-helper.algoliasearch-helper/types/algoliasearch.DefaultSearchClient['searchForFacetValues'] : never */ js.Any
      ): Self = StObject.set(x, "searchForFacetValues", value.asInstanceOf[js.Any])
      
      inline def setSearchForFacetValuesUndefined: Self = StObject.set(x, "searchForFacetValues", js.undefined)
    }
  }
  
  trait SearchClientShape extends StObject {
    
    var search: Any
  }
  object SearchClientShape {
    
    inline def apply(search: Any): SearchClientShape = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchClientShape]
    }
    
    extension [Self <: SearchClientShape](x: Self) {
      
      inline def setSearch(value: Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchClientV4Shape extends StObject {
    
    var transporter: Any
  }
  object SearchClientV4Shape {
    
    inline def apply(transporter: Any): SearchClientV4Shape = {
      val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchClientV4Shape]
    }
    
    extension [Self <: SearchClientV4Shape](x: Self) {
      
      inline def setTransporter(value: Any): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
    }
  }
  
  type SearchForFacetValuesResponse = PickForClient[V3Any]
  
  type SearchOptions = PickForClient[V4SearchOptions]
  
  type SearchResponse[T] = PickForClient[V3ResponseappliedRelevancyS[T]]
  
  type SearchResponses[T] = PickForClient[V4MultipleQueriesResponse[T]]
  
  type SnippetResult[T] = PickForClient[V4SnippetResult[T]]
}
