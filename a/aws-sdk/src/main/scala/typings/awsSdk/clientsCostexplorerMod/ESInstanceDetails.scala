package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ESInstanceDetails extends StObject {
  
  /**
    * Determines whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The class of instance that Amazon Web Services recommends.
    */
  var InstanceClass: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The size of instance that Amazon Web Services recommends.
    */
  var InstanceSize: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Services Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Determines whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
}
object ESInstanceDetails {
  
  inline def apply(): ESInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESInstanceDetails]
  }
  
  extension [Self <: ESInstanceDetails](x: Self) {
    
    inline def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    inline def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    inline def setInstanceClass(value: GenericString): Self = StObject.set(x, "InstanceClass", value.asInstanceOf[js.Any])
    
    inline def setInstanceClassUndefined: Self = StObject.set(x, "InstanceClass", js.undefined)
    
    inline def setInstanceSize(value: GenericString): Self = StObject.set(x, "InstanceSize", value.asInstanceOf[js.Any])
    
    inline def setInstanceSizeUndefined: Self = StObject.set(x, "InstanceSize", js.undefined)
    
    inline def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setSizeFlexEligible(value: GenericBoolean): Self = StObject.set(x, "SizeFlexEligible", value.asInstanceOf[js.Any])
    
    inline def setSizeFlexEligibleUndefined: Self = StObject.set(x, "SizeFlexEligible", js.undefined)
  }
}
