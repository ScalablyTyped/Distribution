package typings.algoliaClientAnalytics

import typings.algoliaClientAnalytics.algoliaClientAnalyticsStrings.de
import typings.algoliaClientAnalytics.algoliaClientAnalyticsStrings.us
import typings.algoliaClientAnalytics.anon.ReadonlyPromiseAddABTestR
import typings.algoliaClientAnalytics.anon.ReadonlyPromiseDeleteABTe
import typings.algoliaClientAnalytics.anon.ReadonlyPromiseGetABTestR
import typings.algoliaClientAnalytics.anon.ReadonlyPromiseGetABTests
import typings.algoliaClientAnalytics.anon.ReadonlyPromiseStopABTest
import typings.algoliaClientCommon.mod.ClientTransporterOptions
import typings.algoliaClientCommon.mod.CreateClient
import typings.algoliaClientSearch.mod.SearchOptions
import typings.algoliaTransporter.mod.RequestOptions
import typings.algoliaTransporter.mod.Transporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/client-analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addABTest(base: AnalyticsClient): js.Function2[
    /* abTest */ ABTest, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseAddABTestR
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("addABTest")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* abTest */ ABTest, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseAddABTestR
  ]]
  
  @JSImport("@algolia/client-analytics", "createAnalyticsClient")
  @js.native
  val createAnalyticsClient: CreateClient[AnalyticsClient, AnalyticsClientOptions & ClientTransporterOptions] = js.native
  
  @scala.inline
  def deleteABTest(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseDeleteABTe
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteABTest")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseDeleteABTe
  ]]
  
  @scala.inline
  def getABTest(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseGetABTestR
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getABTest")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseGetABTestR
  ]]
  
  @scala.inline
  def getABTests(base: AnalyticsClient): js.Function1[
    /* requestOptions */ js.UndefOr[RequestOptions & GetABTestsOptions], 
    ReadonlyPromiseGetABTests
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getABTests")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* requestOptions */ js.UndefOr[RequestOptions & GetABTestsOptions], 
    ReadonlyPromiseGetABTests
  ]]
  
  @scala.inline
  def stopABTest(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseStopABTest
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopABTest")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseStopABTest
  ]]
  
  trait ABTest extends StObject {
    
    /**
      * The ab test end date, if any.
      */
    val endAt: String
    
    /**
      * The ab test name.
      */
    val name: String
    
    /**
      * The ab test list of variants.
      */
    val variants: js.Array[Variant]
  }
  object ABTest {
    
    @scala.inline
    def apply(endAt: String, name: String, variants: js.Array[Variant]): ABTest = {
      val __obj = js.Dynamic.literal(endAt = endAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
      __obj.asInstanceOf[ABTest]
    }
    
    @scala.inline
    implicit class ABTestMutableBuilder[Self <: ABTest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndAt(value: String): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value :_*))
    }
  }
  
  trait AddABTestResponse extends StObject {
    
    /**
      * The ab test unique identifier.
      */
    var abTestID: Double
    
    /**
      * The index name where the ab test is attached to.
      */
    var index: String
    
    /**
      * The operation task id. May be used to perform a wait task.
      */
    var taskID: Double
  }
  object AddABTestResponse {
    
    @scala.inline
    def apply(abTestID: Double, index: String, taskID: Double): AddABTestResponse = {
      val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddABTestResponse]
    }
    
    @scala.inline
    implicit class AddABTestResponseMutableBuilder[Self <: AddABTestResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbTestID(value: Double): Self = StObject.set(x, "abTestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsClient extends StObject {
    
    /**
      * The application id.
      */
    val appId: String
    
    /**
      * The underlying transporter.
      */
    val transporter: Transporter
  }
  object AnalyticsClient {
    
    @scala.inline
    def apply(appId: String, transporter: Transporter): AnalyticsClient = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], transporter = transporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsClient]
    }
    
    @scala.inline
    implicit class AnalyticsClientMutableBuilder[Self <: AnalyticsClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransporter(value: Transporter): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsClientOptions extends StObject {
    
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
    val region: js.UndefOr[de | us] = js.undefined
  }
  object AnalyticsClientOptions {
    
    @scala.inline
    def apply(apiKey: String, appId: String): AnalyticsClientOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsClientOptions]
    }
    
    @scala.inline
    implicit class AnalyticsClientOptionsMutableBuilder[Self <: AnalyticsClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: de | us): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait DeleteABTestResponse extends StObject {
    
    /**
      * The ab test unique identifier.
      */
    var abTestID: Double
    
    /**
      * The index name where the ab test was attached to.
      */
    var index: String
    
    /**
      * The operation task id. May be used to perform a wait task.
      */
    var taskID: Double
  }
  object DeleteABTestResponse {
    
    @scala.inline
    def apply(abTestID: Double, index: String, taskID: Double): DeleteABTestResponse = {
      val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteABTestResponse]
    }
    
    @scala.inline
    implicit class DeleteABTestResponseMutableBuilder[Self <: DeleteABTestResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbTestID(value: Double): Self = StObject.set(x, "abTestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetABTestResponse extends StObject {
    
    /**
      * The ab test unique identifier.
      */
    var abTestID: Double
    
    /**
      * The ab test significance based on click data. Should be higher than 0.95 to be considered significant - no matter which variant is winning.
      */
    var clickSignificance: Double
    
    /**
      *
      * The ab test significance based on conversion data. Should be higher than 0.95 to be considered significant - no matter which variant is winning.
      */
    var conversionSignificance: Double
    
    /**
      * The ab test created date, if any.
      */
    var createdAt: String
    
    /**
      * The ab test end date, if any.
      */
    var endAt: String
    
    /**
      * The ab test name.
      */
    var name: String
    
    /**
      * The ab test status.
      */
    var status: String
    
    /**
      * The ab test updated date.
      */
    var updatedAt: String
    
    /**
      * The ab test list of variants.
      */
    var variants: js.Array[VariantResponse]
  }
  object GetABTestResponse {
    
    @scala.inline
    def apply(
      abTestID: Double,
      clickSignificance: Double,
      conversionSignificance: Double,
      createdAt: String,
      endAt: String,
      name: String,
      status: String,
      updatedAt: String,
      variants: js.Array[VariantResponse]
    ): GetABTestResponse = {
      val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], clickSignificance = clickSignificance.asInstanceOf[js.Any], conversionSignificance = conversionSignificance.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], endAt = endAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetABTestResponse]
    }
    
    @scala.inline
    implicit class GetABTestResponseMutableBuilder[Self <: GetABTestResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbTestID(value: Double): Self = StObject.set(x, "abTestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickSignificance(value: Double): Self = StObject.set(x, "clickSignificance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConversionSignificance(value: Double): Self = StObject.set(x, "conversionSignificance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAt(value: String): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariants(value: js.Array[VariantResponse]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantsVarargs(value: VariantResponse*): Self = StObject.set(x, "variants", js.Array(value :_*))
    }
  }
  
  trait GetABTestsOptions extends StObject {
    
    /**
      *  The limit of the number of ab tests returned.
      */
    val limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of ab tests to skip from the biginning of the list.
      */
    val offset: js.UndefOr[Double] = js.undefined
  }
  object GetABTestsOptions {
    
    @scala.inline
    def apply(): GetABTestsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetABTestsOptions]
    }
    
    @scala.inline
    implicit class GetABTestsOptionsMutableBuilder[Self <: GetABTestsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait GetABTestsResponse extends StObject {
    
    /**
      * The list of ab tests.
      */
    var abtests: js.Array[GetABTestResponse] | Null
    
    /**
      * The number of ab tests within this response.
      */
    var count: Double
    
    /**
      * The total of ab tests.
      */
    var total: Double
  }
  object GetABTestsResponse {
    
    @scala.inline
    def apply(count: Double, total: Double): GetABTestsResponse = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], abtests = null)
      __obj.asInstanceOf[GetABTestsResponse]
    }
    
    @scala.inline
    implicit class GetABTestsResponseMutableBuilder[Self <: GetABTestsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbtests(value: js.Array[GetABTestResponse]): Self = StObject.set(x, "abtests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbtestsNull: Self = StObject.set(x, "abtests", null)
      
      @scala.inline
      def setAbtestsVarargs(value: GetABTestResponse*): Self = StObject.set(x, "abtests", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopABTestResponse extends StObject {
    
    /**
      * The ab test unique identifier.
      */
    var abTestID: Double
    
    /**
      * The index name where the ab test is attached to.
      */
    var index: String
    
    /**
      * The operation task id. May be used to perform a wait task.
      */
    var taskID: Double
  }
  object StopABTestResponse {
    
    @scala.inline
    def apply(abTestID: Double, index: String, taskID: Double): StopABTestResponse = {
      val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopABTestResponse]
    }
    
    @scala.inline
    implicit class StopABTestResponseMutableBuilder[Self <: StopABTestResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbTestID(value: Double): Self = StObject.set(x, "abTestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variant extends StObject {
    
    /**
      * The search parameters.
      */
    val customSearchParameters: js.UndefOr[SearchOptions] = js.undefined
    
    /**
      * Description of the variant. Useful when seing the results in the dashboard or via the API.
      */
    val description: js.UndefOr[String] = js.undefined
    
    /**
      * The index name.
      */
    val index: String
    
    /**
      * Percentage of the traffic that should be going to the variant. The sum of the percentage should be equal to 100.
      */
    val trafficPercentage: Double
  }
  object Variant {
    
    @scala.inline
    def apply(index: String, trafficPercentage: Double): Variant = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], trafficPercentage = trafficPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variant]
    }
    
    @scala.inline
    implicit class VariantMutableBuilder[Self <: Variant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomSearchParameters(value: SearchOptions): Self = StObject.set(x, "customSearchParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSearchParametersUndefined: Self = StObject.set(x, "customSearchParameters", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficPercentage(value: Double): Self = StObject.set(x, "trafficPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariantResponse
    extends StObject
       with Variant {
    
    /**
      * Average click position for the variant.
      */
    var averageClickPosition: js.UndefOr[Double] = js.undefined
    
    /**
      * Distinct click count for the variant.
      */
    var clickCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Click through rate for the variant.
      */
    var clickThroughRate: js.UndefOr[Double] = js.undefined
    
    /**
      * Click through rate for the variant.
      */
    var conversionCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Distinct conversion count for the variant.
      */
    var conversionRate: js.UndefOr[Double] = js.undefined
    
    /**
      * No result count.
      */
    var noResultCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Search count.
      */
    var searchCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Tracked search count.
      */
    var trackedSearchCount: js.UndefOr[Double] = js.undefined
    
    /**
      * User count.
      */
    var userCount: js.UndefOr[Double] = js.undefined
  }
  object VariantResponse {
    
    @scala.inline
    def apply(index: String, trafficPercentage: Double): VariantResponse = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], trafficPercentage = trafficPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariantResponse]
    }
    
    @scala.inline
    implicit class VariantResponseMutableBuilder[Self <: VariantResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAverageClickPosition(value: Double): Self = StObject.set(x, "averageClickPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverageClickPositionUndefined: Self = StObject.set(x, "averageClickPosition", js.undefined)
      
      @scala.inline
      def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
      
      @scala.inline
      def setClickThroughRate(value: Double): Self = StObject.set(x, "clickThroughRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickThroughRateUndefined: Self = StObject.set(x, "clickThroughRate", js.undefined)
      
      @scala.inline
      def setConversionCount(value: Double): Self = StObject.set(x, "conversionCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConversionCountUndefined: Self = StObject.set(x, "conversionCount", js.undefined)
      
      @scala.inline
      def setConversionRate(value: Double): Self = StObject.set(x, "conversionRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConversionRateUndefined: Self = StObject.set(x, "conversionRate", js.undefined)
      
      @scala.inline
      def setNoResultCount(value: Double): Self = StObject.set(x, "noResultCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultCountUndefined: Self = StObject.set(x, "noResultCount", js.undefined)
      
      @scala.inline
      def setSearchCount(value: Double): Self = StObject.set(x, "searchCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchCountUndefined: Self = StObject.set(x, "searchCount", js.undefined)
      
      @scala.inline
      def setTrackedSearchCount(value: Double): Self = StObject.set(x, "trackedSearchCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackedSearchCountUndefined: Self = StObject.set(x, "trackedSearchCount", js.undefined)
      
      @scala.inline
      def setUserCount(value: Double): Self = StObject.set(x, "userCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserCountUndefined: Self = StObject.set(x, "userCount", js.undefined)
    }
  }
}
