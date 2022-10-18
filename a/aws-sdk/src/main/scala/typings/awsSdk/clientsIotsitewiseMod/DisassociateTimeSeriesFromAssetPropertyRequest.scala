package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTimeSeriesFromAssetPropertyRequest extends StObject {
  
  /**
    * The alias that identifies the time series.
    */
  var alias: PropertyAlias
  
  /**
    * The ID of the asset in which the asset property was created.
    */
  var assetId: ID
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: ID
}
object DisassociateTimeSeriesFromAssetPropertyRequest {
  
  inline def apply(alias: PropertyAlias, assetId: ID, propertyId: ID): DisassociateTimeSeriesFromAssetPropertyRequest = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTimeSeriesFromAssetPropertyRequest]
  }
  
  extension [Self <: DisassociateTimeSeriesFromAssetPropertyRequest](x: Self) {
    
    inline def setAlias(value: PropertyAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
  }
}
