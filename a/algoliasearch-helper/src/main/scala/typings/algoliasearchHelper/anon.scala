package typings.algoliasearchHelper

import typings.algoliasearch.algoliasearchMod.AlgoliaSearchOptions
import typings.algoliasearch.algoliasearchMod.SearchClient
import typings.algoliasearchHelper.mod.SearchParameters
import typings.algoliasearchHelper.mod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Avg extends StObject {
    
    var avg: Double
    
    var max: Double
    
    var min: Double
    
    var sum: Double
  }
  object Avg {
    
    @scala.inline
    def apply(avg: Double, max: Double, min: Double, sum: Double): Avg = {
      val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avg]
    }
    
    @scala.inline
    implicit class AvgMutableBuilder[Self <: Avg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: SearchResults[js.Any]
    
    var state: SearchParameters
  }
  object Content {
    
    @scala.inline
    def apply(content: SearchResults[js.Any], state: SearchParameters): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: SearchResults[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: typings.std.Error
  }
  object Error {
    
    @scala.inline
    def apply(error: typings.std.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Facet extends StObject {
    
    var facet: String
    
    var query: String
    
    var state: SearchParameters
  }
  object Facet {
    
    @scala.inline
    def apply(facet: String, query: String, state: SearchParameters): Facet = {
      val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Facet]
    }
    
    @scala.inline
    implicit class FacetMutableBuilder[Self <: Facet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacet(value: String): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsPageReset extends StObject {
    
    var isPageReset: Boolean
    
    var results: SearchResults[js.Any]
    
    var state: SearchParameters
  }
  object IsPageReset {
    
    @scala.inline
    def apply(isPageReset: Boolean, results: SearchResults[js.Any], state: SearchParameters): IsPageReset = {
      val __obj = js.Dynamic.literal(isPageReset = isPageReset.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsPageReset]
    }
    
    @scala.inline
    implicit class IsPageResetMutableBuilder[Self <: IsPageReset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPageReset(value: Boolean): Self = StObject.set(x, "isPageReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: SearchResults[js.Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectID extends StObject {
    
    val objectID: String
  }
  object ObjectID {
    
    @scala.inline
    def apply(objectID: String): ObjectID = {
      val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectID]
    }
    
    @scala.inline
    implicit class ObjectIDMutableBuilder[Self <: ObjectID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var results: SearchResults[js.Any]
    
    var state: SearchParameters
  }
  object Results {
    
    @scala.inline
    def apply(results: SearchResults[js.Any], state: SearchParameters): Results = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResults(value: SearchResults[js.Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultsState extends StObject {
    
    var results: SearchResults[js.Any]
    
    var state: SearchParameters
  }
  object ResultsState {
    
    @scala.inline
    def apply(results: SearchResults[js.Any], state: SearchParameters): ResultsState = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultsState]
    }
    
    @scala.inline
    implicit class ResultsStateMutableBuilder[Self <: ResultsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResults(value: SearchResults[js.Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var state: SearchParameters
  }
  object State {
    
    @scala.inline
    def apply(state: SearchParameters): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofalgoliasearch extends StObject {
    
    def apply(appId: String, apiKey: String): SearchClient = js.native
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
    
    var version: String = js.native
  }
}
