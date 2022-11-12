package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFindingAggregatorRequest extends StObject {
  
  /**
    * Indicates whether to aggregate findings from all of the available Regions in the current partition. Also determines whether to automatically aggregate findings from new Regions as Security Hub supports them and you opt into them. The selected option also determines how to use the Regions provided in the Regions list. The options are as follows:    ALL_REGIONS - Indicates to aggregate findings from all of the Regions where Security Hub is enabled. When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them and you opt into them.     ALL_REGIONS_EXCEPT_SPECIFIED - Indicates to aggregate findings from all of the Regions where Security Hub is enabled, except for the Regions listed in the Regions parameter. When you choose this option, Security Hub also automatically aggregates findings from new Regions as Security Hub supports them and you opt into them.     SPECIFIED_REGIONS - Indicates to aggregate findings only from the Regions listed in the Regions parameter. Security Hub does not automatically aggregate findings from new Regions.   
    */
  var RegionLinkingMode: NonEmptyString
  
  /**
    * If RegionLinkingMode is ALL_REGIONS_EXCEPT_SPECIFIED, then this is a space-separated list of Regions that do not aggregate findings to the aggregation Region. If RegionLinkingMode is SPECIFIED_REGIONS, then this is a space-separated list of Regions that do aggregate findings to the aggregation Region. 
    */
  var Regions: js.UndefOr[StringList] = js.undefined
}
object CreateFindingAggregatorRequest {
  
  inline def apply(RegionLinkingMode: NonEmptyString): CreateFindingAggregatorRequest = {
    val __obj = js.Dynamic.literal(RegionLinkingMode = RegionLinkingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFindingAggregatorRequest]
  }
  
  extension [Self <: CreateFindingAggregatorRequest](x: Self) {
    
    inline def setRegionLinkingMode(value: NonEmptyString): Self = StObject.set(x, "RegionLinkingMode", value.asInstanceOf[js.Any])
    
    inline def setRegions(value: StringList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Regions", js.Array(value*))
  }
}
