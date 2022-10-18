package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetPropertyRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
  
  /**
    * The ID of the asset property.
    */
  var propertyId: ID
}
object DescribeAssetPropertyRequest {
  
  inline def apply(assetId: ID, propertyId: ID): DescribeAssetPropertyRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetPropertyRequest]
  }
  
  extension [Self <: DescribeAssetPropertyRequest](x: Self) {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
  }
}
