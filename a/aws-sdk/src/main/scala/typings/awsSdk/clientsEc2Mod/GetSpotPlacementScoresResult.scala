package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpotPlacementScoresResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10. Each score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at fulfilling the specified target capacity&#x2028; at the time of the Spot placement score request. A score of 10 means that your Spot capacity request is highly likely to succeed in that Region or Availability Zone.  If you request a Spot placement score for Regions, a high score assumes that your fleet request will be configured to use all Availability Zones and the capacity-optimized allocation strategy. If you request a Spot placement score for Availability Zones, a high score assumes that your fleet request will be configured to use a single Availability Zone and the capacity-optimized allocation strategy. Different&#x2028; Regions or Availability Zones might return the same score.  The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will be fully or partially fulfilled. 
    */
  var SpotPlacementScores: js.UndefOr[typings.awsSdk.clientsEc2Mod.SpotPlacementScores] = js.undefined
}
object GetSpotPlacementScoresResult {
  
  inline def apply(): GetSpotPlacementScoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpotPlacementScoresResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSpotPlacementScoresResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpotPlacementScores(value: SpotPlacementScores): Self = StObject.set(x, "SpotPlacementScores", value.asInstanceOf[js.Any])
    
    inline def setSpotPlacementScoresUndefined: Self = StObject.set(x, "SpotPlacementScores", js.undefined)
    
    inline def setSpotPlacementScoresVarargs(value: SpotPlacementScore*): Self = StObject.set(x, "SpotPlacementScores", js.Array(value*))
  }
}
