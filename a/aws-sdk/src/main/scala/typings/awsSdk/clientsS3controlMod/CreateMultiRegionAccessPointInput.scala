package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultiRegionAccessPointInput extends StObject {
  
  /**
    * The name of the Multi-Region Access Point associated with this request.
    */
  var Name: MultiRegionAccessPointName
  
  var PublicAccessBlock: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
  
  /**
    * The buckets in different Regions that are associated with the Multi-Region Access Point.
    */
  var Regions: RegionCreationList
}
object CreateMultiRegionAccessPointInput {
  
  inline def apply(Name: MultiRegionAccessPointName, Regions: RegionCreationList): CreateMultiRegionAccessPointInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Regions = Regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiRegionAccessPointInput]
  }
  
  extension [Self <: CreateMultiRegionAccessPointInput](x: Self) {
    
    inline def setName(value: MultiRegionAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlock(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlock", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockUndefined: Self = StObject.set(x, "PublicAccessBlock", js.undefined)
    
    inline def setRegions(value: RegionCreationList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "Regions", js.Array(value*))
  }
}
