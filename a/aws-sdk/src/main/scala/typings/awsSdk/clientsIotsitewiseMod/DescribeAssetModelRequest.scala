package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetModelRequest extends StObject {
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID
  
  /**
    *  Whether or not to exclude asset model properties from the response. 
    */
  var excludeProperties: js.UndefOr[ExcludeProperties] = js.undefined
}
object DescribeAssetModelRequest {
  
  inline def apply(assetModelId: ID): DescribeAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetModelRequest]
  }
  
  extension [Self <: DescribeAssetModelRequest](x: Self) {
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setExcludeProperties(value: ExcludeProperties): Self = StObject.set(x, "excludeProperties", value.asInstanceOf[js.Any])
    
    inline def setExcludePropertiesUndefined: Self = StObject.set(x, "excludeProperties", js.undefined)
  }
}
