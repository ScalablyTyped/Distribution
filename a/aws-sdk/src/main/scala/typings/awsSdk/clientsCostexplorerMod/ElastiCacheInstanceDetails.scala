package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElastiCacheInstanceDetails extends StObject {
  
  /**
    * Determines whether the recommendation is for a current generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The type of node that Amazon Web Services recommends.
    */
  var NodeType: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The description of the recommended reservation.
    */
  var ProductDescription: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Services Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Determines whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
}
object ElastiCacheInstanceDetails {
  
  inline def apply(): ElastiCacheInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElastiCacheInstanceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElastiCacheInstanceDetails] (val x: Self) extends AnyVal {
    
    inline def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    inline def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    inline def setFamily(value: GenericString): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    inline def setNodeType(value: GenericString): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setProductDescription(value: GenericString): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    inline def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setSizeFlexEligible(value: GenericBoolean): Self = StObject.set(x, "SizeFlexEligible", value.asInstanceOf[js.Any])
    
    inline def setSizeFlexEligibleUndefined: Self = StObject.set(x, "SizeFlexEligible", js.undefined)
  }
}
