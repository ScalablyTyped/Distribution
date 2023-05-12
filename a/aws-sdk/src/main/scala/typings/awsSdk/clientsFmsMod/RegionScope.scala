package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionScope extends StObject {
  
  /**
    * Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
    */
  var AllRegionsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
    */
  var Regions: js.UndefOr[AWSRegionList] = js.undefined
}
object RegionScope {
  
  inline def apply(): RegionScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionScope] (val x: Self) extends AnyVal {
    
    inline def setAllRegionsEnabled(value: Boolean): Self = StObject.set(x, "AllRegionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAllRegionsEnabledUndefined: Self = StObject.set(x, "AllRegionsEnabled", js.undefined)
    
    inline def setRegions(value: AWSRegionList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: AWSRegion*): Self = StObject.set(x, "Regions", js.Array(value*))
  }
}
