package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConfig extends StObject {
  
  /**
    *  The advanced event selectors configured for the service-linked channel. 
    */
  var AdvancedEventSelectors: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.AdvancedEventSelectors] = js.undefined
  
  /**
    *  Specifies whether the service-linked channel applies to one region or all regions. 
    */
  var ApplyToAllRegions: js.UndefOr[Boolean] = js.undefined
}
object SourceConfig {
  
  inline def apply(): SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfig]
  }
  
  extension [Self <: SourceConfig](x: Self) {
    
    inline def setAdvancedEventSelectors(value: AdvancedEventSelectors): Self = StObject.set(x, "AdvancedEventSelectors", value.asInstanceOf[js.Any])
    
    inline def setAdvancedEventSelectorsUndefined: Self = StObject.set(x, "AdvancedEventSelectors", js.undefined)
    
    inline def setAdvancedEventSelectorsVarargs(value: AdvancedEventSelector*): Self = StObject.set(x, "AdvancedEventSelectors", js.Array(value*))
    
    inline def setApplyToAllRegions(value: Boolean): Self = StObject.set(x, "ApplyToAllRegions", value.asInstanceOf[js.Any])
    
    inline def setApplyToAllRegionsUndefined: Self = StObject.set(x, "ApplyToAllRegions", js.undefined)
  }
}
