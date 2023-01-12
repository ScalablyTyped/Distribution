package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeSeriesRequest extends StObject {
  
  /**
    * The alias that identifies the time series.
    */
  var alias: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    * The ID of the asset in which the asset property was created.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
}
object DescribeTimeSeriesRequest {
  
  inline def apply(): DescribeTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeSeriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTimeSeriesRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: PropertyAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
  }
}
