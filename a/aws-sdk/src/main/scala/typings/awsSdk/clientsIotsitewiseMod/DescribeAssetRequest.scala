package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
  
  /**
    *  Whether or not to exclude asset properties from the response. 
    */
  var excludeProperties: js.UndefOr[ExcludeProperties] = js.undefined
}
object DescribeAssetRequest {
  
  inline def apply(assetId: ID): DescribeAssetRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetRequest]
  }
  
  extension [Self <: DescribeAssetRequest](x: Self) {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setExcludeProperties(value: ExcludeProperties): Self = StObject.set(x, "excludeProperties", value.asInstanceOf[js.Any])
    
    inline def setExcludePropertiesUndefined: Self = StObject.set(x, "excludeProperties", js.undefined)
  }
}
