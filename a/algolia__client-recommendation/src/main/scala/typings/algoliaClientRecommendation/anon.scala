package typings.algoliaClientRecommendation

import typings.algoliaClientRecommendation.mod.GetPersonalizationStrategyResponse
import typings.algoliaClientRecommendation.mod.SetPersonalizationStrategyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EventName extends StObject {
    
    var eventName: String
    
    var eventType: String
    
    var score: Double
  }
  object EventName {
    
    @scala.inline
    def apply(eventName: String, eventType: String, score: Double): EventName = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventName]
    }
    
    @scala.inline
    implicit class EventNameMutableBuilder[Self <: EventName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventType extends StObject {
    
    val eventName: String
    
    val eventType: String
    
    val score: Double
  }
  object EventType {
    
    @scala.inline
    def apply(eventName: String, eventType: String, score: Double): EventType = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventType]
    }
    
    @scala.inline
    implicit class EventTypeMutableBuilder[Self <: EventType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait FacetName extends StObject {
    
    var facetName: String
    
    var score: Double
  }
  object FacetName {
    
    @scala.inline
    def apply(facetName: String, score: Double): FacetName = {
      val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacetName]
    }
    
    @scala.inline
    implicit class FacetNameMutableBuilder[Self <: FacetName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacetName(value: String): Self = StObject.set(x, "facetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.GetPersonalizationStrategyResponse>> */
  trait ReadonlyPromiseGetPersona extends StObject {
    
    def `catch`[TResult](): js.Promise[GetPersonalizationStrategyResponse | TResult]
    
    def `finally`(): js.Promise[GetPersonalizationStrategyResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseGetPersona {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[GetPersonalizationStrategyResponse | js.Any],
      `finally`: () => js.Promise[GetPersonalizationStrategyResponse],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseGetPersona = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseGetPersona]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseGetPersonaMutableBuilder[Self <: ReadonlyPromiseGetPersona] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[GetPersonalizationStrategyResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[GetPersonalizationStrategyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.SetPersonalizationStrategyResponse>> */
  trait ReadonlyPromiseSetPersona extends StObject {
    
    def `catch`[TResult](): js.Promise[SetPersonalizationStrategyResponse | TResult]
    
    def `finally`(): js.Promise[SetPersonalizationStrategyResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseSetPersona {
    
    @scala.inline
    def apply(
      `catch`: () => js.Promise[SetPersonalizationStrategyResponse | js.Any],
      `finally`: () => js.Promise[SetPersonalizationStrategyResponse],
      `then`: () => js.Promise[js.Any | js.Any]
    ): ReadonlyPromiseSetPersona = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
      __obj.asInstanceOf[ReadonlyPromiseSetPersona]
    }
    
    @scala.inline
    implicit class ReadonlyPromiseSetPersonaMutableBuilder[Self <: ReadonlyPromiseSetPersona] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: () => js.Promise[SetPersonalizationStrategyResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinally(value: () => js.Promise[SetPersonalizationStrategyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    }
  }
  
  trait Score extends StObject {
    
    val facetName: String
    
    val score: Double
  }
  object Score {
    
    @scala.inline
    def apply(facetName: String, score: Double): Score = {
      val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Score]
    }
    
    @scala.inline
    implicit class ScoreMutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacetName(value: String): Self = StObject.set(x, "facetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
}
