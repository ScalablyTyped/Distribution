package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFindingAggregatorResponse extends StObject {
  
  /**
    * The aggregation Region.
    */
  var FindingAggregationRegion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and stop finding aggregation.
    */
  var FindingAggregatorArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether to link all Regions, all Regions except for a list of excluded Regions, or a list of included Regions.
    */
  var RegionLinkingMode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of excluded Regions or included Regions.
    */
  var Regions: js.UndefOr[StringList] = js.undefined
}
object CreateFindingAggregatorResponse {
  
  inline def apply(): CreateFindingAggregatorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFindingAggregatorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFindingAggregatorResponse] (val x: Self) extends AnyVal {
    
    inline def setFindingAggregationRegion(value: NonEmptyString): Self = StObject.set(x, "FindingAggregationRegion", value.asInstanceOf[js.Any])
    
    inline def setFindingAggregationRegionUndefined: Self = StObject.set(x, "FindingAggregationRegion", js.undefined)
    
    inline def setFindingAggregatorArn(value: NonEmptyString): Self = StObject.set(x, "FindingAggregatorArn", value.asInstanceOf[js.Any])
    
    inline def setFindingAggregatorArnUndefined: Self = StObject.set(x, "FindingAggregatorArn", js.undefined)
    
    inline def setRegionLinkingMode(value: NonEmptyString): Self = StObject.set(x, "RegionLinkingMode", value.asInstanceOf[js.Any])
    
    inline def setRegionLinkingModeUndefined: Self = StObject.set(x, "RegionLinkingMode", js.undefined)
    
    inline def setRegions(value: StringList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Regions", js.Array(value*))
  }
}
