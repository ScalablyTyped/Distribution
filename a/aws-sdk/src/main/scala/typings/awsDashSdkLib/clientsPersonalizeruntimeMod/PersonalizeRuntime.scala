package typings
package awsDashSdkLib.clientsPersonalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonalizeRuntime
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_PersonalizeRuntime: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely item to be of interest to the user.  The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING. 
    */
  def getPersonalizedRanking(): awsDashSdkLib.libRequestMod.Request[GetPersonalizedRankingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPersonalizedRanking(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPersonalizedRankingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPersonalizedRankingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely item to be of interest to the user.  The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING. 
    */
  def getPersonalizedRanking(params: GetPersonalizedRankingRequest): awsDashSdkLib.libRequestMod.Request[GetPersonalizedRankingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPersonalizedRanking(
    params: GetPersonalizedRankingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPersonalizedRankingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPersonalizedRankingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of recommended items. The required input depends on the recipe type used to create the solution backing the campaign, as follows:   RELATED_ITEMS - itemId required, userId not used   USER_PERSONALIZATION - itemId optional, userId required    Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API. 
    */
  def getRecommendations(): awsDashSdkLib.libRequestMod.Request[GetRecommendationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRecommendations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRecommendationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRecommendationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of recommended items. The required input depends on the recipe type used to create the solution backing the campaign, as follows:   RELATED_ITEMS - itemId required, userId not used   USER_PERSONALIZATION - itemId optional, userId required    Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API. 
    */
  def getRecommendations(params: GetRecommendationsRequest): awsDashSdkLib.libRequestMod.Request[GetRecommendationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRecommendations(
    params: GetRecommendationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRecommendationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRecommendationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

