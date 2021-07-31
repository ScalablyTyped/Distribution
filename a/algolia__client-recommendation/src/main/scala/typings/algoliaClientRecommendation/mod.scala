package typings.algoliaClientRecommendation

import typings.algoliaClientCommon.mod.ClientTransporterOptions
import typings.algoliaClientCommon.mod.CreateClient
import typings.algoliaClientRecommendation.anon.EventName
import typings.algoliaClientRecommendation.anon.EventType
import typings.algoliaClientRecommendation.anon.FacetName
import typings.algoliaClientRecommendation.anon.ReadonlyPromiseGetPersona
import typings.algoliaClientRecommendation.anon.ReadonlyPromiseSetPersona
import typings.algoliaClientRecommendation.anon.Score
import typings.algoliaTransporter.mod.RequestOptions
import typings.algoliaTransporter.mod.Transporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/client-recommendation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@algolia/client-recommendation", "createRecommendationClient")
  @js.native
  val createRecommendationClient: CreateClient[RecommendationClient, RecommendationClientOptions & ClientTransporterOptions] = js.native
  
  @scala.inline
  def getPersonalizationStrategy(base: RecommendationClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetPersona] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPersonalizationStrategy")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetPersona]]
  
  @scala.inline
  def setPersonalizationStrategy(base: RecommendationClient): js.Function2[
    /* personalizationStrategy */ PersonalizationStrategy, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseSetPersona
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPersonalizationStrategy")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* personalizationStrategy */ PersonalizationStrategy, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseSetPersona
  ]]
  
  trait GetPersonalizationStrategyResponse extends StObject {
    
    /**
      * Events scoring
      */
    var eventsScoring: js.Array[EventName]
    
    /**
      * Facets scoring
      */
    var facetsScoring: js.Array[FacetName]
    
    /**
      * Personalization impact
      */
    var personalizationImpact: Double
  }
  object GetPersonalizationStrategyResponse {
    
    @scala.inline
    def apply(
      eventsScoring: js.Array[EventName],
      facetsScoring: js.Array[FacetName],
      personalizationImpact: Double
    ): GetPersonalizationStrategyResponse = {
      val __obj = js.Dynamic.literal(eventsScoring = eventsScoring.asInstanceOf[js.Any], facetsScoring = facetsScoring.asInstanceOf[js.Any], personalizationImpact = personalizationImpact.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPersonalizationStrategyResponse]
    }
    
    @scala.inline
    implicit class GetPersonalizationStrategyResponseMutableBuilder[Self <: GetPersonalizationStrategyResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventsScoring(value: js.Array[EventName]): Self = StObject.set(x, "eventsScoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsScoringVarargs(value: EventName*): Self = StObject.set(x, "eventsScoring", js.Array(value :_*))
      
      @scala.inline
      def setFacetsScoring(value: js.Array[FacetName]): Self = StObject.set(x, "facetsScoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetsScoringVarargs(value: FacetName*): Self = StObject.set(x, "facetsScoring", js.Array(value :_*))
      
      @scala.inline
      def setPersonalizationImpact(value: Double): Self = StObject.set(x, "personalizationImpact", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersonalizationStrategy extends StObject {
    
    /**
      * Events scoring
      */
    val eventsScoring: js.Array[EventType]
    
    /**
      * Facets scoring
      */
    val facetsScoring: js.Array[Score]
    
    /**
      * Personalization impact
      */
    val personalizationImpact: Double
  }
  object PersonalizationStrategy {
    
    @scala.inline
    def apply(eventsScoring: js.Array[EventType], facetsScoring: js.Array[Score], personalizationImpact: Double): PersonalizationStrategy = {
      val __obj = js.Dynamic.literal(eventsScoring = eventsScoring.asInstanceOf[js.Any], facetsScoring = facetsScoring.asInstanceOf[js.Any], personalizationImpact = personalizationImpact.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonalizationStrategy]
    }
    
    @scala.inline
    implicit class PersonalizationStrategyMutableBuilder[Self <: PersonalizationStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventsScoring(value: js.Array[EventType]): Self = StObject.set(x, "eventsScoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsScoringVarargs(value: EventType*): Self = StObject.set(x, "eventsScoring", js.Array(value :_*))
      
      @scala.inline
      def setFacetsScoring(value: js.Array[Score]): Self = StObject.set(x, "facetsScoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetsScoringVarargs(value: Score*): Self = StObject.set(x, "facetsScoring", js.Array(value :_*))
      
      @scala.inline
      def setPersonalizationImpact(value: Double): Self = StObject.set(x, "personalizationImpact", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecommendationClient extends StObject {
    
    /**
      * The application id.
      */
    val appId: String
    
    /**
      * The underlying transporter.
      */
    val transporter: Transporter
  }
  object RecommendationClient {
    
    @scala.inline
    def apply(appId: String, transporter: Transporter): RecommendationClient = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], transporter = transporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecommendationClient]
    }
    
    @scala.inline
    implicit class RecommendationClientMutableBuilder[Self <: RecommendationClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransporter(value: Transporter): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecommendationClientOptions extends StObject {
    
    /**
      * The api key.
      */
    val apiKey: String
    
    /**
      * The application id.
      */
    val appId: String
    
    /**
      * The prefered region.
      */
    val region: js.UndefOr[String] = js.undefined
  }
  object RecommendationClientOptions {
    
    @scala.inline
    def apply(apiKey: String, appId: String): RecommendationClientOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecommendationClientOptions]
    }
    
    @scala.inline
    implicit class RecommendationClientOptionsMutableBuilder[Self <: RecommendationClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait SetPersonalizationStrategyResponse extends StObject {
    
    /**
      * The message.
      */
    var message: String
    
    /**
      * The status code.
      */
    var status: js.UndefOr[Double] = js.undefined
  }
  object SetPersonalizationStrategyResponse {
    
    @scala.inline
    def apply(message: String): SetPersonalizationStrategyResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPersonalizationStrategyResponse]
    }
    
    @scala.inline
    implicit class SetPersonalizationStrategyResponseMutableBuilder[Self <: SetPersonalizationStrategyResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
